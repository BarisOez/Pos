

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Felder {
    
    
   public void LayoutFeldLeeren (JTextField TextfeldFeld01,JTextField TextfeldFeld02,JTextField TextfeldFeld03,JTextField TextfeldFeld04,JTextField TextfeldFeld05,JTextField TextfeldFeld06,JTextField TextfeldFeld07,JTextField TextfeldFeld08,
           JTextField TextfeldFeld09,JTextField TextfeldFeld10,JTextField TextfeldFeld11,JTextField TextfeldFeld12,JTextField TextfeldFeld13,JTextField TextfeldFeld14, JTextField TextfeldFeld15 ) {
   TextfeldFeld01.setText("");//Textfeld leeren
   TextfeldFeld02.setText("");//usw
     TextfeldFeld03.setText("");
      TextfeldFeld04.setText("");
       TextfeldFeld05.setText("");
       TextfeldFeld06.setText("");
         TextfeldFeld07.setText("");
          TextfeldFeld08.setText("");
           TextfeldFeld09.setText("");
            TextfeldFeld10.setText("");
             TextfeldFeld11.setText("");
              TextfeldFeld12.setText("");
               TextfeldFeld13.setText("");
                TextfeldFeld14.setText("");
                 TextfeldFeld15.setText("");
  
  }   
    
 public void Kategoriefelderleeren(JTextField UmbenennenFeld2,JTextField UmbenennenFeld3,JTextField UmbenennenFeld4,JTextField UmbenennenFeld5,JTextField UmbenennenFeld6,JTextField UmbenennenFeld7,JTextField UmbenennenFeld8,JTextField UmbenennenFeld9,JTextField UmbenennenFeld10,
         JTextField UmbenennenFeld11,JTextField UmbenennenFeld12,JTextField UmbenennenFeld13) {
     
     
       JTextField[] textFields = {UmbenennenFeld2, UmbenennenFeld3, UmbenennenFeld4,UmbenennenFeld5,UmbenennenFeld6,UmbenennenFeld7,UmbenennenFeld8,UmbenennenFeld9,UmbenennenFeld10,UmbenennenFeld11,UmbenennenFeld12,UmbenennenFeld13};

    for (JTextField textField : textFields) {
        textField.setText("");
}

     
     }   
   
    public void UpdateFelder(String Mysqllink, String username, String password,JTable TabelleSupplementverknüpfungen, JTable TabelleArtikelverknüpfungen) {
        try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
           // SQL-Abfrage zum Abrufen von Informationen aus verschiedenen Tabellen
            String sql = "SELECT a.Artikelnummer, al.Artikelbezeichnung, "
                    + "s1.Supplementbezeichnung AS Supplement1, s2.Supplementbezeichnung AS Supplement2, "
                    + "s3.Supplementbezeichnung AS Supplement3, s4.Supplementbezeichnung AS Supplement4 "
                    + "FROM artikelverknüpfungen a "
                    + "JOIN artikelliste al ON a.Artikelnummer = al.Artikelnummer "
                    + "JOIN supplements s1 ON a.Supplement01 = s1.SupplementID "
                    + "JOIN supplements s2 ON a.Supplement02 = s2.SupplementID "
                    + "JOIN supplements s3 ON a.Supplement03 = s3.SupplementID "
                    + "JOIN supplements s4 ON a.Supplement04 = s4.SupplementID";

        // Erstellen eines Statements zur Ausführung der SQL-Abfrage
            Statement stmt = con.createStatement();
              // Ausführen der Abfrage und Speichern der Ergebnisse in einem ResultSet
            ResultSet rs = stmt.executeQuery(sql);

          
            DefaultTableModel model = (DefaultTableModel) TabelleSupplementverknüpfungen.getModel();
            model.setRowCount(0); 

            while (rs.next()) {
                int artikelnummer = rs.getInt("Artikelnummer");
                String artikelbezeichnung = rs.getString("Artikelbezeichnung");
                String supplement1 = rs.getString("Supplement1");
                String supplement2 = rs.getString("Supplement2");
                String supplement3 = rs.getString("Supplement3");
                String supplement4 = rs.getString("Supplement4");

                Object[] row = {artikelnummer, artikelbezeichnung, supplement1, supplement2, supplement3, supplement4};
                model.addRow(row);
            }

         
            TabelleSupplementverknüpfungen.setModel(model);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        TabelleSupplementverknüpfungen.setAutoCreateRowSorter(true);

        try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
          
            String sql = "SELECT a.Artikelnummer, a.Artikelbezeichnung, a.Verfügbar "
                    + "FROM artikelliste a "
                    + "LEFT JOIN artikelverknüpfungen av ON a.Artikelnummer = av.Artikelnummer "
                    + "WHERE av.Artikelnummer IS NULL";

         
            PreparedStatement stmt = con.prepareStatement(sql);

          
            ResultSet rs = stmt.executeQuery();

     
            if (!rs.next()) {
              
                JOptionPane.showMessageDialog(null, "Alle deine Artikel sind erfolgreich verknüpft.");
                DefaultTableModel model = (DefaultTableModel) TabelleArtikelverknüpfungen.getModel();
                model.setRowCount(0); 
            } else {
               
                DefaultTableModel model = (DefaultTableModel) TabelleArtikelverknüpfungen.getModel();
                model.setRowCount(0); 

                do {
                    String artikelnummer = rs.getString("Artikelnummer");
                    String artikelbezeichnung = rs.getString("Artikelbezeichnung");
                    String verfügbar = rs.getString("Verfügbar");

                    model.addRow(new Object[]{artikelnummer, artikelbezeichnung, verfügbar});
                } while (rs.next());
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        TabelleArtikelverknüpfungen.setAutoCreateRowSorter(true);
    } 
  
    
}
