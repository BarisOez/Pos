

import java.awt.Color;
import java.awt.Component;
import java.text.DecimalFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableCellRenderer;






public class Tabellen {
    
    public void Bestellungentabelle(String Mysqllink, String username, String password, JTable Bestellübersicht,JTable Detailtabelle) {
    try {
        Connection connection = DriverManager.getConnection(Mysqllink, username, password);

        // Abfrage für die Bestellungen
        String bestellungenQuery = "SELECT Bestell_ID, Abholcode, Bestellzeit FROM bestellungen";
        Statement bestellungenStatement = connection.createStatement();
        ResultSet bestellungenResultSet = bestellungenStatement.executeQuery(bestellungenQuery);

        // Bestellübersicht-Modell
        DefaultTableModel bestelluebersichtModel = (DefaultTableModel) Bestellübersicht.getModel();
        bestelluebersichtModel.setRowCount(0);

    while (bestellungenResultSet.next()) {
        Object[] rowData = {
                bestellungenResultSet.getString("Bestell_ID"),
                bestellungenResultSet.getString("Abholcode"),
                bestellungenResultSet.getString("Bestellzeit"),
                0.0  
        };
        bestelluebersichtModel.addRow(rowData);
    }

    
    bestellungenResultSet.close();
    bestellungenStatement.close();


    String bestellungenDetailQuery = "SELECT Bestell_ID, Preis FROM bestellungen_detail";
    Statement bestellungenDetailStatement = connection.createStatement();
    ResultSet bestellungenDetailResultSet = bestellungenDetailStatement.executeQuery(bestellungenDetailQuery);

    
    while (bestellungenDetailResultSet.next()) {
        String bestellID = bestellungenDetailResultSet.getString("Bestell_ID");
        double preis = bestellungenDetailResultSet.getDouble("Preis");


        for (int i = 0; i < bestelluebersichtModel.getRowCount(); i++) {
    String rowBestellID = (String) bestelluebersichtModel.getValueAt(i, 0);
    if (bestellID.equals(rowBestellID)) {
        double currentTotal = 0.0;
        Object totalValue = bestelluebersichtModel.getValueAt(i, 3);
        if (totalValue instanceof Double) {
            currentTotal = (Double) totalValue;
        }
        double newTotal = currentTotal + preis;
        bestelluebersichtModel.setValueAt(newTotal, i, 3);
        break; // Abbrechen der Schleife, da die Bestell-ID gefunden wurde
    }
        }
    }

   
    DecimalFormat df = new DecimalFormat("00.00");
    for (int i = 0; i < bestelluebersichtModel.getRowCount(); i++) {
        Object totalValue = bestelluebersichtModel.getValueAt(i, 3);
        if (totalValue instanceof Double) {
            double total = (Double) totalValue;
            String formattedTotal = df.format(total);
            bestelluebersichtModel.setValueAt(formattedTotal, i, 3);
        }
    }


    bestellungenDetailResultSet.close();
    bestellungenDetailStatement.close();


    connection.close();
} catch (SQLException e) {
    e.printStackTrace();
}


try {
    Connection connection = DriverManager.getConnection(Mysqllink, username, password);


    String query = "SELECT bd.Preis, bd.Bestell_ID, bd.Artikelnummer, al.Artikelbezeichnung " +
            "FROM bestellungen_detail bd " +
            "JOIN artikelliste al ON bd.Artikelnummer = al.Artikelnummer";
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(query);


    DefaultTableModel detailtabelleModel = (DefaultTableModel) Detailtabelle.getModel();
//    DefaultTableModel detailtabelleModel = Detailtabelle;


    detailtabelleModel.setRowCount(0);


    while (resultSet.next()) {
        Object[] rowData = {
                resultSet.getString("Bestell_ID"),
                resultSet.getString("Artikelnummer"),
                resultSet.getString("Artikelbezeichnung"),
                resultSet.getDouble("Preis"),
        };
        detailtabelleModel.addRow(rowData);
    }


    resultSet.close();
    statement.close();
    connection.close();
} catch (SQLException e) {
    e.printStackTrace();
}   
    Detailtabelle.setAutoCreateRowSorter(true);
    Bestellübersicht.setAutoCreateRowSorter(true);
    
    
    
    }    
    
    
     public void UpddateVerfügbarkeitenSupplemente(String Mysqllink, String username, String password, JTable TabelleVerfügbarkeiten) {
        try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
   // SQL-Abfrage, um Daten aus der Tabelle "supplements" abzurufen
            String sql = "SELECT Supplementnummer, Supplementbezeichnung, Verfügbar FROM supplements";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

       // Erstellen des TableModels für die Tabelle
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.addColumn("Supplementnummer");
            tableModel.addColumn("Supplementbezeichnung");
            tableModel.addColumn("Verfügbarkeit");

          // Schleife zum Lesen der Daten aus dem ResultSet
            while (rs.next()) {
                  // Auslesen der Werte aus den Spalten der aktuellen Zeile
                int supplementnummer = rs.getInt("Supplementnummer");
                String supplementbezeichnung = rs.getString("Supplementbezeichnung");
                String verfügbarkeit = rs.getString("Verfügbar");

                  // Erstellen eines Objekt-Arrays mit den gelesenen Daten
                Object[] rowData = {supplementnummer, supplementbezeichnung, verfügbarkeit};

     // Hinzufügen der Zeile zum TableModel
                tableModel.addRow(rowData);
            }

            
            TabelleVerfügbarkeiten.setModel(tableModel);

           
            DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

           
               String verfügbarkeitValue = (String) table.getValueAt(row, 2);

// Überprüfung des Werts der "Verfügbarkeit"-Spalte
if ("Ja".equalsIgnoreCase(verfügbarkeitValue)) {
    // Wenn der Wert "Ja" ist, Hintergrundfarbe auf grün setzen
    cellComponent.setBackground(Color.decode("#54B435"));
} else if ("Nein".equalsIgnoreCase(verfügbarkeitValue)) {
    // Wenn der Wert "Nein" ist, Hintergrundfarbe auf rot setzen
    cellComponent.setBackground(Color.decode("#E90064"));
} else {
    // Für alle anderen Werte wird die Standard-Hintergrundfarbe der Tabelle verwendet
    cellComponent.setBackground(table.getBackground());
}

// Rückgabe des angepassten Zellkomponenten
return cellComponent;

                }
            };

           
            TabelleVerfügbarkeiten.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
               TabelleVerfügbarkeiten.setAutoCreateRowSorter(true);
   

        } catch (SQLException ex) {
            ex.printStackTrace();
            
        } catch (Exception ex) {
            ex.printStackTrace();
           
        }

    }   
    
    
 public void UpddateVerfügbarkeiten(String Mysqllink, String username, String password, JTable Tabelle_Verfügbarkeiten) {
        try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
         
            String sql = "SELECT artikelnummer, artikelbezeichnung, verfügbar FROM artikelliste";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.addColumn("Artikelnummer");
            tableModel.addColumn("Artikelbezeichnung");
            tableModel.addColumn("Verfügbarkeit");

       
            while (rs.next()) {
                String artikelnummer = rs.getString("artikelnummer");
                String artikelbezeichnung = rs.getString("artikelbezeichnung");
                String verfügbarkeit = rs.getString("verfügbar");

              
                Object[] rowData = {artikelnummer, artikelbezeichnung, verfügbarkeit};

             
                tableModel.addRow(rowData);
            }

            
            Tabelle_Verfügbarkeiten.setModel(tableModel);

            
            DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

    
                    String verfügbarkeitValue = (String) table.getValueAt(row, 2);

                  
                    if ("Ja".equalsIgnoreCase(verfügbarkeitValue)) {
                        cellComponent.setBackground(Color.decode("#54B435"));
                    } else if ("Nein".equalsIgnoreCase(verfügbarkeitValue)) {
                        cellComponent.setBackground(Color.decode("#E90064"));
                    } else {

                        cellComponent.setBackground(table.getBackground());
                    }

                    return cellComponent;
                }
            };

          
            Tabelle_Verfügbarkeiten.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
              Tabelle_Verfügbarkeiten.setAutoCreateRowSorter(true);
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        } catch (Exception ex) {
            ex.printStackTrace();
           
        }
    } 
     
    
 public void MenuTabelleUpdate(String Mysqllink, String username, String password, JTable Optiontabelle) {
        try {
            // Laden des MySQL JDBC-Treibers
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
                 // Erstellen des Statements
                Statement st = con.createStatement();
                 // Ausführen der Abfrage
                String sql = "SELECT Supplementnummer, Supplementbezeichnung, Preis, Verfügbar FROM supplements";
                ResultSet rs = st.executeQuery(sql);
 // Zugriff auf das Tabellenmodell der Optiontabelle
                DefaultTableModel tblModel = (DefaultTableModel) Optiontabelle.getModel();
                 // Zurücksetzen der Zeilenanzahl auf 0, um vorhandene Daten zu löschen
                tblModel.setRowCount(0); 
// Iteration über die Ergebnisdaten
                while (rs.next()) {
                    String Supplementnummer = rs.getString("Supplementnummer");
                    String Supplementbezeichnung = rs.getString("Supplementbezeichnung");
                    float Preis = rs.getFloat("Preis");
                    String Verfugbar = rs.getString("Verfügbar");
// Erstellen eines Zeilenarrays und Hinzufügen der Daten
                    String tbData[] = {Supplementnummer, Supplementbezeichnung, String.valueOf(Preis), Verfugbar};
                    tblModel.addRow(tbData);
                }
            }
             // Catch-Blöcke für mögliche Exceptions..
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

        Optiontabelle.setAutoCreateRowSorter(true);

    }   
    
    
}
