

import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;




public class Layout {
    
    
public void Kategorieupdate(String Mysqllink, String username, String password,JLabel FeldKategorie1_2,JLabel FeldKategorie1_3,JLabel FeldKategorie1_4,JLabel FeldKategorie1_5,JLabel FeldKategorie1_6,JLabel FeldKategorie1_7,JLabel FeldKategorie2_1
,JLabel FeldKategorie2_2,JLabel FeldKategorie2_3,JLabel FeldKategorie2_4,JLabel FeldKategorie2_5,JLabel FeldKategorie2_6) {

       try (Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
    // SQL-Abfrage, um die Kategoriebezeichnung basierend auf der gegebenen Reihe zu erhalten
    String sql1_2 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
    try (PreparedStatement pstmt1 = conn.prepareStatement(sql1_2)) {
        pstmt1.setDouble(1, 1.2); // Setzen des Parameters für die Reihe
        ResultSet rs1 = pstmt1.executeQuery();
        rs1.next();
        String kategoriebezeichnung1_2 = rs1.getString("Kategoriebezeichnung");
                FeldKategorie1_2.setText(kategoriebezeichnung1_2);
            }

       
           String sql1_3 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
try (PreparedStatement pstmt2 = conn.prepareStatement(sql1_3)) {
    pstmt2.setDouble(1, 1.3); // Setzen des Parameters für die Reihe
    ResultSet rs2 = pstmt2.executeQuery();
    rs2.next();
    String kategoriebezeichnung1_3 = rs2.getString("Kategoriebezeichnung");
    FeldKategorie1_3.setText(kategoriebezeichnung1_3); // Setzen des Texts im JLabel-Objekt
}
//Usw....

        
            String sql1_4 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_4)) {
                pstmt3.setDouble(1, 1.4);
                ResultSet rs3 = pstmt3.executeQuery();
                rs3.next();
                String kategoriebezeichnung1_4 = rs3.getString("Kategoriebezeichnung");
                FeldKategorie1_4.setText(kategoriebezeichnung1_4);
            }

          
            String sql1_5 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_5)) {
                pstmt3.setDouble(1, 1.5);
                ResultSet rs3 = pstmt3.executeQuery();
                rs3.next();
                String kategoriebezeichnung1_5 = rs3.getString("Kategoriebezeichnung");
                FeldKategorie1_5.setText(kategoriebezeichnung1_5);
            }

            String sql1_6 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_6)) {
                pstmt3.setDouble(1, 1.6);
                ResultSet rs3 = pstmt3.executeQuery();
                rs3.next();
                String kategoriebezeichnung1_6 = rs3.getString("Kategoriebezeichnung");
                FeldKategorie1_6.setText(kategoriebezeichnung1_6);
            }

          
            String sql1_7 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_7)) {
                pstmt3.setDouble(1, 1.7);
                ResultSet rs3 = pstmt3.executeQuery();
                rs3.next();
                String kategoriebezeichnung1_7 = rs3.getString("Kategoriebezeichnung");
                FeldKategorie1_7.setText(kategoriebezeichnung1_7);
            }

            
            String sql2_1 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_1)) {
                pstmt1.setDouble(1, 2.1);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_1 = rs1.getString("Kategoriebezeichnung");
                FeldKategorie2_1.setText(kategoriebezeichnung2_1);
            }

          
            String sql2_2 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_2)) {
                pstmt1.setDouble(1, 2.2);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_2 = rs1.getString("Kategoriebezeichnung");
                FeldKategorie2_2.setText(kategoriebezeichnung2_2);
            }

            
            String sql2_3 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_3)) {
                pstmt1.setDouble(1, 2.3);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_3 = rs1.getString("Kategoriebezeichnung");
                FeldKategorie2_3.setText(kategoriebezeichnung2_3);
            }

            
            String sql2_4 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_4)) {
                pstmt1.setDouble(1, 2.4);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_4 = rs1.getString("Kategoriebezeichnung");
                FeldKategorie2_4.setText(kategoriebezeichnung2_4);
            }

         
            String sql2_5 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_5)) {
                pstmt1.setDouble(1, 2.5);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_5 = rs1.getString("Kategoriebezeichnung");
                FeldKategorie2_5.setText(kategoriebezeichnung2_5);
            }

            
            String sql2_6 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_6)) {
                pstmt1.setDouble(1, 2.6);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_6 = rs1.getString("Kategoriebezeichnung");
                FeldKategorie2_6.setText(kategoriebezeichnung2_6);
            }



        } catch (SQLException e) {
            System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
        }
    }    
    
    
    public void Kategorieumbennen(String Mysqllink, String username, String password, Double reihenwert,String newValue, JLabel jLabel234) {
    try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
 
        String sql1 = "SELECT Kategorie_Nummer FROM kategorielayout WHERE Reihe = ?";
        PreparedStatement stmt1 = con.prepareStatement(sql1);
        stmt1.setDouble(1, reihenwert);
        ResultSet rs1 = stmt1.executeQuery();

        if (rs1.next()) {
            String kategorieId = rs1.getString("Kategorie_Nummer");

            if (kategorieId != null && !kategorieId.isEmpty()) {
                if (newValue != null && !newValue.isEmpty()) {
          
                    String sql2 = "UPDATE kategorien SET Kategoriebezeichnung = ? WHERE Kategorie_ID = ?";
                    PreparedStatement stmt2 = con.prepareStatement(sql2);
                    stmt2.setString(1, newValue);
                    stmt2.setString(2, kategorieId);

                    int rowsUpdated = stmt2.executeUpdate();

                    if (rowsUpdated > 0) {
                        jLabel234.setText("Erfolgreich geändert.");
                    } else {
                        jLabel234.setText("Konnte nicht geändert werden.");
                    }
                } else {
                    jLabel234.setText("Bezeichung darf nicht leer sein");
                }
            } else {
                jLabel234.setText("Kategorie ist null oder leer.");
            }
        } else {
            jLabel234.setText("Keine Daten gefunden.");
        }
        
         javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
                      
                        SwingUtilities.invokeLater(() -> {
                            jLabel234.setText("");
                       
                        });
                    });
                    timer.setRepeats(false);
                    timer.start();
    } catch (SQLException ex) {
        ex.printStackTrace();
        
    } catch (Exception ex) {
        ex.printStackTrace();
       
    }
}  
    
  public void commonCode(String reihe, String Mysqllink, String username, String password,JLabel ArtikelFeld01, JLabel ArtikelFeld02,JLabel ArtikelFeld03,JLabel ArtikelFeld04,JLabel ArtikelFeld05,JLabel ArtikelFeld06,JLabel ArtikelFeld07,
          JLabel ArtikelFeld08,JLabel ArtikelFeld09,JLabel ArtikelFeld10,JLabel ArtikelFeld11,JLabel ArtikelFeld12,JLabel ArtikelFeld13,JLabel ArtikelFeld14,JLabel ArtikelFeld15,
          
          JLabel BildFeld01, JLabel BildFeld02,JLabel BildFeld03,JLabel BildFeld04,JLabel BildFeld05,JLabel BildFeld06,JLabel BildFeld07,
          JLabel BildFeld08,JLabel BildFeld09,JLabel BildFeld10,JLabel BildFeld11,JLabel BildFeld12,JLabel BildFeld13,JLabel BildFeld14,JLabel BildFeld15) {

        for (int i = 1; i < 16; i++) {
            String xx01 = reihe + String.format("%02d", i);

     try (Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
        // SQL-Abfrage, um "Spalte" und "cid" aus der Tabelle "artikellayout" abzurufen
        String sql = "SELECT Spalte, cid FROM artikellayout WHERE ArlaID = (SELECT ArlaID FROM artikellayout WHERE Spalte = ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, xx01);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            // Die Werte aus dem Resultset abrufen
            String spalte = rs.getString("Spalte");
            int cid = rs.getInt("cid");

        
                String sql2 = "SELECT artikelbezeichnung, icon FROM artikelliste WHERE Cid = ?";
try (PreparedStatement pstmt2 = conn.prepareStatement(sql2)) {
    pstmt2.setInt(1, cid);
    ResultSet rs2 = pstmt2.executeQuery();
    rs2.next();
    // Die Werte aus dem Resultset abrufen
    String artikelbezeichnung = rs2.getString("artikelbezeichnung");
    String iconPath = rs2.getString("icon");

                      
                        switch (i) {
                            case 1 -> {
                                // Aktualisiere das Textfeld und das Bildfeld für den ersten Artikel
                                ArtikelFeld01.setText(artikelbezeichnung);
                                BildFeld01.setIcon(new ImageIcon(iconPath));
                            }
                            case 2 -> {
                                // Aktualisiere das Textfeld und das Bildfeld für den ersten Artikel
                                ArtikelFeld02.setText(artikelbezeichnung);
                                BildFeld02.setIcon(new ImageIcon(iconPath));
                            }
                            case 3 -> {
                                // Aktualisiere das Textfeld und das Bildfeld für den ersten Artikel
                                ArtikelFeld03.setText(artikelbezeichnung);
                                BildFeld03.setIcon(new ImageIcon(iconPath));
                            }
                            case 4 -> {
                                // Usw...
                                ArtikelFeld04.setText(artikelbezeichnung);
                                BildFeld04.setIcon(new ImageIcon(iconPath));
                            }
                            case 5 -> {
                                ArtikelFeld05.setText(artikelbezeichnung);
                                BildFeld05.setIcon(new ImageIcon(iconPath));
                            }
                            case 6 -> {
                                ArtikelFeld06.setText(artikelbezeichnung);
                                BildFeld06.setIcon(new ImageIcon(iconPath));
                            }
                            case 7 -> {
                                ArtikelFeld07.setText(artikelbezeichnung);
                                BildFeld07.setIcon(new ImageIcon(iconPath));
                            }
                            case 8 -> {
                                ArtikelFeld08.setText(artikelbezeichnung);
                                BildFeld08.setIcon(new ImageIcon(iconPath));
                            }
                            case 9 -> {
                                ArtikelFeld09.setText(artikelbezeichnung);
                                BildFeld09.setIcon(new ImageIcon(iconPath));
                            }
                            case 10 -> {
                                ArtikelFeld10.setText(artikelbezeichnung);
                                BildFeld10.setIcon(new ImageIcon(iconPath));
                            }
                            case 11 -> {
                                ArtikelFeld11.setText(artikelbezeichnung);
                                BildFeld11.setIcon(new ImageIcon(iconPath));
                            }
                            case 12 -> {
                                ArtikelFeld12.setText(artikelbezeichnung);
                                BildFeld12.setIcon(new ImageIcon(iconPath));
                            }
                            case 13 -> {
                                ArtikelFeld13.setText(artikelbezeichnung);
                                BildFeld13.setIcon(new ImageIcon(iconPath));
                            }
                            case 14 -> {
                                ArtikelFeld14.setText(artikelbezeichnung);
                                BildFeld14.setIcon(new ImageIcon(iconPath));
                            }
                            case 15 -> {
                                ArtikelFeld15.setText(artikelbezeichnung);
                                BildFeld15.setIcon(new ImageIcon(iconPath));
                            }

                        }
                    } catch (SQLException ex) {
                        
                        System.err.println("Database error: " + ex.getMessage());
                        ArtikelFeld01.setText("Error accessing database.");
                    }
                } catch (SQLException ex) {
                  
                    System.err.println("Database error: " + ex.getMessage());
                    ArtikelFeld01.setText("Error accessing database.");
                }
            } catch (SQLException e) {
                System.out.println("Error retrieving Reihe: " + e.getMessage());
                ArtikelFeld01.setText("Error accessing database.");
            }
        }

    }   
    
    
    
    
    
    

   public void commonCode2(String Mysqllink, String username, String password, String artikelnummer, String artikelbezeichnung) {
   int neuerCid = 0;
try (Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
    // SELECT-Abfrage, um den cid für den aktuellen Artikel zu erhalten
    String sql1 = "SELECT cid FROM artikelliste WHERE artikelnummer = ?";
    try (PreparedStatement pstmt1 = conn.prepareStatement(sql1)) {
        pstmt1.setString(1, artikelnummer);
        ResultSet rs1 = pstmt1.executeQuery();
        if (rs1.next()) {
            // Speichern des aktuellen cids
            neuerCid = rs1.getInt("cid");

            // SELECT-Abfrage, um den cid für den zu aktualisierenden Artikel zu erhalten
            String sql2 = "SELECT cid FROM artikelliste WHERE Artikelbezeichnung = ?";
            try (PreparedStatement pstmt2 = conn.prepareStatement(sql2)) {
                pstmt2.setString(1, artikelbezeichnung);
                ResultSet rs2 = pstmt2.executeQuery();
                if (rs2.next()) {
                    // Speichern des zu aktualisierenden cids
                    int alterCid = rs2.getInt("cid");

                    // UPDATE-Abfrage, um den cid im artikellayout zu aktualisieren
                    String sql3 = "UPDATE artikellayout SET cid = ? WHERE cid = ? LIMIT 1";
                    try (PreparedStatement pstmt3 = conn.prepareStatement(sql3)) {
                        pstmt3.setInt(1, neuerCid);
                        pstmt3.setInt(2, alterCid);
                        pstmt3.executeUpdate();
                    } catch (SQLException ex3) {
                        // Fehlerbehandlung, falls ein Fehler beim Ausführen der UPDATE-Abfrage auftritt
                    }
                        }
                    } catch (SQLException ex2) {
                       
                    }
                }
            } catch (SQLException ex1) {
               
            }
        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        }
    }

    
    
    
}
