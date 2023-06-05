
import java.awt.Color;
import javax.swing.JLabel;




public class Vergleich {
    
    public void Vergleich(JLabel umsatzLetztesJahr, JLabel umsatzHeute, JLabel unterschiedtage, JLabel unterschied7tage) {
        try {
            // Get the values from the text fields
            double letztesJahrUmsatz = Double.parseDouble(umsatzLetztesJahr.getText());
            double heutigerUmsatz = Double.parseDouble(umsatzHeute.getText());

            // Calculate the difference and percentage change
            double difference = heutigerUmsatz - letztesJahrUmsatz;
            double percentageChange = 0.0;

            if (letztesJahrUmsatz != 0.0) {
                percentageChange = (difference / letztesJahrUmsatz) * 100;
            } else if (difference > 0) {
                percentageChange = 100.0;
            }

            // Update the "Unterschiedtage" text field with the percentage change
            String formattedPercentageChange = String.format("%.2f%%", percentageChange);
            unterschiedtage.setText(formattedPercentageChange);
            
            // Set the foreground color based on the positive or negative value
            if (difference > 0) {
                unterschiedtage.setForeground(Color.GREEN); // Custom green color
            } else if (difference < 0) {
                unterschiedtage.setForeground(Color.RED);
            } else {
                unterschiedtage.setForeground(Color.BLACK);
            }

            // Debugging: Check if the calculated percentage change is correct
            System.out.println("Percentage Change: " + formattedPercentageChange);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        
        try {
            // Get the values from the text fields
            double letztesJahrUmsatz = Double.parseDouble(umsatzLetztesJahr.getText());
            double heutigerUmsatz = Double.parseDouble(umsatzHeute.getText());

            // Calculate the difference and percentage change
            double difference = heutigerUmsatz - letztesJahrUmsatz;
            double percentageChange = 0.0;

            if (letztesJahrUmsatz != 0.0) {
                percentageChange = (difference / letztesJahrUmsatz) * 100;
            } else if (difference > 0) {
                percentageChange = 100.0;
            }

            // Update the "Unterschied7tage" text field with the percentage change
            String formattedPercentageChange = String.format("%.2f%%", percentageChange);
            unterschied7tage.setText(formattedPercentageChange);

            // Set the foreground color based on the positive or negative value
            if (difference > 0) {
                unterschied7tage.setForeground(Color.GREEN); // Custom green color
            } else if (difference < 0) {
                unterschied7tage.setForeground(Color.RED);
            } else {
                unterschied7tage.setForeground(Color.BLACK);
            }
        } catch (NumberFormatException e) {
            // Handle parsing errors
            e.printStackTrace();
        }
    }
}
