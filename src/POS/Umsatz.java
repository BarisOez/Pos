
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Umsatz {
    
   public void Umsatzheute(JLabel Umsatzheute, String Mysqllink, String username, String password) {
 
         try {
    Connection connection = DriverManager.getConnection(Mysqllink, username, password);

    // Get the current date
    LocalDate currentDate = LocalDate.now();

    // Execute the query to retrieve the Bestell_ID values from today's date in bestellungen table
    String bestellungenQuery = "SELECT Bestell_ID FROM bestellungen WHERE DATE(Bestellzeit) = ?";
    PreparedStatement bestellungenStatement = connection.prepareStatement(bestellungenQuery);
    bestellungenStatement.setDate(1, java.sql.Date.valueOf(currentDate));
    ResultSet bestellungenResultSet = bestellungenStatement.executeQuery();

    // Store the Bestell_ID values in a list
    List<String> bestellIDs = new ArrayList<>();
    while (bestellungenResultSet.next()) {
        String bestellID = bestellungenResultSet.getString("Bestell_ID");
        bestellIDs.add(bestellID);
    }

    // Close the resources for bestellungen table
    bestellungenResultSet.close();
    bestellungenStatement.close();

    // Calculate the total sum of Preis from bestellungen_detail table for the retrieved Bestell_IDs
    double totalUmsatz = 0.0;
    String bestellungenDetailQuery = "SELECT SUM(Preis) AS total FROM bestellungen_detail WHERE Bestell_ID = ?";
    PreparedStatement bestellungenDetailStatement = connection.prepareStatement(bestellungenDetailQuery);
    for (String bestellID : bestellIDs) {
        bestellungenDetailStatement.setString(1, bestellID);
        ResultSet bestellungenDetailResultSet = bestellungenDetailStatement.executeQuery();
        if (bestellungenDetailResultSet.next()) {
            double preis = bestellungenDetailResultSet.getDouble("total");
            totalUmsatz += preis;
        }
        bestellungenDetailResultSet.close();
    }

    // Update the "Umsatzheute" text label with the totalUmsatz value
    String formattedTotalUmsatz = String.format("%.2f", totalUmsatz);
    Umsatzheute.setText(formattedTotalUmsatz);

    // Close the resources for bestellungen_detail table
    bestellungenDetailStatement.close();

    // Close the connection
    connection.close();
} catch (SQLException e) {
    e.printStackTrace();
}
 }   

 
public void Umsatz7tage(JLabel UmsatzdieseWoche,String Mysqllink, String username, String password ) {
 
 

try {
    Connection connection = DriverManager.getConnection(Mysqllink, username, password);

   
    LocalDate currentDate = LocalDate.now();
    LocalDate lastWeekDate = currentDate.minusDays(6); 


    String bestellungenQuery = "SELECT Bestell_ID FROM bestellungen WHERE DATE(Bestellzeit) BETWEEN ? AND ?";
    PreparedStatement bestellungenStatement = connection.prepareStatement(bestellungenQuery);
    bestellungenStatement.setDate(1, java.sql.Date.valueOf(lastWeekDate));
    bestellungenStatement.setDate(2, java.sql.Date.valueOf(currentDate));
    ResultSet bestellungenResultSet = bestellungenStatement.executeQuery();


    List<String> bestellIDs = new ArrayList<>();
    while (bestellungenResultSet.next()) {
        String bestellID = bestellungenResultSet.getString("Bestell_ID");
        bestellIDs.add(bestellID);
    }


    bestellungenResultSet.close();
    bestellungenStatement.close();


    double totalUmsatz = 0.0;
    String bestellungenDetailQuery = "SELECT SUM(Preis) AS total FROM bestellungen_detail WHERE Bestell_ID = ?";
    PreparedStatement bestellungenDetailStatement = connection.prepareStatement(bestellungenDetailQuery);
    for (String bestellID : bestellIDs) {
        bestellungenDetailStatement.setString(1, bestellID);
        ResultSet bestellungenDetailResultSet = bestellungenDetailStatement.executeQuery();
        if (bestellungenDetailResultSet.next()) {
            double preis = bestellungenDetailResultSet.getDouble("total");
            totalUmsatz += preis;
        }
        bestellungenDetailResultSet.close();
    }


    String formattedTotalUmsatz = String.format("%.2f", totalUmsatz);
    UmsatzdieseWoche.setText(formattedTotalUmsatz);

    bestellungenDetailStatement.close();


    connection.close();
} catch (SQLException e) {
    e.printStackTrace();
}   
   
   
   
}
public void UmsatzletztesJahrTag(JLabel UmsatzletztesJahr, String Mysqllink, String username, String password){
 
 try {
    Connection connection = DriverManager.getConnection(Mysqllink, username, password);


    LocalDate currentDate = LocalDate.now();
    LocalDate oneYearAgoDate = currentDate.minusYears(1);

  
    String bestellungenQuery = "SELECT Bestell_ID FROM bestellungen WHERE DATE(Bestellzeit) = ?";
    PreparedStatement bestellungenStatement = connection.prepareStatement(bestellungenQuery);
    bestellungenStatement.setDate(1, java.sql.Date.valueOf(oneYearAgoDate));
    ResultSet bestellungenResultSet = bestellungenStatement.executeQuery();


    List<String> bestellIDs = new ArrayList<>();
    while (bestellungenResultSet.next()) {
        String bestellID = bestellungenResultSet.getString("Bestell_ID");
        bestellIDs.add(bestellID);
    }


    bestellungenResultSet.close();
    bestellungenStatement.close();


    double totalUmsatz = 0.0;
    String bestellungenDetailQuery = "SELECT SUM(Preis) AS total FROM bestellungen_detail WHERE Bestell_ID = ?";
    PreparedStatement bestellungenDetailStatement = connection.prepareStatement(bestellungenDetailQuery);
    for (String bestellID : bestellIDs) {
        bestellungenDetailStatement.setString(1, bestellID);
        ResultSet bestellungenDetailResultSet = bestellungenDetailStatement.executeQuery();
        if (bestellungenDetailResultSet.next()) {
            double preis = bestellungenDetailResultSet.getDouble("total");
            totalUmsatz += preis;
        }
        bestellungenDetailResultSet.close();
    }

    String formattedTotalUmsatz = String.format("%.2f", totalUmsatz);
    UmsatzletztesJahr.setText(formattedTotalUmsatz);


    bestellungenDetailStatement.close();

    connection.close();
} catch (SQLException e) {
    e.printStackTrace();
}

 
 }

 public void UmsatzletztesJahr7Tage (JLabel UmsatzdieseWocheLetztesJahr, JLabel UmsatzdieseWoche, JLabel Unterschiedtage,String Mysqllink, String username, String password) {
 
 try {
    Connection connection = DriverManager.getConnection(Mysqllink, username, password);

        // Aktuelles Datum
    LocalDate currentDate = LocalDate.now();
     // Datum vor einer Woche im letzten Jahr
    LocalDate lastWeekDateLastYear = currentDate.minusYears(1).minusDays(6);

 // SQL-Abfrage für die Bestell-IDs zwischen den beiden Daten
    String bestellungenQuery = "SELECT Bestell_ID FROM bestellungen WHERE DATE(Bestellzeit) BETWEEN ? AND ?";
    // Vorbereiten des vorbereiteten Statements
    PreparedStatement bestellungenStatement = connection.prepareStatement(bestellungenQuery);
    bestellungenStatement.setDate(1, java.sql.Date.valueOf(lastWeekDateLastYear));
    bestellungenStatement.setDate(2, java.sql.Date.valueOf(currentDate.minusYears(1)));
    ResultSet bestellungenResultSet = bestellungenStatement.executeQuery();

// Ausführen der Abfrage und Erhalten des ResultSets
    List<String> bestellIDs = new ArrayList<>();
    while (bestellungenResultSet.next()) {
        String bestellID = bestellungenResultSet.getString("Bestell_ID");
        bestellIDs.add(bestellID);
    }

    bestellungenResultSet.close();
    bestellungenStatement.close();

    
    double totalUmsatz = 0.0;
    String bestellungenDetailQuery = "SELECT SUM(Preis) AS total FROM bestellungen_detail WHERE Bestell_ID = ?";
    PreparedStatement bestellungenDetailStatement = connection.prepareStatement(bestellungenDetailQuery);
    for (String bestellID : bestellIDs) {
        bestellungenDetailStatement.setString(1, bestellID);
        ResultSet bestellungenDetailResultSet = bestellungenDetailStatement.executeQuery();
        if (bestellungenDetailResultSet.next()) {
            double preis = bestellungenDetailResultSet.getDouble("total");
            totalUmsatz += preis;
        }
        bestellungenDetailResultSet.close();
    }


    String formattedTotalUmsatz = String.format("%.2f", totalUmsatz);
    UmsatzdieseWocheLetztesJahr.setText(formattedTotalUmsatz);


    double currentYearUmsatz = Double.parseDouble(UmsatzdieseWoche.getText());
    double lastYearUmsatz = Double.parseDouble(UmsatzdieseWocheLetztesJahr.getText());
    double percentageDifference = ((currentYearUmsatz - lastYearUmsatz) / lastYearUmsatz) * 100.0;


    String formattedPercentageDifference = String.format("%.2f", percentageDifference) + "%";
    Unterschiedtage.setText(formattedPercentageDifference);

   
    if (percentageDifference > 0) {
        Unterschiedtage.setForeground(new Color(0, 153, 51)); 
    } else if (percentageDifference < 0) {
        Unterschiedtage.setForeground(Color.RED);
    }

  
    bestellungenDetailStatement.close();


    connection.close();
} catch (SQLException e) {
    e.printStackTrace();
}
 
 

 

 
 }











}
 
  
    
    
    
    
    

