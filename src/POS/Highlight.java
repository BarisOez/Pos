

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import java.util.Random;












public class Highlight extends javax.swing.JFrame {


Admin admin = new Admin();
String Mysqllink = admin.Mysqllink;
String password = admin.password;
String username = admin.username;
private String reihe;
double total = 0.0;

public String Artikelwert;

public boolean Supplementtester01 = false;
public boolean Supplementtester02 = false;
public boolean Supplementtester03 = false;
public boolean Supplementtester04 = false;


    public Highlight() {
        initComponents();

        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
setBounds(0, 0, screenSize.width, screenSize.height);
setExtendedState(Highlight.MAXIMIZED_BOTH);
    }



public class ClockUpdater extends Thread {
    
    private final JLabel uhrzeitLabel;

    public ClockUpdater(JLabel uhrzeitLabel) {
        this.uhrzeitLabel = uhrzeitLabel;
    }

    
    @Override
    public void run() {
        while (true) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            String time = dateFormat.format(new Date());
            uhrzeitLabel.setText(time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
       
            }
            // Kommentar: Diese Methode wird in einem separaten Thread ausgeführt und aktualisiert regelmäßig die Uhrzeitanzeige.
// Sie verwendet das SimpleDateFormat-Objekt, um das aktuelle Datum und die Uhrzeit im gewünschten Format abzurufen.
// Der Text der uhrzeitLabel-Komponente wird mit der aktuellen Uhrzeit aktualisiert.
// Der Thread wird dann für eine Sekunde (1000 Millisekunden) pausiert, bevor die Schleife erneut durchlaufen wird.
// Wenn der Thread unterbrochen wird (z.B. durch Interrupt), wird keine Aktion ausgeführt.
        }
    }
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Passwordfeld = new javax.swing.JDialog();
        Passlabel = new javax.swing.JPanel();
        Cancel = new javax.swing.JLabel();
        Kennwort = new javax.swing.JPasswordField();
        jLabel79 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        senden = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        Bezahlen = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        AnzeigeTotal = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Bestätigung = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Abholcode = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Countdown = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        Zahl = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        LinkerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Popup = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        ObererPanel = new javax.swing.JPanel();
        jLabel_GutscheincodeEinlosen = new javax.swing.JLabel();
        MittlererPanel = new javax.swing.JPanel();
        Kategorie1_1 = new javax.swing.JLabel();
        Kategorie1_3 = new javax.swing.JLabel();
        Kategorie1_4 = new javax.swing.JLabel();
        Kategorie1_7 = new javax.swing.JLabel();
        Kategorie1_2 = new javax.swing.JLabel();
        Kategorie2_4 = new javax.swing.JLabel();
        Kategorie2_7 = new javax.swing.JLabel();
        Kategorie2_2 = new javax.swing.JLabel();
        Kategorie2_1 = new javax.swing.JLabel();
        Kategorie2_3 = new javax.swing.JLabel();
        Kategorie1_5 = new javax.swing.JLabel();
        Kategorie1_6 = new javax.swing.JLabel();
        Kategorie2_5 = new javax.swing.JLabel();
        Kategorie2_6 = new javax.swing.JLabel();
        UntererPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        Uhrzeit = new javax.swing.JLabel();
        Parent = new javax.swing.JPanel();
        Highlights = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Liste1_2 = new javax.swing.JPanel();
        Salate = new javax.swing.JPanel();
        Titel = new javax.swing.JLabel();
        Text06 = new javax.swing.JLabel();
        Nichtverfügbar1 = new javax.swing.JLabel();
        Nichtverfügbar2 = new javax.swing.JLabel();
        Nichtverfügbar3 = new javax.swing.JLabel();
        Nichtverfügbar4 = new javax.swing.JLabel();
        Nichtverfügbar5 = new javax.swing.JLabel();
        Nichtverfügbar6 = new javax.swing.JLabel();
        Nichtverfügbar7 = new javax.swing.JLabel();
        Nichtverfügbar8 = new javax.swing.JLabel();
        Nichtverfügbar9 = new javax.swing.JLabel();
        Nichtverfügbar10 = new javax.swing.JLabel();
        Nichtverfügbar11 = new javax.swing.JLabel();
        Nichtverfügbar12 = new javax.swing.JLabel();
        Nichtverfügbar13 = new javax.swing.JLabel();
        Nichtverfügbar14 = new javax.swing.JLabel();
        Nichtverfügbar15 = new javax.swing.JLabel();
        Text01 = new javax.swing.JLabel();
        Text07 = new javax.swing.JLabel();
        Text13 = new javax.swing.JLabel();
        Text12 = new javax.swing.JLabel();
        Text08 = new javax.swing.JLabel();
        Text02 = new javax.swing.JLabel();
        Text03 = new javax.swing.JLabel();
        Text04 = new javax.swing.JLabel();
        Text05 = new javax.swing.JLabel();
        Text10 = new javax.swing.JLabel();
        Text15 = new javax.swing.JLabel();
        Text14 = new javax.swing.JLabel();
        Text09 = new javax.swing.JLabel();
        Text11 = new javax.swing.JLabel();
        Image01 = new javax.swing.JLabel();
        Image06 = new javax.swing.JLabel();
        Image11 = new javax.swing.JLabel();
        Image02 = new javax.swing.JLabel();
        Image03 = new javax.swing.JLabel();
        Image04 = new javax.swing.JLabel();
        Image05 = new javax.swing.JLabel();
        Image07 = new javax.swing.JLabel();
        Image08 = new javax.swing.JLabel();
        Image09 = new javax.swing.JLabel();
        Image10 = new javax.swing.JLabel();
        Image12 = new javax.swing.JLabel();
        Image13 = new javax.swing.JLabel();
        Image14 = new javax.swing.JLabel();
        Image15 = new javax.swing.JLabel();
        Salate03 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Artikelbezeichnung = new javax.swing.JLabel();
        Bildanzeige = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Beschreibung = new javax.swing.JTextArea();
        Artikelnummer = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Kalorienanzeige = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Zutaten = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Supplement03 = new javax.swing.JLabel();
        Supplement04Nok = new javax.swing.JLabel();
        Supplement04Extra = new javax.swing.JLabel();
        Supplement04Ok = new javax.swing.JLabel();
        Supplement02Extra = new javax.swing.JLabel();
        Supplement02Ok = new javax.swing.JLabel();
        Supplement02Nok = new javax.swing.JLabel();
        Supplement03Extra = new javax.swing.JLabel();
        Supplement03Ok = new javax.swing.JLabel();
        Supplement01Extra = new javax.swing.JLabel();
        Supplement01Ok = new javax.swing.JLabel();
        Supplement01Nok = new javax.swing.JLabel();
        Supplement01 = new javax.swing.JLabel();
        Preis = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Supplement03Preis = new javax.swing.JLabel();
        Supplement04Preis = new javax.swing.JLabel();
        Supplement02Preis = new javax.swing.JLabel();
        Supplement01Preis = new javax.swing.JLabel();
        Supplement02 = new javax.swing.JLabel();
        Supplement03Nok = new javax.swing.JLabel();
        Supplement04 = new javax.swing.JLabel();
        Supplement02Plus = new javax.swing.JLabel();
        Supplement04Plus = new javax.swing.JLabel();
        Supplement01Plus = new javax.swing.JLabel();
        Supplement03Plus = new javax.swing.JLabel();
        Dauer = new javax.swing.JLabel();
        Sofortfeld = new javax.swing.JLabel();
        Minuten = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Veganfeld3 = new javax.swing.JLabel();
        VegiFeld3 = new javax.swing.JLabel();
        Biofeld3 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();

        Passwordfeld.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Passwordfeld.setAutoRequestFocus(false);
        Passwordfeld.setBackground(new java.awt.Color(204, 0, 0));
        Passwordfeld.setLocation(new java.awt.Point(900, 500));
        Passwordfeld.setModalityType(null);
        Passwordfeld.setUndecorated(true);
        Passwordfeld.setResizable(false);
        Passwordfeld.setSize(new java.awt.Dimension(400, 300));
        Passwordfeld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordfeldMouseClicked(evt);
            }
        });
        Passwordfeld.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                PasswordfeldWindowClosed(evt);
            }
        });

        Passlabel.setBackground(new java.awt.Color(45, 39, 39));
        Passlabel.setMinimumSize(new java.awt.Dimension(400, 200));
        Passlabel.setPreferredSize(new java.awt.Dimension(600, 600));

        Cancel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Cancel.setForeground(new java.awt.Color(255, 255, 255));
        Cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cancel.setText("Cancel");
        Cancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelMouseClicked(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("Anmelden");

        jLabel88.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setText("User:");

        jLabel92.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("Kennwort:");

        User.setPreferredSize(new java.awt.Dimension(90, 22));
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });

        senden.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        senden.setForeground(new java.awt.Color(255, 255, 255));
        senden.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senden.setText("Senden");
        senden.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        senden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PasslabelLayout = new javax.swing.GroupLayout(Passlabel);
        Passlabel.setLayout(PasslabelLayout);
        PasslabelLayout.setHorizontalGroup(
            PasslabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PasslabelLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel79)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PasslabelLayout.createSequentialGroup()
                .addGroup(PasslabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PasslabelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(PasslabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel88)
                            .addComponent(jLabel92))
                        .addGap(18, 18, 18)
                        .addGroup(PasslabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Kennwort)))
                    .addGroup(PasslabelLayout.createSequentialGroup()
                        .addGap(0, 260, Short.MAX_VALUE)
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(senden, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
        );
        PasslabelLayout.setVerticalGroup(
            PasslabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PasslabelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(PasslabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PasslabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(Kennwort, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(PasslabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senden, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(328, Short.MAX_VALUE))
        );

        jLabel78.setText("jLabel78");

        javax.swing.GroupLayout PasswordfeldLayout = new javax.swing.GroupLayout(Passwordfeld.getContentPane());
        Passwordfeld.getContentPane().setLayout(PasswordfeldLayout);
        PasswordfeldLayout.setHorizontalGroup(
            PasswordfeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Passlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(PasswordfeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PasswordfeldLayout.createSequentialGroup()
                    .addGap(184, 184, 184)
                    .addComponent(jLabel78)
                    .addContainerGap(173, Short.MAX_VALUE)))
        );
        PasswordfeldLayout.setVerticalGroup(
            PasswordfeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Passlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addGroup(PasswordfeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PasswordfeldLayout.createSequentialGroup()
                    .addGap(187, 187, 187)
                    .addComponent(jLabel78)
                    .addContainerGap(97, Short.MAX_VALUE)))
        );

        Bezahlen.setLocation(new java.awt.Point(700, 150));
        Bezahlen.setMinimumSize(new java.awt.Dimension(700, 820));
        Bezahlen.setUndecorated(true);
        Bezahlen.setResizable(false);
        Bezahlen.getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(130, 205, 71), 3, true));
        jPanel3.setMinimumSize(new java.awt.Dimension(700, 820));
        jPanel3.setPreferredSize(new java.awt.Dimension(700, 820));
        jPanel3.setLayout(null);

        jLabel15.setBackground(new java.awt.Color(232, 232, 232));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Weiter einkaufen");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel15);
        jLabel15.setBounds(90, 690, 200, 60);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel16.setText("Vielen Dank für Ihre Bestellung:");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(120, 50, 510, 100);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel18.setText("Bitte wählen Sie eine Zahlungsmethode aus:");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(130, 180, 510, 30);

        jPanel5.setBackground(new java.awt.Color(232, 232, 232));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/OIP.jpg"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Kartenzahlung");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(49, 49, 49))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel3.add(jPanel5);
        jPanel5.setBounds(130, 250, 210, 260);

        jPanel7.setBackground(new java.awt.Color(130, 205, 71));
        jPanel7.setLayout(null);

        AnzeigeTotal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        AnzeigeTotal.setForeground(new java.awt.Color(0, 0, 0));
        AnzeigeTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AnzeigeTotal.setText("Wert");
        jPanel7.add(AnzeigeTotal);
        AnzeigeTotal.setBounds(110, 0, 190, 90);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("CHF");
        jPanel7.add(jLabel26);
        jLabel26.setBounds(10, 10, 100, 70);

        jPanel3.add(jPanel7);
        jPanel7.setBounds(330, 680, 300, 90);

        jPanel8.setBackground(new java.awt.Color(232, 232, 232));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/TWINT_Logo-600x600.jpg"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Twint");

        jPanel6.setBackground(new java.awt.Color(232, 232, 232));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Twint");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/TWINT_Logo-600x600.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel23))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel22)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel24))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(jPanel8);
        jPanel8.setBounds(360, 250, 230, 260);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Zu bezahlen:");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(380, 620, 201, 48);

        Bezahlen.getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 700, 820);

        Bestätigung.setLocation(new java.awt.Point(700, 150));
        Bestätigung.setMinimumSize(new java.awt.Dimension(700, 820));
        Bestätigung.setUndecorated(true);
        Bestätigung.setResizable(false);
        Bestätigung.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                BestätigungWindowOpened(evt);
            }
        });
        Bestätigung.getContentPane().setLayout(null);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(130, 205, 71), 3, true));
        jPanel9.setMinimumSize(new java.awt.Dimension(700, 820));
        jPanel9.setLayout(null);

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel10.setLayout(null);

        jLabel35.setText("   Status Ihrer Bestellung. ");
        jPanel10.add(jLabel35);
        jLabel35.setBounds(60, 110, 190, 20);

        jLabel32.setText("Folgen Sie dem Anweisungsterminal betreffend");
        jPanel10.add(jLabel32);
        jLabel32.setBounds(70, 90, 290, 30);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel29.setText("Ihr Abholcode lautet:");
        jPanel10.add(jLabel29);
        jLabel29.setBounds(110, 160, 240, 30);

        Abholcode.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Abholcode.setText("3533");
        jPanel10.add(Abholcode);
        Abholcode.setBounds(150, 200, 130, 50);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel28.setText("Zahlung erfolgreich");
        jPanel10.add(jLabel28);
        jLabel28.setBounds(50, 10, 500, 80);

        jPanel9.add(jPanel10);
        jPanel10.setBounds(160, 40, 400, 310);

        Countdown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/product-collection.png"))); // NOI18N
        jPanel9.add(Countdown);
        Countdown.setBounds(100, 270, 510, 450);

        jLabel36.setText("Fenster schliesst in ");
        jPanel9.add(jLabel36);
        jLabel36.setBounds(240, 780, 160, 20);

        Zahl.setText("30");
        jPanel9.add(Zahl);
        Zahl.setBounds(360, 780, 20, 20);

        jLabel38.setText("Sekunden");
        jPanel9.add(jLabel38);
        jLabel38.setBounds(380, 780, 60, 20);

        jLabel37.setBackground(new java.awt.Color(55, 51, 49));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Neue Bestellung");
        jLabel37.setOpaque(true);
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel37);
        jLabel37.setBounds(230, 720, 230, 50);

        Bestätigung.getContentPane().add(jPanel9);
        jPanel9.setBounds(0, 0, 700, 820);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HappyFood V1");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(37, 37, 37));
        setFocusCycleRoot(false);
        setFocusable(false);
        setFocusableWindowState(false);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LinkerPanel.setBackground(new java.awt.Color(255, 255, 255));
        LinkerPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LinkerPanel.setPreferredSize(new java.awt.Dimension(510, 1000));
        LinkerPanel.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/Screenshot (12).png"))); // NOI18N
        LinkerPanel.add(jLabel1);
        jLabel1.setBounds(100, 60, 317, 150);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bestellübersicht");
        jLabel2.setMinimumSize(new java.awt.Dimension(43, 16));
        LinkerPanel.add(jLabel2);
        jLabel2.setBounds(140, 230, 228, 29);
        LinkerPanel.add(jSeparator1);
        jSeparator1.setBounds(591, 215, 458, 10);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("45565464"); // NOI18N
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        LinkerPanel.add(jLabel3);
        jLabel3.setBounds(591, 237, 182, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Quinoasalat mit Erbsen");
        LinkerPanel.add(jLabel4);
        jLabel4.setBounds(591, 273, 265, 32);

        jLabel5.setText("- Ohne Zwiebeln");
        LinkerPanel.add(jLabel5);
        jLabel5.setBounds(591, 311, 88, 16);

        jLabel6.setText("- Ohne Gurken");
        LinkerPanel.add(jLabel6);
        jLabel6.setBounds(591, 333, 78, 16);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        LinkerPanel.add(jSpinner1);
        jSpinner1.setBounds(591, 355, 68, 26);
        LinkerPanel.add(jSeparator2);
        jSeparator2.setBounds(591, 383, 458, 10);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("23.70 ");
        LinkerPanel.add(jLabel7);
        jLabel7.setBounds(1015, 358, 34, 16);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/5421709519.png"))); // NOI18N
        jLabel8.setVerifyInputWhenFocusTarget(false);
        LinkerPanel.add(jLabel8);
        jLabel8.setBounds(1044, 243, 19, 19);

        Popup.setBorder(null);
        Popup.setClosable(true);
        Popup.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        Popup.setToolTipText("");
        Popup.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Popup.setVisible(true);
        Popup.getContentPane().setLayout(null);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Popup.getContentPane().add(jButton1);
        jButton1.setBounds(453, 441, 79, 27);

        LinkerPanel.add(Popup);
        Popup.setBounds(535, 454, 620, 540);

        jLabel9.setBackground(new java.awt.Color(130, 205, 71));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Bezahlen");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        LinkerPanel.add(jLabel9);
        jLabel9.setBounds(0, 885, 511, 115);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        LinkerPanel.add(jPanel1);
        jPanel1.setBounds(0, 310, 510, 30);

        jScrollPane4.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane4.setBorder(null);
        jScrollPane4.setToolTipText("");
        jScrollPane4.setColumnHeaderView(null);
        jScrollPane4.setEnabled(false);
        jScrollPane4.getViewport().setBackground(Color.WHITE);
        jScrollPane4.setRowHeaderView(null);

        Table.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", ""
            }
        ));
        Table.setBackground(Color.WHITE);
        Table.setShowHorizontalLines(false);
        Table.setShowVerticalLines(false);
        Table.getTableHeader().setVisible(false);
        Table.getTableHeader().setBackground(Color.WHITE);
        Table.getColumnModel().getColumn(0).setCellRenderer(renderer);
        Table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Table.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Table.setGridColor(new java.awt.Color(255, 255, 255));
        Table.setInheritsPopupMenu(true);
        Table.setOpaque(false);
        Table.setRequestFocusEnabled(false);
        Table.setRowHeight(40);
        Table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        Table.getTableHeader().setResizingAllowed(false);
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(0).setPreferredWidth(410);
            Table.getColumnModel().getColumn(1).setPreferredWidth(1);
            Table.getColumnModel().getColumn(2).setPreferredWidth(50);
        }
        Table.getAccessibleContext().setAccessibleName("");
        Table.getAccessibleContext().setAccessibleDescription("");

        LinkerPanel.add(jScrollPane4);
        jScrollPane4.setBounds(10, 320, 500, 440);
        LinkerPanel.add(jSeparator3);
        jSeparator3.setBounds(50, 270, 410, 10);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel33.setText("Total:  CHF");
        LinkerPanel.add(jLabel33);
        jLabel33.setBounds(175, 800, 190, 50);

        Total.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Total.setText("0");
        LinkerPanel.add(Total);
        Total.setBounds(370, 800, 140, 50);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/421709519.png"))); // NOI18N
        jLabel30.setText("Warenkorb leeren");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        LinkerPanel.add(jLabel30);
        jLabel30.setBounds(280, 280, 160, 30);

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/421709519.png"))); // NOI18N
        jLabel31.setText("Letzten Eintrag löschen");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        LinkerPanel.add(jLabel31);
        jLabel31.setBounds(90, 280, 200, 30);

        getContentPane().add(LinkerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1040));

        ObererPanel.setBackground(new java.awt.Color(55, 51, 49));
        ObererPanel.setPreferredSize(new java.awt.Dimension(1390, 90));

        jLabel_GutscheincodeEinlosen.setBackground(new java.awt.Color(55, 51, 49));
        jLabel_GutscheincodeEinlosen.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel_GutscheincodeEinlosen.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_GutscheincodeEinlosen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_GutscheincodeEinlosen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_GutscheincodeEinlosen.setOpaque(true);
        jLabel_GutscheincodeEinlosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_GutscheincodeEinlosenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_GutscheincodeEinlosenMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ObererPanelLayout = new javax.swing.GroupLayout(ObererPanel);
        ObererPanel.setLayout(ObererPanelLayout);
        ObererPanelLayout.setHorizontalGroup(
            ObererPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ObererPanelLayout.createSequentialGroup()
                .addComponent(jLabel_GutscheincodeEinlosen, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1189, Short.MAX_VALUE))
        );
        ObererPanelLayout.setVerticalGroup(
            ObererPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ObererPanelLayout.createSequentialGroup()
                .addComponent(jLabel_GutscheincodeEinlosen, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        getContentPane().add(ObererPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 1410, -1));

        MittlererPanel.setBackground(new java.awt.Color(37, 37, 37));
        MittlererPanel.setForeground(new java.awt.Color(255, 255, 255));
        MittlererPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MittlererPanel.setDoubleBuffered(false);
        MittlererPanel.setFocusable(false);
        MittlererPanel.setRequestFocusEnabled(false);
        MittlererPanel.setVerifyInputWhenFocusTarget(false);
        MittlererPanel.setLayout(null);

        Kategorie1_1.setBackground(new java.awt.Color(37, 37, 37));
        Kategorie1_1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Kategorie1_1.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie1_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie1_1.setText("Highlights");
        Kategorie1_1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        Kategorie1_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kategorie1_1.setOpaque(true);
        Kategorie1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kategorie1_1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Kategorie1_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Kategorie1_1MouseExited(evt);
            }
        });
        MittlererPanel.add(Kategorie1_1);
        Kategorie1_1.setBounds(40, 310, 175, 70);

        Kategorie1_3.setBackground(new java.awt.Color(37, 37, 37));
        Kategorie1_3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Kategorie1_3.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie1_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie1_3.setText("Bowls");
        Kategorie1_3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        Kategorie1_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kategorie1_3.setOpaque(true);
        Kategorie1_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kategorie1_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Kategorie1_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Kategorie1_3MouseExited(evt);
            }
        });
        MittlererPanel.add(Kategorie1_3);
        Kategorie1_3.setBounds(260, 20, 190, 70);

        Kategorie1_4.setBackground(new java.awt.Color(37, 37, 37));
        Kategorie1_4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Kategorie1_4.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie1_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie1_4.setText("Vegetarisch");
        Kategorie1_4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        Kategorie1_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kategorie1_4.setOpaque(true);
        Kategorie1_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kategorie1_4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Kategorie1_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Kategorie1_4MouseExited(evt);
            }
        });
        MittlererPanel.add(Kategorie1_4);
        Kategorie1_4.setBounds(480, 20, 190, 70);

        Kategorie1_7.setBackground(new java.awt.Color(37, 37, 37));
        Kategorie1_7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Kategorie1_7.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie1_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie1_7.setText("Suppen");
        Kategorie1_7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        Kategorie1_7.setOpaque(true);
        Kategorie1_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kategorie1_7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Kategorie1_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Kategorie1_7MouseExited(evt);
            }
        });
        MittlererPanel.add(Kategorie1_7);
        Kategorie1_7.setBounds(1140, 20, 190, 70);

        Kategorie1_2.setBackground(new java.awt.Color(37, 37, 37));
        Kategorie1_2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Kategorie1_2.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie1_2.setText("Salate");
        Kategorie1_2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        Kategorie1_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kategorie1_2.setOpaque(true);
        Kategorie1_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kategorie1_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Kategorie1_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Kategorie1_2MouseExited(evt);
            }
        });
        MittlererPanel.add(Kategorie1_2);
        Kategorie1_2.setBounds(40, 20, 190, 70);

        Kategorie2_4.setBackground(new java.awt.Color(37, 37, 37));
        Kategorie2_4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Kategorie2_4.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie2_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie2_4.setText("Low Carb");
        Kategorie2_4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        Kategorie2_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kategorie2_4.setOpaque(true);
        Kategorie2_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kategorie2_4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Kategorie2_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Kategorie2_4MouseExited(evt);
            }
        });
        MittlererPanel.add(Kategorie2_4);
        Kategorie2_4.setBounds(700, 110, 190, 70);

        Kategorie2_7.setBackground(new java.awt.Color(37, 37, 37));
        Kategorie2_7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Kategorie2_7.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie2_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie2_7.setText("Weiteres");
        Kategorie2_7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        Kategorie2_7.setOpaque(true);
        Kategorie2_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kategorie2_7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Kategorie2_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Kategorie2_7MouseExited(evt);
            }
        });
        MittlererPanel.add(Kategorie2_7);
        Kategorie2_7.setBounds(1120, 270, 175, 70);

        Kategorie2_2.setBackground(new java.awt.Color(37, 37, 37));
        Kategorie2_2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Kategorie2_2.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie2_2.setText("Vitamin Boosters");
        Kategorie2_2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        Kategorie2_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kategorie2_2.setOpaque(true);
        Kategorie2_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kategorie2_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Kategorie2_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Kategorie2_2MouseExited(evt);
            }
        });
        MittlererPanel.add(Kategorie2_2);
        Kategorie2_2.setBounds(260, 110, 190, 70);

        Kategorie2_1.setBackground(new java.awt.Color(37, 37, 37));
        Kategorie2_1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Kategorie2_1.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie2_1.setText("Smoothies");
        Kategorie2_1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        Kategorie2_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kategorie2_1.setOpaque(true);
        Kategorie2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kategorie2_1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Kategorie2_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Kategorie2_1MouseExited(evt);
            }
        });
        MittlererPanel.add(Kategorie2_1);
        Kategorie2_1.setBounds(40, 110, 190, 70);

        Kategorie2_3.setBackground(new java.awt.Color(37, 37, 37));
        Kategorie2_3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Kategorie2_3.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie2_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie2_3.setText("Protein Drinks");
        Kategorie2_3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        Kategorie2_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kategorie2_3.setOpaque(true);
        Kategorie2_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kategorie2_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Kategorie2_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Kategorie2_3MouseExited(evt);
            }
        });
        MittlererPanel.add(Kategorie2_3);
        Kategorie2_3.setBounds(480, 110, 190, 70);

        Kategorie1_5.setBackground(new java.awt.Color(37, 37, 37));
        Kategorie1_5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Kategorie1_5.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie1_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie1_5.setText("Sandwiches");
        Kategorie1_5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        Kategorie1_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kategorie1_5.setOpaque(true);
        Kategorie1_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kategorie1_5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Kategorie1_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Kategorie1_5MouseExited(evt);
            }
        });
        MittlererPanel.add(Kategorie1_5);
        Kategorie1_5.setBounds(700, 20, 190, 70);

        Kategorie1_6.setBackground(new java.awt.Color(37, 37, 37));
        Kategorie1_6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Kategorie1_6.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie1_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie1_6.setText("Burgers/Pizzen");
        Kategorie1_6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        Kategorie1_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kategorie1_6.setOpaque(true);
        Kategorie1_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kategorie1_6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Kategorie1_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Kategorie1_6MouseExited(evt);
            }
        });
        MittlererPanel.add(Kategorie1_6);
        Kategorie1_6.setBounds(920, 20, 190, 70);

        Kategorie2_5.setBackground(new java.awt.Color(37, 37, 37));
        Kategorie2_5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Kategorie2_5.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie2_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie2_5.setText("Getränke");
        Kategorie2_5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        Kategorie2_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kategorie2_5.setOpaque(true);
        Kategorie2_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kategorie2_5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Kategorie2_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Kategorie2_5MouseExited(evt);
            }
        });
        MittlererPanel.add(Kategorie2_5);
        Kategorie2_5.setBounds(920, 110, 190, 70);

        Kategorie2_6.setBackground(new java.awt.Color(37, 37, 37));
        Kategorie2_6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Kategorie2_6.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie2_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie2_6.setText("Desserts");
        Kategorie2_6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        Kategorie2_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kategorie2_6.setOpaque(true);
        Kategorie2_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kategorie2_6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Kategorie2_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Kategorie2_6MouseExited(evt);
            }
        });
        MittlererPanel.add(Kategorie2_6);
        Kategorie2_6.setBounds(1140, 110, 190, 70);

        getContentPane().add(MittlererPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 1410, 190));

        UntererPanel.setBackground(new java.awt.Color(55, 51, 49));

        jLabel14.setText("Beenden");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1global.png"))); // NOI18N
        jLabel77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel77MouseClicked(evt);
            }
        });

        Uhrzeit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Uhrzeit.setForeground(new java.awt.Color(255, 255, 255));
        Uhrzeit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ClockUpdater clockUpdater = new ClockUpdater(Uhrzeit);
        clockUpdater.start();

        javax.swing.GroupLayout UntererPanelLayout = new javax.swing.GroupLayout(UntererPanel);
        UntererPanel.setLayout(UntererPanelLayout);
        UntererPanelLayout.setHorizontalGroup(
            UntererPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UntererPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 855, Short.MAX_VALUE)
                .addComponent(Uhrzeit, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(749, 749, 749)
                .addComponent(jLabel77)
                .addGap(16, 16, 16))
        );
        UntererPanelLayout.setVerticalGroup(
            UntererPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UntererPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UntererPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UntererPanelLayout.createSequentialGroup()
                        .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                        .addContainerGap(10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UntererPanelLayout.createSequentialGroup()
                        .addGroup(UntererPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Uhrzeit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        getContentPane().add(UntererPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1040, 1920, 40));

        Parent.setBackground(new java.awt.Color(37, 37, 37));
        Parent.setLayout(new java.awt.CardLayout());

        Highlights.setBackground(new java.awt.Color(37, 37, 37));
        Highlights.setForeground(new java.awt.Color(255, 255, 255));
        Highlights.setLayout(null);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/https___s3.us-east-1.amazonaws.com_uploads.thevendry.co_24984_1674162607635_download-29.jpg"))); // NOI18N
        Highlights.add(jLabel39);
        jLabel39.setBounds(40, 170, 1140, 550);

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Herzlich Willkommen.");
        Highlights.add(jLabel56);
        jLabel56.setBounds(40, 40, 800, 50);

        jScrollPane3.setBackground(new java.awt.Color(37, 37, 37));
        jScrollPane3.setBorder(null);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setWheelScrollingEnabled(false);

        jTextArea1.setBackground(new java.awt.Color(37, 37, 37));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Vielen Dank für Ihren Besuch in unserem Store.  Hier können Sie eine Bestellung aufgeben. Navigieren Se dazu durch unsere Angebote.");
        jTextArea1.setOpaque(false);
        jScrollPane3.setViewportView(jTextArea1);

        Highlights.add(jScrollPane3);
        jScrollPane3.setBounds(40, 110, 1140, 28);

        Parent.add(Highlights, "card2");

        Liste1_2.setBackground(new java.awt.Color(37, 37, 37));
        Liste1_2.setLayout(new java.awt.CardLayout());

        Salate.setBackground(new java.awt.Color(37, 37, 37));
        Salate.setLayout(null);

        Titel.setBackground(new java.awt.Color(37, 37, 37));
        Titel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Titel.setForeground(new java.awt.Color(255, 255, 255));
        Titel.setText("Salate:");
        Salate.add(Titel);
        Titel.setBounds(30, 30, 420, 32);

        Text06.setBackground(new java.awt.Color(102, 102, 102, 178));
        Text06.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Text06.setForeground(new java.awt.Color(255, 255, 255));
        Text06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text06.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Text06.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Text06.setOpaque(true);
        Text06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Text06MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Text06MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Text06MouseExited(evt);
            }
        });
        Salate.add(Text06);
        Text06.setBounds(30, 440, 230, 50);

        Nichtverfügbar1.setBackground(new java.awt.Color(72, 102, 102, 178));
        Nichtverfügbar1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Nichtverfügbar1.setForeground(new java.awt.Color(255, 255, 255));
        Nichtverfügbar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nichtverfügbar1.setText("Zurzeit nicht Verfügbar");
        Nichtverfügbar1.setOpaque(true);
        Salate.add(Nichtverfügbar1);
        Nichtverfügbar1.setBounds(30, 100, 230, 0);

        Nichtverfügbar2.setBackground(new java.awt.Color(72, 102, 102, 178));
        Nichtverfügbar2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Nichtverfügbar2.setForeground(new java.awt.Color(255, 255, 255));
        Nichtverfügbar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nichtverfügbar2.setText("Zurzeit nicht Verfügbar");
        Nichtverfügbar2.setOpaque(true);
        Salate.add(Nichtverfügbar2);
        Nichtverfügbar2.setBounds(290, 100, 230, 0);

        Nichtverfügbar3.setBackground(new java.awt.Color(72, 102, 102, 178));
        Nichtverfügbar3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Nichtverfügbar3.setForeground(new java.awt.Color(255, 255, 255));
        Nichtverfügbar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nichtverfügbar3.setText("Zurzeit nicht Verfügbar");
        Nichtverfügbar3.setOpaque(true);
        Salate.add(Nichtverfügbar3);
        Nichtverfügbar3.setBounds(550, 100, 230, 0);

        Nichtverfügbar4.setBackground(new java.awt.Color(72, 102, 102, 178));
        Nichtverfügbar4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Nichtverfügbar4.setForeground(new java.awt.Color(255, 255, 255));
        Nichtverfügbar4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nichtverfügbar4.setText("Zurzeit nicht Verfügbar");
        Nichtverfügbar4.setOpaque(true);
        Salate.add(Nichtverfügbar4);
        Nichtverfügbar4.setBounds(810, 100, 230, 0);

        Nichtverfügbar5.setBackground(new java.awt.Color(72, 102, 102, 178));
        Nichtverfügbar5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Nichtverfügbar5.setForeground(new java.awt.Color(255, 255, 255));
        Nichtverfügbar5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nichtverfügbar5.setText("Zurzeit nicht Verfügbar");
        Nichtverfügbar5.setOpaque(true);
        Salate.add(Nichtverfügbar5);
        Nichtverfügbar5.setBounds(1080, 100, 230, 0);

        Nichtverfügbar6.setBackground(new java.awt.Color(72, 102, 102, 178));
        Nichtverfügbar6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Nichtverfügbar6.setForeground(new java.awt.Color(255, 255, 255));
        Nichtverfügbar6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nichtverfügbar6.setText("Zurzeit nicht Verfügbar");
        Nichtverfügbar6.setOpaque(true);
        Salate.add(Nichtverfügbar6);
        Nichtverfügbar6.setBounds(30, 320, 230, 0);

        Nichtverfügbar7.setBackground(new java.awt.Color(72, 102, 102, 178));
        Nichtverfügbar7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Nichtverfügbar7.setForeground(new java.awt.Color(255, 255, 255));
        Nichtverfügbar7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nichtverfügbar7.setText("Zurzeit nicht Verfügbar");
        Nichtverfügbar7.setOpaque(true);
        Salate.add(Nichtverfügbar7);
        Nichtverfügbar7.setBounds(290, 320, 230, 0);

        Nichtverfügbar8.setBackground(new java.awt.Color(72, 102, 102, 178));
        Nichtverfügbar8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Nichtverfügbar8.setForeground(new java.awt.Color(255, 255, 255));
        Nichtverfügbar8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nichtverfügbar8.setText("Zurzeit nicht Verfügbar");
        Nichtverfügbar8.setOpaque(true);
        Salate.add(Nichtverfügbar8);
        Nichtverfügbar8.setBounds(550, 320, 230, 0);

        Nichtverfügbar9.setBackground(new java.awt.Color(72, 102, 102, 178));
        Nichtverfügbar9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Nichtverfügbar9.setForeground(new java.awt.Color(255, 255, 255));
        Nichtverfügbar9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nichtverfügbar9.setText("Zurzeit nicht Verfügbar");
        Nichtverfügbar9.setOpaque(true);
        Salate.add(Nichtverfügbar9);
        Nichtverfügbar9.setBounds(810, 320, 230, 0);

        Nichtverfügbar10.setBackground(new java.awt.Color(72, 102, 102, 178));
        Nichtverfügbar10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Nichtverfügbar10.setForeground(new java.awt.Color(255, 255, 255));
        Nichtverfügbar10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nichtverfügbar10.setText("Zurzeit nicht Verfügbar");
        Nichtverfügbar10.setOpaque(true);
        Salate.add(Nichtverfügbar10);
        Nichtverfügbar10.setBounds(1080, 320, 230, 0);

        Nichtverfügbar11.setBackground(new java.awt.Color(72, 102, 102, 178));
        Nichtverfügbar11.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Nichtverfügbar11.setForeground(new java.awt.Color(255, 255, 255));
        Nichtverfügbar11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nichtverfügbar11.setText("Zurzeit nicht Verfügbar");
        Nichtverfügbar11.setOpaque(true);
        Salate.add(Nichtverfügbar11);
        Nichtverfügbar11.setBounds(30, 540, 230, 0);

        Nichtverfügbar12.setBackground(new java.awt.Color(72, 102, 102, 178));
        Nichtverfügbar12.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Nichtverfügbar12.setForeground(new java.awt.Color(255, 255, 255));
        Nichtverfügbar12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nichtverfügbar12.setText("Zurzeit nicht Verfügbar");
        Nichtverfügbar12.setOpaque(true);
        Salate.add(Nichtverfügbar12);
        Nichtverfügbar12.setBounds(290, 540, 230, 0);

        Nichtverfügbar13.setBackground(new java.awt.Color(72, 102, 102, 178));
        Nichtverfügbar13.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Nichtverfügbar13.setForeground(new java.awt.Color(255, 255, 255));
        Nichtverfügbar13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nichtverfügbar13.setText("Zurzeit nicht Verfügbar");
        Nichtverfügbar13.setOpaque(true);
        Salate.add(Nichtverfügbar13);
        Nichtverfügbar13.setBounds(550, 540, 230, 0);

        Nichtverfügbar14.setBackground(new java.awt.Color(72, 102, 102, 178));
        Nichtverfügbar14.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Nichtverfügbar14.setForeground(new java.awt.Color(255, 255, 255));
        Nichtverfügbar14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nichtverfügbar14.setText("Zurzeit nicht Verfügbar");
        Nichtverfügbar14.setOpaque(true);
        Salate.add(Nichtverfügbar14);
        Nichtverfügbar14.setBounds(810, 540, 230, 0);

        Nichtverfügbar15.setBackground(new java.awt.Color(72, 102, 102, 178));
        Nichtverfügbar15.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Nichtverfügbar15.setForeground(new java.awt.Color(255, 255, 255));
        Nichtverfügbar15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nichtverfügbar15.setText("Zurzeit nicht Verfügbar");
        Nichtverfügbar15.setOpaque(true);
        Salate.add(Nichtverfügbar15);
        Nichtverfügbar15.setBounds(1080, 540, 230, 0);

        Text01.setBackground(new java.awt.Color(102, 102, 102, 178));
        Text01.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Text01.setForeground(new java.awt.Color(255, 255, 255));
        Text01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text01.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Text01.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Text01.setOpaque(true);
        Text01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Text01MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Text01MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Text01MouseExited(evt);
            }
        });
        Salate.add(Text01);
        Text01.setBounds(30, 220, 230, 50);

        Text07.setBackground(new java.awt.Color(102, 102, 102, 178));
        Text07.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Text07.setForeground(new java.awt.Color(255, 255, 255));
        Text07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text07.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Text07.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Text07.setOpaque(true);
        Text07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Text07MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Text07MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Text07MouseExited(evt);
            }
        });
        Salate.add(Text07);
        Text07.setBounds(290, 440, 230, 50);

        Text13.setBackground(new java.awt.Color(102, 102, 102, 178));
        Text13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Text13.setForeground(new java.awt.Color(255, 255, 255));
        Text13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Text13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Text13.setOpaque(true);
        Text13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Text13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Text13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Text13MouseExited(evt);
            }
        });
        Salate.add(Text13);
        Text13.setBounds(550, 660, 230, 50);

        Text12.setBackground(new java.awt.Color(102, 102, 102, 178));
        Text12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Text12.setForeground(new java.awt.Color(255, 255, 255));
        Text12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Text12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Text12.setOpaque(true);
        Text12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Text12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Text12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Text12MouseExited(evt);
            }
        });
        Salate.add(Text12);
        Text12.setBounds(290, 660, 230, 50);

        Text08.setBackground(new java.awt.Color(102, 102, 102, 178));
        Text08.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Text08.setForeground(new java.awt.Color(255, 255, 255));
        Text08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text08.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Text08.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Text08.setOpaque(true);
        Text08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Text08MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Text08MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Text08MouseExited(evt);
            }
        });
        Salate.add(Text08);
        Text08.setBounds(550, 440, 230, 50);

        Text02.setBackground(new java.awt.Color(102, 102, 102, 178));
        Text02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Text02.setForeground(new java.awt.Color(255, 255, 255));
        Text02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text02.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Text02.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Text02.setOpaque(true);
        Text02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Text02MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Text02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Text02MouseExited(evt);
            }
        });
        Salate.add(Text02);
        Text02.setBounds(290, 220, 230, 50);

        Text03.setBackground(new java.awt.Color(102, 102, 102, 178));
        Text03.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Text03.setForeground(new java.awt.Color(255, 255, 255));
        Text03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text03.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Text03.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Text03.setOpaque(true);
        Text03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Text03MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Text03MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Text03MouseExited(evt);
            }
        });
        Salate.add(Text03);
        Text03.setBounds(550, 220, 230, 50);

        Text04.setBackground(new java.awt.Color(102, 102, 102, 178));
        Text04.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Text04.setForeground(new java.awt.Color(255, 255, 255));
        Text04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text04.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Text04.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Text04.setOpaque(true);
        Text04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Text04MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Text04MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Text04MouseExited(evt);
            }
        });
        Salate.add(Text04);
        Text04.setBounds(810, 220, 230, 50);

        Text05.setBackground(new java.awt.Color(102, 102, 102, 178));
        Text05.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Text05.setForeground(new java.awt.Color(255, 255, 255));
        Text05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text05.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Text05.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Text05.setOpaque(true);
        Text05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Text05MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Text05MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Text05MouseExited(evt);
            }
        });
        Salate.add(Text05);
        Text05.setBounds(1080, 220, 230, 50);

        Text10.setBackground(new java.awt.Color(102, 102, 102, 178));
        Text10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Text10.setForeground(new java.awt.Color(255, 255, 255));
        Text10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Text10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Text10.setOpaque(true);
        Text10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Text10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Text10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Text10MouseExited(evt);
            }
        });
        Salate.add(Text10);
        Text10.setBounds(1080, 440, 230, 50);

        Text15.setBackground(new java.awt.Color(102, 102, 102, 178));
        Text15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Text15.setForeground(new java.awt.Color(255, 255, 255));
        Text15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Text15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Text15.setOpaque(true);
        Text15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Text15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Text15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Text15MouseExited(evt);
            }
        });
        Salate.add(Text15);
        Text15.setBounds(1080, 660, 230, 50);

        Text14.setBackground(new java.awt.Color(102, 102, 102, 178));
        Text14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Text14.setForeground(new java.awt.Color(255, 255, 255));
        Text14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Text14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Text14.setOpaque(true);
        Text14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Text14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Text14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Text14MouseExited(evt);
            }
        });
        Salate.add(Text14);
        Text14.setBounds(810, 660, 230, 50);

        Text09.setBackground(new java.awt.Color(102, 102, 102, 178));
        Text09.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Text09.setForeground(new java.awt.Color(255, 255, 255));
        Text09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text09.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Text09.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Text09.setOpaque(true);
        Text09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Text09MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Text09MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Text09MouseExited(evt);
            }
        });
        Salate.add(Text09);
        Text09.setBounds(810, 440, 230, 50);

        Text11.setBackground(new java.awt.Color(102, 102, 102, 178));
        Text11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Text11.setForeground(new java.awt.Color(255, 255, 255));
        Text11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Text11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Text11.setOpaque(true);
        Text11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Text11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Text11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Text11MouseExited(evt);
            }
        });
        Salate.add(Text11);
        Text11.setBounds(30, 660, 230, 50);

        Image01.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Image01.setIconTextGap(0);
        Image01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image01MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Image01MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Image01MouseExited(evt);
            }
        });
        Salate.add(Image01);
        Image01.setBounds(30, 100, 230, 170);

        Image06.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Image06.setIconTextGap(0);
        Image06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image06MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Image06MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Image06MouseExited(evt);
            }
        });
        Salate.add(Image06);
        Image06.setBounds(30, 320, 230, 170);

        Image11.setText("ImageHighlight11");
        Image11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Image11.setIconTextGap(0);
        Image11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Image11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Image11MouseExited(evt);
            }
        });
        Salate.add(Image11);
        Image11.setBounds(30, 540, 230, 170);

        Image02.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Image02.setIconTextGap(0);
        Image02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image02MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Image02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Image02MouseExited(evt);
            }
        });
        Salate.add(Image02);
        Image02.setBounds(290, 100, 230, 170);

        Image03.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Image03.setIconTextGap(0);
        Image03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image03MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Image03MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Image03MouseExited(evt);
            }
        });
        Salate.add(Image03);
        Image03.setBounds(550, 100, 230, 170);

        Image04.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Image04.setIconTextGap(0);
        Image04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image04MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Image04MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Image04MouseExited(evt);
            }
        });
        Salate.add(Image04);
        Image04.setBounds(810, 100, 230, 170);

        Image05.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Image05.setIconTextGap(0);
        Image05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image05MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Image05MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Image05MouseExited(evt);
            }
        });
        Salate.add(Image05);
        Image05.setBounds(1080, 100, 230, 170);

        Image07.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Image07.setIconTextGap(0);
        Image07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image07MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Image07MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Image07MouseExited(evt);
            }
        });
        Salate.add(Image07);
        Image07.setBounds(290, 320, 230, 170);

        Image08.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Image08.setIconTextGap(0);
        Image08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image08MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Image08MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Image08MouseExited(evt);
            }
        });
        Salate.add(Image08);
        Image08.setBounds(550, 320, 230, 170);

        Image09.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Image09.setIconTextGap(0);
        Image09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image09MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Image09MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Image09MouseExited(evt);
            }
        });
        Salate.add(Image09);
        Image09.setBounds(810, 320, 230, 170);

        Image10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Image10.setIconTextGap(0);
        Image10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Image10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Image10MouseExited(evt);
            }
        });
        Salate.add(Image10);
        Image10.setBounds(1080, 320, 230, 170);

        Image12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Image12.setIconTextGap(0);
        Image12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Image12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Image12MouseExited(evt);
            }
        });
        Salate.add(Image12);
        Image12.setBounds(290, 540, 230, 170);

        Image13.setToolTipText("");
        Image13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Image13.setIconTextGap(0);
        Image13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Image13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Image13MouseExited(evt);
            }
        });
        Salate.add(Image13);
        Image13.setBounds(550, 540, 230, 170);

        Image14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Image14.setIconTextGap(0);
        Image14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Image14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Image14MouseExited(evt);
            }
        });
        Salate.add(Image14);
        Image14.setBounds(810, 540, 230, 170);

        Image15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Image15.setIconTextGap(0);
        Image15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Image15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Image15MouseExited(evt);
            }
        });
        Salate.add(Image15);
        Image15.setBounds(1080, 540, 230, 170);

        Liste1_2.add(Salate, "card2");

        Salate03.setBackground(new java.awt.Color(255, 255, 255));
        Salate03.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.setLayout(null);

        Artikelbezeichnung.setFont(new java.awt.Font("Segoe UI", 0, 38)); // NOI18N
        Artikelbezeichnung.setText("Artikelbezeichnung");
        jPanel2.add(Artikelbezeichnung);
        Artikelbezeichnung.setBounds(60, 40, 870, 50);

        Bildanzeige.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.add(Bildanzeige);
        Bildanzeige.setBounds(60, 120, 230, 170);

        jScrollPane1.setBorder(null);

        Beschreibung.setEditable(false);
        Beschreibung.setBackground(new java.awt.Color(255, 255, 255));
        Beschreibung.setColumns(20);
        Beschreibung.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Beschreibung.setRows(5);
        Beschreibung.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        Beschreibung.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(Beschreibung);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(330, 115, 430, 340);

        Artikelnummer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Artikelnummer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Artikelnummer.setText("Artikelnr.");
        jPanel2.add(Artikelnummer);
        Artikelnummer.setBounds(60, 290, 230, 20);

        jScrollPane8.setBorder(null);

        Kalorienanzeige.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nährwert", "Menge"
            }
        ));
        Kalorienanzeige.setPreferredSize(new java.awt.Dimension(150, 120));
        Kalorienanzeige.setRowHeight(30);
        jScrollPane8.setViewportView(Kalorienanzeige);

        jPanel2.add(jScrollPane8);
        jScrollPane8.setBounds(780, 130, 400, 145);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Nährwerte pro 100g");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(780, 110, 150, 20);

        Zutaten.setColumns(20);
        Zutaten.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Zutaten.setRows(5);
        Zutaten.setText("Keine Angaben");
        jScrollPane2.setViewportView(Zutaten);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(780, 300, 400, 150);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Enhält:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(780, 280, 41, 20);

        jPanel4.setBackground(new java.awt.Color(249, 249, 249));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel4.setLayout(null);

        Supplement03.setBackground(new java.awt.Color(255, 255, 255));
        Supplement03.setFont(new java.awt.Font("Segoe UI Symbol", 0, 22)); // NOI18N
        Supplement03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Supplement03.setText("Scharf");
        Supplement03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Supplement03.setEnabled(false);
        jPanel4.add(Supplement03);
        Supplement03.setBounds(390, 80, 180, 34);

        Supplement04Nok.setBackground(new java.awt.Color(255, 255, 255));
        Supplement04Nok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/no.png"))); // NOI18N
        Supplement04Nok.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Supplement04Nok.setEnabled(false);
        Supplement04Nok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Supplement04NokMousePressed(evt);
            }
        });
        jPanel4.add(Supplement04Nok);
        Supplement04Nok.setBounds(610, 40, 40, 34);

        Supplement04Extra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Supplement04Extra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/extra.png"))); // NOI18N
        Supplement04Extra.setEnabled(false);
        Supplement04Extra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Supplement04ExtraMousePressed(evt);
            }
        });
        jPanel4.add(Supplement04Extra);
        Supplement04Extra.setBounds(690, 10, 105, 80);

        Supplement04Ok.setBackground(new java.awt.Color(255, 255, 255));
        Supplement04Ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/ja.png"))); // NOI18N
        Supplement04Ok.setText("jLabel17");
        Supplement04Ok.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Supplement04Ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Supplement04OkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Supplement04OkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Supplement04OkMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Supplement04OkMousePressed(evt);
            }
        });
        jPanel4.add(Supplement04Ok);
        Supplement04Ok.setBounds(650, 40, 40, 34);

        Supplement02Extra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/extra.png"))); // NOI18N
        Supplement02Extra.setEnabled(false);
        Supplement02Extra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Supplement02ExtraMousePressed(evt);
            }
        });
        jPanel4.add(Supplement02Extra);
        Supplement02Extra.setBounds(280, 10, 110, 80);

        Supplement02Ok.setBackground(new java.awt.Color(255, 255, 255));
        Supplement02Ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/ja.png"))); // NOI18N
        Supplement02Ok.setText("jLabel17");
        Supplement02Ok.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Supplement02Ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Supplement02OkMousePressed(evt);
            }
        });
        jPanel4.add(Supplement02Ok);
        Supplement02Ok.setBounds(250, 40, 40, 34);

        Supplement02Nok.setBackground(new java.awt.Color(255, 255, 255));
        Supplement02Nok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/no.png"))); // NOI18N
        Supplement02Nok.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Supplement02Nok.setEnabled(false);
        Supplement02Nok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Supplement02NokMousePressed(evt);
            }
        });
        jPanel4.add(Supplement02Nok);
        Supplement02Nok.setBounds(210, 40, 40, 34);

        Supplement03Extra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/extra.png"))); // NOI18N
        Supplement03Extra.setEnabled(false);
        Supplement03Extra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Supplement03ExtraMousePressed(evt);
            }
        });
        jPanel4.add(Supplement03Extra);
        Supplement03Extra.setBounds(480, 10, 105, 80);

        Supplement03Ok.setBackground(new java.awt.Color(255, 255, 255));
        Supplement03Ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/ja.png"))); // NOI18N
        Supplement03Ok.setText("jLabel17");
        Supplement03Ok.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Supplement03Ok.setEnabled(false);
        Supplement03Ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Supplement03OkMousePressed(evt);
            }
        });
        jPanel4.add(Supplement03Ok);
        Supplement03Ok.setBounds(440, 40, 40, 34);

        Supplement01Extra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/extra.png"))); // NOI18N
        Supplement01Extra.setEnabled(false);
        Supplement01Extra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Supplement01ExtraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Supplement01ExtraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Supplement01ExtraMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Supplement01ExtraMousePressed(evt);
            }
        });
        jPanel4.add(Supplement01Extra);
        Supplement01Extra.setBounds(90, 10, 130, 80);

        Supplement01Ok.setBackground(new java.awt.Color(255, 255, 255));
        Supplement01Ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/ja.png"))); // NOI18N
        Supplement01Ok.setText("jLabel17");
        Supplement01Ok.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Supplement01Ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Supplement01OkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Supplement01OkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Supplement01OkMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Supplement01OkMousePressed(evt);
            }
        });
        jPanel4.add(Supplement01Ok);
        Supplement01Ok.setBounds(50, 40, 40, 34);

        Supplement01Nok.setBackground(new java.awt.Color(255, 255, 255));
        Supplement01Nok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/no.png"))); // NOI18N
        Supplement01Nok.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Supplement01Nok.setEnabled(false);
        Supplement01Nok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Supplement01NokMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Supplement01NokMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Supplement01NokMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Supplement01NokMousePressed(evt);
            }
        });
        jPanel4.add(Supplement01Nok);
        Supplement01Nok.setBounds(10, 40, 40, 34);

        Supplement01.setBackground(new java.awt.Color(255, 255, 255));
        Supplement01.setFont(new java.awt.Font("Segoe UI Symbol", 0, 22)); // NOI18N
        Supplement01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Supplement01.setText("Zwiebeln");
        Supplement01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel4.add(Supplement01);
        Supplement01.setBounds(10, 80, 170, 34);

        Preis.setBackground(new java.awt.Color(255, 255, 255));
        Preis.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Preis.setText("Preis");
        jPanel4.add(Preis);
        Preis.setBounds(1030, 20, 110, 40);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("CHF");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(990, 30, 40, 30);

        jLabel13.setBackground(new java.awt.Color(130, 205, 71));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/warenkorb.png"))); // NOI18N
        jLabel13.setText("   In den Warenkorb");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel13);
        jLabel13.setBounds(830, 100, 290, 40);

        Supplement03Preis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Supplement03Preis.setText("2.50");
        Supplement03Preis.setEnabled(false);
        jPanel4.add(Supplement03Preis);
        Supplement03Preis.setBounds(460, 120, 50, 20);

        Supplement04Preis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Supplement04Preis.setText("2.50");
        Supplement04Preis.setEnabled(false);
        jPanel4.add(Supplement04Preis);
        Supplement04Preis.setBounds(680, 120, 60, 20);

        Supplement02Preis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Supplement02Preis.setText("2.50");
        Supplement02Preis.setEnabled(false);
        jPanel4.add(Supplement02Preis);
        Supplement02Preis.setBounds(270, 120, 50, 20);

        Supplement01Preis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Supplement01Preis.setText("2.50");
        Supplement01Preis.setEnabled(false);
        jPanel4.add(Supplement01Preis);
        Supplement01Preis.setBounds(80, 120, 50, 20);

        Supplement02.setBackground(new java.awt.Color(255, 255, 255));
        Supplement02.setFont(new java.awt.Font("Segoe UI Symbol", 0, 22)); // NOI18N
        Supplement02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Supplement02.setText("Gurken");
        Supplement02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel4.add(Supplement02);
        Supplement02.setBounds(210, 80, 160, 34);

        Supplement03Nok.setBackground(new java.awt.Color(255, 255, 255));
        Supplement03Nok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/no.png"))); // NOI18N
        Supplement03Nok.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Supplement03Nok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Supplement03NokMousePressed(evt);
            }
        });
        jPanel4.add(Supplement03Nok);
        Supplement03Nok.setBounds(400, 40, 40, 34);

        Supplement04.setBackground(new java.awt.Color(255, 255, 255));
        Supplement04.setFont(new java.awt.Font("Segoe UI Symbol", 0, 22)); // NOI18N
        Supplement04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Supplement04.setText("Knoblauch");
        Supplement04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Supplement04.setPreferredSize(new java.awt.Dimension(106, 34));
        jPanel4.add(Supplement04);
        Supplement04.setBounds(610, 80, 180, 34);

        Supplement02Plus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Supplement02Plus.setText("+");
        jPanel4.add(Supplement02Plus);
        Supplement02Plus.setBounds(260, 120, 10, 20);

        Supplement04Plus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Supplement04Plus.setText("+");
        jPanel4.add(Supplement04Plus);
        Supplement04Plus.setBounds(670, 120, 10, 20);

        Supplement01Plus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Supplement01Plus.setText("+");
        Supplement01Plus.setEnabled(false);
        jPanel4.add(Supplement01Plus);
        Supplement01Plus.setBounds(70, 120, 10, 20);

        Supplement03Plus.setText("+");
        jPanel4.add(Supplement03Plus);
        Supplement03Plus.setBounds(450, 120, 10, 16);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(40, 490, 1140, 160);

        Dauer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Dauer.setText("000");
        Dauer.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(Dauer);
        Dauer.setBounds(130, 360, 30, 20);

        Sofortfeld.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Sofortfeld.setText("Sofort Verfügbar");
        jPanel2.add(Sofortfeld);
        Sofortfeld.setBounds(100, 360, 170, 0);

        Minuten.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Minuten.setText("Minuten");
        Minuten.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(Minuten);
        Minuten.setBounds(162, 360, 80, 20);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Durchschnittliche Wartezeit:");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(60, 340, 230, 30);

        Veganfeld3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/Vegan.jpg"))); // NOI18N
        jPanel2.add(Veganfeld3);
        Veganfeld3.setBounds(950, 30, 70, 90);

        VegiFeld3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/vegetarisch.png"))); // NOI18N
        jPanel2.add(VegiFeld3);
        VegiFeld3.setBounds(1040, 40, 60, 70);

        Biofeld3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/Bio.png"))); // NOI18N
        jPanel2.add(Biofeld3);
        Biofeld3.setBounds(1120, 40, 60, 80);

        Salate03.add(jPanel2);
        jPanel2.setBounds(80, 40, 1240, 680);

        jLabel57.setText("Salate03");
        Salate03.add(jLabel57);
        jLabel57.setBounds(2913, 171, 43, 16);

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/gvegetables-salad-with-copy-space.jpg"))); // NOI18N
        Salate03.add(jLabel73);
        jLabel73.setBounds(-1700, -10, 3710, 770);

        Liste1_2.add(Salate03, "card34");

        Parent.add(Liste1_2, "card2");

        getContentPane().add(Parent, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 1410, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden

    }//GEN-LAST:event_formComponentHidden

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        jLabel9.setBackground(new Color(160, 235, 101));
// Kommentar: Diese Zeile setzt die Hintergrundfarbe (Background) des jLabel9-Komponentenobjekts auf die Farbe mit dem RGB-Wert (160, 235, 101).
// Dadurch wird die Hintergrundfarbe des Labels auf ein helles Grün gesetzt.
       
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel9.setBackground(new Color(130, 205, 71));
       // Kommentar: Diese Methode wird aufgerufen, wenn die Maus den Bereich des jLabel9 verlässt.
    // Sie setzt die Hintergrundfarbe (Background) des jLabel9-Komponentenobjekts auf die Farbe mit dem RGB-Wert (130, 205, 71).
    // Dadurch wird die Hintergrundfarbe des Labels auf ein dunkleres Grün gesetzt, wenn die Maus den Bereich verlässt.

    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel_GutscheincodeEinlosenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_GutscheincodeEinlosenMouseEntered
        jLabel_GutscheincodeEinlosen.setForeground(new Color(200, 199, 199));

    }//GEN-LAST:event_jLabel_GutscheincodeEinlosenMouseEntered

    private void jLabel_GutscheincodeEinlosenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_GutscheincodeEinlosenMouseExited
        jLabel_GutscheincodeEinlosen.setForeground(Color.WHITE);
       
    }//GEN-LAST:event_jLabel_GutscheincodeEinlosenMouseExited

    private void Kategorie2_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_3MouseExited
       
    }//GEN-LAST:event_Kategorie2_3MouseExited

    private void Kategorie2_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_3MouseEntered
       
    }//GEN-LAST:event_Kategorie2_3MouseEntered

    private void Kategorie2_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_1MouseExited
       
    }//GEN-LAST:event_Kategorie2_1MouseExited

    private void Kategorie2_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_1MouseEntered
       
    }//GEN-LAST:event_Kategorie2_1MouseEntered

    private void Kategorie2_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_2MouseExited
       
    }//GEN-LAST:event_Kategorie2_2MouseExited

    private void Kategorie2_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_2MouseEntered
       
    }//GEN-LAST:event_Kategorie2_2MouseEntered

    private void Kategorie2_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_7MouseExited
       
    }//GEN-LAST:event_Kategorie2_7MouseExited

    private void Kategorie2_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_7MouseEntered
       
    }//GEN-LAST:event_Kategorie2_7MouseEntered

    private void Kategorie2_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_4MouseExited
       
    }//GEN-LAST:event_Kategorie2_4MouseExited

    private void Kategorie2_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_4MouseEntered
       
    }//GEN-LAST:event_Kategorie2_4MouseEntered

    private void Kategorie1_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_2MouseExited
       
    }//GEN-LAST:event_Kategorie1_2MouseExited

    private void Kategorie1_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_2MouseEntered
       
    }//GEN-LAST:event_Kategorie1_2MouseEntered

    private void Kategorie1_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_7MouseExited
       
    }//GEN-LAST:event_Kategorie1_7MouseExited

    private void Kategorie1_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_7MouseEntered
       
    }//GEN-LAST:event_Kategorie1_7MouseEntered

    private void Kategorie1_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_4MouseExited
       
    }//GEN-LAST:event_Kategorie1_4MouseExited

    private void Kategorie1_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_4MouseEntered
       
    }//GEN-LAST:event_Kategorie1_4MouseEntered

    private void Kategorie1_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_3MouseExited
       
    }//GEN-LAST:event_Kategorie1_3MouseExited

    private void Kategorie1_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_3MouseEntered
       
    }//GEN-LAST:event_Kategorie1_3MouseEntered

    private void Kategorie1_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_1MouseExited
        Kategorie1_1.setBackground(new Color(37, 37, 37));
       // Kommentar: Diese Methode wird aufgerufen, wenn die Maus den Bereich von Kategorie1_1 verlässt.
    // Sie setzt die Hintergrundfarbe (Background) des Kategorie1_1-Komponentenobjekts auf die Farbe mit dem RGB-Wert (37, 37, 37).
    // Dadurch wird die Hintergrundfarbe von Kategorie1_1 auf ein dunkles Grau gesetzt, wenn die Maus den Bereich verlässt.
    }//GEN-LAST:event_Kategorie1_1MouseExited

    private void Kategorie1_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_1MouseEntered
        Kategorie1_1.setBackground(new Color(60, 60, 60));
       
    }//GEN-LAST:event_Kategorie1_1MouseEntered

    private void Kategorie1_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_5MouseEntered
       
    }//GEN-LAST:event_Kategorie1_5MouseEntered

    private void Kategorie1_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_5MouseExited
       
    }//GEN-LAST:event_Kategorie1_5MouseExited

    private void Kategorie1_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_6MouseEntered
       
    }//GEN-LAST:event_Kategorie1_6MouseEntered

    private void Kategorie1_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_6MouseExited
       
    }//GEN-LAST:event_Kategorie1_6MouseExited

    private void Kategorie2_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_5MouseEntered
       
    }//GEN-LAST:event_Kategorie2_5MouseEntered

    private void Kategorie2_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_5MouseExited
       
    }//GEN-LAST:event_Kategorie2_5MouseExited

    private void Kategorie2_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_6MouseEntered
       
    }//GEN-LAST:event_Kategorie2_6MouseEntered

    private void Kategorie2_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_6MouseExited
       
    }//GEN-LAST:event_Kategorie2_6MouseExited

    private void Kategorie1_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_2MouseClicked

String kategoriebezeichnung1_4 = Kategorie1_2.getText();
Titel.setText(kategoriebezeichnung1_4);

try (Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
    String sql = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, kategoriebezeichnung1_4);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            int kategorieID = rs.getInt("Kategorie_ID"); 
            reihe = String.valueOf(kategorieID); 
        }
    } catch (SQLException ex) {
        System.out.println("Error retrieving Kategoriebezeichnung: " + ex.getMessage());
        commonCode();
    }

    Text01.setText("01");
    commonCode();

    Parent.removeAll();
    Parent.add(Liste1_2);
    Parent.repaint();
    Parent.revalidate();

} catch (SQLException e) {
    System.out.println("Error connecting to the database: " + e.getMessage());
    commonCode();
}

        // Kommentar: In diesem Codeabschnitt werden Daten aus der Datenbank abgefragt und verarbeitet.
// Zuerst wird der Wert aus dem Kategorie1_2-Feld in der Variable kategoriebezeichnung1_4 gespeichert und in das Titel-Feld eingefügt.
// Anschließend wird eine Verbindung zur Datenbank hergestellt und eine SQL-Abfrage durchgeführt, um die entsprechende Kategorie-ID abzurufen.
// Wenn ein Ergebnis vorliegt, wird die Kategorie-ID in der Variable reihe gespeichert.
// Danach werden weitere Aktionen durchgeführt, wie das Setzen von Texten, das Hinzufügen von Komponenten zum Parent-Objekt und die Aktualisierung des UI.
// Falls ein SQLException-Fehler auftritt, wird eine entsprechende Fehlermeldung ausgegeben und commonCode() aufgerufen.

    }//GEN-LAST:event_Kategorie1_2MouseClicked



    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Kategorie2_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_7MouseClicked

      String kategoriebezeichnung1_4 = Kategorie2_7.getText();
Titel.setText(kategoriebezeichnung1_4);


try (Connection conn = DriverManager.getConnection(Mysqllink,username,password)) {
    String sql = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, kategoriebezeichnung1_4);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            int kategorieID = rs.getInt("Kategorie_ID"); 
            reihe = String.valueOf(kategorieID);
            
        }
    
} catch (SQLException ex) {
    
}

    Text01.setText("01");
commonCode();

    Parent.removeAll();
Parent.add(Liste1_2);
Parent.repaint();
Parent.revalidate();
        

} catch (SQLException e) {
    System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
    commonCode();
}
    // Kommentar: In diesem Codeabschnitt werden Daten aus der Datenbank abgefragt und verarbeitet.
// Zuerst wird der Wert aus dem Kategorie1_2-Feld in der Variable kategoriebezeichnung1_4 gespeichert und in das Titel-Feld eingefügt.
// Anschließend wird eine Verbindung zur Datenbank hergestellt und eine SQL-Abfrage durchgeführt, um die entsprechende Kategorie-ID abzurufen.
// Wenn ein Ergebnis vorliegt, wird die Kategorie-ID in der Variable reihe gespeichert.
// Danach werden weitere Aktionen durchgeführt, wie das Setzen von Texten, das Hinzufügen von Komponenten zum Parent-Objekt und die Aktualisierung des UI.
// Falls ein SQLException-Fehler auftritt, wird eine entsprechende Fehlermeldung ausgegeben und commonCode() aufgerufen.
    }//GEN-LAST:event_Kategorie2_7MouseClicked

    private void Kategorie1_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_3MouseClicked

String kategoriebezeichnung1_4 = Kategorie1_3.getText();
Titel.setText(kategoriebezeichnung1_4);

try (Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
    String sql = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, kategoriebezeichnung1_4);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            int kategorieID = rs.getInt("Kategorie_ID"); 
            reihe = Integer.toString(kategorieID);
        }
    } catch (SQLException ex) {
        
    }


    Text01.setText("01");
    commonCode();

    Parent.removeAll();
    Parent.add(Liste1_2);
    Parent.repaint();
    Parent.revalidate();
        
} catch (SQLException e) {
    System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
    commonCode();
}

        
           // Kommentar: In diesem Codeabschnitt werden Daten aus der Datenbank abgefragt und verarbeitet.
// Zuerst wird der Wert aus dem Kategorie1_2-Feld in der Variable kategoriebezeichnung1_4 gespeichert und in das Titel-Feld eingefügt.
// Anschließend wird eine Verbindung zur Datenbank hergestellt und eine SQL-Abfrage durchgeführt, um die entsprechende Kategorie-ID abzurufen.
// Wenn ein Ergebnis vorliegt, wird die Kategorie-ID in der Variable reihe gespeichert.
// Danach werden weitere Aktionen durchgeführt, wie das Setzen von Texten, das Hinzufügen von Komponenten zum Parent-Objekt und die Aktualisierung des UI.
// Falls ein SQLException-Fehler auftritt, wird eine entsprechende Fehlermeldung ausgegeben und commonCode() aufgerufen.

       
    }//GEN-LAST:event_Kategorie1_3MouseClicked

    private void Kategorie1_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_1MouseClicked
 Parent.removeAll();    // Entfernt alle vorhandenen Komponenten vom Parent-Container
Parent.add(Highlights);    // Fügt die Highlights-Komponente zum Parent-Container hinzu
Parent.repaint();    // Aktualisiert das Aussehen des Parent-Containers
Parent.revalidate();    // Führt eine erneute Validierung des Layouts für den Parent-Container durch

       
    }//GEN-LAST:event_Kategorie1_1MouseClicked

    private void Kategorie1_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_4MouseClicked
String kategoriebezeichnung1_4 = Kategorie1_4.getText();
Titel.setText(kategoriebezeichnung1_4);    // Setzt den Text des Titel-Feldes auf den Wert von kategoriebezeichnung1_4

try (Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
    String sql = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, kategoriebezeichnung1_4);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            int kategorieID = rs.getInt("Kategorie_ID");
            reihe = String.valueOf(kategorieID);
            // Der Wert der Spalte "Kategorie_ID" aus der Datenbank wird in kategorieID gespeichert
            // reihe wird auf den String-Wert von kategorieID gesetzt
        }
    


    
} catch (SQLException ex) {
    
}

    Text01.setText("01");
commonCode();

    Parent.removeAll();
Parent.add(Liste1_2);
Parent.repaint();
Parent.revalidate();
        

} catch (SQLException e) {
    System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
    commonCode();
}
       
    }//GEN-LAST:event_Kategorie1_4MouseClicked

    private void Kategorie1_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_5MouseClicked
String kategoriebezeichnung1_4 = Kategorie1_5.getText();
Titel.setText(kategoriebezeichnung1_4);


try (Connection conn = DriverManager.getConnection(Mysqllink,username,password)) {
    String sql = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, kategoriebezeichnung1_4);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            int kategorieID = rs.getInt("Kategorie_ID"); 
            reihe = String.valueOf(kategorieID); 
            
        }
    
} catch (SQLException ex) {
    
}

    Text01.setText("01");
commonCode();

    Parent.removeAll();
Parent.add(Liste1_2);
Parent.repaint();
Parent.revalidate();
        

} catch (SQLException e) {
    System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
    commonCode();
}
    }//GEN-LAST:event_Kategorie1_5MouseClicked

    private void Kategorie1_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_6MouseClicked
 String kategoriebezeichnung1_4 = Kategorie1_6.getText();
 Titel.setText(kategoriebezeichnung1_4);


try (Connection conn = DriverManager.getConnection(Mysqllink,username,password)) {
    String sql = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, kategoriebezeichnung1_4);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            int kategorieID = rs.getInt("Kategorie_ID");
            reihe = String.valueOf(kategorieID); 
            
        }
    
} catch (SQLException ex) {
    
}

    Text01.setText("01");
commonCode();

    Parent.removeAll();
Parent.add(Liste1_2);
Parent.repaint();
Parent.revalidate();
        

} catch (SQLException e) {
    System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
    commonCode();
}
    }//GEN-LAST:event_Kategorie1_6MouseClicked

    private void Kategorie1_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_7MouseClicked
String kategoriebezeichnung1_4 = Kategorie1_7.getText();
Titel.setText(kategoriebezeichnung1_4);


try (Connection conn = DriverManager.getConnection(Mysqllink,username,password)) {
    String sql = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, kategoriebezeichnung1_4);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            int kategorieID = rs.getInt("Kategorie_ID");
            reihe = String.valueOf(kategorieID); 
            
        }
    
} catch (SQLException ex) {
    
}

    Text01.setText("01");
commonCode();

    Parent.removeAll();
Parent.add(Liste1_2);
Parent.repaint();
Parent.revalidate();
        

} catch (SQLException e) {
    System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
    commonCode();
}
    }//GEN-LAST:event_Kategorie1_7MouseClicked

    private void Kategorie2_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_1MouseClicked
String kategoriebezeichnung1_4 = Kategorie2_1.getText();
Titel.setText(kategoriebezeichnung1_4);


try (Connection conn = DriverManager.getConnection(Mysqllink,username,password)) {
    String sql = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, kategoriebezeichnung1_4);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            int kategorieID = rs.getInt("Kategorie_ID");
            reihe = String.valueOf(kategorieID); 
            
        }
    
} catch (SQLException ex) {
    
}

    Text01.setText("01");
commonCode();

    Parent.removeAll();
Parent.add(Liste1_2);
Parent.repaint();
Parent.revalidate();
        

} catch (SQLException e) {
    System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
    commonCode();
}
    }//GEN-LAST:event_Kategorie2_1MouseClicked

    private void Kategorie2_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_2MouseClicked
String kategoriebezeichnung1_4 = Kategorie2_2.getText();
Titel.setText(kategoriebezeichnung1_4);


try (Connection conn = DriverManager.getConnection(Mysqllink,username,password)) {
    String sql = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, kategoriebezeichnung1_4);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            int kategorieID = rs.getInt("Kategorie_ID"); 
            reihe = String.valueOf(kategorieID);
            
        }
    
} catch (SQLException ex) {
    
}

    Text01.setText("01");
commonCode();

    Parent.removeAll();
Parent.add(Liste1_2);
Parent.repaint();
Parent.revalidate();
        

} catch (SQLException e) {
    System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
    commonCode();
}
    }//GEN-LAST:event_Kategorie2_2MouseClicked

    private void Kategorie2_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_3MouseClicked
String kategoriebezeichnung1_4 = Kategorie2_3.getText();
Titel.setText(kategoriebezeichnung1_4);


try (Connection conn = DriverManager.getConnection(Mysqllink,username,password)) {
    String sql = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, kategoriebezeichnung1_4);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            int kategorieID = rs.getInt("Kategorie_ID");  
            reihe = String.valueOf(kategorieID);
            
        }
    
} catch (SQLException ex) {
    
}

    Text01.setText("01");
commonCode();

    Parent.removeAll();
Parent.add(Liste1_2);
Parent.repaint();
Parent.revalidate();
        

} catch (SQLException e) {
    System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
    commonCode();
}
    // Kommentar: In diesem Codeabschnitt werden Daten aus der Datenbank abgefragt und verarbeitet.
// Zuerst wird der Wert aus dem Kategorie1_2-Feld in der Variable kategoriebezeichnung1_4 gespeichert und in das Titel-Feld eingefügt.
// Anschließend wird eine Verbindung zur Datenbank hergestellt und eine SQL-Abfrage durchgeführt, um die entsprechende Kategorie-ID abzurufen.
// Wenn ein Ergebnis vorliegt, wird die Kategorie-ID in der Variable reihe gespeichert.
// Danach werden weitere Aktionen durchgeführt, wie das Setzen von Texten, das Hinzufügen von Komponenten zum Parent-Objekt und die Aktualisierung des UI.
// Falls ein SQLException-Fehler auftritt, wird eine entsprechende Fehlermeldung ausgegeben und commonCode() aufgerufen.
    }//GEN-LAST:event_Kategorie2_3MouseClicked

    private void Kategorie2_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_4MouseClicked

String kategoriebezeichnung1_4 = Kategorie2_4.getText();
Titel.setText(kategoriebezeichnung1_4);


try (Connection conn = DriverManager.getConnection(Mysqllink,username,password)) {
    String sql = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, kategoriebezeichnung1_4);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            int kategorieID = rs.getInt("Kategorie_ID"); 
            reihe = String.valueOf(kategorieID); 
            
        }
    
} catch (SQLException ex) {
    
}

    Text01.setText("01");
commonCode();

    Parent.removeAll();
Parent.add(Liste1_2);
Parent.repaint();
Parent.revalidate();
        

} catch (SQLException e) {
    System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
    commonCode();
}     
    // Kommentar: In diesem Codeabschnitt werden Daten aus der Datenbank abgefragt und verarbeitet.
// Zuerst wird der Wert aus dem Kategorie1_2-Feld in der Variable kategoriebezeichnung1_4 gespeichert und in das Titel-Feld eingefügt.
// Anschließend wird eine Verbindung zur Datenbank hergestellt und eine SQL-Abfrage durchgeführt, um die entsprechende Kategorie-ID abzurufen.
// Wenn ein Ergebnis vorliegt, wird die Kategorie-ID in der Variable reihe gespeichert.
// Danach werden weitere Aktionen durchgeführt, wie das Setzen von Texten, das Hinzufügen von Komponenten zum Parent-Objekt und die Aktualisierung des UI.
// Falls ein SQLException-Fehler auftritt, wird eine entsprechende Fehlermeldung ausgegeben und commonCode() aufgerufen.
    }//GEN-LAST:event_Kategorie2_4MouseClicked

    private void Kategorie2_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_5MouseClicked
String kategoriebezeichnung1_4 = Kategorie2_5.getText();
Titel.setText(kategoriebezeichnung1_4);


try (Connection conn = DriverManager.getConnection(Mysqllink,username,password)) {
    String sql = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, kategoriebezeichnung1_4);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            int kategorieID = rs.getInt("Kategorie_ID"); 
            reihe = String.valueOf(kategorieID); 
            
        }
    
} catch (SQLException ex) {
    
}

    Text01.setText("01");
commonCode();

    Parent.removeAll();
Parent.add(Liste1_2);
Parent.repaint();
Parent.revalidate();
        

} catch (SQLException e) {
    System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
    commonCode();
        // Kommentar: In diesem Codeabschnitt werden Daten aus der Datenbank abgefragt und verarbeitet.
// Zuerst wird der Wert aus dem Kategorie1_2-Feld in der Variable kategoriebezeichnung1_4 gespeichert und in das Titel-Feld eingefügt.
// Anschließend wird eine Verbindung zur Datenbank hergestellt und eine SQL-Abfrage durchgeführt, um die entsprechende Kategorie-ID abzurufen.
// Wenn ein Ergebnis vorliegt, wird die Kategorie-ID in der Variable reihe gespeichert.
// Danach werden weitere Aktionen durchgeführt, wie das Setzen von Texten, das Hinzufügen von Komponenten zum Parent-Objekt und die Aktualisierung des UI.
// Falls ein SQLException-Fehler auftritt, wird eine entsprechende Fehlermeldung ausgegeben und commonCode() aufgerufen.
}
    }//GEN-LAST:event_Kategorie2_5MouseClicked

    private void Kategorie2_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_6MouseClicked
String kategoriebezeichnung1_4 = Kategorie2_6.getText();
Titel.setText(kategoriebezeichnung1_4);


try (Connection conn = DriverManager.getConnection(Mysqllink,username,password)) {
    String sql = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, kategoriebezeichnung1_4);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            int kategorieID = rs.getInt("Kategorie_ID"); 
            reihe = String.valueOf(kategorieID); 
            
        }
    
} catch (SQLException ex) {
    
}

    Text01.setText("01");
commonCode();

    Parent.removeAll();
Parent.add(Liste1_2);
Parent.repaint();
Parent.revalidate();
        

} catch (SQLException e) {
    System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
    commonCode();
}
    }//GEN-LAST:event_Kategorie2_6MouseClicked

    private void Image15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image15MouseExited
        Text15.setSize(230, 50);
        Text15.setLocation(1080, 660);
       
    }//GEN-LAST:event_Image15MouseExited

    private void Image15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image15MouseEntered
        Text15.setSize(230, 170);
        Text15.setLocation(1080, 540);
    }//GEN-LAST:event_Image15MouseEntered

    private void Image15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image15MouseClicked
        
       
    }//GEN-LAST:event_Image15MouseClicked

    private void Image14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image14MouseExited
        Text14.setSize(230, 50);
        Text14.setLocation(810, 660);
       
    }//GEN-LAST:event_Image14MouseExited

    private void Image14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image14MouseEntered
        Text14.setSize(230, 170);
        Text14.setLocation(810, 540);
       
    }//GEN-LAST:event_Image14MouseEntered

    private void Image14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image14MouseClicked
      
       
    }//GEN-LAST:event_Image14MouseClicked

    private void Image13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image13MouseExited
        Text13.setSize(230, 50);
        Text13.setLocation(550, 660);
       
    }//GEN-LAST:event_Image13MouseExited

    private void Image13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image13MouseEntered
        Text13.setSize(230, 170);
        Text13.setLocation(550, 540);

       
    }//GEN-LAST:event_Image13MouseEntered

    private void Image13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image13MouseClicked
        
       
    }//GEN-LAST:event_Image13MouseClicked

    private void Image12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image12MouseExited

        Text12.setSize(230, 50);
        Text12.setLocation(290, 660);
    }//GEN-LAST:event_Image12MouseExited

    private void Image12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image12MouseEntered
        Text12.setSize(230, 170);
        Text12.setLocation(290, 540);

       
    }//GEN-LAST:event_Image12MouseEntered

    private void Image12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image12MouseClicked
       

       
    }//GEN-LAST:event_Image12MouseClicked

    private void Image10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image10MouseExited
        Text10.setSize(230, 50);
        Text10.setLocation(1080, 440);
       
    }//GEN-LAST:event_Image10MouseExited

    private void Image10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image10MouseEntered
        Text10.setSize(230, 170);
        Text10.setLocation(1080, 320);
       
    }//GEN-LAST:event_Image10MouseEntered

    private void Image10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image10MouseClicked
    
       
    }//GEN-LAST:event_Image10MouseClicked

    private void Image09MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image09MouseExited
        Text09.setSize(230, 50);
        Text09.setLocation(810, 440);
       
    }//GEN-LAST:event_Image09MouseExited

    private void Image09MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image09MouseEntered
        Text09.setSize(230, 170);
        Text09.setLocation(810, 320);
       
    }//GEN-LAST:event_Image09MouseEntered

    private void Image09MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image09MouseClicked
    
       
    }//GEN-LAST:event_Image09MouseClicked

    private void Image08MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image08MouseExited
        Text08.setSize(230, 50);
        Text08.setLocation(550, 440);
       
    }//GEN-LAST:event_Image08MouseExited

    private void Image08MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image08MouseEntered
        Text08.setSize(230, 170);
        Text08.setLocation(550, 320);
       
    }//GEN-LAST:event_Image08MouseEntered

    private void Image08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image08MouseClicked
        
       
    }//GEN-LAST:event_Image08MouseClicked

    private void Image07MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image07MouseExited
        Text07.setSize(230, 50);
        Text07.setLocation(290, 440);
       
    }//GEN-LAST:event_Image07MouseExited

    private void Image07MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image07MouseEntered
        Text07.setSize(230, 170);
        Text07.setLocation(290, 320);
       
    }//GEN-LAST:event_Image07MouseEntered

    private void Image07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image07MouseClicked
      
       
    }//GEN-LAST:event_Image07MouseClicked

    private void Image05MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image05MouseExited
        Text05.setSize(230, 50);
        Text05.setLocation(1080, 220);

       
    }//GEN-LAST:event_Image05MouseExited

    private void Image05MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image05MouseEntered
        Text05.setSize(230, 170);
        Text05.setLocation(1080, 100);
       
    }//GEN-LAST:event_Image05MouseEntered

    private void Image05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image05MouseClicked
      
    }//GEN-LAST:event_Image05MouseClicked

    private void Image04MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image04MouseExited
        Text04.setSize(230, 50);
        Text04.setLocation(810, 220);

       
    }//GEN-LAST:event_Image04MouseExited

    private void Image04MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image04MouseEntered
        Text04.setSize(230, 170);
        Text04.setLocation(810, 100);
       
    }//GEN-LAST:event_Image04MouseEntered

    private void Image04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image04MouseClicked
       
       
    }//GEN-LAST:event_Image04MouseClicked

    private void Image03MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image03MouseExited
        Text03.setSize(230, 50);
        Text03.setLocation(550, 220);

       
    }//GEN-LAST:event_Image03MouseExited

    private void Image03MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image03MouseEntered
        Text03.setSize(230, 170);
        Text03.setLocation(550, 100);
       
    }//GEN-LAST:event_Image03MouseEntered

    private void Image03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image03MouseClicked
  
       
    }//GEN-LAST:event_Image03MouseClicked

    private void Image02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image02MouseExited
        Text02.setSize(230, 50);
        Text02.setLocation(290, 220);

       
    }//GEN-LAST:event_Image02MouseExited

    private void Image02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image02MouseEntered
        Text02.setSize(230, 170);
        Text02.setLocation(290, 100);
       
    }//GEN-LAST:event_Image02MouseEntered

    private void Image02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image02MouseClicked
   
       
    }//GEN-LAST:event_Image02MouseClicked

    private void Image11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image11MouseExited
        Text11.setSize(230, 50);
        Text11.setLocation(30, 660);
       
    }//GEN-LAST:event_Image11MouseExited

    private void Image11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image11MouseEntered
        Text11.setSize(230, 170);
        Text11.setLocation(30, 540);
       
    }//GEN-LAST:event_Image11MouseEntered

    private void Image11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image11MouseClicked
        
       
    }//GEN-LAST:event_Image11MouseClicked

    private void Image06MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image06MouseExited
        Text06.setSize(230, 50);
        Text06.setLocation(30, 440);
       
    }//GEN-LAST:event_Image06MouseExited

    private void Image06MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image06MouseEntered
        Text06.setSize(230, 170);
        Text06.setLocation(30, 320);
       
    }//GEN-LAST:event_Image06MouseEntered

    private void Image06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image06MouseClicked
  
       
    }//GEN-LAST:event_Image06MouseClicked

    private void Image01MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image01MouseExited
        Text01.setSize(230, 50);
        Text01.setLocation(30, 220);
       
    }//GEN-LAST:event_Image01MouseExited

    private void Image01MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image01MouseEntered
        Text01.setSize(230, 170);
        Text01.setLocation(30, 100);

       
    }//GEN-LAST:event_Image01MouseEntered

    private void Image01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image01MouseClicked
   
       
    }//GEN-LAST:event_Image01MouseClicked

    private void Text11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text11MouseExited
        Text11.setSize(230, 50);
        Text11.setLocation(30, 660);
       
    }//GEN-LAST:event_Text11MouseExited

    private void Text11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text11MouseEntered
        Text11.setSize(230, 170);
        Text11.setLocation(30, 540);
       
    }//GEN-LAST:event_Text11MouseEntered

    private void Text11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text11MouseClicked
if (Text11.isEnabled()) {
        Artikelwert = Text11.getText();
        commonCode2();
        
        Parent.removeAll();
        Parent.add(Salate03);
        Parent.repaint();
        Parent.revalidate();
        Text11.setSize(230, 50);
        Text11.setLocation(30, 660);
}
       // Kommentar: Diese Methode wird aufgerufen, wenn auf das Text11-Objekt geklickt wird.
// Zunächst wird überprüft, ob Text11 aktiviert (enabled) ist.
// Wenn ja, wird der Wert von Text11 in der Variable Artikelwert gespeichert und commonCode2() aufgerufen.
// Anschließend werden weitere Aktionen durchgeführt, wie das Entfernen aller Komponenten vom Parent-Objekt, das Hinzufügen von Salate03-Komponente zum Parent-Objekt und die Aktualisierung des UI.
// Außerdem werden die Größe und Position von Text11 angepasst.
    }//GEN-LAST:event_Text11MouseClicked

    private void Text09MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text09MouseExited

        Text09.setSize(230, 50);
        Text09.setLocation(810, 440);

    }//GEN-LAST:event_Text09MouseExited

    private void Text09MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text09MouseEntered

        Text09.setSize(230, 170);
        Text09.setLocation(810, 320);

    }//GEN-LAST:event_Text09MouseEntered

    private void Text09MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text09MouseClicked
if (Text09.isEnabled()) {
        Artikelwert = Text09.getText();
        commonCode2();

        Parent.removeAll();
        Parent.add(Salate03);
        Parent.repaint();
        Parent.revalidate();
        Text09.setSize(230, 50);
        Text09.setLocation(810, 440);
}// Kommentar: Diese Methode wird aufgerufen, wenn auf das Text11-Objekt geklickt wird.
// Zunächst wird überprüft, ob Text11 aktiviert (enabled) ist.
// Wenn ja, wird der Wert von Text11 in der Variable Artikelwert gespeichert und commonCode2() aufgerufen.
// Anschließend werden weitere Aktionen durchgeführt, wie das Entfernen aller Komponenten vom Parent-Objekt, das Hinzufügen von Salate03-Komponente zum Parent-Objekt und die Aktualisierung des UI.
// Außerdem werden die Größe und Position von Text11 angepasst.
       
    }//GEN-LAST:event_Text09MouseClicked

    private void Text14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text14MouseExited
        Text14.setSize(230, 50);
        Text14.setLocation(810, 660);
       
    }//GEN-LAST:event_Text14MouseExited

    private void Text14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text14MouseEntered
        Text14.setSize(230, 170);
        Text14.setLocation(810, 540);
       
    }//GEN-LAST:event_Text14MouseEntered

    private void Text14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text14MouseClicked
if (Text14.isEnabled()) {
        Artikelwert = Text14.getText();
         commonCode2();

        Parent.removeAll();
        Parent.add(Salate03);
        Parent.repaint();
        Parent.revalidate();
        Text14.setSize(230, 50);
        Text14.setLocation(810, 660);
}// Kommentar: Diese Methode wird aufgerufen, wenn auf das Text11-Objekt geklickt wird.
// Zunächst wird überprüft, ob Text11 aktiviert (enabled) ist.
// Wenn ja, wird der Wert von Text11 in der Variable Artikelwert gespeichert und commonCode2() aufgerufen.
// Anschließend werden weitere Aktionen durchgeführt, wie das Entfernen aller Komponenten vom Parent-Objekt, das Hinzufügen von Salate03-Komponente zum Parent-Objekt und die Aktualisierung des UI.
// Außerdem werden die Größe und Position von Text11 angepasst.
       
    }//GEN-LAST:event_Text14MouseClicked

    private void Text15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text15MouseExited
        Text15.setSize(230, 50);
        Text15.setLocation(1080, 660);
       
    }//GEN-LAST:event_Text15MouseExited

    private void Text15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text15MouseEntered
        Text15.setSize(230, 170);
        Text15.setLocation(1080, 540);
       
    }//GEN-LAST:event_Text15MouseEntered

    private void Text15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text15MouseClicked
if (Text15.isEnabled()) {
        Artikelwert = Text15.getText();
        commonCode2();

        Parent.removeAll();
        Parent.add(Salate03);
        Parent.repaint();
        Parent.revalidate();
        Text15.setSize(230, 50);
        Text15.setLocation(1080, 660);
}
       
    }//GEN-LAST:event_Text15MouseClicked

    private void Text10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text10MouseExited

        Text10.setSize(230, 50);
        Text10.setLocation(1080, 440);
    }//GEN-LAST:event_Text10MouseExited

    private void Text10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text10MouseEntered

        Text10.setSize(230, 170);
        Text10.setLocation(1080, 320);

    }//GEN-LAST:event_Text10MouseEntered

    private void Text10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text10MouseClicked
if (Text10.isEnabled()) {
        Artikelwert = Text10.getText();
        commonCode2();

        Parent.removeAll();
        Parent.add(Salate03);
        Parent.repaint();
        Parent.revalidate();
        Text10.setSize(230, 50);
        Text10.setLocation(1080, 440);
}
       
    }//GEN-LAST:event_Text10MouseClicked

    private void Text05MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text05MouseExited
        Text05.setSize(230, 50);
        Text05.setLocation(1080, 220);
       
    }//GEN-LAST:event_Text05MouseExited

    private void Text05MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text05MouseEntered
        Text05.setSize(230, 170);
        Text05.setLocation(1080, 100);
       
    }//GEN-LAST:event_Text05MouseEntered

    private void Text05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text05MouseClicked
if (Text04.isEnabled()) {
        Artikelwert = Text05.getText();
 commonCode2();

        Parent.removeAll();
        Parent.add(Salate03);
        Parent.repaint();
        Parent.revalidate();
        Text05.setSize(230, 50);
        Text05.setLocation(1080, 220);
}
       
    }//GEN-LAST:event_Text05MouseClicked

    private void Text04MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text04MouseExited
        Text04.setSize(230, 50);
        Text04.setLocation(810, 220);
       
    }//GEN-LAST:event_Text04MouseExited

    private void Text04MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text04MouseEntered
        Text04.setSize(230, 170);
        Text04.setLocation(810, 100);
       
    }//GEN-LAST:event_Text04MouseEntered

    private void Text04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text04MouseClicked
if (Text04.isEnabled()) {
        Artikelwert = Text04.getText();
        commonCode2();

        Parent.removeAll();
        Parent.add(Salate03);
        Parent.repaint();
        Parent.revalidate();
        Text04.setSize(230, 50);
        Text04.setLocation(810, 220);
}
       
    }//GEN-LAST:event_Text04MouseClicked

    private void Text03MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text03MouseExited
        Text03.setSize(230, 50);
        Text03.setLocation(550, 220);

       
    }//GEN-LAST:event_Text03MouseExited

    private void Text03MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text03MouseEntered
        Text03.setSize(230, 170);
        Text03.setLocation(550, 100);
       
    }//GEN-LAST:event_Text03MouseEntered

    private void Text03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text03MouseClicked
if (Text03.isEnabled()) {
        Artikelwert = Text03.getText();
 commonCode2();

        Parent.removeAll();
        Parent.add(Salate03);
        Parent.repaint();
        Parent.revalidate();
        Text03.setSize(230, 50);
        Text03.setLocation(550, 220);
}
       
    }//GEN-LAST:event_Text03MouseClicked

    private void Text02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text02MouseExited
        Text02.setSize(230, 50);
        Text02.setLocation(290, 220);
       
    }//GEN-LAST:event_Text02MouseExited

    private void Text02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text02MouseEntered
        Text02.setSize(230, 170);
        Text02.setLocation(290, 100);
       
    }//GEN-LAST:event_Text02MouseEntered

    private void Text02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text02MouseClicked
if (Text02.isEnabled()) {
 Artikelwert = Text02.getText();
 commonCode2();
 
        Parent.removeAll();
        Parent.add(Salate03);
        Parent.repaint();
        Parent.revalidate();
        Text02.setSize(230, 50);
        Text02.setLocation(290, 220);
      
}
       
    }//GEN-LAST:event_Text02MouseClicked

    private void Text08MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text08MouseExited

        Text08.setSize(230, 50);
        Text08.setLocation(550, 440);

    }//GEN-LAST:event_Text08MouseExited

    private void Text08MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text08MouseEntered

        Text08.setSize(230, 170);
        Text08.setLocation(550, 320);

    }//GEN-LAST:event_Text08MouseEntered

    private void Text08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text08MouseClicked
if (Text08.isEnabled()) {
        Artikelwert = Text08.getText();
         commonCode2();

        Parent.removeAll();
        Parent.add(Salate03);
        Parent.repaint();
        Parent.revalidate();
        Text08.setSize(230, 50);
        Text08.setLocation(550, 440);
}// Kommentar: Diese Methode wird aufgerufen, wenn auf das Text11-Objekt geklickt wird.
// Zunächst wird überprüft, ob Text11 aktiviert (enabled) ist.
// Wenn ja, wird der Wert von Text11 in der Variable Artikelwert gespeichert und commonCode2() aufgerufen.
// Anschließend werden weitere Aktionen durchgeführt, wie das Entfernen aller Komponenten vom Parent-Objekt, das Hinzufügen von Salate03-Komponente zum Parent-Objekt und die Aktualisierung des UI.
// Außerdem werden die Größe und Position von Text11 angepasst.
       
    }//GEN-LAST:event_Text08MouseClicked

    private void Text12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text12MouseExited
        Text12.setSize(230, 50);
        Text12.setLocation(290, 660);
       
    }//GEN-LAST:event_Text12MouseExited

    private void Text12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text12MouseEntered
        Text12.setSize(230, 170);
        Text12.setLocation(290, 540);
       
    }//GEN-LAST:event_Text12MouseEntered

    private void Text12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text12MouseClicked
if (Text12.isEnabled()) {
        Artikelwert = Text12.getText();
        commonCode2();

        Parent.removeAll();
        Parent.add(Salate03);
        Parent.repaint();
        Parent.revalidate();
        Text12.setSize(230, 50);
        Text12.setLocation(290, 660);
}
       
    }//GEN-LAST:event_Text12MouseClicked

    private void Text13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text13MouseExited
        Text13.setSize(230, 50);
        Text13.setLocation(550, 660);
       
    }//GEN-LAST:event_Text13MouseExited

    private void Text13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text13MouseEntered
        Text13.setSize(230, 170);
        Text13.setLocation(550, 540);
       
    }//GEN-LAST:event_Text13MouseEntered

    private void Text13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text13MouseClicked
if (Text13.isEnabled()) {
        Artikelwert = Text13.getText();
        commonCode2();

        Parent.removeAll();
        Parent.add(Salate03);
        Parent.repaint();
        Parent.revalidate();
        Text13.setSize(230, 50);
        Text13.setLocation(550, 660);
}
       
    }//GEN-LAST:event_Text13MouseClicked

    private void Text07MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text07MouseExited

        Text07.setSize(230, 50);
        Text07.setLocation(290, 440);

    }//GEN-LAST:event_Text07MouseExited

    private void Text07MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text07MouseEntered

        Text07.setSize(230, 170);
        Text07.setLocation(290, 320);
       

    }//GEN-LAST:event_Text07MouseEntered

    private void Text07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text07MouseClicked
if (Text07.isEnabled()) {
        Artikelwert = Text07.getText();
         commonCode2();

        Parent.removeAll();
        Parent.add(Salate03);
        Parent.repaint();
        Parent.revalidate();
        Text07.setSize(230, 50);
        Text07.setLocation(290, 440);
}
       
    }//GEN-LAST:event_Text07MouseClicked

    private void Text01MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text01MouseExited
        Text01.setSize(230, 50);
        
        Text01.setLocation(30, 220);
       
    }//GEN-LAST:event_Text01MouseExited

    private void Text01MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text01MouseEntered
        Text01.setSize(230, 170);
       

        Text01.setLocation(30, 100);
       
    }//GEN-LAST:event_Text01MouseEntered

    private void Text01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text01MouseClicked

if (Text01.isEnabled()) {
    Artikelwert = Text01.getText();
    commonCode2();
    Parent.removeAll();
    Parent.add(Salate03);
    Parent.repaint();
    Parent.revalidate();
    Text01.setSize(230, 50);
    Text01.setLocation(30, 220);
}
// Kommentar: Diese Methode wird aufgerufen, wenn auf das Text11-Objekt geklickt wird.
// Zunächst wird überprüft, ob Text11 aktiviert (enabled) ist.
// Wenn ja, wird der Wert von Text11 in der Variable Artikelwert gespeichert und commonCode2() aufgerufen.
// Anschließend werden weitere Aktionen durchgeführt, wie das Entfernen aller Komponenten vom Parent-Objekt, das Hinzufügen von Salate03-Komponente zum Parent-Objekt und die Aktualisierung des UI.
// Außerdem werden die Größe und Position von Text11 angepasst.


       
       
    }//GEN-LAST:event_Text01MouseClicked

    private void Text06MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text06MouseExited

        Text06.setSize(230, 50);
        Text06.setLocation(30, 440);
    }//GEN-LAST:event_Text06MouseExited

    private void Text06MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text06MouseEntered

        Text06.setSize(230, 170);
        Text06.setLocation(30, 320);
       

       

       
    }//GEN-LAST:event_Text06MouseEntered

    private void Text06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text06MouseClicked
if (Text06.isEnabled()) {
        Artikelwert = Text06.getText();
         commonCode2();

        Parent.removeAll();
        Parent.add(Salate03);
        Parent.repaint();
        Parent.revalidate();
        Text06.setSize(230, 50);
        Text06.setLocation(30, 440);
}
       
    }//GEN-LAST:event_Text06MouseClicked

    private void jLabel77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel77MouseClicked

Passwordfeld.setVisible(true);
Bestätigung.setVisible(false);
Bezahlen.setVisible(false);

senden.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {

String username = User.getText();
char[] password = Kennwort.getPassword();

if (password != null && new String(password).equals("password") && username.equals("admin")) {
    Admin myAdmin = new Admin();
    myAdmin.setVisible(true);
    Passwordfeld.dispose();
    JFrame Highlight = new JFrame();
    Highlight.dispose(); 
} else {
    JOptionPane.showMessageDialog(Passwordfeld, "Incorrect username or password. Try again.", "Error", JOptionPane.ERROR_MESSAGE);
}
// Kommentar: Diese Methode wird aufgerufen, wenn auf das jLabel77-Objekt geklickt wird.
    // Zunächst werden die Sichtbarkeiten der Passwordfeld-, Bestätigung- und Bezahlen-Objekte angepasst.
    // Anschließend wird ein MouseListener für das senden-Objekt hinzugefügt.
    // Im MouseListener werden der eingegebene Benutzername (username) und das Passwort (password) abgefragt.
    // Falls das Passwort "password" und der Benutzername "admin" entsprechen, wird ein Admin-Objekt erstellt und sichtbar gemacht.
    // Danach werden das Passwordfeld und das Highlight-JFrame geschlossen.
    // Andernfalls wird eine Fehlermeldung über JOptionPane angezeigt.
        
    }
});


        
       
    }//GEN-LAST:event_jLabel77MouseClicked

    private void CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseClicked

Passwordfeld.dispose();
    Passwordfeld.setVisible(false);
    this.setVisible(true);

       //Kommentar: Diese Codezeilen werden ausgeführt, um das Passwordfeld-Fenster zu schließen und unsichtbar zu machen. Anschließend wird das aktuelle Fenster (das die Methode ausführt) sichtbar gemacht.
    }//GEN-LAST:event_CancelMouseClicked

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
       
    }//GEN-LAST:event_UserActionPerformed

    private void sendenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendenMouseClicked
       
    }//GEN-LAST:event_sendenMouseClicked

    private void PasswordfeldWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_PasswordfeldWindowClosed

       
    }//GEN-LAST:event_PasswordfeldWindowClosed

    private void PasswordfeldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordfeldMouseClicked
       
    }//GEN-LAST:event_PasswordfeldMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        
        
 try (Connection conn = DriverManager.getConnection(Mysqllink,username,password)) {

  String sql1_2 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
try (PreparedStatement pstmt1 = conn.prepareStatement(sql1_2)) {
    pstmt1.setDouble(1, 1.2);
    ResultSet rs1 = pstmt1.executeQuery();
    if (rs1.next()) {
        String kategoriebezeichnung1_2 = rs1.getString("Kategoriebezeichnung");
        Kategorie1_2.setText(kategoriebezeichnung1_2);
    } else {

    }
} catch (SQLException ex) {
    
}

  String sql1_3 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_3)) {
    pstmt3.setDouble(1, 1.3);
    ResultSet rs3 = pstmt3.executeQuery();
    if (rs3.next()) {
        String kategoriebezeichnung1_3 = rs3.getString("Kategoriebezeichnung");
        Kategorie1_3.setText(kategoriebezeichnung1_3);
    } else {
    
    }
} catch (SQLException ex) {
    
}

   String sql1_4 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_4)) {
    pstmt3.setDouble(1, 1.4);
    ResultSet rs3 = pstmt3.executeQuery();
    if (rs3.next()) {
        String kategoriebezeichnung1_4 = rs3.getString("Kategoriebezeichnung");
        Kategorie1_4.setText(kategoriebezeichnung1_4);
    } else {
        
    }
} catch (SQLException ex) {
    
}
//Kommentar: In diesem Codeabschnitt wird eine Verbindung zur Datenbank hergestellt. Anschließend werden drei SQL-Abfragen ausgeführt, um die Kategoriebezeichnungen
//für bestimmte Reihen zu erhalten. Die Abfrageergebnisse werden verwendet, um die entsprechenden Textfelder (Kategorie1_2, Kategorie1_3, Kategorie1_4) in der Benutzeroberfläche
//zu aktualisieren. Falls keine Ergebnisse gefunden werden, kann dies entsprechend behandelt werden. Bei auftretenden SQLExceptions wird die Ausnahme entsprechend behandelt.

   String sql1_5 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_5)) {
    pstmt3.setDouble(1, 1.5);
    ResultSet rs3 = pstmt3.executeQuery();
    if (rs3.next()) {
        String kategoriebezeichnung1_5 = rs3.getString("Kategoriebezeichnung");
        Kategorie1_5.setText(kategoriebezeichnung1_5);
    } else {
        
    }
} catch (SQLException ex) {
    
}
//Kommentar: In diesem Codeabschnitt wird eine weitere SQL-Abfrage hinzugefügt, um die Kategoriebezeichnung für die Reihe 1.5 zu erhalten. Das Ergebnis der Abfrage wird 
//verwendet, um das entsprechende Textfeld (Kategorie1_5) in der Benutzeroberfläche zu aktualisieren. Wenn keine Ergebnisse gefunden werden, kann dies entsprechend
//behandelt werden. SQLExceptions werden entsprechend behandelt.

   String sql1_6 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_6)) {
    pstmt3.setDouble(1, 1.6);
    ResultSet rs3 = pstmt3.executeQuery();
    if (rs3.next()) {
        String kategoriebezeichnung1_6 = rs3.getString("Kategoriebezeichnung");
        Kategorie1_6.setText(kategoriebezeichnung1_6);
    } else {
        
    }
} catch (SQLException ex) {
    
}

    
  
  String sql1_7 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_7)) {
    pstmt3.setDouble(1, 1.7);
    ResultSet rs3 = pstmt3.executeQuery();
    if (rs3.next()) {
        String kategoriebezeichnung1_7 = rs3.getString("Kategoriebezeichnung");
        Kategorie1_7.setText(kategoriebezeichnung1_7);
    } else {
        
    }
} catch (SQLException ex) {
    
}

 
    String sql2_1 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_1)) {
    pstmt1.setDouble(1, 2.1);
    ResultSet rs1 = pstmt1.executeQuery();
    if (rs1.next()) {
        String kategoriebezeichnung2_1 = rs1.getString("Kategoriebezeichnung");
        Kategorie2_1.setText(kategoriebezeichnung2_1);
    } else {
        
    }
} catch (SQLException ex) {
    
}

  
    String sql2_2 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_2)) {
    pstmt1.setDouble(1, 2.2);
    ResultSet rs1 = pstmt1.executeQuery();
    if (rs1.next()) {
        String kategoriebezeichnung2_2 = rs1.getString("Kategoriebezeichnung");
        Kategorie2_2.setText(kategoriebezeichnung2_2);
    } else {
        
    }
} catch (SQLException ex) {
    
}

    
 
   String sql2_3 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_3)) {
    pstmt1.setDouble(1, 2.3);
    ResultSet rs1 = pstmt1.executeQuery();
    if (rs1.next()) {
        String kategoriebezeichnung2_3 = rs1.getString("Kategoriebezeichnung");
        Kategorie2_3.setText(kategoriebezeichnung2_3);
    } else {
        
    }
} catch (SQLException ex) {
    
}

    
    
    
    String sql2_4 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_4)) {
    pstmt1.setDouble(1, 2.4);
    ResultSet rs1 = pstmt1.executeQuery();
    if (rs1.next()) {
        String kategoriebezeichnung2_4 = rs1.getString("Kategoriebezeichnung");
        Kategorie2_4.setText(kategoriebezeichnung2_4);
    } else {
        
    }
} catch (SQLException ex) {
    
}

    

    String sql2_5 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_5)) {
    pstmt1.setDouble(1, 2.5);
    ResultSet rs1 = pstmt1.executeQuery();
    if (rs1.next()) {
        String kategoriebezeichnung2_5 = rs1.getString("Kategoriebezeichnung");
        Kategorie2_5.setText(kategoriebezeichnung2_5);
    } else {
        
    }
} catch (SQLException ex) {
    
}


   String sql2_6 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_6)) {
    pstmt1.setDouble(1, 2.6);
    ResultSet rs1 = pstmt1.executeQuery();
if (rs1.next()) {
    String kategoriebezeichnung2_6 = rs1.getString("Kategoriebezeichnung");
    Kategorie2_6.setText(kategoriebezeichnung2_6);
} else {

}
} catch (SQLException ex) {

}
       
  String sql2_7 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_7)) {
    pstmt1.setDouble(1, 2.7);
    ResultSet rs1 = pstmt1.executeQuery();
    if (rs1.next()) {
        String kategoriebezeichnung2_7 = rs1.getString("Kategoriebezeichnung");
        Kategorie2_7.setText(kategoriebezeichnung2_7);
    } else {
        
    }
} catch (SQLException ex) {
    


}}  catch (SQLException ex) {
        Logger.getLogger(Highlight.class.getName()).log(Level.SEVERE, null, ex);
    }



       
    }//GEN-LAST:event_formWindowOpened

    private void Supplement04OkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement04OkMouseClicked
       
    }//GEN-LAST:event_Supplement04OkMouseClicked

    private void Supplement04OkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement04OkMouseEntered

        
       
    }//GEN-LAST:event_Supplement04OkMouseEntered

    private void Supplement04OkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement04OkMouseExited

       
    }//GEN-LAST:event_Supplement04OkMouseExited

    private void Supplement01NokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement01NokMouseClicked

    }//GEN-LAST:event_Supplement01NokMouseClicked

    private void Supplement01OkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement01OkMouseClicked
  
       
    }//GEN-LAST:event_Supplement01OkMouseClicked

    private void Supplement01ExtraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement01ExtraMouseClicked
      
    }//GEN-LAST:event_Supplement01ExtraMouseClicked

    private void Supplement01NokMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement01NokMouseEntered

       
    }//GEN-LAST:event_Supplement01NokMouseEntered

    private void Supplement01NokMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement01NokMouseExited

       
    }//GEN-LAST:event_Supplement01NokMouseExited

    private void Supplement01OkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement01OkMouseEntered

       
    }//GEN-LAST:event_Supplement01OkMouseEntered

    private void Supplement01OkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement01OkMouseExited
       
       
    }//GEN-LAST:event_Supplement01OkMouseExited

    private void Supplement01ExtraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement01ExtraMouseEntered

       
    }//GEN-LAST:event_Supplement01ExtraMouseEntered

    private void Supplement01ExtraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement01ExtraMouseExited
   
       
    }//GEN-LAST:event_Supplement01ExtraMouseExited

    private void Supplement01NokMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement01NokMousePressed
if (Supplementtester01) {
        try {
            // Den Preis des Supplements und den Artikel Preis erhalten
            String supplementPreis = Supplement01Preis.getText();
            String artikelPreis = Preis.getText();

            // Preise in Float umwandeln
            float supplementPreisNum = Float.parseFloat(supplementPreis);
            float artikelPreisNum = Float.parseFloat(artikelPreis);

            // Neuen Gesamtpreis berechnen
            float gesamtPreisNum = artikelPreisNum - supplementPreisNum;

            // Preis mit zwei Nachkommastellen formatieren
            DecimalFormat df = new DecimalFormat("0.00");
            Preis.setText(df.format(gesamtPreisNum));

            // Supplementtester01 auf "false" setzen, um weitere Berechnungen zu verhindern
            Supplementtester01 = false;
        } catch (NumberFormatException e) {
            // Eventuelle NumberFormatException behandeln

}
    
    }    
        
    // Aktiviere den "Supplement01Nok"-Button
Supplement01Nok.setEnabled(true);

// Deaktiviere die folgenden Komponenten
Supplement01Ok.setEnabled(false);
Supplement01Extra.setEnabled(false);
Supplement01.setEnabled(false);

// Setze die Schriftart der Komponenten "Supplement01" und "Supplement01Preis" auf den normalen Schriftstil
Supplement01.setFont(Supplement01.getFont().deriveFont(Font.PLAIN));
Supplement01Preis.setFont(Supplement01Preis.getFont().deriveFont(Font.PLAIN));

// Deaktiviere die Komponenten "Supplement01Preis" und "Supplement01Plus"
Supplement01Preis.setEnabled(false);
Supplement01Plus.setEnabled(false);

    }//GEN-LAST:event_Supplement01NokMousePressed

    private void Supplement01OkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement01OkMousePressed

 if (Supplementtester01) {
    try {
    String supplementPreis = Supplement01Preis.getText();
    String artikelPreis = Preis.getText();

    float supplementPreisNum = Float.parseFloat(supplementPreis);
    float artikelPreisNum = Float.parseFloat(artikelPreis);


    float gesamtPreisNum = artikelPreisNum - supplementPreisNum ;


    DecimalFormat df = new DecimalFormat("0.00");
    Preis.setText(df.format(gesamtPreisNum));
    Supplementtester01 = false;
} catch (NumberFormatException e) {

}
    
    }    
        
        Supplement01Ok.setEnabled(true);
        Supplement01Nok.setEnabled(false);
        Supplement01Extra.setEnabled(false);
        Supplement01.setEnabled(true);
         Supplement01.setFont(Supplement01.getFont().deriveFont(Font.PLAIN));
         Supplement01Preis.setFont(Supplement01Preis.getFont().deriveFont(Font.PLAIN));
         Supplement01Preis.setEnabled(false);
         Supplement01Plus.setEnabled(false);
       
    }//GEN-LAST:event_Supplement01OkMousePressed

    private void Supplement01ExtraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement01ExtraMousePressed
  Supplement01Nok.setEnabled(false);
        Supplement01Ok.setEnabled(false);
        Supplement01Extra.setEnabled(true); 
        Supplement01.setEnabled(true);
        Supplement01.setFont(Supplement01.getFont().deriveFont(Font.BOLD));
        Supplement01Preis.setFont(Supplement01Preis.getFont().deriveFont(Font.BOLD));
        Supplement01Preis.setEnabled(true);
        Supplement01Plus.setEnabled(true);
        
if (!Supplementtester01) {
    try {
        String supplementPreis = Supplement01Preis.getText();
        String artikelPreis = Preis.getText();
   
        float supplementPreisNum = Float.parseFloat(supplementPreis);
        float artikelPreisNum = Float.parseFloat(artikelPreis);


        float gesamtPreisNum = supplementPreisNum + artikelPreisNum;

 
        DecimalFormat df = new DecimalFormat("0.00");
        Preis.setText(df.format(gesamtPreisNum));
        Supplementtester01 = true;

    } catch (NumberFormatException e) {
     
    }
}


       
    }//GEN-LAST:event_Supplement01ExtraMousePressed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
String priceString = Preis.getText();
double price = Double.parseDouble(priceString);
String Zusatz01 = Supplement01.getText();
String Zusatz02 = Supplement02.getText();
String Zusatz03 = Supplement03.getText();
String Zusatz04 = Supplement04.getText();

if(Supplement01.isVisible()) { 

if (Supplement01Nok.isEnabled()) {
    Zusatz01 = "- ohne " + Zusatz01;
}

if (Supplement01Ok.isEnabled()) {
    Zusatz01 = "- mit " + Zusatz01;
  
}

if (Supplement01Extra.isEnabled()) {
    Zusatz01 = "- mit extra " + Zusatz01 + " (+" + Supplement01Preis.getText() + " Fr.)";
}
}
else {
    Zusatz01 = "";

}

if(Supplement02.isVisible()) { 
if (Supplement02Nok.isEnabled()) {
    Zusatz02 = "- ohne " + Zusatz02;
}

if (Supplement02Ok.isEnabled()) {
    Zusatz02 = "- mit " + Zusatz02;
  
}

if (Supplement02Extra.isEnabled()) {
    Zusatz02 = "- mit extra " + Zusatz02 + " (+" + Supplement02Preis.getText() + " Fr.)";
}
}
else{
Zusatz02 = "";
 
}

if(Supplement03.isVisible()) { 
if (Supplement03Nok.isEnabled()) {
    Zusatz03 = "- ohne " + Zusatz03;
}

if (Supplement03Ok.isEnabled()) {
    Zusatz03 = "- mit " + Zusatz03;
  
}

if (Supplement03Extra.isEnabled()) {
    Zusatz03 = "- mit extra " + Zusatz03 + " (+" + Supplement03Preis.getText() + " Fr.)";
}
}
else{
Zusatz03 = "";
 
}
if (Supplement04.isVisible()) {
if (Supplement04Nok.isEnabled()) {
    Zusatz04 = "- ohne " + Zusatz04;
}

if (Supplement04Ok.isEnabled()) {
    Zusatz04 = "- mit " + Zusatz04;
  
}

if (Supplement04Extra.isEnabled()) {
    Zusatz04 = "- mit extra " + Zusatz04 + " (+" + Supplement04Preis.getText() + " Fr.)";
}
}

else
{

Zusatz04 = "";

}


DefaultTableModel model = (DefaultTableModel) Table.getModel();




Object[] rowData1 = { "<html><font size='3'><b>" + Artikelnummer.getText() + "</b></font></html>", "",  "" };
Object[] rowData2 = { "<html><font size='6'>" + Artikelbezeichnung.getText() + "</font></html>", "",  price };
Object[] rowData3 = { "<html><font size='3'>" + Zusatz01 + "</font></html>", "", "" };
Object[] rowData4 = { "<html><font size='3'>" + Zusatz02 + "</font></html>", "", "" };
Object[] rowData5 = { "<html><font size='3'>" + Zusatz03 + "</font></html>", "", "" };
Object[] rowData6 = { "<html><font size='3'>" + Zusatz04 + "</font></html>", "", "" };
Object[] rowData7 = { "", "", "" };

model.addRow(rowData1);
model.addRow(rowData2);

model.addRow(rowData3);
model.addRow(rowData4);
model.addRow(rowData5);
model.addRow(rowData6);
model.addRow(rowData7);




for (int i = model.getRowCount() - 6; i < model.getRowCount(); i++) {
    Object value = model.getValueAt(i, 2);
    if (i == 1 && value instanceof String && !((String) value).isEmpty()) {
        double betrag = Double.parseDouble((String) value);
        total += betrag;
    } else if (value instanceof Double) {
        double betrag = (double) value;
        total += betrag;
    }
}
DecimalFormat df = new DecimalFormat("#.00");
String formattedTotal = df.format(total);
Total.setText(formattedTotal);


       
    }//GEN-LAST:event_jLabel13MouseClicked

    private void Supplement02NokMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement02NokMousePressed
if (Supplementtester02) {
    try {
    String supplementPreis = Supplement02Preis.getText();
    String artikelPreis = Preis.getText();

    float supplementPreisNum = Float.parseFloat(supplementPreis);
    float artikelPreisNum = Float.parseFloat(artikelPreis);


    float gesamtPreisNum = artikelPreisNum - supplementPreisNum ;

  
    DecimalFormat df = new DecimalFormat("0.00");
    Preis.setText(df.format(gesamtPreisNum));
    Supplementtester02 = false;
} catch (NumberFormatException e) {

}
    
    }    
        
        
        Supplement02Nok.setEnabled(true);
 
        Supplement02Ok.setEnabled(false);
        Supplement02Extra.setEnabled(false);
        Supplement02.setEnabled(false);
        Supplement02.setFont(Supplement02.getFont().deriveFont(Font.PLAIN));
        Supplement02Preis.setFont(Supplement02Preis.getFont().deriveFont(Font.PLAIN));
        Supplement02Preis.setEnabled(false);
        Supplement02Plus.setEnabled(false);
       
    }//GEN-LAST:event_Supplement02NokMousePressed

    private void Supplement02OkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement02OkMousePressed
 if (Supplementtester02) {
    try {
    String supplementPreis = Supplement02Preis.getText();
    String artikelPreis = Preis.getText();

    float supplementPreisNum = Float.parseFloat(supplementPreis);
    float artikelPreisNum = Float.parseFloat(artikelPreis);


    float gesamtPreisNum = artikelPreisNum - supplementPreisNum ;

   
    DecimalFormat df = new DecimalFormat("0.00");
    Preis.setText(df.format(gesamtPreisNum));
    Supplementtester02 = false;
} catch (NumberFormatException e) {
 
}
    
    }    
        
        Supplement02Ok.setEnabled(true);
        Supplement02Nok.setEnabled(false);
        Supplement02Extra.setEnabled(false);
        Supplement02.setEnabled(true);
         Supplement02.setFont(Supplement02.getFont().deriveFont(Font.PLAIN));
         Supplement02Preis.setFont(Supplement02Preis.getFont().deriveFont(Font.PLAIN));
         Supplement02Preis.setEnabled(false);
         Supplement02Plus.setEnabled(false);
       
    }//GEN-LAST:event_Supplement02OkMousePressed

    private void Supplement02ExtraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement02ExtraMousePressed
  Supplement02Nok.setEnabled(false);
        Supplement02Ok.setEnabled(false);
        Supplement02Extra.setEnabled(true); 
        Supplement02.setEnabled(true);
        Supplement02.setFont(Supplement02.getFont().deriveFont(Font.BOLD));
        Supplement02Preis.setFont(Supplement02Preis.getFont().deriveFont(Font.BOLD));
        Supplement02Preis.setEnabled(true);
        Supplement02Plus.setEnabled(true);
        
if (!Supplementtester02) {
    try {
        String supplementPreis = Supplement02Preis.getText();
        String artikelPreis = Preis.getText();
     
        float supplementPreisNum = Float.parseFloat(supplementPreis);
        float artikelPreisNum = Float.parseFloat(artikelPreis);

        float gesamtPreisNum = supplementPreisNum + artikelPreisNum;

  
        DecimalFormat df = new DecimalFormat("0.00");
        Preis.setText(df.format(gesamtPreisNum));
        Supplementtester02 = true;

    } catch (NumberFormatException e) {
  
    }
}

       
    }//GEN-LAST:event_Supplement02ExtraMousePressed

    private void Supplement03NokMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement03NokMousePressed
if (Supplementtester03) {
    try {
    String supplementPreis = Supplement03Preis.getText();
    String artikelPreis = Preis.getText();
   
    float supplementPreisNum = Float.parseFloat(supplementPreis);
    float artikelPreisNum = Float.parseFloat(artikelPreis);


    float gesamtPreisNum = artikelPreisNum - supplementPreisNum ;


    DecimalFormat df = new DecimalFormat("0.00");
    Preis.setText(df.format(gesamtPreisNum));
    Supplementtester03 = false;
} catch (NumberFormatException e) {

}
    
    }    
        
        
        Supplement03Nok.setEnabled(true);
 
        Supplement03Ok.setEnabled(false);
        Supplement03Extra.setEnabled(false);
        Supplement03.setEnabled(false);
        Supplement03.setFont(Supplement03.getFont().deriveFont(Font.PLAIN));
        Supplement03Preis.setFont(Supplement03Preis.getFont().deriveFont(Font.PLAIN));
        Supplement03Preis.setEnabled(false);
        Supplement03Plus.setEnabled(false);
       
       
    }//GEN-LAST:event_Supplement03NokMousePressed

    private void Supplement03OkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement03OkMousePressed
if (Supplementtester03) {
    try {
    String supplementPreis = Supplement03Preis.getText();
    String artikelPreis = Preis.getText();

    float supplementPreisNum = Float.parseFloat(supplementPreis);
    float artikelPreisNum = Float.parseFloat(artikelPreis);


    float gesamtPreisNum = artikelPreisNum - supplementPreisNum ;


    DecimalFormat df = new DecimalFormat("0.00");
    Preis.setText(df.format(gesamtPreisNum));
    Supplementtester03 = false;
} catch (NumberFormatException e) {

}
    
    }    
        
        Supplement03Ok.setEnabled(true);
        Supplement03Nok.setEnabled(false);
        Supplement03Extra.setEnabled(false);
        Supplement03.setEnabled(true);
         Supplement03.setFont(Supplement03.getFont().deriveFont(Font.PLAIN));
         Supplement03Preis.setFont(Supplement03Preis.getFont().deriveFont(Font.PLAIN));
         Supplement03Preis.setEnabled(false);
         Supplement03Plus.setEnabled(false);
       
    }//GEN-LAST:event_Supplement03OkMousePressed

    private void Supplement03ExtraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement03ExtraMousePressed
  Supplement03Nok.setEnabled(false);
        Supplement03Ok.setEnabled(false);
        Supplement03Extra.setEnabled(true); 
        Supplement03.setEnabled(true);
        Supplement03.setFont(Supplement03.getFont().deriveFont(Font.BOLD));
        Supplement03Preis.setFont(Supplement03Preis.getFont().deriveFont(Font.BOLD));
        Supplement03Preis.setEnabled(true);
        Supplement03Plus.setEnabled(true);
        
if (!Supplementtester03) {
    try {
        String supplementPreis = Supplement03Preis.getText();
        String artikelPreis = Preis.getText();
 
        float supplementPreisNum = Float.parseFloat(supplementPreis);
        float artikelPreisNum = Float.parseFloat(artikelPreis);


        float gesamtPreisNum = supplementPreisNum + artikelPreisNum;

       
        DecimalFormat df = new DecimalFormat("0.00");
        Preis.setText(df.format(gesamtPreisNum));
        Supplementtester03 = true;

    } catch (NumberFormatException e) {
      
    }
}
       
    }//GEN-LAST:event_Supplement03ExtraMousePressed

    private void Supplement04NokMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement04NokMousePressed
if (Supplementtester04) {
    try {
    String supplementPreis = Supplement04Preis.getText();
    String artikelPreis = Preis.getText();

    float supplementPreisNum = Float.parseFloat(supplementPreis);
    float artikelPreisNum = Float.parseFloat(artikelPreis);


    float gesamtPreisNum = artikelPreisNum - supplementPreisNum ;


    DecimalFormat df = new DecimalFormat("0.00");
    Preis.setText(df.format(gesamtPreisNum));
    Supplementtester04 = false;
} catch (NumberFormatException e) {

}
    
    }    
        
        
        Supplement04Nok.setEnabled(true);
 
        Supplement04Ok.setEnabled(false);
        Supplement04Extra.setEnabled(false);
        Supplement04.setEnabled(false);
        Supplement04.setFont(Supplement04.getFont().deriveFont(Font.PLAIN));
        Supplement04Preis.setFont(Supplement04Preis.getFont().deriveFont(Font.PLAIN));
        Supplement04Preis.setEnabled(false);
        Supplement04Plus.setEnabled(false);
       
    }//GEN-LAST:event_Supplement04NokMousePressed

    private void Supplement04OkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement04OkMousePressed
if (Supplementtester04) {
    try {
    String supplementPreis = Supplement04Preis.getText();
    String artikelPreis = Preis.getText();
   
    float supplementPreisNum = Float.parseFloat(supplementPreis);
    float artikelPreisNum = Float.parseFloat(artikelPreis);


    float gesamtPreisNum = artikelPreisNum - supplementPreisNum ;


    DecimalFormat df = new DecimalFormat("0.00");
    Preis.setText(df.format(gesamtPreisNum));
    Supplementtester04 = false;
} catch (NumberFormatException e) {

}
    
    }    
        
        Supplement04Ok.setEnabled(true);
        Supplement04Nok.setEnabled(false);
        Supplement04Extra.setEnabled(false);
        Supplement04.setEnabled(true);
         Supplement04.setFont(Supplement04.getFont().deriveFont(Font.PLAIN));
         Supplement04Preis.setFont(Supplement04Preis.getFont().deriveFont(Font.PLAIN));
         Supplement04Preis.setEnabled(false);
         Supplement04Plus.setEnabled(false);
       
    }//GEN-LAST:event_Supplement04OkMousePressed

    private void Supplement04ExtraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplement04ExtraMousePressed
  Supplement04Nok.setEnabled(false);
        Supplement04Ok.setEnabled(false);
        Supplement04Extra.setEnabled(true); 
        Supplement04.setEnabled(true);
        Supplement04.setFont(Supplement04.getFont().deriveFont(Font.BOLD));
        Supplement04Preis.setFont(Supplement04Preis.getFont().deriveFont(Font.BOLD));
        Supplement04Preis.setEnabled(true);
        Supplement04Plus.setEnabled(true);
        
if (!Supplementtester04) {
    try {
        String supplementPreis = Supplement04Preis.getText();
        String artikelPreis = Preis.getText();

        float supplementPreisNum = Float.parseFloat(supplementPreis);
        float artikelPreisNum = Float.parseFloat(artikelPreis);


        float gesamtPreisNum = supplementPreisNum + artikelPreisNum;

     
        DecimalFormat df = new DecimalFormat("0.00");
        Preis.setText(df.format(gesamtPreisNum));
        Supplementtester04 = true;

    } catch (NumberFormatException e) {
      
    }
}
       
    }//GEN-LAST:event_Supplement04ExtraMousePressed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

   String totalText = Total.getText();
double totalValue = Double.parseDouble(totalText);
DecimalFormat decimalFormat = new DecimalFormat("#0.00");
String formattedTotalValue = decimalFormat.format(totalValue);

AnzeigeTotal.setText(formattedTotalValue);


if (totalValue > 0) {
    Bezahlen.setVisible(true);
    this.setEnabled(false);
}

       
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
Bezahlen.dispose();
    Bezahlen.setVisible(false);
    this.setVisible(true);
    this.setEnabled(true);
       
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked

Bezahlung ();
Bezahlen.dispose();  
Bezahlen.setVisible(false);






       
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
DefaultTableModel model = (DefaultTableModel) Table.getModel();
model.setRowCount(0);
total=0;
DecimalFormat df = new DecimalFormat("#0.00");
String formattedTotal = df.format(total);
Total.setText(formattedTotal);

       
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
DefaultTableModel model = (DefaultTableModel) Table.getModel();
int rowCount = model.getRowCount();
int rowsToRemove = Math.min(rowCount, 7);


for (int i = rowCount - 1; i >= rowCount - rowsToRemove; i--) {
    Object value = model.getValueAt(i, 2);
    if (value instanceof Double) {
        double betrag = (double) value;
        total -= betrag;
       
    }
    model.removeRow(i); 
}
DecimalFormat df = new DecimalFormat("#0.00");
// Ensure total is non-negative
total = Math.max(total, 0.0);
String formattedTotal = df.format(total);

Total.setText(formattedTotal);
// Ensure total is non-negative


       
    }//GEN-LAST:event_jLabel31MouseClicked

    private void BestätigungWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_BestätigungWindowOpened


Timer timer = new Timer(30000, new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
  
      Bestätigung.dispose();  
Bestätigung.setVisible(false);


Highlight newFrame = new Highlight();
newFrame.setVisible(true);
newFrame.setEnabled(true);
    }
});
timer.setRepeats(false);
timer.start();


       
        Timer countdownTimer = new Timer(1000, e -> {
            int remainingSeconds = Integer.parseInt(Zahl.getText());
            if (remainingSeconds > 0) {
                remainingSeconds--;
                Zahl.setText(String.valueOf(remainingSeconds));
            } else {
                ((Timer) e.getSource()).stop();
            }
        });

 
        Zahl.setText("30");
        countdownTimer.start();

       
    }//GEN-LAST:event_BestätigungWindowOpened

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
      Bezahlung ();
Bezahlen.dispose();  
Bezahlen.setVisible(false);


    }//GEN-LAST:event_jPanel8MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
Bestätigung.dispose();  
Bestätigung.setVisible(false);



Highlight newFrame = new Highlight();
newFrame.setVisible(true);
newFrame.setEnabled(true);

;


       
    }//GEN-LAST:event_jLabel37MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated


    }//GEN-LAST:event_formWindowActivated

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        System.exit(0);

    }//GEN-LAST:event_jLabel14MouseClicked

   
public static void main(String args[]) {
    
    
       


    try {
        // Durchlaufen der verfügbaren LookAndFeelInfos
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            // Überprüfen, ob der Name des aktuellen LookAndFeelInfo "Nimbus" ist
            if ("Nimbus".equals(info.getName())) {
                // Wenn ja, das Look and Feel auf Nimbus setzen und Schleife beenden
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        // Fehlerbehandlung für ClassNotFoundException
        java.util.logging.Logger.getLogger(Highlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        // Fehlerbehandlung für InstantiationException
        java.util.logging.Logger.getLogger(Highlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        // Fehlerbehandlung für IllegalAccessException
        java.util.logging.Logger.getLogger(Highlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        // Fehlerbehandlung für UnsupportedLookAndFeelException
        java.util.logging.Logger.getLogger(Highlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    
}

     
    
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Highlight().setVisible(true);
            }
        });
        
    
            
    

       
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Abholcode;
    private javax.swing.JLabel AnzeigeTotal;
    private javax.swing.JLabel Artikelbezeichnung;
    private javax.swing.JLabel Artikelnummer;
    private javax.swing.JTextArea Beschreibung;
    private javax.swing.JDialog Bestätigung;
    private javax.swing.JDialog Bezahlen;
    private javax.swing.JLabel Bildanzeige;
    private javax.swing.JLabel Biofeld3;
    private javax.swing.JLabel Cancel;
    private javax.swing.JLabel Countdown;
    private javax.swing.JLabel Dauer;
    private javax.swing.JPanel Highlights;
    private javax.swing.JLabel Image01;
    private javax.swing.JLabel Image02;
    private javax.swing.JLabel Image03;
    private javax.swing.JLabel Image04;
    private javax.swing.JLabel Image05;
    private javax.swing.JLabel Image06;
    private javax.swing.JLabel Image07;
    private javax.swing.JLabel Image08;
    private javax.swing.JLabel Image09;
    private javax.swing.JLabel Image10;
    private javax.swing.JLabel Image11;
    private javax.swing.JLabel Image12;
    private javax.swing.JLabel Image13;
    private javax.swing.JLabel Image14;
    private javax.swing.JLabel Image15;
    private javax.swing.JTable Kalorienanzeige;
    public javax.swing.JLabel Kategorie1_1;
    private javax.swing.JLabel Kategorie1_2;
    private javax.swing.JLabel Kategorie1_3;
    private javax.swing.JLabel Kategorie1_4;
    private javax.swing.JLabel Kategorie1_5;
    private javax.swing.JLabel Kategorie1_6;
    private javax.swing.JLabel Kategorie1_7;
    private javax.swing.JLabel Kategorie2_1;
    private javax.swing.JLabel Kategorie2_2;
    private javax.swing.JLabel Kategorie2_3;
    private javax.swing.JLabel Kategorie2_4;
    private javax.swing.JLabel Kategorie2_5;
    private javax.swing.JLabel Kategorie2_6;
    private javax.swing.JLabel Kategorie2_7;
    private javax.swing.JPasswordField Kennwort;
    private javax.swing.JPanel LinkerPanel;
    private javax.swing.JPanel Liste1_2;
    private javax.swing.JLabel Minuten;
    private javax.swing.JPanel MittlererPanel;
    private javax.swing.JLabel Nichtverfügbar1;
    private javax.swing.JLabel Nichtverfügbar10;
    private javax.swing.JLabel Nichtverfügbar11;
    private javax.swing.JLabel Nichtverfügbar12;
    private javax.swing.JLabel Nichtverfügbar13;
    private javax.swing.JLabel Nichtverfügbar14;
    private javax.swing.JLabel Nichtverfügbar15;
    private javax.swing.JLabel Nichtverfügbar2;
    private javax.swing.JLabel Nichtverfügbar3;
    private javax.swing.JLabel Nichtverfügbar4;
    private javax.swing.JLabel Nichtverfügbar5;
    private javax.swing.JLabel Nichtverfügbar6;
    private javax.swing.JLabel Nichtverfügbar7;
    private javax.swing.JLabel Nichtverfügbar8;
    private javax.swing.JLabel Nichtverfügbar9;
    private javax.swing.JPanel ObererPanel;
    private javax.swing.JPanel Parent;
    private javax.swing.JPanel Passlabel;
    private javax.swing.JDialog Passwordfeld;
    private javax.swing.JInternalFrame Popup;
    private javax.swing.JLabel Preis;
    private javax.swing.JPanel Salate;
    private javax.swing.JPanel Salate03;
    private javax.swing.JLabel Sofortfeld;
    private javax.swing.JLabel Supplement01;
    private javax.swing.JLabel Supplement01Extra;
    private javax.swing.JLabel Supplement01Nok;
    private javax.swing.JLabel Supplement01Ok;
    private javax.swing.JLabel Supplement01Plus;
    private javax.swing.JLabel Supplement01Preis;
    private javax.swing.JLabel Supplement02;
    private javax.swing.JLabel Supplement02Extra;
    private javax.swing.JLabel Supplement02Nok;
    private javax.swing.JLabel Supplement02Ok;
    private javax.swing.JLabel Supplement02Plus;
    private javax.swing.JLabel Supplement02Preis;
    private javax.swing.JLabel Supplement03;
    private javax.swing.JLabel Supplement03Extra;
    private javax.swing.JLabel Supplement03Nok;
    private javax.swing.JLabel Supplement03Ok;
    private javax.swing.JLabel Supplement03Plus;
    private javax.swing.JLabel Supplement03Preis;
    private javax.swing.JLabel Supplement04;
    private javax.swing.JLabel Supplement04Extra;
    private javax.swing.JLabel Supplement04Nok;
    private javax.swing.JLabel Supplement04Ok;
    private javax.swing.JLabel Supplement04Plus;
    private javax.swing.JLabel Supplement04Preis;
    private javax.swing.JTable Table;
    private javax.swing.JLabel Text01;
    private javax.swing.JLabel Text02;
    private javax.swing.JLabel Text03;
    private javax.swing.JLabel Text04;
    private javax.swing.JLabel Text05;
    private javax.swing.JLabel Text06;
    private javax.swing.JLabel Text07;
    private javax.swing.JLabel Text08;
    private javax.swing.JLabel Text09;
    private javax.swing.JLabel Text10;
    private javax.swing.JLabel Text11;
    private javax.swing.JLabel Text12;
    private javax.swing.JLabel Text13;
    private javax.swing.JLabel Text14;
    private javax.swing.JLabel Text15;
    private javax.swing.JLabel Titel;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel Uhrzeit;
    private javax.swing.JPanel UntererPanel;
    private javax.swing.JTextField User;
    private javax.swing.JLabel Veganfeld3;
    private javax.swing.JLabel VegiFeld3;
    private javax.swing.JLabel Zahl;
    private javax.swing.JTextArea Zutaten;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel_GutscheincodeEinlosen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel senden;
    // End of variables declaration//GEN-END:variables

   private void commonCode() {
    // Schleife von 1 bis 15 durchlaufen
    for (int i = 1; i < 16; i++) {
        // Generiere den String xx01 basierend auf der aktuellen Reihe und dem Index i
        String xx01 = reihe + String.format("%02d", i);

        // Verbindung zur Datenbank herstellen
        try (Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
            // SQL-Abfrage für Spalte und cid ausführen
            String sql = "SELECT Spalte, cid FROM artikellayout WHERE ArlaID = (SELECT ArlaID FROM artikellayout WHERE Spalte = ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, xx01);
                ResultSet rs = pstmt.executeQuery();
                rs.next();
                String spalte = rs.getString("Spalte");
                int cid = rs.getInt("cid");

                // SQL-Abfrage für artikelbezeichnung, icon und Verfügbar ausführen
                String sql2 = "SELECT artikelbezeichnung, icon, Verfügbar FROM artikelliste WHERE Cid = ?";
                try (PreparedStatement pstmt2 = conn.prepareStatement(sql2)) {
                    pstmt2.setInt(1, cid);
                    ResultSet rs2 = pstmt2.executeQuery();
                    rs2.next();
                    String artikelbezeichnung = rs2.getString("artikelbezeichnung");
                    String iconPath = rs2.getString("icon");
                    String verfügbar = rs2.getString("Verfügbar");

                    // Switch-Anweisung basierend auf dem Index i
                    switch(i) {
                        case 1 -> {
                            // Text und Icon für Textfeld und Bild setzen
                            Text01.setText(artikelbezeichnung);
                            Image01.setIcon(new ImageIcon(iconPath));
                            Nichtverfügbar1.setSize(Nichtverfügbar1.getWidth(), 0);
                            Text01.setEnabled(true);
                            Text01.setOpaque(true);
                            
                            // Überprüfen, ob Artikel verfügbar ist
                            if (verfügbar.equals("Nein")) {
                                // Wenn nicht verfügbar, Textfeld deaktivieren und unsichtbar machen
                                Nichtverfügbar1.setSize(Nichtverfügbar1.getWidth(), 170);
                                Text01.setEnabled(false);
                                Text01.setOpaque(false);
                                Text01.setText("");
                            }
                        }
                    case 2 -> {
                        Text02.setText(artikelbezeichnung);
                        Image02.setIcon(new ImageIcon(iconPath));
                        Nichtverfügbar2.setSize(Nichtverfügbar2.getWidth(), 0);
                            Text02.setEnabled(true);
                            Text02.setOpaque(true);
                        if (verfügbar.equals("Nein")) {
                            Nichtverfügbar2.setSize(Nichtverfügbar2.getWidth(), 170);
                            Text02.setEnabled(false);
                            Text02.setOpaque(false);
                            Text02.setText("");

                        }
                    }
                    case 3 -> {
                        Text03.setText(artikelbezeichnung);
                        Image03.setIcon(new ImageIcon(iconPath));
                        Nichtverfügbar3.setSize(Nichtverfügbar3.getWidth(), 0);
                            Text03.setEnabled(true);
                            Text03.setOpaque(true);
                        if (verfügbar.equals("Nein")) {
                            Nichtverfügbar3.setSize(Nichtverfügbar3.getWidth(), 170);
                            Text03.setEnabled(false);
                            Text03.setOpaque(false);
                            Text03.setText("");

                        }
                    }
                    case 4 -> {
                        Text04.setText(artikelbezeichnung);
                        Image04.setIcon(new ImageIcon(iconPath));
                        Nichtverfügbar4.setSize(Nichtverfügbar4.getWidth(), 0);
                            Text04.setEnabled(true);
                            Text04.setOpaque(true);
                        if (verfügbar.equals("Nein")) {
                            Nichtverfügbar4.setSize(Nichtverfügbar4.getWidth(), 170);
                            Text04.setEnabled(false);
                            Text04.setOpaque(false);
                            Text04.setText("");

                        }
                    }
                    case 5 -> {
                        Text05.setText(artikelbezeichnung);
                        Image05.setIcon(new ImageIcon(iconPath));
                        Nichtverfügbar5.setSize(Nichtverfügbar5.getWidth(), 0);
                            Text05.setEnabled(true);
                            Text05.setOpaque(true);
                        if (verfügbar.equals("Nein")) {
                            Nichtverfügbar5.setSize(Nichtverfügbar5.getWidth(), 170);
                            Text05.setEnabled(false);
                            Text05.setOpaque(false);
                            Text05.setText("");

                        }
                    }
                    case 6 -> {
                        Text06.setText(artikelbezeichnung);
                        Image06.setIcon(new ImageIcon(iconPath));
                        Nichtverfügbar6.setSize(Nichtverfügbar6.getWidth(), 0);
                            Text06.setEnabled(true);
                            Text06.setOpaque(true);
                        if (verfügbar.equals("Nein")) {
                            Nichtverfügbar6.setSize(Nichtverfügbar6.getWidth(), 170);
                            Text06.setEnabled(false);
                            Text06.setOpaque(false);
                            Text06.setText("");

                        }
                    }
                    case 7 -> {
//                         if (artikelbezeichnung.equals("Avocado-Spinat Lassi")){
//                         
//                            Text07.setVisible(false);
//                        Image07.setVisible(false);
//                        Nichtverfügbar7.setVisible(false);
//                            Text07.setVisible(false);
//                            Text07.setVisible(false);
//                         
//                         }
                        
                        
                        
                        
                        Text07.setText(artikelbezeichnung);
                        Image07.setIcon(new ImageIcon(iconPath));
                        Nichtverfügbar7.setSize(Nichtverfügbar7.getWidth(), 0);
                            Text07.setEnabled(true);
                            Text07.setOpaque(true);
                        if (verfügbar.equals("Nein")) {
                            Nichtverfügbar7.setSize(Nichtverfügbar7.getWidth(), 170);
                            Text07.setEnabled(false);
                            Text07.setOpaque(false);
                            Text07.setText("");

                        }
                    }
                    case 8 -> {
                        Text08.setText(artikelbezeichnung);
                        Image08.setIcon(new ImageIcon(iconPath));
                        Nichtverfügbar8.setSize(Nichtverfügbar8.getWidth(), 0);
                            Text08.setEnabled(true);
                            Text08.setOpaque(true);
                        if (verfügbar.equals("Nein")) {
                            Nichtverfügbar8.setSize(Nichtverfügbar8.getWidth(), 170);
                            Text08.setEnabled(false);
                            Text08.setOpaque(false);
                            Text08.setText("");

                        }
                    }
                    case 9 -> {
                        Text09.setText(artikelbezeichnung);
                        Image09.setIcon(new ImageIcon(iconPath));
                        Nichtverfügbar9.setSize(Nichtverfügbar9.getWidth(), 0);
                            Text09.setEnabled(true);
                            Text09.setOpaque(true);
                        if (verfügbar.equals("Nein")) {
                            Nichtverfügbar9.setSize(Nichtverfügbar9.getWidth(), 170);
                            Text09.setEnabled(false);
                            Text09.setOpaque(false);
                            Text09.setText("");

                        }
                    }
                    case 10 -> {
                        Text10.setText(artikelbezeichnung);
                        Image10.setIcon(new ImageIcon(iconPath));
                        Nichtverfügbar10.setSize(Nichtverfügbar10.getWidth(), 0);
                            Text10.setEnabled(true);
                            Text10.setOpaque(true);
                        if (verfügbar.equals("Nein")) {
                            Nichtverfügbar10.setSize(Nichtverfügbar10.getWidth(), 170);
                            Text10.setEnabled(false);
                            Text10.setOpaque(false);
                            Text10.setText("");

                        }
                    }
                    case 11 -> {
                        Text11.setText(artikelbezeichnung);
                        Image11.setIcon(new ImageIcon(iconPath));
                        Nichtverfügbar11.setSize(Nichtverfügbar11.getWidth(), 0);
                            Text11.setEnabled(true);
                            Text11.setOpaque(true);
                        if (verfügbar.equals("Nein")) {
                            Nichtverfügbar11.setSize(Nichtverfügbar11.getWidth(), 170);
                            Text11.setEnabled(false);
                            Text11.setOpaque(false);
                            Text11.setText("");

                        }
                    }
                    case 12 -> {
                        Text12.setText(artikelbezeichnung);
                        Image12.setIcon(new ImageIcon(iconPath));
                        Nichtverfügbar12.setSize(Nichtverfügbar12.getWidth(), 0);
                            Text12.setEnabled(true);
                            Text12.setOpaque(true);
                        if (verfügbar.equals("Nein")) {
                            Nichtverfügbar12.setSize(Nichtverfügbar12.getWidth(), 170);
                            Text12.setEnabled(false);
                            Text12.setOpaque(false);
                            Text12.setText("");

                        }
                    }
                    case 13 -> {
                        Text13.setText(artikelbezeichnung);
                        Image13.setIcon(new ImageIcon(iconPath));
                        Nichtverfügbar13.setSize(Nichtverfügbar13.getWidth(), 0);
                            Text13.setEnabled(true);
                            Text13.setOpaque(true);
                        if (verfügbar.equals("Nein")) {
                            Nichtverfügbar13.setSize(Nichtverfügbar13.getWidth(), 170);
                            Text13.setEnabled(false);
                            Text13.setOpaque(false);
                            Text13.setText("");

                        }
                    }
                    case 14 -> {
                        Text14.setText(artikelbezeichnung);
                        Image14.setIcon(new ImageIcon(iconPath));
                        Nichtverfügbar14.setSize(Nichtverfügbar14.getWidth(), 0);
                            Text14.setEnabled(true);
                            Text14.setOpaque(true);
                        if (verfügbar.equals("Nein")) {
                            Nichtverfügbar14.setSize(Nichtverfügbar14.getWidth(), 170);
                            Text14.setEnabled(false);
                            Text14.setOpaque(false);
                            Text14.setText("");

                        }
                    }
                    case 15 -> {
                        Text15.setText(artikelbezeichnung);
                        Image15.setIcon(new ImageIcon(iconPath));
                        Nichtverfügbar15.setSize(Nichtverfügbar15.getWidth(), 0);
                            Text15.setEnabled(true);
                            Text15.setOpaque(true);
                        if (verfügbar.equals("Nein")) {
                            Nichtverfügbar15.setSize(Nichtverfügbar15.getWidth(), 170);
                            Text15.setEnabled(false);
                            Text15.setOpaque(false);
                            Text15.setText("");

                        }
                    }  
                           
                }
            } catch (SQLException ex) {
    
                System.err.println("Database error: " + ex.getMessage());
                Text01.setText("Error accessing database.");
            }
        } catch (SQLException ex) {
            
            System.err.println("Database error: " + ex.getMessage());
            Text01.setText("Error accessing database.");
        }
    } catch (SQLException e) {
        System.out.println("Error retrieving Reihe: " + e.getMessage());
        Text01.setText("Error accessing database.");
    }       
}

Supplementtester01 = false;
Supplementtester02 = false;
Supplementtester03 = false;
Supplementtester04 = false;

 Supplement01Nok.setEnabled(false);
 
        Supplement01Ok.setEnabled(true);
        Supplement01Extra.setEnabled(false);
        Supplement01.setEnabled(true);
        Supplement01.setFont(Supplement01.getFont().deriveFont(Font.PLAIN));
        Supplement01Preis.setFont(Supplement01Preis.getFont().deriveFont(Font.PLAIN));
        Supplement01Preis.setEnabled(false);
        Supplement01Plus.setEnabled(false);

         Supplement02Nok.setEnabled(false);
 
        Supplement02Ok.setEnabled(true);
        Supplement02Extra.setEnabled(false);
        Supplement02.setEnabled(true);
        Supplement02.setFont(Supplement02.getFont().deriveFont(Font.PLAIN));
        Supplement02Preis.setFont(Supplement02Preis.getFont().deriveFont(Font.PLAIN));
        Supplement02Preis.setEnabled(false);
        Supplement02Plus.setEnabled(false);
        
                Supplement03Nok.setEnabled(false);
 
        Supplement03Ok.setEnabled(true);
        Supplement03Extra.setEnabled(false);
        Supplement03.setEnabled(true);
        Supplement03.setFont(Supplement03.getFont().deriveFont(Font.PLAIN));
        Supplement03Preis.setFont(Supplement03Preis.getFont().deriveFont(Font.PLAIN));
        Supplement03Preis.setEnabled(false);
        Supplement03Plus.setEnabled(false);
        
             Supplement04Nok.setEnabled(false);
 
        Supplement04Ok.setEnabled(true);
        Supplement04Extra.setEnabled(false);
        Supplement04.setEnabled(true);
        Supplement04.setFont(Supplement04.getFont().deriveFont(Font.PLAIN));
        Supplement04Preis.setFont(Supplement04Preis.getFont().deriveFont(Font.PLAIN));
        Supplement04Preis.setEnabled(false);
        Supplement04Plus.setEnabled(false);
    
    }


       private void commonCode2() {
   Supplement01Nok.setVisible(true);
        Supplement01Ok.setVisible(true);
        Supplement01Extra.setVisible(true);
        Supplement01.setVisible(true);
        Supplement01Preis.setVisible(true);
          Supplement01Plus.setVisible(true);
        
         Supplement02Nok.setVisible(true);
        Supplement02Ok.setVisible(true);
        Supplement02Extra.setVisible(true);
        Supplement02.setVisible(true);
        Supplement02Preis.setVisible(true);
            Supplement02Plus.setVisible(true);
        
         Supplement03Nok.setVisible(true);
        Supplement03Ok.setVisible(true);
        Supplement03Extra.setVisible(true);
        Supplement03.setVisible(true);
        Supplement03Preis.setVisible(true);
            Supplement03Plus.setVisible(true);
        
         Supplement04Nok.setVisible(true);
        Supplement04Ok.setVisible(true);
        Supplement04Extra.setVisible(true);
        Supplement04.setVisible(true);
        Supplement04Preis.setVisible(true);
            Supplement04Plus.setVisible(true);
           
           
           
    try (Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
    String sql = "SELECT artikelbezeichnung, artikelbeschreibung, artikelzutaten, icon, dauer, preis, artikelnummer, kalorien, kohlenhydrate, proteine, fette, vegetarisch, vegan, bio FROM artikelliste WHERE artikelbezeichnung = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, Artikelwert);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            String artikelbezeichnung = rs.getString("artikelbezeichnung");
            String artikelbeschreibung = rs.getString("artikelbeschreibung");
            String artikelzutaten = rs.getString("artikelzutaten");
            String iconPath = rs.getString("icon");
            int dauer = rs.getInt("Dauer");
            float preis = rs.getFloat("preis");
            String artikelnummer = rs.getString("artikelnummer");
            String kalorien = rs.getString("kalorien");
            String kohlenhydrate = rs.getString("kohlenhydrate");
            String proteine = rs.getString("proteine");
            String fette = rs.getString("fette");
            String vegetarisch = rs.getString("vegetarisch");
            String vegan = rs.getString("vegan");
            String bio = rs.getString("bio");
            
             if ("Ja".equals(bio)) {
                        Biofeld3.setSize(60, 80);
                    } else {
                        Biofeld3.setSize(60, 0);
                    }

                    if ("Ja".equals(vegetarisch)) {
                        VegiFeld3.setSize(60, 70);
                    } else {
                        VegiFeld3.setSize(60, 0);
                    }

                    if ("Ja".equals(vegan)) {
                        Veganfeld3.setSize(70, 90);
                    } else {
                        Veganfeld3.setSize(70, 0);
                    }

            Artikelbezeichnung.setText(artikelbezeichnung);
            Beschreibung.setText(artikelbeschreibung);
            Zutaten.setText(artikelzutaten);
            Bildanzeige.setIcon(new ImageIcon(iconPath));
            Preis.setText(String.format("%.2f", preis));
            Artikelnummer.setText(artikelnummer);
            
            if (dauer == 0) {
                        Sofortfeld.setSize(200, 40);
                        Minuten.setSize(100, 0);
                        Dauer.setSize(80, 0);

                    } else {
                        Sofortfeld.setSize(200, 0);
                        Minuten.setSize(100, 40);
                        Dauer.setSize(80, 40);
                        Dauer.setText(String.valueOf(dauer));

                    }
            

            DefaultTableModel model = (DefaultTableModel) Kalorienanzeige.getModel();
            model.setRowCount(0); 
            model.addRow(new Object[]{"Kalorien", kalorien + " kcal"});
            model.addRow(new Object[]{"Kohlenhydrate", kohlenhydrate + " g"});
            model.addRow(new Object[]{"Proteine", proteine + " g"});
            model.addRow(new Object[]{"Fette", fette + " g"});
        } else {
      
        }
    } catch (SQLException ex) {
        
    }
} catch (SQLException e) {
    System.out.println("Error connecting to database: " + e.getMessage());
}
    


String artikelnummer = Artikelnummer.getText();
try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {

    String sql = "SELECT s1.Supplementbezeichnung AS Supplement01, s1.Preis AS Supplement01Preis, s1.Verfügbar AS Supplement01Verfügbar, "
            + "s2.Supplementbezeichnung AS Supplement02, s2.Preis AS Supplement02Preis, s2.Verfügbar AS Supplement02Verfügbar, "
            + "s3.Supplementbezeichnung AS Supplement03, s3.Preis AS Supplement03Preis, s3.Verfügbar AS Supplement03Verfügbar, "
            + "s4.Supplementbezeichnung AS Supplement04, s4.Preis AS Supplement04Preis, s4.Verfügbar AS Supplement04Verfügbar "
            + "FROM artikelverknüpfungen a "
            + "LEFT JOIN supplements s1 ON a.Supplement01 = s1.SupplementID "
            + "LEFT JOIN supplements s2 ON a.Supplement02 = s2.SupplementID "
            + "LEFT JOIN supplements s3 ON a.Supplement03 = s3.SupplementID "
            + "LEFT JOIN supplements s4 ON a.Supplement04 = s4.SupplementID "
            + "WHERE a.Artikelnummer = ?";

    PreparedStatement stmt = con.prepareStatement(sql);
    stmt.setString(1, artikelnummer);

    ResultSet rs = stmt.executeQuery();

    if (rs.next()) {
        String supplement01 = rs.getString("Supplement01");
        String supplement02 = rs.getString("Supplement02");
        String supplement03 = rs.getString("Supplement03");
        String supplement04 = rs.getString("Supplement04");
        String supplement01Preis = rs.getString("Supplement01Preis");
        String supplement02Preis = rs.getString("Supplement02Preis");
        String supplement03Preis = rs.getString("Supplement03Preis");
        String supplement04Preis = rs.getString("Supplement04Preis");
        String supplement01Verfügbar = rs.getString("Supplement01Verfügbar");
        String supplement02Verfügbar = rs.getString("Supplement02Verfügbar");
        String supplement03Verfügbar = rs.getString("Supplement03Verfügbar");
        String supplement04Verfügbar = rs.getString("Supplement04Verfügbar");

        Supplement01.setText(supplement01);
        Supplement02.setText(supplement02);
        Supplement03.setText(supplement03);
        Supplement04.setText(supplement04);
        Supplement01Preis.setText(supplement01Preis);
        Supplement02Preis.setText(supplement02Preis);
        Supplement03Preis.setText(supplement03Preis);
        Supplement04Preis.setText(supplement04Preis);
        
       
        
        if ("Nein".equals(supplement01Verfügbar)) {
     Supplement01Nok.setVisible(false);
        Supplement01Ok.setVisible(false);
        Supplement01Extra.setVisible(false);
        Supplement01.setVisible(false);
        Supplement01Preis.setVisible(false);
           Supplement01Plus.setVisible(false);
 }
        
          if ("Nein".equals(supplement02Verfügbar)) {
     Supplement02Nok.setVisible(false);
        Supplement02Ok.setVisible(false);
        Supplement02Extra.setVisible(false);
        Supplement02.setVisible(false);
        Supplement02Preis.setVisible(false);
           Supplement02Plus.setVisible(false);
 }
          
            if ("Nein".equals(supplement03Verfügbar)) {
     Supplement03Nok.setVisible(false);
        Supplement03Ok.setVisible(false);
        Supplement03Extra.setVisible(false);
        Supplement03.setVisible(false);
        Supplement03Preis.setVisible(false);
           Supplement03Plus.setVisible(false);
 }
            
              if ("Nein".equals(supplement04Verfügbar)) {
     Supplement04Nok.setVisible(false);
        Supplement04Ok.setVisible(false);
        Supplement04Extra.setVisible(false);
        Supplement04.setVisible(false);
        Supplement04Preis.setVisible(false);
           Supplement04Plus.setVisible(false);
 }
        
        
        
    } else {
        
        Supplement01.setText("Not Found");
        Supplement02.setText("Not Found");
        Supplement03.setText("Not Found");
        Supplement04.setText("Not Found");
        Supplement01Preis.setText("Not Found");
        Supplement02Preis.setText("Not Found");
        Supplement03Preis.setText("Not Found");
        Supplement04Preis.setText("Not Found");
        
        
        Supplement01Nok.setVisible(false);
        Supplement01Ok.setVisible(false);
        Supplement01Extra.setVisible(false);
        Supplement01.setVisible(false);
        Supplement01Preis.setVisible(false);
         Supplement01Plus.setVisible(false);
        
         Supplement02Nok.setVisible(false);
        Supplement02Ok.setVisible(false);
        Supplement02Extra.setVisible(false);
        Supplement02.setVisible(false);
        Supplement02Preis.setVisible(false);
         Supplement02Plus.setVisible(false);
        
         Supplement03Nok.setVisible(false);
        Supplement03Ok.setVisible(false);
        Supplement03Extra.setVisible(false);
        Supplement03.setVisible(false);
        Supplement03Preis.setVisible(false);
         Supplement03Plus.setVisible(false);
        
         Supplement04Nok.setVisible(false);
        Supplement04Ok.setVisible(false);
        Supplement04Extra.setVisible(false);
        Supplement04.setVisible(false);
        Supplement04Preis.setVisible(false);
         Supplement04Plus.setVisible(false);
        
    }

} catch (SQLException ex) {
    ex.printStackTrace();
}






    
       }
    


DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
     
        if (row == 1 && column == 0) {
            Font f = c.getFont();
            c.setFont(new Font(f.getName(), f.getStyle(), 26));
        }
        return c;
    }
};

public String generateRandomCode() {
    int codeLength = 4; // Länge des generierten Codes
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // Zeichen, aus denen der Code generiert wird
    StringBuilder code = new StringBuilder(); // StringBuilder zum Aufbau des Codes

    Random random = new Random(); // Zufallsgenerator
    for (int i = 0; i < codeLength; i++) {
        int randomIndex = random.nextInt(characters.length()); // Zufälliger Index basierend auf der Länge der Zeichen
        code.append(characters.charAt(randomIndex)); // Zeichen an der zufälligen Position zum Code hinzufügen
    }

    return code.toString(); // Code als String zurückgeben
}



public void Bezahlung() {
    Bestätigung.setVisible(true);  // Die Bestätigungskomponente wird sichtbar gemacht
    Bezahlen.setEnabled(false);    // Die Bezahlen-Komponente wird deaktiviert

    String abholcode = null;
    int bestellID = -1;

    try (Connection connection = DriverManager.getConnection(Mysqllink, username, password)) {
        abholcode = generateRandomCode();  // Ein zufälliger Abholcode wird generiert

        String sql = "INSERT INTO bestellungen (abholcode) VALUES (?)";
        PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        statement.setString(1, abholcode);
        statement.executeUpdate();

        ResultSet generatedKeys = statement.getGeneratedKeys();
        if (generatedKeys.next()) {
            bestellID = generatedKeys.getInt(1);
            System.out.println("Entry created with abholcode: " + abholcode + " and Bestell_ID: " + bestellID);
        } else {
            System.out.println("Failed to retrieve the generated Bestell_ID");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }



Abholcode.setText(abholcode);

DefaultTableModel model = (DefaultTableModel) Table.getModel();
int rowCount = model.getRowCount();

for (int i = 0; i < rowCount; i++) {
    String rowData1 = (String) model.getValueAt(i, 0);
    int startIndex = rowData1.indexOf("<b>") + 3;
    int endIndex = rowData1.indexOf("</b>");

    if (startIndex != -1 && endIndex != -1) {
        String artikelnummerStr = rowData1.substring(startIndex, endIndex).trim();
        if (!artikelnummerStr.isEmpty()) {
            int artikelnummer;
            try {
                artikelnummer = Integer.parseInt(artikelnummerStr);
            } catch (NumberFormatException e) {
                System.err.println("Invalid artikelnummer: " + artikelnummerStr);
                continue;
            }
            Object rowData2Obj = model.getValueAt(i + 1, 2);
            String rowData2 = rowData2Obj.toString(); 
            double price;
            try {
                price = Double.parseDouble(rowData2);
            } catch (NumberFormatException e) {
                System.err.println("Invalid price: " + rowData2);
                continue;
            }

            try (Connection connection = DriverManager.getConnection(Mysqllink, username, password)) {
                String sql = "INSERT INTO bestellungen_detail (Bestell_ID, Artikelnummer, Preis) VALUES (?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, bestellID);
                statement.setInt(2, artikelnummer);
                statement.setDouble(3, price);
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
                
            }
        }
    }
}


}

public void test() {

    String kategoriebezeichnung1_4 = Kategorie1_2.getText();
Titel.setText(kategoriebezeichnung1_4);

try (Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
    String sql = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, kategoriebezeichnung1_4);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            int kategorieID = rs.getInt("Kategorie_ID"); 
            reihe = String.valueOf(kategorieID); 
        }
    } catch (SQLException ex) {
        System.out.println("Error retrieving Kategoriebezeichnung: " + ex.getMessage());
        commonCode();
    }

    Text01.setText("01");
    commonCode();

    Parent.removeAll();
    Parent.add(Liste1_2);
    Parent.repaint();
    Parent.revalidate();

} catch (SQLException e) {
    System.out.println("Error connecting to the database: " + e.getMessage());
    commonCode();
}


};


    
}