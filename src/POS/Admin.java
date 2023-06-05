
import javax.swing.SwingUtilities;
import javax.swing.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
import java.util.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Point;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Admin extends javax.swing.JFrame {

  public static class Url {
    public String Mysqllink = "jdbc:mysql://lx99.hoststar.hosting/ch354986_happyfood?";
    public String username = "ch354986_baris";
    public String password = "Happyfood_2023";
}

Url url = new Url();
String Mysqllink = url.Mysqllink;
String username = url.username;
String password = url.password;

private String reihe;
private String artikelnummer;
private String artikelbezeichnung;

double reihenwert = 0; // Der Wert für kl.Reihe
String newValue = ""; // Eine neue leere Zeichenkette

// Die Klasse "Url" enthält die Verbindungsdaten für die MySQL-Datenbank.
// Es werden separate Variablen erstellt, um die Werte von "Mysqllink", "username" und "password" zu speichern.
// Die privaten String-Variablen "reihe", "artikelnummer" und "artikelbezeichnung" könnten weitere Informationen enthalten.
// Die Variable "reihenwert" wird mit 0 initialisiert und "newValue" ist eine leere Zeichenkette.


    private void setSelectedItem(JComboBox<String> comboBox, String value) {
    for (int i = 0; i < comboBox.getItemCount(); i++) {
        String item = comboBox.getItemAt(i);
        if (item.equals(value)) {
            comboBox.setSelectedIndex(i);
            break;
        }
    }
}

// Diese Methode dient dazu, ein bestimmtes Element in einem JComboBox auszuwählen.
// Es wird eine Schleife verwendet, um jedes Element im JComboBox zu überprüfen.
// Wenn ein Element gefunden wird, das mit dem angegebenen Wert übereinstimmt, wird der entsprechende Index ausgewählt.
// Die Schleife wird dann mit "break" beendet, um nur das erste übereinstimmende Element auszuwählen.


  
    public Admin() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, screenSize.height);
        setExtendedState(Highlight.MAXIMIZED_BOTH);

        // Der Codeblock versucht, eine Verbindung zur Datenbank herzustellen und die Kategoriebezeichnungen aus der Tabelle "kategorien" abzurufen.
// Dazu wird die Klasse "com.mysql.cj.jdbc.Driver" geladen und eine Verbindung mit den angegebenen Verbindungsdaten hergestellt.
// Ein SQL-Statement wird erstellt und ausgeführt, um die Kategoriebezeichnungen abzurufen.
// Die gefundenen Kategoriebezeichnungen werden dann den entsprechenden JComboBox-Objekten hinzugefügt.
// Fehlermeldungen werden in der Konsole ausgegeben, falls ein Fehler auftritt.
      
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
                Statement st = con.createStatement();
                String sql = "SELECT Kategoriebezeichnung from kategorien";
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    KategorieCombobox.addItem(rs.getString("Kategoriebezeichnung"));
                    KategorieCombobox1_7.addItem(rs.getString("Kategoriebezeichnung"));

                    KategorieCombobox1_2.addItem(rs.getString("Kategoriebezeichnung"));
                    KategorieCombobox1_3.addItem(rs.getString("Kategoriebezeichnung"));
                    KategorieCombobox1_4.addItem(rs.getString("Kategoriebezeichnung"));
                    KategorieCombobox1_5.addItem(rs.getString("Kategoriebezeichnung"));
                    KategorieCombobox1_6.addItem(rs.getString("Kategoriebezeichnung"));
                  
                    KategorieCombobox2_1.addItem(rs.getString("Kategoriebezeichnung"));
                    KategorieCombobox2_2.addItem(rs.getString("Kategoriebezeichnung"));
                    KategorieCombobox2_3.addItem(rs.getString("Kategoriebezeichnung"));
                    KategorieCombobox2_4.addItem(rs.getString("Kategoriebezeichnung"));
                    KategorieCombobox2_5.addItem(rs.getString("Kategoriebezeichnung"));
                    KategorieCombobox2_6.addItem(rs.getString("Kategoriebezeichnung"));

                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel75 = new javax.swing.JLabel();
        Admin = new javax.swing.JPanel();
        Admin_linkeSpalte = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MenuArtikelbewirtschaftung = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MenuDashboard = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        ParentAdmin = new javax.swing.JPanel();
        Startseite = new javax.swing.JPanel();
        BewirtschaftungOben1 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        MenuDashboard2 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel286 = new javax.swing.JLabel();
        Artikelbewirtschaftung = new javax.swing.JPanel();
        BewirtschaftungOben = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Showdata = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        ParentArtikelbewirtschaftung = new javax.swing.JPanel();
        Artikeldaten = new javax.swing.JPanel();
        ArtikeldatenOben = new javax.swing.JPanel();
        Adddata = new javax.swing.JLabel();
        Adddata1 = new javax.swing.JLabel();
        Adddata2 = new javax.swing.JLabel();
        Adddata3 = new javax.swing.JLabel();
        Adddata5 = new javax.swing.JLabel();
        Adddata6 = new javax.swing.JLabel();
        ParentArtikeldaten = new javax.swing.JPanel();
        Artikelanzeigen = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Artikeltabelle1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabelle1 = new javax.swing.JTable();
        jLabel82 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        Artikeldetail = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        Artikelinspektion1 = new javax.swing.JPanel();
        btn_Anzeige2 = new javax.swing.JButton();
        Artikelnummeranzeige2 = new javax.swing.JTextField();
        Artikelbild2 = new javax.swing.JLabel();
        Artikelbezeichner2 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        Veganfeld2 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        Kalorientabelle2 = new javax.swing.JTable();
        Preisanzeiger2 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        VegiFeld2 = new javax.swing.JLabel();
        Minuten2 = new javax.swing.JLabel();
        Biofeld2 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        Daueranzeiger2 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        Zutatenanzeiger2 = new javax.swing.JTextArea();
        Kategorieanzeiger2 = new javax.swing.JLabel();
        Sofortfeld2 = new javax.swing.JLabel();
        Artikelnummeranzeiger2 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        Artikelbeschreiber2 = new javax.swing.JTextArea();
        jLabel140 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        Artikelhinzufugen = new javax.swing.JPanel();
        Panelartikel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Expander1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Minimizer1 = new javax.swing.JLabel();
        Imagezeiger = new javax.swing.JLabel();
        Artikelproteine_hinzufugen = new javax.swing.JTextField();
        Artikelfette_hinzufugen = new javax.swing.JTextField();
        Artikelpreis_hinzufugen = new javax.swing.JTextField();
        Bildpfad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Artikelkalorien_hinzufugen = new javax.swing.JTextField();
        Artikelkohlenhydrate_hinzufugen = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Artikelbeschreibung_hinzufugen = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        Artikelbezeichnung_hinzufugen = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        KategorieCombobox = new javax.swing.JComboBox<>();
        Artikelnummer_hinzufugen = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Veganbox = new javax.swing.JComboBox<>();
        Biobox = new javax.swing.JComboBox<>();
        jLabel96 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        Artikeldauer = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        Vegibox = new javax.swing.JComboBox<>();
        jLabel101 = new javax.swing.JLabel();
        Bildhochladen = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Artikelzutaten_hinzufugen = new javax.swing.JTextArea();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Panelartikelliste = new javax.swing.JPanel();
        Expander2 = new javax.swing.JLabel();
        Minimizer2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Artikellistetabelle = new javax.swing.JTable();
        jLabel93 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        Artikelinspektion = new javax.swing.JPanel();
        Expander3 = new javax.swing.JLabel();
        Minimizer3 = new javax.swing.JLabel();
        btn_Anzeige = new javax.swing.JButton();
        Artikelnummeranzeige = new javax.swing.JTextField();
        Artikelbild = new javax.swing.JLabel();
        Artikelbezeichner = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        Veganfeld = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Kalorientabelle = new javax.swing.JTable();
        Preisanzeiger = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        VegiFeld = new javax.swing.JLabel();
        Minuten = new javax.swing.JLabel();
        Biofeld = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        Daueranzeiger = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        Zutatenanzeiger = new javax.swing.JTextArea();
        Kategorieanzeiger = new javax.swing.JLabel();
        Sofortfeld = new javax.swing.JLabel();
        Artikelnummeranzeiger = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Artikelbeschreiber = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel105 = new javax.swing.JLabel();
        Artikelbearbeiten = new javax.swing.JPanel();
        bearbeitenlayout = new javax.swing.JPanel();
        Panelartikel1 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        Bildwahlenbearbeiten = new javax.swing.JButton();
        Expander4 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        Minimizer4 = new javax.swing.JLabel();
        Imagezeiger2 = new javax.swing.JLabel();
        Artikelproteine_bearbeiten = new javax.swing.JTextField();
        Artikelfette_bearbeiten = new javax.swing.JTextField();
        Artikelpreis_bearbeiten = new javax.swing.JTextField();
        Bildpfad_bearbeiten = new javax.swing.JTextField();
        jLabel193 = new javax.swing.JLabel();
        Artikelkalorien_bearbeiten = new javax.swing.JTextField();
        Artikelkohlenhydrate_bearbeiten = new javax.swing.JTextField();
        jLabel195 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        Artikelbeschreibung_bearbeiten = new javax.swing.JTextArea();
        jLabel196 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        Anzeigenbearbeiten = new javax.swing.JLabel();
        Artikelbezeichnung_bearbeiten = new javax.swing.JTextField();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        Kategoriebox_bearbeiten = new javax.swing.JComboBox<>();
        Artikelnummer_bearbeitenfeld = new javax.swing.JTextField();
        jLabel209 = new javax.swing.JLabel();
        Veganbox_bearbeiten = new javax.swing.JComboBox<>();
        Bio_bearbeiten = new javax.swing.JComboBox<>();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        Artikeldauer_bearbeiten = new javax.swing.JTextField();
        BearbeitenArtikel = new javax.swing.JLabel();
        Vegi_bearbeiten = new javax.swing.JComboBox<>();
        jLabel213 = new javax.swing.JLabel();
        Bildhochladenbearbeiten = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        Artikelzutaten_bearbeiten = new javax.swing.JTextArea();
        FeldLeerenbearbeiten = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        Artikellöschen = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        Artikelnummer_löschen = new javax.swing.JTextField();
        jLabel224 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        Anzeigen_löschen = new javax.swing.JLabel();
        Anzeiger_löschen = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        Artikelverfügbarkeiten = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel221 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        Tabelle_Verfügbarkeiten = new javax.swing.JTable();
        Artikelnummerverfügbarkeiten = new javax.swing.JTextField();
        BoxVerfügbarkeiten = new javax.swing.JComboBox<>();
        Anzeiger_Verfügbarkeiten = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        Ändern_Verfübbarkeiten = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        jLabel228 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jLabel227 = new javax.swing.JLabel();
        Supplemente = new javax.swing.JPanel();
        Supplementparent = new javax.swing.JPanel();
        MenuOptionen = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Optiontabelle = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        yyy = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        OptionPreis = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        OptionNummer = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        OptionBezeichnung = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        AnzeigeOptionhinzufugen = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        Optionnummerbearbeiten = new javax.swing.JTextField();
        Optionbezeichnungbearbeiten = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        Optionpreisbearbeiten = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        Anzeigenausgabe = new javax.swing.JLabel();
        Andernausgabe = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        AnzeigeOptionhinzufugen2 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        OptionNummerloschen = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        OptionBezeichnungloschen = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        OptionPreisloschen = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        OptionLöschen = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        suchausgabe = new javax.swing.JLabel();
        Loschenausgabe = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        SupplementDrucken = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        Zuordnen = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel147 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        TabelleSupplementverknüpfungen = new javax.swing.JTable();
        jLabel151 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        Artikelnummer_auflösen = new javax.swing.JTextField();
        Supplement4_bearbeiten = new javax.swing.JComboBox<>();
        Supplement2_bearbeiten = new javax.swing.JComboBox<>();
        Supplement2_erstellen = new javax.swing.JComboBox<>();
        Supplement4_erstellen = new javax.swing.JComboBox<>();
        jLabel194 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        Artikelanzeige_auflösen = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        Anzeige_erstellen = new javax.swing.JLabel();
        Supplement3_erstellen = new javax.swing.JComboBox<>();
        jLabel175 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        Supplement1_erstellen = new javax.swing.JComboBox<>();
        Supplement3_bearbeiten = new javax.swing.JComboBox<>();
        Supplement1_bearbeiten = new javax.swing.JComboBox<>();
        Artikelnummer_erstellen = new javax.swing.JTextField();
        fff = new javax.swing.JLabel();
        fff2 = new javax.swing.JLabel();
        fff3 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        ok = new javax.swing.JLabel();
        ok2 = new javax.swing.JLabel();
        ok3 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        Artikelanzeige_bearbeiten = new javax.swing.JLabel();
        Supplement4_auflösen = new javax.swing.JLabel();
        Artikelanzeige_erstellen = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        Supplement1_auflösen = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        Fehler_bearbeiten = new javax.swing.JLabel();
        Fehler_erstellen = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        Erstellen = new javax.swing.JLabel();
        Supplement2_auflösen = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        Artikelnummer_bearbeiten = new javax.swing.JTextField();
        jLabel155 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        Supplement3_auflösen = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        Leeren_erstellen = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        TabelleArtikelverknüpfungen = new javax.swing.JTable();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        VerfügbarkeitenSupplemente = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel236 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        Supplementeändern = new javax.swing.JLabel();
        jLabel239 = new javax.swing.JLabel();
        Supplementanzeigen = new javax.swing.JLabel();
        BoxSupplemente = new javax.swing.JComboBox<>();
        Supplementnummer = new javax.swing.JTextField();
        Supplementanzeiger = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        TabelleVerfügbarkeiten = new javax.swing.JTable();
        jLabel233 = new javax.swing.JLabel();
        jLabel235 = new javax.swing.JLabel();
        SupplementeOben = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        Kategorien = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel246 = new javax.swing.JLabel();
        UmbenennenFeld7 = new javax.swing.JTextField();
        UmbenennenFeld5 = new javax.swing.JTextField();
        jLabel243 = new javax.swing.JLabel();
        jLabel251 = new javax.swing.JLabel();
        jLabel253 = new javax.swing.JLabel();
        jLabel254 = new javax.swing.JLabel();
        UmbenennenFeld6 = new javax.swing.JTextField();
        jLabel257 = new javax.swing.JLabel();
        UmbenennenFeld4 = new javax.swing.JTextField();
        jLabel256 = new javax.swing.JLabel();
        UmbenennenFeld3 = new javax.swing.JTextField();
        FeldKategorie2_6 = new javax.swing.JLabel();
        jLabel255 = new javax.swing.JLabel();
        FeldKategorie2_4 = new javax.swing.JLabel();
        FeldKategorie2_5 = new javax.swing.JLabel();
        FeldKategorie2_3 = new javax.swing.JLabel();
        FeldKategorie1_5 = new javax.swing.JLabel();
        jLabel265 = new javax.swing.JLabel();
        FeldKategorie2_2 = new javax.swing.JLabel();
        UmbenennenFeld2 = new javax.swing.JTextField();
        jLabel263 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        UmbenennenFeld8 = new javax.swing.JTextField();
        FeldKategorie1_7 = new javax.swing.JLabel();
        jLabel266 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        FeldKategorie2_1 = new javax.swing.JLabel();
        UmbenennenFeld13 = new javax.swing.JTextField();
        Senden12 = new javax.swing.JLabel();
        jLabel264 = new javax.swing.JLabel();
        Senden11 = new javax.swing.JLabel();
        Senden10 = new javax.swing.JLabel();
        UmbenennenFeld12 = new javax.swing.JTextField();
        UmbenennenFeld11 = new javax.swing.JTextField();
        jLabel273 = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        Senden15 = new javax.swing.JLabel();
        jLabel274 = new javax.swing.JLabel();
        jLabel250 = new javax.swing.JLabel();
        Senden14 = new javax.swing.JLabel();
        jLabel247 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();
        jLabel248 = new javax.swing.JLabel();
        Senden13 = new javax.swing.JLabel();
        jLabel245 = new javax.swing.JLabel();
        UmbenennenFeld10 = new javax.swing.JTextField();
        UmbenennenFeld9 = new javax.swing.JTextField();
        FeldKategorie1_6 = new javax.swing.JLabel();
        jLabel241 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        FeldKategorie1_4 = new javax.swing.JLabel();
        FeldKategorie1_2 = new javax.swing.JLabel();
        FeldKategorie1_3 = new javax.swing.JLabel();
        jLabel238 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        Mitarbeiter = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ParentKassenlayout = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        Showdata1 = new javax.swing.JLabel();
        Showdata2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        Artikel = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        Artikeltabelle = new javax.swing.JTable();
        ArtikelFeld15 = new javax.swing.JLabel();
        ArtikelFeld10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BezeichnungFeld15 = new javax.swing.JLabel();
        BildFeld15 = new javax.swing.JLabel();
        BezeichnungFeld10 = new javax.swing.JLabel();
        ArtikelFeld05 = new javax.swing.JLabel();
        BezeichnungFeld05 = new javax.swing.JLabel();
        Kategorie2_1 = new javax.swing.JLabel();
        DefinitionKategorie1_15 = new javax.swing.JLabel();
        Kategorie2_6 = new javax.swing.JLabel();
        Kategorie2_4 = new javax.swing.JLabel();
        Kategorie1_7 = new javax.swing.JLabel();
        Kategorie1_2 = new javax.swing.JLabel();
        Kategorie1_6 = new javax.swing.JLabel();
        Kategorie2_5 = new javax.swing.JLabel();
        Kategorie1_4 = new javax.swing.JLabel();
        Kategorie1_5 = new javax.swing.JLabel();
        Kategorie1_3 = new javax.swing.JLabel();
        Kategorie2_2 = new javax.swing.JLabel();
        Kategorie2_3 = new javax.swing.JLabel();
        ArtikelFeld08 = new javax.swing.JLabel();
        BezeichnungFeld02 = new javax.swing.JLabel();
        BezeichnungFeld04 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        BildFeld05 = new javax.swing.JLabel();
        BezeichnungFeld01 = new javax.swing.JLabel();
        BildFeld10 = new javax.swing.JLabel();
        ArtikelFeld14 = new javax.swing.JLabel();
        ArtikelFeld01 = new javax.swing.JLabel();
        BezeichnungFeld07 = new javax.swing.JLabel();
        ArtikelFeld06 = new javax.swing.JLabel();
        BezeichnungFeld03 = new javax.swing.JLabel();
        ArtikelFeld04 = new javax.swing.JLabel();
        BezeichnungFeld09 = new javax.swing.JLabel();
        ArtikelFeld03 = new javax.swing.JLabel();
        BezeichnungFeld14 = new javax.swing.JLabel();
        ArtikelFeld02 = new javax.swing.JLabel();
        BezeichnungFeld11 = new javax.swing.JLabel();
        ArtikelFeld09 = new javax.swing.JLabel();
        ArtikelFeld11 = new javax.swing.JLabel();
        BezeichnungFeld13 = new javax.swing.JLabel();
        LeerenFeld11 = new javax.swing.JButton();
        ArtikelFeld12 = new javax.swing.JLabel();
        Image13 = new javax.swing.JLabel();
        BildFeld01 = new javax.swing.JLabel();
        BildFeld02 = new javax.swing.JLabel();
        BildFeld03 = new javax.swing.JLabel();
        BildFeld04 = new javax.swing.JLabel();
        BezeichnungFeld08 = new javax.swing.JLabel();
        BezeichnungFeld12 = new javax.swing.JLabel();
        ArtikelFeld07 = new javax.swing.JLabel();
        BezeichnungFeld06 = new javax.swing.JLabel();
        TextfeldFeld11 = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        BildFeld06 = new javax.swing.JLabel();
        BildFeld07 = new javax.swing.JLabel();
        BildFeld08 = new javax.swing.JLabel();
        BildFeld09 = new javax.swing.JLabel();
        ArtikelFeld13 = new javax.swing.JLabel();
        BildFeld11 = new javax.swing.JLabel();
        BildFeld12 = new javax.swing.JLabel();
        BildFeld13 = new javax.swing.JLabel();
        BildFeld14 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        AndernFeld15 = new javax.swing.JButton();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        TextfeldFeld01 = new javax.swing.JTextField();
        TextfeldFeld02 = new javax.swing.JTextField();
        TextfeldFeld03 = new javax.swing.JTextField();
        TextfeldFeld04 = new javax.swing.JTextField();
        TextfeldFeld05 = new javax.swing.JTextField();
        TextfeldFeld10 = new javax.swing.JTextField();
        TextfeldFeld09 = new javax.swing.JTextField();
        TextfeldFeld15 = new javax.swing.JTextField();
        TextfeldFeld14 = new javax.swing.JTextField();
        TextfeldFeld08 = new javax.swing.JTextField();
        TextfeldFeld13 = new javax.swing.JTextField();
        TextfeldFeld12 = new javax.swing.JTextField();
        TextfeldFeld07 = new javax.swing.JTextField();
        TextfeldFeld06 = new javax.swing.JTextField();
        LeerenFeld01 = new javax.swing.JButton();
        LeerenFeld02 = new javax.swing.JButton();
        LeerenFeld03 = new javax.swing.JButton();
        LeerenFeld04 = new javax.swing.JButton();
        LeerenFeld05 = new javax.swing.JButton();
        LeerenFeld10 = new javax.swing.JButton();
        LeerenFeld09 = new javax.swing.JButton();
        LeerenFeld15 = new javax.swing.JButton();
        LeerenFeld14 = new javax.swing.JButton();
        LeerenFeld13 = new javax.swing.JButton();
        LeerenFeld08 = new javax.swing.JButton();
        LeerenFeld07 = new javax.swing.JButton();
        LeerenFeld12 = new javax.swing.JButton();
        LeerenFeld06 = new javax.swing.JButton();
        AndernFeld01 = new javax.swing.JButton();
        AndernFeld06 = new javax.swing.JButton();
        AndernFeld11 = new javax.swing.JButton();
        AndernFeld02 = new javax.swing.JButton();
        AndernFeld07 = new javax.swing.JButton();
        AndernFeld12 = new javax.swing.JButton();
        AndernFeld03 = new javax.swing.JButton();
        AndernFeld08 = new javax.swing.JButton();
        AndernFeld13 = new javax.swing.JButton();
        AndernFeld14 = new javax.swing.JButton();
        AndernFeld09 = new javax.swing.JButton();
        AndernFeld04 = new javax.swing.JButton();
        AndernFeld05 = new javax.swing.JButton();
        AndernFeld10 = new javax.swing.JButton();
        Kategorie = new javax.swing.JPanel();
        Startkassenlayout = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        DefinitionKategorie1_2 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        DefinitionKategorie1_3 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        DefinitionKategorie1_4 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        DefinitionKategorie1_5 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        DefinitionKategorie1_6 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        DefinitionKategorie1_7 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        KategorieCombobox1_7 = new javax.swing.JComboBox<>();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        DefinitionKategorie2_1 = new javax.swing.JLabel();
        DefinitionKategorie2_2 = new javax.swing.JLabel();
        DefinitionKategorie2_3 = new javax.swing.JLabel();
        DefinitionKategorie2_4 = new javax.swing.JLabel();
        DefinitionKategorie2_5 = new javax.swing.JLabel();
        DefinitionKategorie2_6 = new javax.swing.JLabel();
        Speichern1_2 = new javax.swing.JLabel();
        Speichern1_3 = new javax.swing.JLabel();
        Speichern1_4 = new javax.swing.JLabel();
        Speichern1_5 = new javax.swing.JLabel();
        Speichern1_6 = new javax.swing.JLabel();
        Speichern1_7 = new javax.swing.JLabel();
        Speichern2_1 = new javax.swing.JLabel();
        Speichern2_2 = new javax.swing.JLabel();
        Speichern2_3 = new javax.swing.JLabel();
        Speichern2_4 = new javax.swing.JLabel();
        Speichern2_5 = new javax.swing.JLabel();
        Speichern2_6 = new javax.swing.JLabel();
        KategorieCombobox1_2 = new javax.swing.JComboBox<>();
        KategorieCombobox1_3 = new javax.swing.JComboBox<>();
        KategorieCombobox1_4 = new javax.swing.JComboBox<>();
        KategorieCombobox1_5 = new javax.swing.JComboBox<>();
        KategorieCombobox1_6 = new javax.swing.JComboBox<>();
        KategorieCombobox2_1 = new javax.swing.JComboBox<>();
        KategorieCombobox2_2 = new javax.swing.JComboBox<>();
        KategorieCombobox2_3 = new javax.swing.JComboBox<>();
        KategorieCombobox2_4 = new javax.swing.JComboBox<>();
        KategorieCombobox2_5 = new javax.swing.JComboBox<>();
        KategorieCombobox2_6 = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jLabel143 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        Bestellungen = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane23 = new javax.swing.JScrollPane();
        Bestellübersicht = new javax.swing.JTable();
        jLabel259 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        Detailtabelle = new javax.swing.JTable();
        jLabel281 = new javax.swing.JLabel();
        jLabel282 = new javax.swing.JLabel();
        Bestellunglöschen = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        jLabel280 = new javax.swing.JLabel();
        Filtern = new javax.swing.JTextField();
        BestellID = new javax.swing.JTextField();
        jLabel268 = new javax.swing.JLabel();
        jLabel269 = new javax.swing.JLabel();
        jLabel271 = new javax.swing.JLabel();
        jLabel272 = new javax.swing.JLabel();
        jLabel275 = new javax.swing.JLabel();
        jLabel276 = new javax.swing.JLabel();
        jLabel277 = new javax.swing.JLabel();
        Löschanzeige = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel267 = new javax.swing.JLabel();
        Statistiken = new javax.swing.JPanel();
        StatistikenLabel = new javax.swing.JPanel();
        Vergleichletztesjahr = new javax.swing.JLabel();
        Letztesjahr = new javax.swing.JLabel();
        Frankeheute = new javax.swing.JLabel();
        Franken7tage = new javax.swing.JLabel();
        Unterschied7tage = new javax.swing.JLabel();
        Vergleichletztesjahr1 = new javax.swing.JLabel();
        Letztesjahr7 = new javax.swing.JLabel();
        UmsatzdieseWocheLetztesJahr = new javax.swing.JLabel();
        Unterschiedtage = new javax.swing.JLabel();
        Titelheute = new javax.swing.JLabel();
        UmsatzletztesJahr = new javax.swing.JLabel();
        UmsatzdieseWoche = new javax.swing.JLabel();
        Umsatzheute = new javax.swing.JLabel();
        Titel7tage = new javax.swing.JLabel();
        HeuteLabel = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        Umsatz7tage = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        TitelStatistiken = new javax.swing.JLabel();

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/winterv960-ning-30.jpg"))); // NOI18N
        jLabel75.setText("jLabel75");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Admin.setBackground(new java.awt.Color(255, 255, 255));
        Admin.setPreferredSize(new java.awt.Dimension(1920, 1080));
        Admin.setLayout(null);

        Admin_linkeSpalte.setBackground(new java.awt.Color(21, 152, 149));
        Admin_linkeSpalte.setForeground(new java.awt.Color(255, 0, 0));
        Admin_linkeSpalte.setLayout(null);

        jLabel34.setBackground(new java.awt.Color(102, 102, 102, 80));
        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Kassenmodus");
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        Admin_linkeSpalte.add(jLabel34);
        jLabel34.setBounds(60, 920, 264, 53);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/2poslogo.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Admin_linkeSpalte.add(jLabel2);
        jLabel2.setBounds(60, 40, 270, 60);

        MenuArtikelbewirtschaftung.setBackground(new java.awt.Color(102, 102, 102, 80));
        MenuArtikelbewirtschaftung.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        MenuArtikelbewirtschaftung.setForeground(new java.awt.Color(255, 255, 255));
        MenuArtikelbewirtschaftung.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuArtikelbewirtschaftung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1NicePng_product-icon-png_3048513.png"))); // NOI18N
        MenuArtikelbewirtschaftung.setText("  Artikelbewirtschaftung");
        MenuArtikelbewirtschaftung.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuArtikelbewirtschaftung.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MenuArtikelbewirtschaftungMouseMoved(evt);
            }
        });
        MenuArtikelbewirtschaftung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuArtikelbewirtschaftungMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuArtikelbewirtschaftungMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuArtikelbewirtschaftungMouseExited(evt);
            }
        });
        Admin_linkeSpalte.add(MenuArtikelbewirtschaftung);
        MenuArtikelbewirtschaftung.setBounds(60, 380, 310, 51);

        jLabel107.setBackground(new java.awt.Color(102, 102, 102, 80));
        jLabel107.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/55.png"))); // NOI18N
        jLabel107.setText("  Bestellungen");
        jLabel107.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel107MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel107MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel107MouseExited(evt);
            }
        });
        Admin_linkeSpalte.add(jLabel107);
        jLabel107.setBounds(50, 480, 310, 53);

        jLabel36.setBackground(new java.awt.Color(102, 102, 102, 80));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1chart+diagram+graph+graph+line+graphs+statistics+icon-1320086012050639555.png"))); // NOI18N
        jLabel36.setText("   Statistiken");
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel36MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel36MouseExited(evt);
            }
        });
        Admin_linkeSpalte.add(jLabel36);
        jLabel36.setBounds(60, 700, 310, 50);

        jLabel37.setBackground(new java.awt.Color(102, 102, 102, 80));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/169-512_98856.png"))); // NOI18N
        jLabel37.setText("  Kassenlayout");
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel37MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel37MouseExited(evt);
            }
        });
        Admin_linkeSpalte.add(jLabel37);
        jLabel37.setBounds(60, 590, 310, 53);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102, 80));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Beenden");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        Admin_linkeSpalte.add(jLabel1);
        jLabel1.setBounds(60, 1000, 264, 51);

        MenuDashboard.setBackground(new java.awt.Color(102, 102, 102, 80));
        MenuDashboard.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        MenuDashboard.setForeground(new java.awt.Color(255, 255, 255));
        MenuDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1Paomedia-Small-N-Flat-House.512.png"))); // NOI18N
        MenuDashboard.setText("  Dashboard");
        MenuDashboard.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuDashboardMouseExited(evt);
            }
        });
        Admin_linkeSpalte.add(MenuDashboard);
        MenuDashboard.setBounds(60, 270, 310, 53);

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/Dashboard.jpg"))); // NOI18N
        Admin_linkeSpalte.add(jLabel60);
        jLabel60.setBounds(0, 0, 380, 1080);

        Admin.add(Admin_linkeSpalte);
        Admin_linkeSpalte.setBounds(0, 0, 380, 1080);

        ParentAdmin.setBackground(new java.awt.Color(255, 255, 255));
        ParentAdmin.setLayout(new java.awt.CardLayout());

        Startseite.setBackground(new java.awt.Color(255, 255, 255));
        Startseite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0)));
        Startseite.setLayout(null);

        BewirtschaftungOben1.setBackground(new java.awt.Color(249, 251, 231));
        BewirtschaftungOben1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        BewirtschaftungOben1.setLayout(null);

        jLabel80.setBackground(new java.awt.Color(51, 51, 255));
        jLabel80.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1NicePng_product-icon-png_3048513.png"))); // NOI18N
        jLabel80.setText("  Artikelbewirtschaftung");
        jLabel80.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel80MouseClicked(evt);
            }
        });
        BewirtschaftungOben1.add(jLabel80);
        jLabel80.setBounds(-230, 280, 580, 51);

        MenuDashboard2.setBackground(new java.awt.Color(102, 102, 102, 80));
        MenuDashboard2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        MenuDashboard2.setForeground(new java.awt.Color(0, 0, 0));
        MenuDashboard2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuDashboard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1Paomedia-Small-N-Flat-House.512.png"))); // NOI18N
        MenuDashboard2.setText("  Dashboard");
        MenuDashboard2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuDashboard2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuDashboard2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuDashboard2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuDashboard2MouseExited(evt);
            }
        });
        BewirtschaftungOben1.add(MenuDashboard2);
        MenuDashboard2.setBounds(60, 20, 310, 53);

        Startseite.add(BewirtschaftungOben1);
        BewirtschaftungOben1.setBounds(0, 20, 2000, 100);

        jScrollPane22.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Herzlich Willkommen zum POS System Adminbereich!\n\n\nIn diesem Bereich können Sie Anpassungen an ihren Stammdaten durchführen.\n");
        jTextArea1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane22.setViewportView(jTextArea1);

        Startseite.add(jScrollPane22);
        jScrollPane22.setBounds(260, 250, 1070, 170);

        jLabel286.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel286.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/Screenshot (26).png"))); // NOI18N
        jLabel286.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        Startseite.add(jLabel286);
        jLabel286.setBounds(260, 460, 860, 520);

        ParentAdmin.add(Startseite, "card3");

        Artikelbewirtschaftung.setLayout(null);

        BewirtschaftungOben.setBackground(new java.awt.Color(238, 238, 238));
        BewirtschaftungOben.setAutoscrolls(true);
        BewirtschaftungOben.setLayout(null);

        jLabel65.setBackground(new java.awt.Color(51, 51, 255));
        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1NicePng_product-icon-png_3048513.png"))); // NOI18N
        jLabel65.setText("   Artikelbewirtschaftung");
        jLabel65.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel65MouseClicked(evt);
            }
        });
        BewirtschaftungOben.add(jLabel65);
        jLabel65.setBounds(40, 10, 270, 50);

        jLabel64.setBackground(new java.awt.Color(51, 51, 255));
        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1NicePng_product-icon-png_3048513.png"))); // NOI18N
        jLabel64.setText("  Artikelbewirtschaftung");
        jLabel64.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel64MouseClicked(evt);
            }
        });
        BewirtschaftungOben.add(jLabel64);
        jLabel64.setBounds(-230, 280, 580, 51);

        jPanel5.setBackground(new java.awt.Color(113, 37, 151));
        jPanel5.setLayout(null);

        Showdata.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Showdata.setForeground(new java.awt.Color(255, 255, 255));
        Showdata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1menu.png"))); // NOI18N
        Showdata.setText("Artikeldaten");
        Showdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowdataMouseClicked(evt);
            }
        });
        jPanel5.add(Showdata);
        Showdata.setBounds(180, 0, 200, 40);

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1menu.png"))); // NOI18N
        jLabel61.setText("Supplemente");
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel61MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel61);
        jLabel61.setBounds(680, 0, 170, 40);

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1menu.png"))); // NOI18N
        jLabel62.setText("Kategorien");
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel62MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel62);
        jLabel62.setBounds(1160, 0, 134, 40);

        BewirtschaftungOben.add(jPanel5);
        jPanel5.setBounds(0, 67, 1560, 50);

        Artikelbewirtschaftung.add(BewirtschaftungOben);
        BewirtschaftungOben.setBounds(0, 0, 1540, 110);

        ParentArtikelbewirtschaftung.setLayout(new java.awt.CardLayout());

        Artikeldaten.setLayout(null);

        ArtikeldatenOben.setBackground(new java.awt.Color(255, 255, 255));
        ArtikeldatenOben.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        ArtikeldatenOben.setForeground(new java.awt.Color(255, 255, 255));
        ArtikeldatenOben.setLayout(null);

        Adddata.setForeground(new java.awt.Color(102, 0, 204));
        Adddata.setText("Artikel hinzufügen");
        Adddata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdddataMouseClicked(evt);
            }
        });
        ArtikeldatenOben.add(Adddata);
        Adddata.setBounds(600, 0, 97, 40);

        Adddata1.setForeground(new java.awt.Color(102, 0, 204));
        Adddata1.setText("Artikel löschen");
        Adddata1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Adddata1MouseClicked(evt);
            }
        });
        ArtikeldatenOben.add(Adddata1);
        Adddata1.setBounds(1050, 0, 97, 40);

        Adddata2.setForeground(new java.awt.Color(102, 0, 204));
        Adddata2.setText("Artikelübersicht");
        Adddata2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Adddata2MouseClicked(evt);
            }
        });
        ArtikeldatenOben.add(Adddata2);
        Adddata2.setBounds(190, 0, 130, 40);

        Adddata3.setForeground(new java.awt.Color(102, 0, 204));
        Adddata3.setText("Artikel bearbeiten");
        Adddata3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Adddata3MouseClicked(evt);
            }
        });
        ArtikeldatenOben.add(Adddata3);
        Adddata3.setBounds(830, 0, 140, 40);

        Adddata5.setForeground(new java.awt.Color(102, 0, 204));
        Adddata5.setText("Artikelinspektion");
        Adddata5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Adddata5MouseClicked(evt);
            }
        });
        ArtikeldatenOben.add(Adddata5);
        Adddata5.setBounds(400, 0, 130, 40);

        Adddata6.setForeground(new java.awt.Color(102, 0, 204));
        Adddata6.setText("Artikelverfügbarkeiten");
        Adddata6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Adddata6MouseClicked(evt);
            }
        });
        ArtikeldatenOben.add(Adddata6);
        Adddata6.setBounds(1230, 0, 160, 40);

        Artikeldaten.add(ArtikeldatenOben);
        ArtikeldatenOben.setBounds(-10, 0, 1560, 40);

        ParentArtikeldaten.setBackground(new java.awt.Color(255, 255, 255));
        ParentArtikeldaten.setLayout(new java.awt.CardLayout());

        Artikelanzeigen.setBackground(new java.awt.Color(255, 224, 163));
        Artikelanzeigen.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Artikelübersicht");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        Artikelanzeigen.add(jLabel4);
        jLabel4.setBounds(70, 40, 270, 60);

        jLabel187.setBackground(new java.awt.Color(179, 201, 156));
        jLabel187.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel187.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/4pexels-codioful-(formerly-gradienta)-7130498.jpg"))); // NOI18N
        jLabel187.setOpaque(true);
        Artikelanzeigen.add(jLabel187);
        jLabel187.setBounds(70, 40, 270, 60);

        Artikeltabelle1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Artikeltabelle1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(Artikeltabelle1);
        Artikeltabelle1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        Artikelanzeigen.add(jScrollPane2);
        jScrollPane2.setBounds(0, 1257, 1489, 322);

        jScrollPane1.setBackground(new java.awt.Color(252, 255, 231));

        Tabelle1.setAutoCreateRowSorter(true);
        Tabelle1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Artikelnummer", "Artikelbezeichnung", "Artikelbeschreibung", "Artikelkategorie", "Kalorien", "Kohlenhydrate", "Proteine", "Fette", "AlleZutaten", "Preis", "Icon", "Dauer", "Vegetarisch", "Bio", "Vegan", "Verfügbar"
            }
        ));
        Tabelle1.setColumnSelectionAllowed(true);
        Tabelle1.setInheritsPopupMenu(true);
        Tabelle1.setRowHeight(40);
        jScrollPane1.setViewportView(Tabelle1);
        Tabelle1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        Artikelanzeigen.add(jScrollPane1);
        jScrollPane1.setBounds(70, 140, 1430, 730);

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/printer.png"))); // NOI18N
        jLabel82.setText("Liste drucken");
        jLabel82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel82MouseClicked(evt);
            }
        });
        Artikelanzeigen.add(jLabel82);
        jLabel82.setBounds(1380, 100, 120, 25);

        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/v960-ning-30.jpg"))); // NOI18N
        Artikelanzeigen.add(jLabel148);
        jLabel148.setBounds(-50, 0, 1690, 1030);

        ParentArtikeldaten.add(Artikelanzeigen, "card3");

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(null);

        Artikelinspektion1.setLayout(null);

        btn_Anzeige2.setBackground(new java.awt.Color(255, 153, 51));
        btn_Anzeige2.setText("Anzeigen");
        btn_Anzeige2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Anzeige2MouseClicked(evt);
            }
        });
        btn_Anzeige2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Anzeige2ActionPerformed(evt);
            }
        });
        Artikelinspektion1.add(btn_Anzeige2);
        btn_Anzeige2.setBounds(490, 160, 100, 30);

        Artikelnummeranzeige2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Artikelnummeranzeige2ActionPerformed(evt);
            }
        });
        Artikelinspektion1.add(Artikelnummeranzeige2);
        Artikelnummeranzeige2.setBounds(320, 160, 150, 30);

        Artikelbild2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Artikelinspektion1.add(Artikelbild2);
        Artikelbild2.setBounds(220, 350, 230, 170);

        Artikelbezeichner2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Artikelbezeichner2.setText("Artikelbezeichnung");
        Artikelinspektion1.add(Artikelbezeichner2);
        Artikelbezeichner2.setBounds(220, 260, 980, 50);

        jLabel90.setText("Artikelnummer");
        Artikelinspektion1.add(jLabel90);
        jLabel90.setBounds(220, 170, 100, 16);

        Veganfeld2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/Vegan.jpg"))); // NOI18N
        Artikelinspektion1.add(Veganfeld2);
        Veganfeld2.setBounds(810, 50, 70, 0);

        jLabel91.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel91.setText("Preis CHF:");
        Artikelinspektion1.add(jLabel91);
        jLabel91.setBounds(1210, 740, 90, 30);

        Kalorientabelle2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nährwert", "Menge"
            }
        ));
        Kalorientabelle2.setPreferredSize(new java.awt.Dimension(150, 120));
        Kalorientabelle2.setRowHeight(30);
        jScrollPane12.setViewportView(Kalorientabelle2);

        Artikelinspektion1.add(jScrollPane12);
        jScrollPane12.setBounds(960, 350, 400, 150);

        Preisanzeiger2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Preisanzeiger2.setText("Preis");
        Artikelinspektion1.add(Preisanzeiger2);
        Preisanzeiger2.setBounds(1310, 730, 70, 50);

        jLabel118.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel118.setText("Enthält:");
        Artikelinspektion1.add(jLabel118);
        jLabel118.setBounds(960, 500, 80, 30);

        jLabel120.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel120.setText("Kategorie:");
        Artikelinspektion1.add(jLabel120);
        jLabel120.setBounds(1190, 50, 80, 20);

        jLabel121.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel121.setText("Artikelnummer:");
        Artikelinspektion1.add(jLabel121);
        jLabel121.setBounds(210, 530, 120, 25);

        jLabel122.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel122.setText("Nähwerte pro 100g");
        Artikelinspektion1.add(jLabel122);
        jLabel122.setBounds(960, 320, 160, 30);

        jLabel123.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel123.setText("Artikelbeschreibung");
        Artikelinspektion1.add(jLabel123);
        jLabel123.setBounds(490, 340, 160, 30);

        jLabel124.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(255, 102, 0));
        jLabel124.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel124.setText("   Artikelinspektion durchführen");
        jLabel124.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Artikelinspektion1.add(jLabel124);
        jLabel124.setBounds(190, 70, 700, 60);

        VegiFeld2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/vegetarisch.png"))); // NOI18N
        Artikelinspektion1.add(VegiFeld2);
        VegiFeld2.setBounds(950, 60, 60, 0);

        Minuten2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Minuten2.setText("Minuten");
        Artikelinspektion1.add(Minuten2);
        Minuten2.setBounds(320, 620, 70, 30);

        Biofeld2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/Bio.png"))); // NOI18N
        Artikelinspektion1.add(Biofeld2);
        Biofeld2.setBounds(890, 50, 50, 0);

        jLabel129.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel129.setText("Durchschnittliche Wartezeit");
        Artikelinspektion1.add(jLabel129);
        jLabel129.setBounds(230, 590, 230, 30);

        Daueranzeiger2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Daueranzeiger2.setText("Zeit");
        Artikelinspektion1.add(Daueranzeiger2);
        Daueranzeiger2.setBounds(280, 620, 40, 30);

        jScrollPane13.setBorder(null);
        jScrollPane13.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Zutatenanzeiger2.setEditable(false);
        Zutatenanzeiger2.setBackground(new java.awt.Color(255, 255, 255));
        Zutatenanzeiger2.setColumns(20);
        Zutatenanzeiger2.setRows(5);
        Zutatenanzeiger2.setText("Zutatenliste\n");
        Zutatenanzeiger2.setToolTipText("");
        Zutatenanzeiger2.setBorder(null);
        Zutatenanzeiger2.setOpaque(false);
        Zutatenanzeiger2.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        Zutatenanzeiger2.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane13.setViewportView(Zutatenanzeiger2);

        Artikelinspektion1.add(jScrollPane13);
        jScrollPane13.setBounds(960, 530, 400, 190);

        Kategorieanzeiger2.setBackground(new java.awt.Color(153, 153, 153));
        Kategorieanzeiger2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Kategorieanzeiger2.setForeground(new java.awt.Color(255, 255, 255));
        Kategorieanzeiger2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorieanzeiger2.setText("Kategorie");
        Kategorieanzeiger2.setOpaque(true);
        Artikelinspektion1.add(Kategorieanzeiger2);
        Kategorieanzeiger2.setBounds(1190, 80, 180, 50);

        Sofortfeld2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Sofortfeld2.setText("Sofort Verfügbar");
        Artikelinspektion1.add(Sofortfeld2);
        Sofortfeld2.setBounds(260, 620, 160, 0);

        Artikelnummeranzeiger2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Artikelnummeranzeiger2.setText("Artikelnummer");
        Artikelinspektion1.add(Artikelnummeranzeiger2);
        Artikelnummeranzeiger2.setBounds(340, 530, 120, 22);

        jScrollPane14.setBorder(null);
        jScrollPane14.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Artikelbeschreiber2.setEditable(false);
        Artikelbeschreiber2.setBackground(new java.awt.Color(255, 255, 255));
        Artikelbeschreiber2.setColumns(20);
        Artikelbeschreiber2.setRows(5);
        Artikelbeschreiber2.setText("Artikelbeschreibung");
        Artikelbeschreiber2.setToolTipText("");
        Artikelbeschreiber2.setBorder(null);
        Artikelbeschreiber2.setOpaque(false);
        Artikelbeschreiber2.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        Artikelbeschreiber2.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane14.setViewportView(Artikelbeschreiber2);

        Artikelinspektion1.add(jScrollPane14);
        jScrollPane14.setBounds(490, 370, 440, 350);

        jLabel140.setBackground(new java.awt.Color(255, 255, 255));
        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/v960-ning-11.jpg"))); // NOI18N
        Artikelinspektion1.add(jLabel140);
        jLabel140.setBounds(0, -10, 1940, 1000);

        jScrollPane15.setViewportView(jTextPane2);

        Artikelinspektion1.add(jScrollPane15);
        jScrollPane15.setBounds(840, 190, 330, 380);

        jPanel15.add(Artikelinspektion1);
        Artikelinspektion1.setBounds(0, 0, 1930, 1000);

        javax.swing.GroupLayout ArtikeldetailLayout = new javax.swing.GroupLayout(Artikeldetail);
        Artikeldetail.setLayout(ArtikeldetailLayout);
        ArtikeldetailLayout.setHorizontalGroup(
            ArtikeldetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 1540, Short.MAX_VALUE)
        );
        ArtikeldetailLayout.setVerticalGroup(
            ArtikeldetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );

        ParentArtikeldaten.add(Artikeldetail, "card5");

        Artikelhinzufugen.setBackground(new java.awt.Color(255, 255, 255));
        Artikelhinzufugen.setLayout(null);

        Panelartikel.setBackground(new java.awt.Color(255, 255, 255));
        Panelartikel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Panelartikel.setLayout(null);

        jLabel12.setText("Fette");
        Panelartikel.add(jLabel12);
        jLabel12.setBounds(930, 130, 120, 16);

        jButton1.setText("Bild wählen");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panelartikel.add(jButton1);
        jButton1.setBounds(1190, 250, 110, 30);

        Expander1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/PPinClipart.com_choice-clipart_2020173.png"))); // NOI18N
        Expander1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Expander1MouseClicked(evt);
            }
        });
        Panelartikel.add(Expander1);
        Expander1.setBounds(1400, 0, 30, 0);

        jLabel19.setText("Preis");
        Panelartikel.add(jLabel19);
        jLabel19.setBounds(640, 190, 120, 16);

        jLabel17.setText("Proteine");
        Panelartikel.add(jLabel17);
        jLabel17.setBounds(930, 70, 120, 16);

        jLabel16.setText("Kohlenhydrate");
        Panelartikel.add(jLabel16);
        jLabel16.setBounds(640, 130, 120, 16);

        jLabel13.setText("Kalorien");
        Panelartikel.add(jLabel13);
        jLabel13.setBounds(640, 70, 120, 16);

        Minimizer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/up.png"))); // NOI18N
        Minimizer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Minimizer1MouseClicked(evt);
            }
        });
        Panelartikel.add(Minimizer1);
        Minimizer1.setBounds(1400, 0, 30, 40);

        Imagezeiger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panelartikel.add(Imagezeiger);
        Imagezeiger.setBounds(1210, 60, 210, 170);

        Artikelproteine_hinzufugen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Artikelproteine_hinzufugenActionPerformed(evt);
            }
        });
        Panelartikel.add(Artikelproteine_hinzufugen);
        Artikelproteine_hinzufugen.setBounds(1000, 60, 148, 33);
        Panelartikel.add(Artikelfette_hinzufugen);
        Artikelfette_hinzufugen.setBounds(1000, 120, 148, 33);

        Artikelpreis_hinzufugen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Panelartikel.add(Artikelpreis_hinzufugen);
        Artikelpreis_hinzufugen.setBounds(750, 180, 90, 33);

        Bildpfad.setEnabled(false);
        Bildpfad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BildpfadActionPerformed(evt);
            }
        });
        Panelartikel.add(Bildpfad);
        Bildpfad.setBounds(750, 250, 390, 33);

        jLabel11.setText("Zutatenliste");
        Panelartikel.add(jLabel11);
        jLabel11.setBounds(640, 330, 120, 16);
        Panelartikel.add(Artikelkalorien_hinzufugen);
        Artikelkalorien_hinzufugen.setBounds(750, 60, 148, 33);
        Panelartikel.add(Artikelkohlenhydrate_hinzufugen);
        Artikelkohlenhydrate_hinzufugen.setBounds(750, 120, 148, 33);
        Panelartikel.add(jLabel21);
        jLabel21.setBounds(1160, 340, 270, 30);

        Artikelbeschreibung_hinzufugen.setColumns(20);
        Artikelbeschreibung_hinzufugen.setRows(5);
        jScrollPane4.setViewportView(Artikelbeschreibung_hinzufugen);

        Panelartikel.add(jScrollPane4);
        jScrollPane4.setBounds(180, 320, 390, 290);

        jLabel15.setText("Artikelkategorie");
        Panelartikel.add(jLabel15);
        jLabel15.setBounds(20, 210, 106, 16);

        jLabel109.setText("Vegan");
        Panelartikel.add(jLabel109);
        jLabel109.setBounds(430, 250, 80, 16);
        Panelartikel.add(Artikelbezeichnung_hinzufugen);
        Artikelbezeichnung_hinzufugen.setBounds(180, 150, 148, 33);

        jLabel14.setText("Artikelbezeichnung");
        Panelartikel.add(jLabel14);
        jLabel14.setBounds(20, 160, 106, 16);

        jLabel31.setText("Vorbereitungszeit");
        Panelartikel.add(jLabel31);
        jLabel31.setBounds(880, 190, 110, 16);

        jLabel7.setText("Artikelnummer");
        Panelartikel.add(jLabel7);
        jLabel7.setBounds(20, 110, 110, 16);

        jLabel95.setText("Minuten");
        Panelartikel.add(jLabel95);
        jLabel95.setBounds(1080, 190, 60, 16);

        jLabel92.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/2gradientadd.png"))); // NOI18N
        jLabel92.setText("   Artikel hinzufügen");
        jLabel92.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Panelartikel.add(jLabel92);
        jLabel92.setBounds(10, 0, 260, 40);

        KategorieCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KategorieComboboxActionPerformed(evt);
            }
        });
        Panelartikel.add(KategorieCombobox);
        KategorieCombobox.setBounds(180, 200, 150, 33);
        Panelartikel.add(Artikelnummer_hinzufugen);
        Artikelnummer_hinzufugen.setBounds(180, 100, 148, 33);

        jLabel20.setText("Mindestgrösse 230 x 170");
        Panelartikel.add(jLabel20);
        jLabel20.setBounds(1250, 230, 170, 16);

        Veganbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nein", "Ja" }));
        Veganbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VeganboxActionPerformed(evt);
            }
        });
        Panelartikel.add(Veganbox);
        Veganbox.setBounds(430, 280, 76, 26);

        Biobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nein", "Ja" }));
        Biobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BioboxActionPerformed(evt);
            }
        });
        Panelartikel.add(Biobox);
        Biobox.setBounds(310, 280, 76, 26);

        jLabel96.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel96.setText("Hier können Sie einen neuen Artikel hinzufügen:");
        Panelartikel.add(jLabel96);
        jLabel96.setBounds(10, 60, 430, 25);

        jLabel81.setText("Artikelbeschreibung");
        Panelartikel.add(jLabel81);
        jLabel81.setBounds(20, 320, 130, 16);
        Panelartikel.add(Artikeldauer);
        Artikeldauer.setBounds(1000, 180, 70, 30);

        jLabel98.setBackground(new java.awt.Color(255, 102, 0));
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/2gradientadd.png"))); // NOI18N
        jLabel98.setText("Hinzufügen");
        jLabel98.setOpaque(true);
        jLabel98.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel98MouseClicked(evt);
            }
        });
        Panelartikel.add(jLabel98);
        jLabel98.setBounds(1260, 560, 160, 40);

        Vegibox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nein", "Ja" }));
        Vegibox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VegiboxActionPerformed(evt);
            }
        });
        Panelartikel.add(Vegibox);
        Vegibox.setBounds(180, 280, 76, 26);

        jLabel101.setText("Bio");
        Panelartikel.add(jLabel101);
        jLabel101.setBounds(310, 250, 80, 16);

        Bildhochladen.setBackground(new java.awt.Color(255, 255, 255));
        Bildhochladen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bildhochladen.setText("Bild hochladen");
        Bildhochladen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bildhochladen.setOpaque(true);
        Bildhochladen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BildhochladenMouseClicked(evt);
            }
        });
        Panelartikel.add(Bildhochladen);
        Bildhochladen.setBounds(1310, 250, 110, 30);

        jLabel106.setText("Vegetarisch");
        Panelartikel.add(jLabel106);
        jLabel106.setBounds(180, 250, 80, 16);

        jLabel18.setText("Bildpfad");
        Panelartikel.add(jLabel18);
        jLabel18.setBounds(640, 260, 120, 16);

        Artikelzutaten_hinzufugen.setColumns(20);
        Artikelzutaten_hinzufugen.setRows(5);
        jScrollPane5.setViewportView(Artikelzutaten_hinzufugen);

        Panelartikel.add(jScrollPane5);
        jScrollPane5.setBounds(750, 320, 390, 290);

        jLabel99.setBackground(new java.awt.Color(153, 153, 255));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1remove.png"))); // NOI18N
        jLabel99.setText("Felder leeren");
        jLabel99.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel99.setOpaque(true);
        jLabel99.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel99MouseClicked(evt);
            }
        });
        Panelartikel.add(jLabel99);
        jLabel99.setBounds(1260, 500, 160, 40);

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1pngwing.com (3).png"))); // NOI18N
        jLabel100.setToolTipText("Zufallsnummer erstellen.");
        jLabel100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel100MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel100MouseEntered(evt);
            }
        });
        Panelartikel.add(jLabel100);
        jLabel100.setBounds(330, 100, 30, 30);

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/v960-ning-11.jpg"))); // NOI18N
        Panelartikel.add(jLabel102);
        jLabel102.setBounds(0, 40, 1440, 590);
        JPanel panel = new JPanel();
        panel.setLayout(null); // disable layout manager

        jLabel103.setBackground(new java.awt.Color(179, 201, 156));
        jLabel103.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/08.jpg"))); // NOI18N
        jLabel103.setOpaque(true);
        Panelartikel.add(jLabel103);
        jLabel103.setBounds(0, 0, 1440, 40);

        jLabel10.setText("Artikelbeschreibung");
        Panelartikel.add(jLabel10);
        jLabel10.setBounds(20, 330, 120, 16);

        Artikelhinzufugen.add(Panelartikel);
        Panelartikel.setBounds(50, 50, 1440, 630);

        Panelartikelliste.setLayout(null);

        Expander2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1PinClipart.com_choice-clipart_2020173.png"))); // NOI18N
        Expander2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Expander2MouseClicked(evt);
            }
        });
        Panelartikelliste.add(Expander2);
        Expander2.setBounds(1400, 0, 28, 40);

        Minimizer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/up.png"))); // NOI18N
        Minimizer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Minimizer2MouseClicked(evt);
            }
        });
        Panelartikelliste.add(Minimizer2);
        Minimizer2.setBounds(1400, 0, 30, 0);

        Artikellistetabelle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Artikelnummer", "Artikelbezeichnung", "Artikelbeschreibung", "Artikelkategorie", "Kalorien", "Kohlenhydrate", "Proteine", "Fette", "Zutatenliste", "Preis", "Icon", "Vorbereitungszeit", "Vegetarisch", "Bio", "Vegan"
            }
        ));
        jScrollPane6.setViewportView(Artikellistetabelle);
        if (Artikellistetabelle.getColumnModel().getColumnCount() > 0) {
            Artikellistetabelle.getColumnModel().getColumn(14).setResizable(false);
        }

        Panelartikelliste.add(jScrollPane6);
        jScrollPane6.setBounds(40, 100, 1400, 470);

        jLabel93.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/2gradientadd.png"))); // NOI18N
        jLabel93.setText("   Artikeldatenliste anzeigen");
        jLabel93.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Panelartikelliste.add(jLabel93);
        jLabel93.setBounds(10, 0, 340, 40);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/v960-ning-11.jpg"))); // NOI18N
        Panelartikelliste.add(jLabel22);
        jLabel22.setBounds(0, 40, 1440, 590);

        jLabel104.setBackground(new java.awt.Color(179, 201, 156));
        jLabel104.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/08.jpg"))); // NOI18N
        jLabel104.setOpaque(true);
        Panelartikelliste.add(jLabel104);
        jLabel104.setBounds(0, 0, 1440, 630);

        Artikelhinzufugen.add(Panelartikelliste);
        Panelartikelliste.setBounds(50, 690, 1440, 40);

        Artikelinspektion.setLayout(null);

        Expander3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1PinClipart.com_choice-clipart_2020173.png"))); // NOI18N
        Expander3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Expander3MouseClicked(evt);
            }
        });
        Artikelinspektion.add(Expander3);
        Expander3.setBounds(1400, 0, 28, 40);

        Minimizer3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/up.png"))); // NOI18N
        Minimizer3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Minimizer3MouseClicked(evt);
            }
        });
        Artikelinspektion.add(Minimizer3);
        Minimizer3.setBounds(1400, 0, 30, 0);

        btn_Anzeige.setBackground(new java.awt.Color(255, 153, 51));
        btn_Anzeige.setText("Anzeigen");
        btn_Anzeige.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AnzeigeMouseClicked(evt);
            }
        });
        btn_Anzeige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AnzeigeActionPerformed(evt);
            }
        });
        Artikelinspektion.add(btn_Anzeige);
        btn_Anzeige.setBounds(340, 60, 100, 30);

        Artikelnummeranzeige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtikelnummeranzeigeActionPerformed(evt);
            }
        });
        Artikelinspektion.add(Artikelnummeranzeige);
        Artikelnummeranzeige.setBounds(170, 60, 150, 30);

        Artikelbild.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Artikelinspektion.add(Artikelbild);
        Artikelbild.setBounds(50, 230, 230, 170);

        Artikelbezeichner.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Artikelbezeichner.setText("Artikelbezeichnung");
        Artikelinspektion.add(Artikelbezeichner);
        Artikelbezeichner.setBounds(50, 140, 980, 50);

        jLabel26.setText("Artikelnummer");
        Artikelinspektion.add(jLabel26);
        jLabel26.setBounds(60, 70, 100, 16);

        Veganfeld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/Vegan.jpg"))); // NOI18N
        Artikelinspektion.add(Veganfeld);
        Veganfeld.setBounds(810, 50, 70, 0);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("Preis CHF:");
        Artikelinspektion.add(jLabel28);
        jLabel28.setBounds(1050, 590, 90, 30);

        Kalorientabelle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nährwert", "Menge"
            }
        ));
        Kalorientabelle.setPreferredSize(new java.awt.Dimension(150, 120));
        Kalorientabelle.setRowHeight(30);
        jScrollPane8.setViewportView(Kalorientabelle);

        Artikelinspektion.add(jScrollPane8);
        jScrollPane8.setBounds(810, 210, 400, 150);

        Preisanzeiger.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Preisanzeiger.setText("Preis");
        Artikelinspektion.add(Preisanzeiger);
        Preisanzeiger.setBounds(1140, 580, 70, 50);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setText("Zutaten:");
        Artikelinspektion.add(jLabel30);
        jLabel30.setBounds(810, 360, 80, 30);

        jLabel108.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel108.setText("Kategorie:");
        Artikelinspektion.add(jLabel108);
        jLabel108.setBounds(1030, 50, 80, 20);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel27.setText("Artikelnummer:");
        Artikelinspektion.add(jLabel27);
        jLabel27.setBounds(50, 410, 120, 25);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Nähwerte pro 100g");
        Artikelinspektion.add(jLabel24);
        jLabel24.setBounds(810, 180, 160, 30);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setText("Artikelbeschreibung");
        Artikelinspektion.add(jLabel29);
        jLabel29.setBounds(300, 200, 160, 30);

        jLabel94.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/2gradientadd.png"))); // NOI18N
        jLabel94.setText("   Artikelinspektion durchführen");
        jLabel94.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Artikelinspektion.add(jLabel94);
        jLabel94.setBounds(10, 0, 340, 30);

        VegiFeld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/vegetarisch.png"))); // NOI18N
        Artikelinspektion.add(VegiFeld);
        VegiFeld.setBounds(950, 60, 60, 0);

        Minuten.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Minuten.setText("Minuten");
        Artikelinspektion.add(Minuten);
        Minuten.setBounds(150, 490, 70, 30);

        Biofeld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/Bio.png"))); // NOI18N
        Artikelinspektion.add(Biofeld);
        Biofeld.setBounds(890, 50, 50, 0);

        jLabel97.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel97.setText("Durchschnittliche Wartezeit");
        Artikelinspektion.add(jLabel97);
        jLabel97.setBounds(50, 460, 230, 30);

        Daueranzeiger.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Daueranzeiger.setText("Zeit");
        Artikelinspektion.add(Daueranzeiger);
        Daueranzeiger.setBounds(110, 490, 40, 30);

        jScrollPane10.setBorder(null);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Zutatenanzeiger.setEditable(false);
        Zutatenanzeiger.setBackground(new java.awt.Color(255, 255, 255));
        Zutatenanzeiger.setColumns(20);
        Zutatenanzeiger.setRows(5);
        Zutatenanzeiger.setText("Zutatenliste\n");
        Zutatenanzeiger.setToolTipText("");
        Zutatenanzeiger.setBorder(null);
        Zutatenanzeiger.setOpaque(false);
        Zutatenanzeiger.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        Zutatenanzeiger.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane10.setViewportView(Zutatenanzeiger);

        Artikelinspektion.add(jScrollPane10);
        jScrollPane10.setBounds(810, 390, 400, 190);

        Kategorieanzeiger.setBackground(new java.awt.Color(153, 153, 153));
        Kategorieanzeiger.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Kategorieanzeiger.setForeground(new java.awt.Color(255, 255, 255));
        Kategorieanzeiger.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorieanzeiger.setText("Kategorie");
        Kategorieanzeiger.setOpaque(true);
        Artikelinspektion.add(Kategorieanzeiger);
        Kategorieanzeiger.setBounds(1030, 80, 180, 50);

        Sofortfeld.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Sofortfeld.setText("Sofort Verfügbar");
        Artikelinspektion.add(Sofortfeld);
        Sofortfeld.setBounds(80, 490, 160, 0);

        Artikelnummeranzeiger.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Artikelnummeranzeiger.setText("Artikelnummer");
        Artikelinspektion.add(Artikelnummeranzeiger);
        Artikelnummeranzeiger.setBounds(160, 410, 120, 22);

        jScrollPane7.setBorder(null);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Artikelbeschreiber.setEditable(false);
        Artikelbeschreiber.setBackground(new java.awt.Color(255, 255, 255));
        Artikelbeschreiber.setColumns(20);
        Artikelbeschreiber.setRows(5);
        Artikelbeschreiber.setText("Artikelbeschreibung");
        Artikelbeschreiber.setToolTipText("");
        Artikelbeschreiber.setBorder(null);
        Artikelbeschreiber.setOpaque(false);
        Artikelbeschreiber.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        Artikelbeschreiber.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane7.setViewportView(Artikelbeschreiber);

        Artikelinspektion.add(jScrollPane7);
        jScrollPane7.setBounds(300, 230, 440, 350);

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/v960-ning-11.jpg"))); // NOI18N
        Artikelinspektion.add(jLabel25);
        jLabel25.setBounds(0, 40, 1440, 590);

        jScrollPane9.setViewportView(jTextPane1);

        Artikelinspektion.add(jScrollPane9);
        jScrollPane9.setBounds(840, 190, 330, 380);

        jLabel105.setBackground(new java.awt.Color(179, 201, 156));
        jLabel105.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/08.jpg"))); // NOI18N
        jLabel105.setOpaque(true);
        Artikelinspektion.add(jLabel105);
        jLabel105.setBounds(0, 0, 1440, 630);

        Artikelhinzufugen.add(Artikelinspektion);
        Artikelinspektion.setBounds(50, 740, 1440, 40);

        ParentArtikeldaten.add(Artikelhinzufugen, "card3");

        bearbeitenlayout.setBackground(new java.awt.Color(255, 255, 255));
        bearbeitenlayout.setLayout(null);

        Panelartikel1.setBackground(new java.awt.Color(255, 255, 255));
        Panelartikel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Panelartikel1.setLayout(null);

        jLabel84.setText("Fette");
        Panelartikel1.add(jLabel84);
        jLabel84.setBounds(930, 130, 120, 16);

        Bildwahlenbearbeiten.setText("Bild wählen");
        Bildwahlenbearbeiten.setEnabled(false);
        Bildwahlenbearbeiten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BildwahlenbearbeitenMouseClicked(evt);
            }
        });
        Bildwahlenbearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BildwahlenbearbeitenActionPerformed(evt);
            }
        });
        Panelartikel1.add(Bildwahlenbearbeiten);
        Bildwahlenbearbeiten.setBounds(1190, 250, 110, 30);

        Expander4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/PPinClipart.com_choice-clipart_2020173.png"))); // NOI18N
        Expander4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Expander4MouseClicked(evt);
            }
        });
        Panelartikel1.add(Expander4);
        Expander4.setBounds(1400, 0, 30, 0);

        jLabel88.setText("Preis");
        Panelartikel1.add(jLabel88);
        jLabel88.setBounds(640, 190, 120, 16);

        jLabel166.setText("Proteine");
        Panelartikel1.add(jLabel166);
        jLabel166.setBounds(930, 70, 120, 16);

        jLabel178.setText("Kohlenhydrate");
        Panelartikel1.add(jLabel178);
        jLabel178.setBounds(640, 130, 120, 16);

        jLabel192.setText("Kalorien");
        Panelartikel1.add(jLabel192);
        jLabel192.setBounds(640, 70, 120, 16);

        Minimizer4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/up.png"))); // NOI18N
        Minimizer4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Minimizer4MouseClicked(evt);
            }
        });
        Panelartikel1.add(Minimizer4);
        Minimizer4.setBounds(1400, 0, 30, 40);

        Imagezeiger2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panelartikel1.add(Imagezeiger2);
        Imagezeiger2.setBounds(1210, 60, 210, 170);

        Artikelproteine_bearbeiten.setEnabled(false);
        Artikelproteine_bearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Artikelproteine_bearbeitenActionPerformed(evt);
            }
        });
        Panelartikel1.add(Artikelproteine_bearbeiten);
        Artikelproteine_bearbeiten.setBounds(1000, 60, 148, 33);

        Artikelfette_bearbeiten.setEnabled(false);
        Panelartikel1.add(Artikelfette_bearbeiten);
        Artikelfette_bearbeiten.setBounds(1000, 120, 148, 33);

        Artikelpreis_bearbeiten.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Artikelpreis_bearbeiten.setEnabled(false);
        Panelartikel1.add(Artikelpreis_bearbeiten);
        Artikelpreis_bearbeiten.setBounds(750, 180, 90, 33);

        Bildpfad_bearbeiten.setEnabled(false);
        Bildpfad_bearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bildpfad_bearbeitenActionPerformed(evt);
            }
        });
        Panelartikel1.add(Bildpfad_bearbeiten);
        Bildpfad_bearbeiten.setBounds(750, 250, 390, 33);

        jLabel193.setText("Zutatenliste");
        Panelartikel1.add(jLabel193);
        jLabel193.setBounds(640, 330, 120, 16);

        Artikelkalorien_bearbeiten.setEnabled(false);
        Panelartikel1.add(Artikelkalorien_bearbeiten);
        Artikelkalorien_bearbeiten.setBounds(750, 60, 148, 33);

        Artikelkohlenhydrate_bearbeiten.setEnabled(false);
        Panelartikel1.add(Artikelkohlenhydrate_bearbeiten);
        Artikelkohlenhydrate_bearbeiten.setBounds(750, 120, 148, 33);
        Panelartikel1.add(jLabel195);
        jLabel195.setBounds(1160, 340, 270, 30);

        Artikelbeschreibung_bearbeiten.setColumns(20);
        Artikelbeschreibung_bearbeiten.setRows(5);
        Artikelbeschreibung_bearbeiten.setEnabled(false);
        jScrollPane18.setViewportView(Artikelbeschreibung_bearbeiten);

        Panelartikel1.add(jScrollPane18);
        jScrollPane18.setBounds(180, 320, 390, 290);

        jLabel196.setText("Artikelkategorie");
        Panelartikel1.add(jLabel196);
        jLabel196.setBounds(20, 210, 106, 16);

        jLabel200.setText("Vegan");
        Panelartikel1.add(jLabel200);
        jLabel200.setBounds(430, 250, 80, 16);

        Anzeigenbearbeiten.setBackground(new java.awt.Color(204, 204, 204));
        Anzeigenbearbeiten.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Anzeigenbearbeiten.setText("Anzeigen");
        Anzeigenbearbeiten.setOpaque(true);
        Anzeigenbearbeiten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnzeigenbearbeitenMouseClicked(evt);
            }
        });
        Panelartikel1.add(Anzeigenbearbeiten);
        Anzeigenbearbeiten.setBounds(340, 100, 100, 33);

        Artikelbezeichnung_bearbeiten.setEnabled(false);
        Panelartikel1.add(Artikelbezeichnung_bearbeiten);
        Artikelbezeichnung_bearbeiten.setBounds(180, 150, 148, 33);

        jLabel201.setText("Artikelbezeichnung");
        Panelartikel1.add(jLabel201);
        jLabel201.setBounds(20, 160, 106, 16);

        jLabel202.setText("Vorbereitungszeit");
        Panelartikel1.add(jLabel202);
        jLabel202.setBounds(880, 190, 110, 16);

        jLabel203.setText("Artikelnummer");
        Panelartikel1.add(jLabel203);
        jLabel203.setBounds(20, 110, 110, 16);

        jLabel207.setText("Minuten");
        Panelartikel1.add(jLabel207);
        jLabel207.setBounds(1080, 190, 60, 16);

        jLabel208.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel208.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel208.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/2gradientadd.png"))); // NOI18N
        jLabel208.setText("   Artikel bearbeiten");
        jLabel208.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Panelartikel1.add(jLabel208);
        jLabel208.setBounds(10, 0, 260, 40);

        Kategoriebox_bearbeiten.setEnabled(false);
        Kategoriebox_bearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kategoriebox_bearbeitenActionPerformed(evt);
            }
        });
        Panelartikel1.add(Kategoriebox_bearbeiten);
        Kategoriebox_bearbeiten.setBounds(180, 200, 150, 33);
        Panelartikel1.add(Artikelnummer_bearbeitenfeld);
        Artikelnummer_bearbeitenfeld.setBounds(180, 100, 148, 33);

        jLabel209.setText("Mindestgrösse 230 x 170");
        Panelartikel1.add(jLabel209);
        jLabel209.setBounds(1250, 230, 170, 16);

        Veganbox_bearbeiten.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nein", "Ja" }));
        Veganbox_bearbeiten.setEnabled(false);
        Veganbox_bearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Veganbox_bearbeitenActionPerformed(evt);
            }
        });
        Panelartikel1.add(Veganbox_bearbeiten);
        Veganbox_bearbeiten.setBounds(430, 280, 76, 26);

        Bio_bearbeiten.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nein", "Ja" }));
        Bio_bearbeiten.setEnabled(false);
        Bio_bearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bio_bearbeitenActionPerformed(evt);
            }
        });
        Panelartikel1.add(Bio_bearbeiten);
        Bio_bearbeiten.setBounds(310, 280, 76, 26);

        jLabel210.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel210.setText("Hier können Sie einen neuen Artikel bearbeiten:");
        Panelartikel1.add(jLabel210);
        jLabel210.setBounds(10, 60, 430, 25);

        jLabel211.setText("Artikelbeschreibung");
        Panelartikel1.add(jLabel211);
        jLabel211.setBounds(20, 320, 130, 16);

        Artikeldauer_bearbeiten.setEnabled(false);
        Panelartikel1.add(Artikeldauer_bearbeiten);
        Artikeldauer_bearbeiten.setBounds(1000, 180, 70, 30);

        BearbeitenArtikel.setBackground(new java.awt.Color(255, 102, 0));
        BearbeitenArtikel.setForeground(new java.awt.Color(255, 255, 255));
        BearbeitenArtikel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BearbeitenArtikel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/2gradientadd.png"))); // NOI18N
        BearbeitenArtikel.setText("Ändern");
        BearbeitenArtikel.setOpaque(true);
        BearbeitenArtikel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BearbeitenArtikelMouseClicked(evt);
            }
        });
        Panelartikel1.add(BearbeitenArtikel);
        BearbeitenArtikel.setBounds(1260, 560, 160, 40);

        Vegi_bearbeiten.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nein", "Ja" }));
        Vegi_bearbeiten.setEnabled(false);
        Vegi_bearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vegi_bearbeitenActionPerformed(evt);
            }
        });
        Panelartikel1.add(Vegi_bearbeiten);
        Vegi_bearbeiten.setBounds(180, 280, 76, 26);

        jLabel213.setText("Bio");
        Panelartikel1.add(jLabel213);
        jLabel213.setBounds(310, 250, 80, 16);

        Bildhochladenbearbeiten.setBackground(new java.awt.Color(255, 255, 255));
        Bildhochladenbearbeiten.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bildhochladenbearbeiten.setText("Bild hochladen");
        Bildhochladenbearbeiten.setEnabled(false);
        Bildhochladenbearbeiten.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bildhochladenbearbeiten.setOpaque(true);
        Bildhochladenbearbeiten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BildhochladenbearbeitenMouseClicked(evt);
            }
        });
        Panelartikel1.add(Bildhochladenbearbeiten);
        Bildhochladenbearbeiten.setBounds(1310, 250, 110, 30);

        jLabel214.setText("Vegetarisch");
        Panelartikel1.add(jLabel214);
        jLabel214.setBounds(180, 250, 80, 16);

        jLabel215.setText("Bildpfad");
        Panelartikel1.add(jLabel215);
        jLabel215.setBounds(640, 260, 120, 16);

        Artikelzutaten_bearbeiten.setColumns(20);
        Artikelzutaten_bearbeiten.setRows(5);
        Artikelzutaten_bearbeiten.setEnabled(false);
        jScrollPane19.setViewportView(Artikelzutaten_bearbeiten);

        Panelartikel1.add(jScrollPane19);
        jScrollPane19.setBounds(750, 320, 390, 290);

        FeldLeerenbearbeiten.setBackground(new java.awt.Color(153, 153, 255));
        FeldLeerenbearbeiten.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FeldLeerenbearbeiten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1remove.png"))); // NOI18N
        FeldLeerenbearbeiten.setText("Felder leeren");
        FeldLeerenbearbeiten.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        FeldLeerenbearbeiten.setOpaque(true);
        FeldLeerenbearbeiten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeldLeerenbearbeitenMouseClicked(evt);
            }
        });
        Panelartikel1.add(FeldLeerenbearbeiten);
        FeldLeerenbearbeiten.setBounds(1260, 500, 160, 40);

        jLabel218.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/v960-ning-11.jpg"))); // NOI18N
        Panelartikel1.add(jLabel218);
        jLabel218.setBounds(0, 40, 1440, 590);

        jLabel219.setBackground(new java.awt.Color(179, 201, 156));
        jLabel219.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel219.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/08.jpg"))); // NOI18N
        jLabel219.setOpaque(true);
        Panelartikel1.add(jLabel219);
        jLabel219.setBounds(0, 0, 1440, 40);

        jLabel220.setText("Artikelbeschreibung");
        Panelartikel1.add(jLabel220);
        jLabel220.setBounds(20, 330, 120, 16);

        bearbeitenlayout.add(Panelartikel1);
        Panelartikel1.setBounds(50, 50, 1440, 630);

        javax.swing.GroupLayout ArtikelbearbeitenLayout = new javax.swing.GroupLayout(Artikelbearbeiten);
        Artikelbearbeiten.setLayout(ArtikelbearbeitenLayout);
        ArtikelbearbeitenLayout.setHorizontalGroup(
            ArtikelbearbeitenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bearbeitenlayout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1540, Short.MAX_VALUE)
        );
        ArtikelbearbeitenLayout.setVerticalGroup(
            ArtikelbearbeitenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArtikelbearbeitenLayout.createSequentialGroup()
                .addComponent(bearbeitenlayout, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ParentArtikeldaten.add(Artikelbearbeiten, "card5");

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(null);
        jPanel16.add(Artikelnummer_löschen);
        Artikelnummer_löschen.setBounds(420, 250, 180, 40);

        jLabel224.setBackground(new java.awt.Color(204, 204, 255));
        jLabel224.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel224.setText("Felder leeren");
        jLabel224.setOpaque(true);
        jLabel224.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel224MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel224);
        jLabel224.setBounds(1140, 380, 110, 40);

        jLabel225.setText("Achtung: Zuerst müssen Sie den Artikel aus einem Layout entfernen, bevor Sie es löschen können.");
        jPanel16.add(jLabel225);
        jLabel225.setBounds(270, 150, 550, 50);

        jLabel223.setBackground(new java.awt.Color(204, 204, 255));
        jLabel223.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel223.setText("Löschen");
        jLabel223.setOpaque(true);
        jLabel223.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel223MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel223);
        jLabel223.setBounds(1140, 450, 110, 40);

        Anzeigen_löschen.setBackground(new java.awt.Color(204, 204, 255));
        Anzeigen_löschen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Anzeigen_löschen.setText("Anzeigen");
        Anzeigen_löschen.setOpaque(true);
        Anzeigen_löschen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Anzeigen_löschenMouseClicked(evt);
            }
        });
        jPanel16.add(Anzeigen_löschen);
        Anzeigen_löschen.setBounds(650, 250, 110, 40);

        Anzeiger_löschen.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Anzeiger_löschen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        jPanel16.add(Anzeiger_löschen);
        Anzeiger_löschen.setBounds(270, 350, 850, 60);

        jLabel217.setText("Artikelnummer:");
        jPanel16.add(jLabel217);
        jLabel217.setBounds(270, 250, 100, 40);

        jLabel216.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel216.setText("Einen Artikel löschen");
        jPanel16.add(jLabel216);
        jLabel216.setBounds(620, 70, 380, 60);

        jLabel226.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel226.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel226.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/winterv960-ning-30.jpg"))); // NOI18N
        jLabel226.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        jPanel16.add(jLabel226);
        jLabel226.setBounds(220, 70, 1060, 60);

        jLabel212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/v960-ning-30.jpg"))); // NOI18N
        jLabel212.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        jPanel16.add(jLabel212);
        jLabel212.setBounds(220, 70, 1060, 480);

        javax.swing.GroupLayout ArtikellöschenLayout = new javax.swing.GroupLayout(Artikellöschen);
        Artikellöschen.setLayout(ArtikellöschenLayout);
        ArtikellöschenLayout.setHorizontalGroup(
            ArtikellöschenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 1540, Short.MAX_VALUE)
        );
        ArtikellöschenLayout.setVerticalGroup(
            ArtikellöschenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );

        ParentArtikeldaten.add(Artikellöschen, "card6");

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(null);

        jLabel221.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel221.setForeground(new java.awt.Color(0, 0, 0));
        jLabel221.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel221.setText("Verfügbarkeitenmanager");
        jPanel18.add(jLabel221);
        jLabel221.setBounds(930, 160, 290, 50);

        Tabelle_Verfügbarkeiten.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane20.setViewportView(Tabelle_Verfügbarkeiten);

        jPanel18.add(jScrollPane20);
        jScrollPane20.setBounds(50, 150, 640, 500);
        jPanel18.add(Artikelnummerverfügbarkeiten);
        Artikelnummerverfügbarkeiten.setBounds(1000, 350, 110, 40);

        BoxVerfügbarkeiten.setEnabled(false);
        jPanel18.add(BoxVerfügbarkeiten);
        BoxVerfügbarkeiten.setBounds(1010, 510, 110, 40);

        Anzeiger_Verfügbarkeiten.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Anzeiger_Verfügbarkeiten.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        jPanel18.add(Anzeiger_Verfügbarkeiten);
        Anzeiger_Verfügbarkeiten.setBounds(830, 430, 470, 40);

        jLabel232.setText("Hier können Sie die Verfügbarkeiten Status einzelner Artikel ändern.");
        jPanel18.add(jLabel232);
        jLabel232.setBounds(770, 250, 410, 30);

        Ändern_Verfübbarkeiten.setBackground(new java.awt.Color(0, 204, 0));
        Ändern_Verfübbarkeiten.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ändern_Verfübbarkeiten.setText("Ändern");
        Ändern_Verfübbarkeiten.setEnabled(false);
        Ändern_Verfübbarkeiten.setOpaque(true);
        Ändern_Verfübbarkeiten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ändern_VerfübbarkeitenMouseClicked(evt);
            }
        });
        jPanel18.add(Ändern_Verfübbarkeiten);
        Ändern_Verfübbarkeiten.setBounds(1190, 510, 110, 40);

        jLabel229.setBackground(new java.awt.Color(153, 153, 255));
        jLabel229.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel229.setText("Anzeigen");
        jLabel229.setOpaque(true);
        jLabel229.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel229MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel229MouseEntered(evt);
            }
        });
        jPanel18.add(jLabel229);
        jLabel229.setBounds(1190, 350, 110, 40);

        jLabel230.setText("Verfübbarkeitstatus");
        jPanel18.add(jLabel230);
        jLabel230.setBounds(830, 500, 110, 40);

        jLabel228.setText("Artikelnummer");
        jPanel18.add(jLabel228);
        jLabel228.setBounds(840, 350, 110, 40);

        jLabel222.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/wp8634795-gradient-blue-wallpapers.png"))); // NOI18N
        jLabel222.setText("jLabel222");
        jLabel222.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        jPanel18.add(jLabel222);
        jLabel222.setBounds(740, 150, 680, 60);

        jLabel227.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/v960-ning-30.jpg"))); // NOI18N
        jLabel227.setText("jLabel227");
        jLabel227.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        jPanel18.add(jLabel227);
        jLabel227.setBounds(740, 210, 680, 440);

        javax.swing.GroupLayout ArtikelverfügbarkeitenLayout = new javax.swing.GroupLayout(Artikelverfügbarkeiten);
        Artikelverfügbarkeiten.setLayout(ArtikelverfügbarkeitenLayout);
        ArtikelverfügbarkeitenLayout.setHorizontalGroup(
            ArtikelverfügbarkeitenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ArtikelverfügbarkeitenLayout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, 1534, Short.MAX_VALUE)
                .addContainerGap())
        );
        ArtikelverfügbarkeitenLayout.setVerticalGroup(
            ArtikelverfügbarkeitenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArtikelverfügbarkeitenLayout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ParentArtikeldaten.add(Artikelverfügbarkeiten, "card7");

        Artikeldaten.add(ParentArtikeldaten);
        ParentArtikeldaten.setBounds(0, 40, 1540, 940);

        ParentArtikelbewirtschaftung.add(Artikeldaten, "card2");

        Supplemente.setLayout(null);

        Supplementparent.setLayout(new java.awt.CardLayout());

        MenuOptionen.setBackground(new java.awt.Color(255, 255, 255));
        MenuOptionen.setPreferredSize(new java.awt.Dimension(1490, 850));
        MenuOptionen.setLayout(null);

        Optiontabelle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplementnummer", "Supplementbezeichnung", "Preis", "Verfugbar"
            }
        ));
        Optiontabelle.setColumnSelectionAllowed(true);
        Optiontabelle.setGridColor(new java.awt.Color(255, 204, 0));
        Optiontabelle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Optiontabelle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(Optiontabelle);
        Optiontabelle.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        MenuOptionen.add(jScrollPane3);
        jScrollPane3.setBounds(50, 180, 550, 670);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.setLayout(null);

        yyy.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        yyy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/gradientyes.png"))); // NOI18N
        yyy.setFocusable(false);
        jPanel2.add(yyy);
        yyy.setBounds(390, 180, 30, 0);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/2gradientadd.png"))); // NOI18N
        jLabel3.setText("   Supplement hinzufügen");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 0, 260, 40);

        jLabel39.setBackground(new java.awt.Color(102, 204, 0));
        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setText(" Menü Option hinzufügen");
        jLabel39.setOpaque(true);
        jPanel2.add(jLabel39);
        jLabel39.setBounds(850, 250, 330, 30);

        jLabel41.setText("Supplementnummer:");
        jPanel2.add(jLabel41);
        jLabel41.setBounds(10, 120, 160, 16);
        jPanel2.add(OptionPreis);
        OptionPreis.setBounds(420, 110, 148, 33);

        jLabel45.setText("Supplementbezeichnung:");
        jPanel2.add(jLabel45);
        jLabel45.setBounds(10, 180, 160, 16);

        OptionNummer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionNummerActionPerformed(evt);
            }
        });
        jPanel2.add(OptionNummer);
        OptionNummer.setBounds(160, 110, 148, 33);

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel44.setText("Hier können Sie Menü Optionen hinzufügen:");
        jPanel2.add(jLabel44);
        jLabel44.setBounds(10, 60, 430, 25);

        jLabel46.setText("Preis:");
        jPanel2.add(jLabel46);
        jLabel46.setBounds(380, 120, 50, 16);
        jPanel2.add(OptionBezeichnung);
        OptionBezeichnung.setBounds(160, 170, 148, 33);

        jLabel48.setBackground(new java.awt.Color(37, 27, 55));
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/2gradientadd.png"))); // NOI18N
        jLabel48.setText("Hinzufügen");
        jLabel48.setOpaque(true);
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel48);
        jLabel48.setBounds(680, 170, 150, 40);

        jLabel49.setBackground(new java.awt.Color(204, 204, 204));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1remove.png"))); // NOI18N
        jLabel49.setText("Felder leeren");
        jLabel49.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel49.setOpaque(true);
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel49);
        jLabel49.setBounds(680, 110, 150, 40);

        AnzeigeOptionhinzufugen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AnzeigeOptionhinzufugen.setForeground(new java.awt.Color(204, 0, 255));
        jPanel2.add(AnzeigeOptionhinzufugen);
        AnzeigeOptionhinzufugen.setBounds(430, 170, 210, 45);

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1pngwing.com (3).png"))); // NOI18N
        jLabel59.setToolTipText("Zufallsnummer erstellen.");
        jLabel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel59MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel59MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel59);
        jLabel59.setBounds(310, 110, 30, 30);

        jLabel73.setIcon(new javax.swing.ImageIcon("C:\\Users\\baris\\Downloads\\winter-blue-pink-gradient-background-vector\\v960-ning-30.jpg")); // NOI18N
        jLabel73.setText("jLabel73");
        jPanel2.add(jLabel73);
        jLabel73.setBounds(40, 490, 740, 2270);

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/winterv960-ning-30.jpg"))); // NOI18N
        jPanel2.add(jLabel74);
        jLabel74.setBounds(0, 40, 840, 210);

        jLabel50.setBackground(new java.awt.Color(179, 201, 156));
        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/4pexels-codioful-(formerly-gradienta)-7130498.jpg"))); // NOI18N
        jLabel50.setOpaque(true);
        jPanel2.add(jLabel50);
        jLabel50.setBounds(0, 0, 840, 40);

        MenuOptionen.add(jPanel2);
        jPanel2.setBounds(630, 60, 840, 250);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.setLayout(null);

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1pencil-tool.png"))); // NOI18N
        jLabel42.setText("   Supplement bearbeiten");
        jLabel42.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel42);
        jLabel42.setBounds(10, 0, 260, 40);

        jLabel40.setBackground(new java.awt.Color(179, 201, 156));
        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/4pexels-codioful-(formerly-gradienta)-7130498.jpg"))); // NOI18N
        jLabel40.setOpaque(true);
        jPanel3.add(jLabel40);
        jLabel40.setBounds(0, 0, 850, 40);

        jLabel66.setText("Supplementnummer:");
        jPanel3.add(jLabel66);
        jLabel66.setBounds(10, 100, 160, 16);

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel67.setText("Hier können Sie Menü Optionen ändern:");
        jPanel3.add(jLabel67);
        jLabel67.setBounds(10, 50, 430, 25);

        jLabel68.setText("Supplementbezeichnung:");
        jPanel3.add(jLabel68);
        jLabel68.setBounds(10, 160, 160, 16);

        Optionnummerbearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionnummerbearbeitenActionPerformed(evt);
            }
        });
        jPanel3.add(Optionnummerbearbeiten);
        Optionnummerbearbeiten.setBounds(160, 90, 148, 33);

        Optionbezeichnungbearbeiten.setBackground(new java.awt.Color(204, 204, 204));
        Optionbezeichnungbearbeiten.setEnabled(false);
        jPanel3.add(Optionbezeichnungbearbeiten);
        Optionbezeichnungbearbeiten.setBounds(160, 150, 148, 33);

        jLabel69.setText("Preis:");
        jPanel3.add(jLabel69);
        jLabel69.setBounds(370, 100, 50, 16);

        Optionpreisbearbeiten.setBackground(new java.awt.Color(204, 204, 204));
        Optionpreisbearbeiten.setEnabled(false);
        jPanel3.add(Optionpreisbearbeiten);
        Optionpreisbearbeiten.setBounds(410, 90, 148, 33);

        jLabel70.setBackground(new java.awt.Color(204, 204, 204));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1remove.png"))); // NOI18N
        jLabel70.setText("Felder leeren");
        jLabel70.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel70.setIconTextGap(2);
        jLabel70.setOpaque(true);
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel70MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel70);
        jLabel70.setBounds(670, 130, 160, 40);

        jLabel71.setBackground(new java.awt.Color(37, 27, 55));
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1pencil-tool.png"))); // NOI18N
        jLabel71.setText("Ändern");
        jLabel71.setIconTextGap(2);
        jLabel71.setOpaque(true);
        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel71);
        jLabel71.setBounds(670, 190, 160, 40);

        jLabel72.setBackground(new java.awt.Color(153, 153, 153));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1zoom.png"))); // NOI18N
        jLabel72.setText("Anzeigen");
        jLabel72.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel72.setIconTextGap(0);
        jLabel72.setOpaque(true);
        jLabel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel72MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel72);
        jLabel72.setBounds(670, 70, 160, 40);

        Anzeigenausgabe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Anzeigenausgabe.setForeground(new java.awt.Color(255, 0, 0));
        Anzeigenausgabe.setRequestFocusEnabled(false);
        jPanel3.add(Anzeigenausgabe);
        Anzeigenausgabe.setBounds(410, 130, 280, 30);

        Andernausgabe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.add(Andernausgabe);
        Andernausgabe.setBounds(410, 160, 280, 30);

        MenuOptionen.add(jPanel3);
        jPanel3.setBounds(630, 350, 840, 250);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel4.setLayout(null);

        AnzeigeOptionhinzufugen2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AnzeigeOptionhinzufugen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1709519.png"))); // NOI18N
        AnzeigeOptionhinzufugen2.setMinimumSize(new java.awt.Dimension(0, 0));
        AnzeigeOptionhinzufugen2.setName(""); // NOI18N
        AnzeigeOptionhinzufugen2.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel4.add(AnzeigeOptionhinzufugen2);
        AnzeigeOptionhinzufugen2.setBounds(1020, 10, 170, 0);

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1cancel.png"))); // NOI18N
        jLabel38.setText("    Supplement löschen");
        jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel4.add(jLabel38);
        jLabel38.setBounds(10, 0, 260, 40);

        jLabel33.setBackground(new java.awt.Color(255, 51, 0));
        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setText("  Menü Option löschen");
        jLabel33.setOpaque(true);
        jPanel4.add(jLabel33);
        jLabel33.setBounds(1140, 170, 330, 30);

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel51.setText("Hier können Sie Menü Optionen löschen:");
        jPanel4.add(jLabel51);
        jLabel51.setBounds(10, 60, 430, 25);

        jLabel52.setText("Supplementnummer:");
        jPanel4.add(jLabel52);
        jLabel52.setBounds(10, 100, 160, 16);

        jLabel53.setBackground(new java.awt.Color(255, 255, 0));
        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel53.setText("  Menü Option bearbeiten");
        jLabel53.setOpaque(true);
        jPanel4.add(jLabel53);
        jLabel53.setBounds(860, 710, 330, 30);

        jLabel54.setBackground(new java.awt.Color(179, 201, 156));
        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/4pexels-codioful-(formerly-gradienta)-7130498.jpg"))); // NOI18N
        jLabel54.setOpaque(true);
        jPanel4.add(jLabel54);
        jLabel54.setBounds(0, 0, 840, 40);

        OptionNummerloschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionNummerloschenActionPerformed(evt);
            }
        });
        jPanel4.add(OptionNummerloschen);
        OptionNummerloschen.setBounds(160, 90, 148, 33);

        jLabel55.setText("Supplementbezeichnung:");
        jPanel4.add(jLabel55);
        jLabel55.setBounds(10, 160, 160, 16);

        OptionBezeichnungloschen.setBackground(new java.awt.Color(204, 204, 204));
        OptionBezeichnungloschen.setEnabled(false);
        jPanel4.add(OptionBezeichnungloschen);
        OptionBezeichnungloschen.setBounds(160, 150, 148, 33);

        jLabel56.setText("Preis:");
        jPanel4.add(jLabel56);
        jLabel56.setBounds(370, 100, 50, 16);

        OptionPreisloschen.setBackground(new java.awt.Color(204, 204, 204));
        OptionPreisloschen.setEnabled(false);
        jPanel4.add(OptionPreisloschen);
        OptionPreisloschen.setBounds(410, 90, 148, 33);

        jLabel57.setBackground(new java.awt.Color(153, 153, 153));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1zoom.png"))); // NOI18N
        jLabel57.setText("Suchen");
        jLabel57.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel57.setIconTextGap(0);
        jLabel57.setOpaque(true);
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel57MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel57);
        jLabel57.setBounds(667, 70, 160, 40);

        OptionLöschen.setBackground(new java.awt.Color(37, 27, 55));
        OptionLöschen.setForeground(new java.awt.Color(255, 255, 255));
        OptionLöschen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OptionLöschen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1cancel.png"))); // NOI18N
        OptionLöschen.setText("Löschen");
        OptionLöschen.setOpaque(true);
        OptionLöschen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OptionLöschenMouseClicked(evt);
            }
        });
        jPanel4.add(OptionLöschen);
        OptionLöschen.setBounds(667, 190, 160, 40);

        jLabel58.setBackground(new java.awt.Color(204, 204, 204));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1remove.png"))); // NOI18N
        jLabel58.setText("Felder leeren");
        jLabel58.setOpaque(true);
        jLabel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel58MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel58);
        jLabel58.setBounds(667, 130, 160, 40);

        suchausgabe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        suchausgabe.setForeground(new java.awt.Color(255, 0, 0));
        suchausgabe.setRequestFocusEnabled(false);
        jPanel4.add(suchausgabe);
        suchausgabe.setBounds(370, 150, 280, 30);

        Loschenausgabe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel4.add(Loschenausgabe);
        Loschenausgabe.setBounds(370, 190, 280, 30);

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/winterv960-ning-30.jpg"))); // NOI18N
        jLabel76.setText("jLabel76");
        jPanel4.add(jLabel76);
        jLabel76.setBounds(0, 40, 840, 210);

        MenuOptionen.add(jPanel4);
        jPanel4.setBounds(630, 640, 840, 250);

        SupplementDrucken.setBackground(new java.awt.Color(255, 255, 255));
        SupplementDrucken.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SupplementDrucken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/printer.png"))); // NOI18N
        SupplementDrucken.setText("Drucken");
        SupplementDrucken.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplementDruckenMouseClicked(evt);
            }
        });
        MenuOptionen.add(SupplementDrucken);
        SupplementDrucken.setBounds(510, 850, 100, 50);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Supplemente");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MenuOptionen.add(jLabel8);
        jLabel8.setBounds(200, 80, 320, 38);

        jLabel77.setBackground(new java.awt.Color(179, 201, 156));
        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/4pexels-codioful-(formerly-gradienta)-7130498.jpg"))); // NOI18N
        jLabel77.setOpaque(true);
        MenuOptionen.add(jLabel77);
        jLabel77.setBounds(50, 60, 550, 80);

        Supplementparent.add(MenuOptionen, "card4");

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(null);

        jLabel147.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel147.setText("Artikel ohne Supplementverknüpfungen");
        jPanel17.add(jLabel147);
        jLabel147.setBounds(50, 20, 590, 40);

        jLabel174.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1cancel.png"))); // NOI18N
        jLabel174.setText("   Supplementeverknüpfung auflösen");
        jPanel17.add(jLabel174);
        jLabel174.setBounds(810, 720, 510, 40);

        jScrollPane16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        TabelleSupplementverknüpfungen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        TabelleSupplementverknüpfungen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Artikelnummer", "Artikelbezeichnung", "Supplement 1", "Supplement 2", "Supplement 3", "Supplement 4"
            }
        ));
        jScrollPane16.setViewportView(TabelleSupplementverknüpfungen);

        jPanel17.add(jScrollPane16);
        jScrollPane16.setBounds(40, 520, 730, 400);

        jLabel151.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel151.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel151.setText("Supplementverknüpfungen");
        jPanel17.add(jLabel151);
        jLabel151.setBounds(810, 20, 700, 60);

        jLabel154.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1pencil-tool.png"))); // NOI18N
        jLabel154.setText("   Supplementverknüpfung bearbeiten");
        jPanel17.add(jLabel154);
        jLabel154.setBounds(810, 420, 440, 40);

        jLabel149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/refresh-149-32.png"))); // NOI18N
        jLabel149.setText("Daten aktualisieren");
        jLabel149.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel149MouseClicked(evt);
            }
        });
        jPanel17.add(jLabel149);
        jLabel149.setBounds(630, 430, 150, 50);

        jLabel171.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel171.setText("Artikel mit Supplementverknüpfungen");
        jPanel17.add(jLabel171);
        jLabel171.setBounds(50, 480, 410, 40);

        jLabel181.setText("Supplement 4");
        jPanel17.add(jLabel181);
        jLabel181.setBounds(1070, 330, 90, 16);

        jLabel169.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel169.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/2gradientadd.png"))); // NOI18N
        jLabel169.setText("   Supplementverknüpfung erstellen");
        jPanel17.add(jLabel169);
        jLabel169.setBounds(810, 100, 410, 40);

        jLabel182.setText("Supplement 3");
        jPanel17.add(jLabel182);
        jLabel182.setBounds(830, 330, 90, 16);
        jPanel17.add(Artikelnummer_auflösen);
        Artikelnummer_auflösen.setBounds(920, 770, 110, 40);

        Supplement4_bearbeiten.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        Supplement4_bearbeiten.setEnabled(false);
        Supplement4_bearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Supplement4_bearbeitenActionPerformed(evt);
            }
        });
        jPanel17.add(Supplement4_bearbeiten);
        Supplement4_bearbeiten.setBounds(1060, 660, 160, 30);

        Supplement2_bearbeiten.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        Supplement2_bearbeiten.setEnabled(false);
        jPanel17.add(Supplement2_bearbeiten);
        Supplement2_bearbeiten.setBounds(820, 660, 160, 30);

        Supplement2_erstellen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        Supplement2_erstellen.setEnabled(false);
        jPanel17.add(Supplement2_erstellen);
        Supplement2_erstellen.setBounds(1070, 280, 180, 30);

        Supplement4_erstellen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        Supplement4_erstellen.setEnabled(false);
        jPanel17.add(Supplement4_erstellen);
        Supplement4_erstellen.setBounds(1070, 350, 180, 30);

        jLabel194.setBackground(new java.awt.Color(153, 153, 153));
        jLabel194.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel194.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1zoom.png"))); // NOI18N
        jLabel194.setText("Anzeigen");
        jLabel194.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel194.setIconTextGap(0);
        jLabel194.setOpaque(true);
        jLabel194.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel194MouseClicked(evt);
            }
        });
        jPanel17.add(jLabel194);
        jLabel194.setBounds(1320, 770, 170, 40);

        jLabel184.setBackground(new java.awt.Color(204, 204, 204));
        jLabel184.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel184.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1remove.png"))); // NOI18N
        jLabel184.setText("Felder leeren");
        jLabel184.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel184.setIconTextGap(2);
        jLabel184.setOpaque(true);
        jLabel184.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel184MouseClicked(evt);
            }
        });
        jPanel17.add(jLabel184);
        jLabel184.setBounds(1320, 820, 170, 40);

        jLabel183.setBackground(new java.awt.Color(37, 27, 55));
        jLabel183.setForeground(new java.awt.Color(255, 255, 255));
        jLabel183.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel183.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/2gradientadd.png"))); // NOI18N
        jLabel183.setText("Verknüpfung auflösen");
        jLabel183.setOpaque(true);
        jLabel183.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel183MouseClicked(evt);
            }
        });
        jPanel17.add(jLabel183);
        jLabel183.setBounds(1320, 870, 170, 40);

        jLabel176.setText("Artikelnummer");
        jPanel17.add(jLabel176);
        jLabel176.setBounds(830, 160, 110, 16);

        jLabel179.setText("Supplement 2");
        jPanel17.add(jLabel179);
        jLabel179.setBounds(1070, 260, 90, 16);

        jLabel180.setText("Supplement 4");
        jPanel17.add(jLabel180);
        jLabel180.setBounds(1060, 640, 90, 16);

        Artikelanzeige_auflösen.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Artikelanzeige_auflösen.setForeground(new java.awt.Color(102, 0, 102));
        jPanel17.add(Artikelanzeige_auflösen);
        Artikelanzeige_auflösen.setBounds(1060, 770, 250, 40);

        jLabel168.setBackground(new java.awt.Color(179, 201, 156));
        jLabel168.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/4pexels-codioful-(formerly-gradienta)-7130498.jpg"))); // NOI18N
        jLabel168.setOpaque(true);
        jPanel17.add(jLabel168);
        jLabel168.setBounds(810, 420, 700, 40);

        jLabel188.setText("Supplement 1");
        jPanel17.add(jLabel188);
        jLabel188.setBounds(830, 260, 90, 16);

        Anzeige_erstellen.setBackground(new java.awt.Color(153, 153, 153));
        Anzeige_erstellen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Anzeige_erstellen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1zoom.png"))); // NOI18N
        Anzeige_erstellen.setText("Anzeigen");
        Anzeige_erstellen.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Anzeige_erstellen.setIconTextGap(0);
        Anzeige_erstellen.setOpaque(true);
        Anzeige_erstellen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Anzeige_erstellenMouseClicked(evt);
            }
        });
        jPanel17.add(Anzeige_erstellen);
        Anzeige_erstellen.setBounds(1315, 150, 170, 40);

        Supplement3_erstellen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        Supplement3_erstellen.setEnabled(false);
        jPanel17.add(Supplement3_erstellen);
        Supplement3_erstellen.setBounds(830, 350, 160, 30);

        jLabel175.setBackground(new java.awt.Color(179, 201, 156));
        jLabel175.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/4pexels-codioful-(formerly-gradienta)-7130498.jpg"))); // NOI18N
        jLabel175.setOpaque(true);
        jPanel17.add(jLabel175);
        jLabel175.setBounds(810, 100, 700, 40);

        jLabel150.setBackground(new java.awt.Color(179, 201, 156));
        jLabel150.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/4pexels-codioful-(formerly-gradienta)-7130498.jpg"))); // NOI18N
        jLabel150.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jLabel150.setOpaque(true);
        jPanel17.add(jLabel150);
        jLabel150.setBounds(40, 480, 730, 40);

        Supplement1_erstellen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        Supplement1_erstellen.setEnabled(false);
        jPanel17.add(Supplement1_erstellen);
        Supplement1_erstellen.setBounds(830, 280, 160, 30);

        Supplement3_bearbeiten.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        Supplement3_bearbeiten.setEnabled(false);
        jPanel17.add(Supplement3_bearbeiten);
        Supplement3_bearbeiten.setBounds(1060, 590, 160, 30);

        Supplement1_bearbeiten.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        Supplement1_bearbeiten.setEnabled(false);
        jPanel17.add(Supplement1_bearbeiten);
        Supplement1_bearbeiten.setBounds(820, 590, 160, 30);
        jPanel17.add(Artikelnummer_erstellen);
        Artikelnummer_erstellen.setBounds(930, 150, 110, 40);

        fff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1cancel.png"))); // NOI18N
        jPanel17.add(fff);
        fff.setBounds(1030, 210, 26, 0);

        fff2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1cancel.png"))); // NOI18N
        jPanel17.add(fff2);
        fff2.setBounds(1030, 530, 26, 0);

        fff3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1cancel.png"))); // NOI18N
        jPanel17.add(fff3);
        fff3.setBounds(1030, 770, 26, 0);

        jLabel190.setText("Supplement 2");
        jPanel17.add(jLabel190);
        jLabel190.setBounds(820, 640, 90, 16);

        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/gradientyes.png"))); // NOI18N
        jPanel17.add(ok);
        ok.setBounds(1030, 210, 31, 0);

        ok2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/gradientyes.png"))); // NOI18N
        jPanel17.add(ok2);
        ok2.setBounds(1030, 530, 31, 0);

        ok3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/gradientyes.png"))); // NOI18N
        jPanel17.add(ok3);
        ok3.setBounds(1030, 770, 31, 0);

        jLabel191.setText("Supplement 3");
        jPanel17.add(jLabel191);
        jLabel191.setBounds(1060, 570, 90, 16);

        Artikelanzeige_bearbeiten.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Artikelanzeige_bearbeiten.setForeground(new java.awt.Color(102, 0, 102));
        jPanel17.add(Artikelanzeige_bearbeiten);
        Artikelanzeige_bearbeiten.setBounds(820, 520, 490, 40);

        Supplement4_auflösen.setBackground(new java.awt.Color(204, 204, 255));
        Supplement4_auflösen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Supplement4_auflösen.setOpaque(true);
        jPanel17.add(Supplement4_auflösen);
        Supplement4_auflösen.setBounds(1160, 870, 110, 40);

        Artikelanzeige_erstellen.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Artikelanzeige_erstellen.setForeground(new java.awt.Color(102, 0, 102));
        Artikelanzeige_erstellen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel17.add(Artikelanzeige_erstellen);
        Artikelanzeige_erstellen.setBounds(830, 200, 480, 40);

        jLabel177.setText("Supplement 4");
        jPanel17.add(jLabel177);
        jLabel177.setBounds(1060, 880, 90, 16);

        Supplement1_auflösen.setBackground(new java.awt.Color(204, 204, 255));
        Supplement1_auflösen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Supplement1_auflösen.setOpaque(true);
        jPanel17.add(Supplement1_auflösen);
        Supplement1_auflösen.setBounds(920, 820, 110, 40);

        jLabel189.setText("Supplement 1");
        jPanel17.add(jLabel189);
        jLabel189.setBounds(820, 570, 90, 20);

        Fehler_bearbeiten.setBackground(new java.awt.Color(102, 0, 102));
        Fehler_bearbeiten.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Fehler_bearbeiten.setForeground(new java.awt.Color(102, 0, 102));
        jPanel17.add(Fehler_bearbeiten);
        Fehler_bearbeiten.setBounds(1060, 530, 240, 30);

        Fehler_erstellen.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Fehler_erstellen.setForeground(new java.awt.Color(102, 0, 102));
        jPanel17.add(Fehler_erstellen);
        Fehler_erstellen.setBounds(1060, 200, 240, 50);

        jLabel199.setText("Supplement 3");
        jPanel17.add(jLabel199);
        jLabel199.setBounds(1060, 830, 90, 16);

        Erstellen.setBackground(new java.awt.Color(37, 27, 55));
        Erstellen.setForeground(new java.awt.Color(255, 255, 255));
        Erstellen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Erstellen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/2gradientadd.png"))); // NOI18N
        Erstellen.setText("Verknüpfung erstellen");
        Erstellen.setOpaque(true);
        Erstellen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ErstellenMouseClicked(evt);
            }
        });
        jPanel17.add(Erstellen);
        Erstellen.setBounds(1315, 340, 170, 40);

        Supplement2_auflösen.setBackground(new java.awt.Color(204, 204, 255));
        Supplement2_auflösen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Supplement2_auflösen.setOpaque(true);
        jPanel17.add(Supplement2_auflösen);
        Supplement2_auflösen.setBounds(920, 870, 110, 40);

        jLabel204.setBackground(new java.awt.Color(153, 153, 153));
        jLabel204.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel204.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1zoom.png"))); // NOI18N
        jLabel204.setText("Anzeigen");
        jLabel204.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel204.setIconTextGap(0);
        jLabel204.setOpaque(true);
        jLabel204.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel204MouseClicked(evt);
            }
        });
        jPanel17.add(jLabel204);
        jLabel204.setBounds(1320, 470, 170, 40);

        jLabel205.setBackground(new java.awt.Color(204, 204, 204));
        jLabel205.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel205.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1remove.png"))); // NOI18N
        jLabel205.setText("Felder leeren");
        jLabel205.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel205.setIconTextGap(2);
        jLabel205.setOpaque(true);
        jLabel205.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel205MouseClicked(evt);
            }
        });
        jPanel17.add(jLabel205);
        jLabel205.setBounds(1320, 530, 170, 40);

        jLabel206.setBackground(new java.awt.Color(37, 27, 55));
        jLabel206.setForeground(new java.awt.Color(255, 255, 255));
        jLabel206.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel206.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/2gradientadd.png"))); // NOI18N
        jLabel206.setText("Verknüpfung bearbeiten");
        jLabel206.setOpaque(true);
        jLabel206.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel206MouseClicked(evt);
            }
        });
        jPanel17.add(jLabel206);
        jLabel206.setBounds(1320, 650, 170, 40);
        jPanel17.add(Artikelnummer_bearbeiten);
        Artikelnummer_bearbeiten.setBounds(920, 470, 110, 40);

        jLabel155.setBackground(new java.awt.Color(179, 201, 156));
        jLabel155.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/4pexels-codioful-(formerly-gradienta)-7130498.jpg"))); // NOI18N
        jLabel155.setOpaque(true);
        jPanel17.add(jLabel155);
        jLabel155.setBounds(810, 720, 700, 40);

        jLabel185.setText("Artikelnummer");
        jPanel17.add(jLabel185);
        jLabel185.setBounds(820, 780, 100, 16);

        Supplement3_auflösen.setBackground(new java.awt.Color(204, 204, 255));
        Supplement3_auflösen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Supplement3_auflösen.setOpaque(true);
        jPanel17.add(Supplement3_auflösen);
        Supplement3_auflösen.setBounds(1160, 820, 110, 40);

        jLabel197.setText("Supplement 1");
        jPanel17.add(jLabel197);
        jLabel197.setBounds(820, 830, 120, 16);

        jLabel186.setText("Artikelnummer");
        jPanel17.add(jLabel186);
        jLabel186.setBounds(820, 480, 110, 16);

        jLabel198.setText("Supplement 2");
        jPanel17.add(jLabel198);
        jLabel198.setBounds(820, 880, 90, 16);

        jLabel152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/winterv960-ning-30.jpg"))); // NOI18N
        jPanel17.add(jLabel152);
        jLabel152.setBounds(810, 760, 700, 160);

        jLabel153.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        jPanel17.add(jLabel153);
        jLabel153.setBounds(810, 440, 700, 260);

        jLabel167.setBackground(new java.awt.Color(179, 201, 156));
        jLabel167.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/4pexels-codioful-(formerly-gradienta)-7130498.jpg"))); // NOI18N
        jLabel167.setOpaque(true);
        jPanel17.add(jLabel167);
        jLabel167.setBounds(810, 20, 700, 60);

        jLabel170.setBackground(new java.awt.Color(179, 201, 156));
        jLabel170.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/4pexels-codioful-(formerly-gradienta)-7130498.jpg"))); // NOI18N
        jLabel170.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jLabel170.setOpaque(true);
        jPanel17.add(jLabel170);
        jLabel170.setBounds(40, 20, 730, 40);

        Leeren_erstellen.setBackground(new java.awt.Color(204, 204, 204));
        Leeren_erstellen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Leeren_erstellen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1remove.png"))); // NOI18N
        Leeren_erstellen.setText("Felder leeren");
        Leeren_erstellen.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Leeren_erstellen.setIconTextGap(2);
        Leeren_erstellen.setOpaque(true);
        Leeren_erstellen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Leeren_erstellenMouseClicked(evt);
            }
        });
        jPanel17.add(Leeren_erstellen);
        Leeren_erstellen.setBounds(1315, 210, 170, 40);

        jScrollPane17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        TabelleArtikelverknüpfungen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        TabelleArtikelverknüpfungen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Artikelnummer", "Artikelbezeichnung", "Verfügbar"
            }
        ));
        jScrollPane17.setViewportView(TabelleArtikelverknüpfungen);

        jPanel17.add(jScrollPane17);
        jScrollPane17.setBounds(40, 60, 730, 370);

        jLabel172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/winterv960-ning-30.jpg"))); // NOI18N
        jPanel17.add(jLabel172);
        jLabel172.setBounds(810, 130, 700, 270);

        jLabel173.setBackground(new java.awt.Color(179, 201, 156));
        jLabel173.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/4pexels-codioful-(formerly-gradienta)-7130498.jpg"))); // NOI18N
        jLabel173.setOpaque(true);
        jPanel17.add(jLabel173);
        jLabel173.setBounds(810, 130, 700, 40);

        javax.swing.GroupLayout ZuordnenLayout = new javax.swing.GroupLayout(Zuordnen);
        Zuordnen.setLayout(ZuordnenLayout);
        ZuordnenLayout.setHorizontalGroup(
            ZuordnenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 1540, Short.MAX_VALUE)
        );
        ZuordnenLayout.setVerticalGroup(
            ZuordnenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
        );

        Supplementparent.add(Zuordnen, "card4");

        VerfügbarkeitenSupplemente.setLayout(null);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setLayout(null);

        jLabel236.setText("Hier können Sie die Verfügbarkeiten ändern.");
        jPanel19.add(jLabel236);
        jLabel236.setBounds(920, 280, 300, 16);

        jLabel237.setText("Artikelnummer:");
        jPanel19.add(jLabel237);
        jLabel237.setBounds(880, 400, 120, 16);

        Supplementeändern.setBackground(new java.awt.Color(153, 51, 255));
        Supplementeändern.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Supplementeändern.setText("Ändern");
        Supplementeändern.setEnabled(false);
        Supplementeändern.setOpaque(true);
        Supplementeändern.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplementeändernMouseClicked(evt);
            }
        });
        jPanel19.add(Supplementeändern);
        Supplementeändern.setBounds(1250, 610, 160, 40);

        jLabel239.setText("Verfügbarkeitsstatus");
        jPanel19.add(jLabel239);
        jLabel239.setBounds(870, 620, 150, 30);

        Supplementanzeigen.setBackground(new java.awt.Color(51, 102, 255));
        Supplementanzeigen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Supplementanzeigen.setText("Anzeigen");
        Supplementanzeigen.setOpaque(true);
        Supplementanzeigen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplementanzeigenMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SupplementanzeigenMousePressed(evt);
            }
        });
        jPanel19.add(Supplementanzeigen);
        Supplementanzeigen.setBounds(1250, 390, 160, 40);

        BoxSupplemente.setAutoscrolls(true);
        BoxSupplemente.setEnabled(false);
        jPanel19.add(BoxSupplemente);
        BoxSupplemente.setBounds(1060, 610, 120, 40);
        jPanel19.add(Supplementnummer);
        Supplementnummer.setBounds(1050, 390, 150, 40);

        Supplementanzeiger.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Supplementanzeiger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        jPanel19.add(Supplementanzeiger);
        Supplementanzeiger.setBounds(880, 500, 530, 50);

        jLabel231.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel231.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel231.setText("Verfügbarkeitenmanager");
        jPanel19.add(jLabel231);
        jLabel231.setBounds(810, 140, 690, 60);

        TabelleVerfügbarkeiten.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane21.setViewportView(TabelleVerfügbarkeiten);

        jPanel19.add(jScrollPane21);
        jScrollPane21.setBounds(220, 140, 530, 600);

        jLabel233.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/winterv960-ning-30.jpg"))); // NOI18N
        jLabel233.setText("jLabel233");
        jPanel19.add(jLabel233);
        jLabel233.setBounds(800, 200, 700, 540);

        jLabel235.setBackground(new java.awt.Color(179, 201, 156));
        jLabel235.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel235.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/4pexels-codioful-(formerly-gradienta)-7130498.jpg"))); // NOI18N
        jLabel235.setOpaque(true);
        jPanel19.add(jLabel235);
        jLabel235.setBounds(800, 140, 700, 60);

        VerfügbarkeitenSupplemente.add(jPanel19);
        jPanel19.setBounds(0, 0, 1540, 930);

        Supplementparent.add(VerfügbarkeitenSupplemente, "card4");

        Supplemente.add(Supplementparent);
        Supplementparent.setBounds(0, 40, 1540, 930);

        SupplementeOben.setBackground(new java.awt.Color(255, 255, 255));
        SupplementeOben.setForeground(new java.awt.Color(102, 0, 102));
        SupplementeOben.setLayout(null);

        jLabel32.setForeground(new java.awt.Color(102, 0, 102));
        jLabel32.setText("Supplemente");
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel32MouseEntered(evt);
            }
        });
        SupplementeOben.add(jLabel32);
        jLabel32.setBounds(250, -2, 100, 50);

        jLabel141.setForeground(new java.awt.Color(102, 0, 102));
        jLabel141.setText("Supplementverknüpfungen");
        jLabel141.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel141MouseClicked(evt);
            }
        });
        SupplementeOben.add(jLabel141);
        jLabel141.setBounds(650, -4, 230, 50);
        SupplementeOben.add(jLabel145);
        jLabel145.setBounds(1046, 6, 0, 0);

        jLabel146.setForeground(new java.awt.Color(102, 0, 102));
        jLabel146.setText("Supplementeverfügbarkeiten");
        jLabel146.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel146MouseClicked(evt);
            }
        });
        SupplementeOben.add(jLabel146);
        jLabel146.setBounds(1150, -4, 190, 50);

        Supplemente.add(SupplementeOben);
        SupplementeOben.setBounds(0, 0, 1540, 40);

        ParentArtikelbewirtschaftung.add(Supplemente, "card4");

        Kategorien.setLayout(null);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(null);

        jLabel246.setBackground(new java.awt.Color(255, 153, 0));
        jLabel246.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel246.setText("Umbennen");
        jLabel246.setOpaque(true);
        jLabel246.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel246MouseClicked(evt);
            }
        });
        jPanel20.add(jLabel246);
        jLabel246.setBounds(543, 770, 180, 40);
        jPanel20.add(UmbenennenFeld7);
        UmbenennenFeld7.setBounds(540, 730, 185, 40);
        jPanel20.add(UmbenennenFeld5);
        UmbenennenFeld5.setBounds(540, 510, 185, 40);

        jLabel243.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel243.setText("Neue Bezeichnung");
        jPanel20.add(jLabel243);
        jLabel243.setBounds(1250, 140, 190, 25);

        jLabel251.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/kisspng-arrow-computer-icons-red-clip-art-red-arrow-5abf82c1bb2560.6797266415225002897666.png"))); // NOI18N
        jPanel20.add(jLabel251);
        jLabel251.setBounds(410, 620, 130, 70);

        jLabel253.setBackground(new java.awt.Color(255, 153, 0));
        jLabel253.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel253.setText("Umbennen");
        jLabel253.setOpaque(true);
        jLabel253.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel253MouseClicked(evt);
            }
        });
        jPanel20.add(jLabel253);
        jLabel253.setBounds(542, 220, 180, 40);

        jLabel254.setBackground(new java.awt.Color(255, 153, 0));
        jLabel254.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel254.setText("Umbennen");
        jLabel254.setOpaque(true);
        jLabel254.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel254MouseClicked(evt);
            }
        });
        jPanel20.add(jLabel254);
        jLabel254.setBounds(543, 350, 180, 40);
        jPanel20.add(UmbenennenFeld6);
        UmbenennenFeld6.setBounds(540, 620, 185, 40);

        jLabel257.setBackground(new java.awt.Color(255, 153, 0));
        jLabel257.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel257.setText("Umbennen");
        jLabel257.setOpaque(true);
        jLabel257.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel257MouseClicked(evt);
            }
        });
        jPanel20.add(jLabel257);
        jLabel257.setBounds(543, 660, 180, 40);
        jPanel20.add(UmbenennenFeld4);
        UmbenennenFeld4.setBounds(540, 410, 185, 40);

        jLabel256.setBackground(new java.awt.Color(255, 153, 0));
        jLabel256.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel256.setText("Umbennen");
        jLabel256.setOpaque(true);
        jLabel256.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel256MouseClicked(evt);
            }
        });
        jPanel20.add(jLabel256);
        jLabel256.setBounds(543, 550, 180, 40);
        jPanel20.add(UmbenennenFeld3);
        UmbenennenFeld3.setBounds(540, 310, 185, 40);

        FeldKategorie2_6.setBackground(new java.awt.Color(51, 51, 51));
        FeldKategorie2_6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FeldKategorie2_6.setForeground(new java.awt.Color(255, 255, 255));
        FeldKategorie2_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FeldKategorie2_6.setText("Highlights");
        FeldKategorie2_6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        FeldKategorie2_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FeldKategorie2_6.setOpaque(true);
        FeldKategorie2_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeldKategorie2_6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FeldKategorie2_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FeldKategorie2_6MouseExited(evt);
            }
        });
        jPanel20.add(FeldKategorie2_6);
        FeldKategorie2_6.setBounds(860, 730, 200, 70);

        jLabel255.setBackground(new java.awt.Color(255, 153, 0));
        jLabel255.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel255.setText("Umbennen");
        jLabel255.setOpaque(true);
        jLabel255.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel255MouseClicked(evt);
            }
        });
        jPanel20.add(jLabel255);
        jLabel255.setBounds(543, 450, 180, 40);

        FeldKategorie2_4.setBackground(new java.awt.Color(51, 51, 51));
        FeldKategorie2_4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FeldKategorie2_4.setForeground(new java.awt.Color(255, 255, 255));
        FeldKategorie2_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FeldKategorie2_4.setText("Highlights");
        FeldKategorie2_4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        FeldKategorie2_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FeldKategorie2_4.setOpaque(true);
        FeldKategorie2_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeldKategorie2_4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FeldKategorie2_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FeldKategorie2_4MouseExited(evt);
            }
        });
        jPanel20.add(FeldKategorie2_4);
        FeldKategorie2_4.setBounds(860, 510, 200, 70);

        FeldKategorie2_5.setBackground(new java.awt.Color(51, 51, 51));
        FeldKategorie2_5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FeldKategorie2_5.setForeground(new java.awt.Color(255, 255, 255));
        FeldKategorie2_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FeldKategorie2_5.setText("Highlights");
        FeldKategorie2_5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        FeldKategorie2_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FeldKategorie2_5.setOpaque(true);
        FeldKategorie2_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeldKategorie2_5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FeldKategorie2_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FeldKategorie2_5MouseExited(evt);
            }
        });
        jPanel20.add(FeldKategorie2_5);
        FeldKategorie2_5.setBounds(860, 620, 200, 70);

        FeldKategorie2_3.setBackground(new java.awt.Color(51, 51, 51));
        FeldKategorie2_3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FeldKategorie2_3.setForeground(new java.awt.Color(255, 255, 255));
        FeldKategorie2_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FeldKategorie2_3.setText("Highlights");
        FeldKategorie2_3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        FeldKategorie2_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FeldKategorie2_3.setOpaque(true);
        FeldKategorie2_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeldKategorie2_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FeldKategorie2_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FeldKategorie2_3MouseExited(evt);
            }
        });
        jPanel20.add(FeldKategorie2_3);
        FeldKategorie2_3.setBounds(860, 410, 200, 70);

        FeldKategorie1_5.setBackground(new java.awt.Color(51, 51, 51));
        FeldKategorie1_5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FeldKategorie1_5.setForeground(new java.awt.Color(255, 255, 255));
        FeldKategorie1_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FeldKategorie1_5.setText("Highlights");
        FeldKategorie1_5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        FeldKategorie1_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FeldKategorie1_5.setOpaque(true);
        FeldKategorie1_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeldKategorie1_5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FeldKategorie1_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FeldKategorie1_5MouseExited(evt);
            }
        });
        jPanel20.add(FeldKategorie1_5);
        FeldKategorie1_5.setBounds(160, 520, 200, 70);

        jLabel265.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/kisspng-arrow-computer-icons-red-clip-art-red-arrow-5abf82c1bb2560.6797266415225002897666.png"))); // NOI18N
        jPanel20.add(jLabel265);
        jLabel265.setBounds(1100, 610, 120, 70);

        FeldKategorie2_2.setBackground(new java.awt.Color(51, 51, 51));
        FeldKategorie2_2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FeldKategorie2_2.setForeground(new java.awt.Color(255, 255, 255));
        FeldKategorie2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FeldKategorie2_2.setText("Highlights");
        FeldKategorie2_2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        FeldKategorie2_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FeldKategorie2_2.setOpaque(true);
        FeldKategorie2_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeldKategorie2_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FeldKategorie2_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FeldKategorie2_2MouseExited(evt);
            }
        });
        jPanel20.add(FeldKategorie2_2);
        FeldKategorie2_2.setBounds(860, 310, 200, 70);
        jPanel20.add(UmbenennenFeld2);
        UmbenennenFeld2.setBounds(540, 180, 185, 40);

        jLabel263.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/kisspng-arrow-computer-icons-red-clip-art-red-arrow-5abf82c1bb2560.6797266415225002897666.png"))); // NOI18N
        jPanel20.add(jLabel263);
        jLabel263.setBounds(1100, 410, 120, 70);

        jLabel262.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/kisspng-arrow-computer-icons-red-clip-art-red-arrow-5abf82c1bb2560.6797266415225002897666.png"))); // NOI18N
        jPanel20.add(jLabel262);
        jLabel262.setBounds(1100, 310, 120, 70);
        jPanel20.add(UmbenennenFeld8);
        UmbenennenFeld8.setBounds(1245, 180, 185, 40);

        FeldKategorie1_7.setBackground(new java.awt.Color(51, 51, 51));
        FeldKategorie1_7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FeldKategorie1_7.setForeground(new java.awt.Color(255, 255, 255));
        FeldKategorie1_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FeldKategorie1_7.setText("Highlights");
        FeldKategorie1_7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        FeldKategorie1_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FeldKategorie1_7.setOpaque(true);
        FeldKategorie1_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeldKategorie1_7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FeldKategorie1_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FeldKategorie1_7MouseExited(evt);
            }
        });
        jPanel20.add(FeldKategorie1_7);
        FeldKategorie1_7.setBounds(160, 740, 200, 70);

        jLabel266.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/kisspng-arrow-computer-icons-red-clip-art-red-arrow-5abf82c1bb2560.6797266415225002897666.png"))); // NOI18N
        jPanel20.add(jLabel266);
        jLabel266.setBounds(1100, 730, 120, 70);

        jLabel261.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/kisspng-arrow-computer-icons-red-clip-art-red-arrow-5abf82c1bb2560.6797266415225002897666.png"))); // NOI18N
        jPanel20.add(jLabel261);
        jLabel261.setBounds(1100, 200, 120, 70);

        jLabel260.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel260.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel260.setText("Kategorienbezeichnung");
        jPanel20.add(jLabel260);
        jLabel260.setBounds(70, 30, 310, 60);

        FeldKategorie2_1.setBackground(new java.awt.Color(51, 51, 51));
        FeldKategorie2_1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FeldKategorie2_1.setForeground(new java.awt.Color(255, 255, 255));
        FeldKategorie2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FeldKategorie2_1.setText("Highlights");
        FeldKategorie2_1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        FeldKategorie2_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FeldKategorie2_1.setOpaque(true);
        FeldKategorie2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeldKategorie2_1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FeldKategorie2_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FeldKategorie2_1MouseExited(evt);
            }
        });
        jPanel20.add(FeldKategorie2_1);
        FeldKategorie2_1.setBounds(860, 200, 200, 70);
        jPanel20.add(UmbenennenFeld13);
        UmbenennenFeld13.setBounds(1245, 730, 185, 40);

        Senden12.setBackground(new java.awt.Color(255, 153, 0));
        Senden12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Senden12.setText("Umbennen");
        Senden12.setOpaque(true);
        Senden12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Senden12MouseClicked(evt);
            }
        });
        jPanel20.add(Senden12);
        Senden12.setBounds(1248, 450, 180, 40);

        jLabel264.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/kisspng-arrow-computer-icons-red-clip-art-red-arrow-5abf82c1bb2560.6797266415225002897666.png"))); // NOI18N
        jPanel20.add(jLabel264);
        jLabel264.setBounds(1100, 510, 120, 70);

        Senden11.setBackground(new java.awt.Color(255, 153, 0));
        Senden11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Senden11.setText("Umbennen");
        Senden11.setOpaque(true);
        Senden11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Senden11MouseClicked(evt);
            }
        });
        jPanel20.add(Senden11);
        Senden11.setBounds(1248, 350, 180, 40);

        Senden10.setBackground(new java.awt.Color(255, 153, 0));
        Senden10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Senden10.setText("Umbennen");
        Senden10.setOpaque(true);
        Senden10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Senden10MouseClicked(evt);
            }
        });
        jPanel20.add(Senden10);
        Senden10.setBounds(1248, 220, 180, 40);
        jPanel20.add(UmbenennenFeld12);
        UmbenennenFeld12.setBounds(1245, 620, 185, 40);
        jPanel20.add(UmbenennenFeld11);
        UmbenennenFeld11.setBounds(1245, 510, 185, 40);

        jLabel273.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel273.setText("Neue Bezeichnung");
        jPanel20.add(jLabel273);
        jLabel273.setBounds(550, 140, 190, 25);

        jLabel234.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel234.setForeground(new java.awt.Color(153, 51, 255));
        jPanel20.add(jLabel234);
        jLabel234.setBounds(890, 30, 540, 60);

        Senden15.setBackground(new java.awt.Color(255, 153, 0));
        Senden15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Senden15.setText("Umbennen");
        Senden15.setOpaque(true);
        Senden15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Senden15MouseClicked(evt);
            }
        });
        jPanel20.add(Senden15);
        Senden15.setBounds(1248, 770, 180, 40);

        jLabel274.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel274.setText("Aktuelle Bezeichnung:");
        jPanel20.add(jLabel274);
        jLabel274.setBounds(860, 140, 200, 30);

        jLabel250.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/kisspng-arrow-computer-icons-red-clip-art-red-arrow-5abf82c1bb2560.6797266415225002897666.png"))); // NOI18N
        jPanel20.add(jLabel250);
        jLabel250.setBounds(410, 740, 130, 70);

        Senden14.setBackground(new java.awt.Color(255, 153, 0));
        Senden14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Senden14.setText("Umbennen");
        Senden14.setOpaque(true);
        Senden14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Senden14MouseClicked(evt);
            }
        });
        jPanel20.add(Senden14);
        Senden14.setBounds(1248, 660, 180, 40);

        jLabel247.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/kisspng-arrow-computer-icons-red-clip-art-red-arrow-5abf82c1bb2560.6797266415225002897666.png"))); // NOI18N
        jPanel20.add(jLabel247);
        jLabel247.setBounds(410, 420, 120, 70);

        jLabel249.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/kisspng-arrow-computer-icons-red-clip-art-red-arrow-5abf82c1bb2560.6797266415225002897666.png"))); // NOI18N
        jPanel20.add(jLabel249);
        jLabel249.setBounds(410, 520, 130, 70);

        jLabel248.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/kisspng-arrow-computer-icons-red-clip-art-red-arrow-5abf82c1bb2560.6797266415225002897666.png"))); // NOI18N
        jPanel20.add(jLabel248);
        jLabel248.setBounds(410, 320, 160, 70);

        Senden13.setBackground(new java.awt.Color(255, 153, 0));
        Senden13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Senden13.setText("Umbennen");
        Senden13.setOpaque(true);
        Senden13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Senden13MouseClicked(evt);
            }
        });
        jPanel20.add(Senden13);
        Senden13.setBounds(1248, 550, 180, 40);

        jLabel245.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/kisspng-arrow-computer-icons-red-clip-art-red-arrow-5abf82c1bb2560.6797266415225002897666.png"))); // NOI18N
        jPanel20.add(jLabel245);
        jLabel245.setBounds(410, 210, 110, 70);
        jPanel20.add(UmbenennenFeld10);
        UmbenennenFeld10.setBounds(1245, 410, 185, 40);
        jPanel20.add(UmbenennenFeld9);
        UmbenennenFeld9.setBounds(1245, 310, 185, 40);

        FeldKategorie1_6.setBackground(new java.awt.Color(51, 51, 51));
        FeldKategorie1_6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FeldKategorie1_6.setForeground(new java.awt.Color(255, 255, 255));
        FeldKategorie1_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FeldKategorie1_6.setText("Highlights");
        FeldKategorie1_6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        FeldKategorie1_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FeldKategorie1_6.setOpaque(true);
        FeldKategorie1_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeldKategorie1_6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FeldKategorie1_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FeldKategorie1_6MouseExited(evt);
            }
        });
        jPanel20.add(FeldKategorie1_6);
        FeldKategorie1_6.setBounds(160, 630, 200, 70);

        jLabel241.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/v960-ning-11.jpg"))); // NOI18N
        jLabel241.setText("jLabel241");
        jPanel20.add(jLabel241);
        jLabel241.setBounds(80, 30, 1400, 60);

        jLabel242.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel242.setText("Aktuelle Bezeichnung:");
        jPanel20.add(jLabel242);
        jLabel242.setBounds(160, 140, 200, 30);

        FeldKategorie1_4.setBackground(new java.awt.Color(51, 51, 51));
        FeldKategorie1_4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FeldKategorie1_4.setForeground(new java.awt.Color(255, 255, 255));
        FeldKategorie1_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FeldKategorie1_4.setText("Highlights");
        FeldKategorie1_4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        FeldKategorie1_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FeldKategorie1_4.setOpaque(true);
        FeldKategorie1_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeldKategorie1_4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FeldKategorie1_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FeldKategorie1_4MouseExited(evt);
            }
        });
        jPanel20.add(FeldKategorie1_4);
        FeldKategorie1_4.setBounds(160, 410, 200, 70);

        FeldKategorie1_2.setBackground(new java.awt.Color(51, 51, 51));
        FeldKategorie1_2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FeldKategorie1_2.setForeground(new java.awt.Color(255, 255, 255));
        FeldKategorie1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FeldKategorie1_2.setText("Highlights");
        FeldKategorie1_2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        FeldKategorie1_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FeldKategorie1_2.setOpaque(true);
        FeldKategorie1_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeldKategorie1_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FeldKategorie1_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FeldKategorie1_2MouseExited(evt);
            }
        });
        jPanel20.add(FeldKategorie1_2);
        FeldKategorie1_2.setBounds(160, 200, 200, 70);

        FeldKategorie1_3.setBackground(new java.awt.Color(51, 51, 51));
        FeldKategorie1_3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FeldKategorie1_3.setForeground(new java.awt.Color(255, 255, 255));
        FeldKategorie1_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FeldKategorie1_3.setText("Highlights");
        FeldKategorie1_3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        FeldKategorie1_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FeldKategorie1_3.setOpaque(true);
        FeldKategorie1_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeldKategorie1_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FeldKategorie1_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FeldKategorie1_3MouseExited(evt);
            }
        });
        jPanel20.add(FeldKategorie1_3);
        FeldKategorie1_3.setBounds(160, 310, 200, 70);

        jLabel238.setText("Hier können Sie die Kategorien umbennen.");
        jPanel20.add(jLabel238);
        jLabel238.setBounds(100, 100, 270, 30);

        jLabel240.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/v960-ning-30.jpg"))); // NOI18N
        jPanel20.add(jLabel240);
        jLabel240.setBounds(80, 90, 1400, 790);

        Kategorien.add(jPanel20);
        jPanel20.setBounds(0, 0, 1650, 1060);

        ParentArtikelbewirtschaftung.add(Kategorien, "card6");

        Artikelbewirtschaftung.add(ParentArtikelbewirtschaftung);
        ParentArtikelbewirtschaftung.setBounds(0, 110, 1540, 970);

        ParentAdmin.add(Artikelbewirtschaftung, "card2");

        jLabel6.setText("Mitarbeiter");

        javax.swing.GroupLayout MitarbeiterLayout = new javax.swing.GroupLayout(Mitarbeiter);
        Mitarbeiter.setLayout(MitarbeiterLayout);
        MitarbeiterLayout.setHorizontalGroup(
            MitarbeiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MitarbeiterLayout.createSequentialGroup()
                .addGap(425, 425, 425)
                .addComponent(jLabel6)
                .addContainerGap(1057, Short.MAX_VALUE))
        );
        MitarbeiterLayout.setVerticalGroup(
            MitarbeiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MitarbeiterLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel6)
                .addContainerGap(804, Short.MAX_VALUE))
        );

        ParentAdmin.add(Mitarbeiter, "card4");

        ParentKassenlayout.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(238, 238, 238));
        jPanel8.setLayout(null);

        jLabel79.setBackground(new java.awt.Color(102, 102, 102, 80));
        jLabel79.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/169-512_98856.png"))); // NOI18N
        jLabel79.setText("  Kassenlayout");
        jLabel79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel79MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel79MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel79MouseExited(evt);
            }
        });
        jPanel8.add(jLabel79);
        jLabel79.setBounds(60, 10, 350, 50);

        ParentKassenlayout.add(jPanel8);
        jPanel8.setBounds(0, 0, 800, 60);

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));
        jPanel1.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(113, 37, 151));

        Showdata1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Showdata1.setForeground(new java.awt.Color(255, 255, 255));
        Showdata1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1menu.png"))); // NOI18N
        Showdata1.setText("Artikelanordnung");
        Showdata1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Showdata1MouseClicked(evt);
            }
        });

        Showdata2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Showdata2.setForeground(new java.awt.Color(255, 255, 255));
        Showdata2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1menu.png"))); // NOI18N
        Showdata2.setText("Kategorieanordnung");
        Showdata2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Showdata2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(Showdata1)
                .addGap(538, 538, 538)
                .addComponent(Showdata2)
                .addContainerGap(353, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Showdata1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(Showdata2))
        );

        jPanel1.add(jPanel9);
        jPanel9.setBounds(0, 70, 1550, 40);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel13);
        jPanel13.setBounds(0, 100, 1540, 29);

        ParentKassenlayout.add(jPanel1);
        jPanel1.setBounds(0, 0, 1550, 120);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.CardLayout());

        Artikel.setBackground(new java.awt.Color(255, 255, 255));
        Artikel.setLayout(null);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setVerifyInputWhenFocusTarget(false);
        jPanel10.setLayout(null);

        Artikeltabelle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Artikelnummer", "Artikelbezeichnung", "Kategorie", "Verfügbar"
            }
        ));
        Artikeltabelle.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                ArtikeltabelleComponentMoved(evt);
            }
        });
        jScrollPane11.setViewportView(Artikeltabelle);

        jPanel10.add(jScrollPane11);
        jScrollPane11.setBounds(470, 0, 1010, 200);

        ArtikelFeld15.setBackground(new java.awt.Color(204, 204, 204));
        ArtikelFeld15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ArtikelFeld15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ArtikelFeld15.setText("Artikel");
        ArtikelFeld15.setOpaque(true);
        jPanel10.add(ArtikelFeld15);
        ArtikelFeld15.setBounds(1240, 840, 230, 50);

        ArtikelFeld10.setBackground(new java.awt.Color(204, 204, 204));
        ArtikelFeld10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ArtikelFeld10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ArtikelFeld10.setText("Artikel");
        ArtikelFeld10.setOpaque(true);
        jPanel10.add(ArtikelFeld10);
        ArtikelFeld10.setBounds(1240, 600, 230, 50);
        jPanel10.add(jSeparator1);
        jSeparator1.setBounds(0, 210, 1560, 10);

        BezeichnungFeld15.setBackground(new java.awt.Color(156, 167, 119));
        BezeichnungFeld15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BezeichnungFeld15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BezeichnungFeld15.setText("Feld 15");
        BezeichnungFeld15.setOpaque(true);
        jPanel10.add(BezeichnungFeld15);
        BezeichnungFeld15.setBounds(1240, 710, 230, 30);

        BildFeld15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/images.jpeg"))); // NOI18N
        BildFeld15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BildFeld15.setIconTextGap(0);
        BildFeld15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BildFeld15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BildFeld15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BildFeld15MouseExited(evt);
            }
        });
        jPanel10.add(BildFeld15);
        BildFeld15.setBounds(1240, 710, 230, 180);

        BezeichnungFeld10.setBackground(new java.awt.Color(156, 167, 119));
        BezeichnungFeld10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BezeichnungFeld10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BezeichnungFeld10.setText("Feld 10");
        BezeichnungFeld10.setOpaque(true);
        jPanel10.add(BezeichnungFeld10);
        BezeichnungFeld10.setBounds(1240, 470, 230, 30);

        ArtikelFeld05.setBackground(new java.awt.Color(204, 204, 204));
        ArtikelFeld05.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ArtikelFeld05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ArtikelFeld05.setText("Artikel");
        ArtikelFeld05.setOpaque(true);
        jPanel10.add(ArtikelFeld05);
        ArtikelFeld05.setBounds(1240, 360, 230, 50);

        BezeichnungFeld05.setBackground(new java.awt.Color(156, 167, 119));
        BezeichnungFeld05.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BezeichnungFeld05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BezeichnungFeld05.setText("Feld 05");
        BezeichnungFeld05.setOpaque(true);
        jPanel10.add(BezeichnungFeld05);
        BezeichnungFeld05.setBounds(1240, 230, 230, 30);

        Kategorie2_1.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Kategorie2_1.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie2_1.setText("Highlights");
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
        jPanel10.add(Kategorie2_1);
        Kategorie2_1.setBounds(170, 80, 140, 40);

        DefinitionKategorie1_15.setBackground(new java.awt.Color(37, 37, 37));
        DefinitionKategorie1_15.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        DefinitionKategorie1_15.setForeground(new java.awt.Color(255, 255, 255));
        DefinitionKategorie1_15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DefinitionKategorie1_15.setText("Highlights");
        DefinitionKategorie1_15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        DefinitionKategorie1_15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DefinitionKategorie1_15.setOpaque(true);
        DefinitionKategorie1_15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_15MouseExited(evt);
            }
        });
        jPanel10.add(DefinitionKategorie1_15);
        DefinitionKategorie1_15.setBounds(1780, 160, 140, 50);

        Kategorie2_6.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Kategorie2_6.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie2_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie2_6.setText("Highlights");
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
        jPanel10.add(Kategorie2_6);
        Kategorie2_6.setBounds(310, 120, 140, 40);

        Kategorie2_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Kategorie2_4.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie2_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie2_4.setText("Highlights");
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
        jPanel10.add(Kategorie2_4);
        Kategorie2_4.setBounds(310, 40, 140, 40);

        Kategorie1_7.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Kategorie1_7.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie1_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie1_7.setText("Highlights");
        Kategorie1_7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        Kategorie1_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel10.add(Kategorie1_7);
        Kategorie1_7.setBounds(170, 40, 140, 40);

        Kategorie1_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Kategorie1_2.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie1_2.setText("Highlights");
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
        jPanel10.add(Kategorie1_2);
        Kategorie1_2.setBounds(30, 0, 140, 40);

        Kategorie1_6.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Kategorie1_6.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie1_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie1_6.setText("Highlights");
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
        jPanel10.add(Kategorie1_6);
        Kategorie1_6.setBounds(170, 0, 140, 40);

        Kategorie2_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Kategorie2_5.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie2_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie2_5.setText("Highlights");
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
        jPanel10.add(Kategorie2_5);
        Kategorie2_5.setBounds(310, 80, 140, 40);

        Kategorie1_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Kategorie1_4.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie1_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie1_4.setText("Highlights");
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
        jPanel10.add(Kategorie1_4);
        Kategorie1_4.setBounds(30, 80, 140, 40);

        Kategorie1_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Kategorie1_5.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie1_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie1_5.setText("Highlights");
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
        jPanel10.add(Kategorie1_5);
        Kategorie1_5.setBounds(30, 120, 140, 40);

        Kategorie1_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Kategorie1_3.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie1_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie1_3.setText("Highlights");
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
        jPanel10.add(Kategorie1_3);
        Kategorie1_3.setBounds(30, 40, 140, 40);

        Kategorie2_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Kategorie2_2.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie2_2.setText("Highlights");
        Kategorie2_2.setAutoscrolls(true);
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
        jPanel10.add(Kategorie2_2);
        Kategorie2_2.setBounds(170, 120, 140, 40);

        Kategorie2_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Kategorie2_3.setForeground(new java.awt.Color(255, 255, 255));
        Kategorie2_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kategorie2_3.setText("Highlights");
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
        jPanel10.add(Kategorie2_3);
        Kategorie2_3.setBounds(310, 0, 140, 40);

        ArtikelFeld08.setBackground(new java.awt.Color(204, 204, 204));
        ArtikelFeld08.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ArtikelFeld08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ArtikelFeld08.setText("Artikel");
        ArtikelFeld08.setOpaque(true);
        jPanel10.add(ArtikelFeld08);
        ArtikelFeld08.setBounds(640, 600, 230, 50);

        BezeichnungFeld02.setBackground(new java.awt.Color(156, 167, 119));
        BezeichnungFeld02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BezeichnungFeld02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BezeichnungFeld02.setText("Feld 02");
        BezeichnungFeld02.setOpaque(true);
        jPanel10.add(BezeichnungFeld02);
        BezeichnungFeld02.setBounds(340, 230, 230, 30);

        BezeichnungFeld04.setBackground(new java.awt.Color(156, 167, 119));
        BezeichnungFeld04.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BezeichnungFeld04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BezeichnungFeld04.setText("Feld 04");
        BezeichnungFeld04.setOpaque(true);
        jPanel10.add(BezeichnungFeld04);
        BezeichnungFeld04.setBounds(940, 230, 230, 30);

        jLabel89.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("Automatische Anordnung");
        jPanel10.add(jLabel89);
        jLabel89.setBounds(1200, 30, 310, 50);

        BildFeld05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/images.jpeg"))); // NOI18N
        BildFeld05.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BildFeld05.setIconTextGap(0);
        BildFeld05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BildFeld05MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BildFeld05MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BildFeld05MouseExited(evt);
            }
        });
        jPanel10.add(BildFeld05);
        BildFeld05.setBounds(1240, 230, 230, 180);

        BezeichnungFeld01.setBackground(new java.awt.Color(156, 167, 119));
        BezeichnungFeld01.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BezeichnungFeld01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BezeichnungFeld01.setText("Feld 01");
        BezeichnungFeld01.setOpaque(true);
        jPanel10.add(BezeichnungFeld01);
        BezeichnungFeld01.setBounds(40, 230, 230, 30);

        BildFeld10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/images.jpeg"))); // NOI18N
        BildFeld10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BildFeld10.setIconTextGap(0);
        BildFeld10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BildFeld10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BildFeld10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BildFeld10MouseExited(evt);
            }
        });
        jPanel10.add(BildFeld10);
        BildFeld10.setBounds(1240, 470, 230, 180);

        ArtikelFeld14.setBackground(new java.awt.Color(204, 204, 204));
        ArtikelFeld14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ArtikelFeld14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ArtikelFeld14.setText("Artikel");
        ArtikelFeld14.setOpaque(true);
        jPanel10.add(ArtikelFeld14);
        ArtikelFeld14.setBounds(940, 840, 230, 50);

        ArtikelFeld01.setBackground(new java.awt.Color(204, 204, 204));
        ArtikelFeld01.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ArtikelFeld01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ArtikelFeld01.setText("Artikel");
        ArtikelFeld01.setOpaque(true);
        jPanel10.add(ArtikelFeld01);
        ArtikelFeld01.setBounds(40, 360, 230, 50);

        BezeichnungFeld07.setBackground(new java.awt.Color(156, 167, 119));
        BezeichnungFeld07.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BezeichnungFeld07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BezeichnungFeld07.setText("Feld 07");
        BezeichnungFeld07.setOpaque(true);
        jPanel10.add(BezeichnungFeld07);
        BezeichnungFeld07.setBounds(340, 470, 230, 30);

        ArtikelFeld06.setBackground(new java.awt.Color(204, 204, 204));
        ArtikelFeld06.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ArtikelFeld06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ArtikelFeld06.setText("Artikel");
        ArtikelFeld06.setOpaque(true);
        jPanel10.add(ArtikelFeld06);
        ArtikelFeld06.setBounds(40, 600, 230, 50);

        BezeichnungFeld03.setBackground(new java.awt.Color(156, 167, 119));
        BezeichnungFeld03.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BezeichnungFeld03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BezeichnungFeld03.setText("Feld 03");
        BezeichnungFeld03.setOpaque(true);
        jPanel10.add(BezeichnungFeld03);
        BezeichnungFeld03.setBounds(640, 230, 230, 30);

        ArtikelFeld04.setBackground(new java.awt.Color(204, 204, 204));
        ArtikelFeld04.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ArtikelFeld04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ArtikelFeld04.setText("Artikel");
        ArtikelFeld04.setOpaque(true);
        jPanel10.add(ArtikelFeld04);
        ArtikelFeld04.setBounds(940, 360, 230, 50);

        BezeichnungFeld09.setBackground(new java.awt.Color(156, 167, 119));
        BezeichnungFeld09.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BezeichnungFeld09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BezeichnungFeld09.setText("Feld 09");
        BezeichnungFeld09.setOpaque(true);
        jPanel10.add(BezeichnungFeld09);
        BezeichnungFeld09.setBounds(940, 470, 230, 30);

        ArtikelFeld03.setBackground(new java.awt.Color(204, 204, 204));
        ArtikelFeld03.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ArtikelFeld03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ArtikelFeld03.setText("Artikel");
        ArtikelFeld03.setOpaque(true);
        jPanel10.add(ArtikelFeld03);
        ArtikelFeld03.setBounds(640, 360, 230, 50);

        BezeichnungFeld14.setBackground(new java.awt.Color(156, 167, 119));
        BezeichnungFeld14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BezeichnungFeld14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BezeichnungFeld14.setText("Feld 14");
        BezeichnungFeld14.setOpaque(true);
        jPanel10.add(BezeichnungFeld14);
        BezeichnungFeld14.setBounds(940, 710, 230, 30);

        ArtikelFeld02.setBackground(new java.awt.Color(204, 204, 204));
        ArtikelFeld02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ArtikelFeld02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ArtikelFeld02.setText("Artikel");
        ArtikelFeld02.setOpaque(true);
        jPanel10.add(ArtikelFeld02);
        ArtikelFeld02.setBounds(340, 360, 230, 50);

        BezeichnungFeld11.setBackground(new java.awt.Color(156, 167, 119));
        BezeichnungFeld11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BezeichnungFeld11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BezeichnungFeld11.setText("Feld 11");
        BezeichnungFeld11.setOpaque(true);
        jPanel10.add(BezeichnungFeld11);
        BezeichnungFeld11.setBounds(40, 710, 230, 30);

        ArtikelFeld09.setBackground(new java.awt.Color(204, 204, 204));
        ArtikelFeld09.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ArtikelFeld09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ArtikelFeld09.setText("Artikel");
        ArtikelFeld09.setOpaque(true);
        jPanel10.add(ArtikelFeld09);
        ArtikelFeld09.setBounds(940, 600, 230, 50);

        ArtikelFeld11.setBackground(new java.awt.Color(204, 204, 204));
        ArtikelFeld11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ArtikelFeld11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ArtikelFeld11.setText("Artikel");
        ArtikelFeld11.setOpaque(true);
        jPanel10.add(ArtikelFeld11);
        ArtikelFeld11.setBounds(40, 840, 230, 50);

        BezeichnungFeld13.setBackground(new java.awt.Color(156, 167, 119));
        BezeichnungFeld13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BezeichnungFeld13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BezeichnungFeld13.setText("Feld 13");
        BezeichnungFeld13.setOpaque(true);
        jPanel10.add(BezeichnungFeld13);
        BezeichnungFeld13.setBounds(640, 710, 230, 30);

        LeerenFeld11.setBackground(new java.awt.Color(153, 153, 153));
        LeerenFeld11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1trash.png"))); // NOI18N
        LeerenFeld11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeerenFeld11MouseClicked(evt);
            }
        });
        LeerenFeld11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerenFeld11ActionPerformed(evt);
            }
        });
        jPanel10.add(LeerenFeld11);
        LeerenFeld11.setBounds(190, 900, 40, 30);

        ArtikelFeld12.setBackground(new java.awt.Color(204, 204, 204));
        ArtikelFeld12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ArtikelFeld12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ArtikelFeld12.setText("Artikel");
        ArtikelFeld12.setOpaque(true);
        jPanel10.add(ArtikelFeld12);
        ArtikelFeld12.setBounds(340, 840, 230, 50);

        Image13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/images.jpeg"))); // NOI18N
        Image13.setText("jLabel24");
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
        jPanel10.add(Image13);
        Image13.setBounds(1240, 470, 230, 180);

        BildFeld01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/images.jpeg"))); // NOI18N
        BildFeld01.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BildFeld01.setIconTextGap(0);
        BildFeld01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BildFeld01MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BildFeld01MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BildFeld01MouseExited(evt);
            }
        });
        jPanel10.add(BildFeld01);
        BildFeld01.setBounds(40, 230, 230, 180);

        BildFeld02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/images.jpeg"))); // NOI18N
        BildFeld02.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BildFeld02.setIconTextGap(0);
        BildFeld02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BildFeld02MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BildFeld02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BildFeld02MouseExited(evt);
            }
        });
        jPanel10.add(BildFeld02);
        BildFeld02.setBounds(340, 230, 230, 180);

        BildFeld03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/images.jpeg"))); // NOI18N
        BildFeld03.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BildFeld03.setIconTextGap(0);
        BildFeld03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BildFeld03MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BildFeld03MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BildFeld03MouseExited(evt);
            }
        });
        jPanel10.add(BildFeld03);
        BildFeld03.setBounds(640, 230, 230, 180);

        BildFeld04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/images.jpeg"))); // NOI18N
        BildFeld04.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BildFeld04.setIconTextGap(0);
        BildFeld04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BildFeld04MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BildFeld04MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BildFeld04MouseExited(evt);
            }
        });
        jPanel10.add(BildFeld04);
        BildFeld04.setBounds(940, 230, 230, 180);

        BezeichnungFeld08.setBackground(new java.awt.Color(156, 167, 119));
        BezeichnungFeld08.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BezeichnungFeld08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BezeichnungFeld08.setText("Feld 08");
        BezeichnungFeld08.setOpaque(true);
        jPanel10.add(BezeichnungFeld08);
        BezeichnungFeld08.setBounds(640, 470, 230, 30);

        BezeichnungFeld12.setBackground(new java.awt.Color(156, 167, 119));
        BezeichnungFeld12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BezeichnungFeld12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BezeichnungFeld12.setText("Feld 12");
        BezeichnungFeld12.setOpaque(true);
        jPanel10.add(BezeichnungFeld12);
        BezeichnungFeld12.setBounds(340, 710, 230, 30);

        ArtikelFeld07.setBackground(new java.awt.Color(204, 204, 204));
        ArtikelFeld07.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ArtikelFeld07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ArtikelFeld07.setText("Artikel");
        ArtikelFeld07.setOpaque(true);
        jPanel10.add(ArtikelFeld07);
        ArtikelFeld07.setBounds(340, 600, 230, 50);

        BezeichnungFeld06.setBackground(new java.awt.Color(156, 167, 119));
        BezeichnungFeld06.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BezeichnungFeld06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BezeichnungFeld06.setText("Feld 06");
        BezeichnungFeld06.setOpaque(true);
        jPanel10.add(BezeichnungFeld06);
        BezeichnungFeld06.setBounds(40, 470, 230, 30);
        jPanel10.add(TextfeldFeld11);
        TextfeldFeld11.setBounds(120, 900, 70, 30);

        jLabel136.setText("Artikelnummer");
        jPanel10.add(jLabel136);
        jLabel136.setBounds(1240, 900, 90, 30);

        BildFeld06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/images.jpeg"))); // NOI18N
        BildFeld06.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BildFeld06.setIconTextGap(0);
        BildFeld06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BildFeld06MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BildFeld06MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BildFeld06MouseExited(evt);
            }
        });
        jPanel10.add(BildFeld06);
        BildFeld06.setBounds(40, 470, 230, 180);

        BildFeld07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/images.jpeg"))); // NOI18N
        BildFeld07.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BildFeld07.setIconTextGap(0);
        BildFeld07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BildFeld07MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BildFeld07MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BildFeld07MouseExited(evt);
            }
        });
        jPanel10.add(BildFeld07);
        BildFeld07.setBounds(340, 470, 230, 180);

        BildFeld08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/images.jpeg"))); // NOI18N
        BildFeld08.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BildFeld08.setIconTextGap(0);
        BildFeld08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BildFeld08MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BildFeld08MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BildFeld08MouseExited(evt);
            }
        });
        jPanel10.add(BildFeld08);
        BildFeld08.setBounds(640, 470, 230, 180);

        BildFeld09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/images.jpeg"))); // NOI18N
        BildFeld09.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BildFeld09.setIconTextGap(0);
        BildFeld09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BildFeld09MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BildFeld09MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BildFeld09MouseExited(evt);
            }
        });
        jPanel10.add(BildFeld09);
        BildFeld09.setBounds(940, 470, 230, 180);

        ArtikelFeld13.setBackground(new java.awt.Color(204, 204, 204));
        ArtikelFeld13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ArtikelFeld13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ArtikelFeld13.setText("Artikel");
        ArtikelFeld13.setOpaque(true);
        jPanel10.add(ArtikelFeld13);
        ArtikelFeld13.setBounds(640, 840, 230, 50);

        BildFeld11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/images.jpeg"))); // NOI18N
        BildFeld11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BildFeld11.setIconTextGap(0);
        BildFeld11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BildFeld11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BildFeld11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BildFeld11MouseExited(evt);
            }
        });
        jPanel10.add(BildFeld11);
        BildFeld11.setBounds(40, 710, 230, 180);

        BildFeld12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/images.jpeg"))); // NOI18N
        BildFeld12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BildFeld12.setIconTextGap(0);
        BildFeld12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BildFeld12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BildFeld12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BildFeld12MouseExited(evt);
            }
        });
        jPanel10.add(BildFeld12);
        BildFeld12.setBounds(340, 710, 230, 180);

        BildFeld13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/images.jpeg"))); // NOI18N
        BildFeld13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BildFeld13.setIconTextGap(0);
        BildFeld13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BildFeld13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BildFeld13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BildFeld13MouseExited(evt);
            }
        });
        jPanel10.add(BildFeld13);
        BildFeld13.setBounds(640, 710, 230, 180);

        BildFeld14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/images.jpeg"))); // NOI18N
        BildFeld14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BildFeld14.setIconTextGap(0);
        BildFeld14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BildFeld14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BildFeld14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BildFeld14MouseExited(evt);
            }
        });
        jPanel10.add(BildFeld14);
        BildFeld14.setBounds(940, 710, 230, 180);

        jLabel165.setText("Artikelnummer");
        jPanel10.add(jLabel165);
        jLabel165.setBounds(940, 900, 90, 30);

        AndernFeld15.setBackground(new java.awt.Color(64, 81, 59));
        AndernFeld15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1save.png"))); // NOI18N
        AndernFeld15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AndernFeld15MouseClicked(evt);
            }
        });
        jPanel10.add(AndernFeld15);
        AndernFeld15.setBounds(1430, 900, 40, 30);

        jLabel137.setText("Artikelnummer");
        jPanel10.add(jLabel137);
        jLabel137.setBounds(40, 420, 90, 30);

        jLabel138.setText("Artikelnummer");
        jPanel10.add(jLabel138);
        jLabel138.setBounds(340, 420, 90, 30);

        jLabel139.setText("Artikelnummer");
        jPanel10.add(jLabel139);
        jLabel139.setBounds(640, 420, 90, 30);

        jLabel144.setText("Artikelnummer");
        jPanel10.add(jLabel144);
        jLabel144.setBounds(940, 420, 90, 30);

        jLabel156.setText("Artikelnummer");
        jPanel10.add(jLabel156);
        jLabel156.setBounds(1240, 420, 90, 30);

        jLabel157.setText("Artikelnummer");
        jPanel10.add(jLabel157);
        jLabel157.setBounds(1240, 660, 90, 30);

        jLabel158.setText("Artikelnummer");
        jPanel10.add(jLabel158);
        jLabel158.setBounds(940, 660, 90, 30);

        jLabel159.setText("Artikelnummer");
        jPanel10.add(jLabel159);
        jLabel159.setBounds(640, 660, 90, 30);

        jLabel160.setText("Artikelnummer");
        jPanel10.add(jLabel160);
        jLabel160.setBounds(340, 660, 90, 30);

        jLabel161.setText("Artikelnummer");
        jPanel10.add(jLabel161);
        jLabel161.setBounds(40, 660, 90, 30);

        jLabel162.setText("Artikelnummer");
        jPanel10.add(jLabel162);
        jLabel162.setBounds(40, 900, 90, 30);

        jLabel163.setText("Artikelnummer");
        jPanel10.add(jLabel163);
        jLabel163.setBounds(340, 900, 90, 30);

        jLabel164.setText("Artikelnummer");
        jPanel10.add(jLabel164);
        jLabel164.setBounds(640, 900, 90, 30);
        jPanel10.add(TextfeldFeld01);
        TextfeldFeld01.setBounds(120, 420, 70, 30);

        TextfeldFeld02.setVerifyInputWhenFocusTarget(false);
        jPanel10.add(TextfeldFeld02);
        TextfeldFeld02.setBounds(420, 420, 70, 30);
        jPanel10.add(TextfeldFeld03);
        TextfeldFeld03.setBounds(720, 420, 70, 30);
        jPanel10.add(TextfeldFeld04);
        TextfeldFeld04.setBounds(1020, 420, 70, 30);
        jPanel10.add(TextfeldFeld05);
        TextfeldFeld05.setBounds(1320, 420, 70, 30);
        jPanel10.add(TextfeldFeld10);
        TextfeldFeld10.setBounds(1320, 660, 70, 30);
        jPanel10.add(TextfeldFeld09);
        TextfeldFeld09.setBounds(1020, 660, 70, 30);
        jPanel10.add(TextfeldFeld15);
        TextfeldFeld15.setBounds(1320, 900, 70, 30);
        jPanel10.add(TextfeldFeld14);
        TextfeldFeld14.setBounds(1020, 900, 70, 30);
        jPanel10.add(TextfeldFeld08);
        TextfeldFeld08.setBounds(720, 660, 70, 30);
        jPanel10.add(TextfeldFeld13);
        TextfeldFeld13.setBounds(720, 900, 70, 30);
        jPanel10.add(TextfeldFeld12);
        TextfeldFeld12.setBounds(420, 900, 70, 30);
        jPanel10.add(TextfeldFeld07);
        TextfeldFeld07.setBounds(420, 660, 70, 30);
        jPanel10.add(TextfeldFeld06);
        TextfeldFeld06.setBounds(120, 660, 70, 30);

        LeerenFeld01.setBackground(new java.awt.Color(153, 153, 153));
        LeerenFeld01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1trash.png"))); // NOI18N
        LeerenFeld01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeerenFeld01MouseClicked(evt);
            }
        });
        LeerenFeld01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerenFeld01ActionPerformed(evt);
            }
        });
        jPanel10.add(LeerenFeld01);
        LeerenFeld01.setBounds(190, 420, 40, 30);

        LeerenFeld02.setBackground(new java.awt.Color(153, 153, 153));
        LeerenFeld02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1trash.png"))); // NOI18N
        LeerenFeld02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeerenFeld02MouseClicked(evt);
            }
        });
        LeerenFeld02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerenFeld02ActionPerformed(evt);
            }
        });
        jPanel10.add(LeerenFeld02);
        LeerenFeld02.setBounds(490, 420, 40, 30);

        LeerenFeld03.setBackground(new java.awt.Color(153, 153, 153));
        LeerenFeld03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1trash.png"))); // NOI18N
        LeerenFeld03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeerenFeld03MouseClicked(evt);
            }
        });
        LeerenFeld03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerenFeld03ActionPerformed(evt);
            }
        });
        jPanel10.add(LeerenFeld03);
        LeerenFeld03.setBounds(790, 420, 40, 30);

        LeerenFeld04.setBackground(new java.awt.Color(153, 153, 153));
        LeerenFeld04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1trash.png"))); // NOI18N
        LeerenFeld04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeerenFeld04MouseClicked(evt);
            }
        });
        LeerenFeld04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerenFeld04ActionPerformed(evt);
            }
        });
        jPanel10.add(LeerenFeld04);
        LeerenFeld04.setBounds(1090, 420, 40, 30);

        LeerenFeld05.setBackground(new java.awt.Color(153, 153, 153));
        LeerenFeld05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1trash.png"))); // NOI18N
        LeerenFeld05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeerenFeld05MouseClicked(evt);
            }
        });
        LeerenFeld05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerenFeld05ActionPerformed(evt);
            }
        });
        jPanel10.add(LeerenFeld05);
        LeerenFeld05.setBounds(1390, 420, 40, 30);

        LeerenFeld10.setBackground(new java.awt.Color(153, 153, 153));
        LeerenFeld10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1trash.png"))); // NOI18N
        LeerenFeld10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeerenFeld10MouseClicked(evt);
            }
        });
        LeerenFeld10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerenFeld10ActionPerformed(evt);
            }
        });
        jPanel10.add(LeerenFeld10);
        LeerenFeld10.setBounds(1390, 660, 40, 30);

        LeerenFeld09.setBackground(new java.awt.Color(153, 153, 153));
        LeerenFeld09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1trash.png"))); // NOI18N
        LeerenFeld09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeerenFeld09MouseClicked(evt);
            }
        });
        LeerenFeld09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerenFeld09ActionPerformed(evt);
            }
        });
        jPanel10.add(LeerenFeld09);
        LeerenFeld09.setBounds(1090, 660, 40, 30);

        LeerenFeld15.setBackground(new java.awt.Color(153, 153, 153));
        LeerenFeld15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1trash.png"))); // NOI18N
        LeerenFeld15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeerenFeld15MouseClicked(evt);
            }
        });
        LeerenFeld15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerenFeld15ActionPerformed(evt);
            }
        });
        jPanel10.add(LeerenFeld15);
        LeerenFeld15.setBounds(1390, 900, 40, 30);

        LeerenFeld14.setBackground(new java.awt.Color(153, 153, 153));
        LeerenFeld14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1trash.png"))); // NOI18N
        LeerenFeld14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeerenFeld14MouseClicked(evt);
            }
        });
        LeerenFeld14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerenFeld14ActionPerformed(evt);
            }
        });
        jPanel10.add(LeerenFeld14);
        LeerenFeld14.setBounds(1090, 900, 40, 30);

        LeerenFeld13.setBackground(new java.awt.Color(153, 153, 153));
        LeerenFeld13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1trash.png"))); // NOI18N
        LeerenFeld13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeerenFeld13MouseClicked(evt);
            }
        });
        LeerenFeld13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerenFeld13ActionPerformed(evt);
            }
        });
        jPanel10.add(LeerenFeld13);
        LeerenFeld13.setBounds(790, 900, 40, 30);

        LeerenFeld08.setBackground(new java.awt.Color(153, 153, 153));
        LeerenFeld08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1trash.png"))); // NOI18N
        LeerenFeld08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeerenFeld08MouseClicked(evt);
            }
        });
        LeerenFeld08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerenFeld08ActionPerformed(evt);
            }
        });
        jPanel10.add(LeerenFeld08);
        LeerenFeld08.setBounds(790, 660, 40, 30);

        LeerenFeld07.setBackground(new java.awt.Color(153, 153, 153));
        LeerenFeld07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1trash.png"))); // NOI18N
        LeerenFeld07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeerenFeld07MouseClicked(evt);
            }
        });
        LeerenFeld07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerenFeld07ActionPerformed(evt);
            }
        });
        jPanel10.add(LeerenFeld07);
        LeerenFeld07.setBounds(490, 660, 40, 30);

        LeerenFeld12.setBackground(new java.awt.Color(153, 153, 153));
        LeerenFeld12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1trash.png"))); // NOI18N
        LeerenFeld12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeerenFeld12MouseClicked(evt);
            }
        });
        LeerenFeld12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerenFeld12ActionPerformed(evt);
            }
        });
        jPanel10.add(LeerenFeld12);
        LeerenFeld12.setBounds(490, 900, 40, 30);

        LeerenFeld06.setBackground(new java.awt.Color(153, 153, 153));
        LeerenFeld06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1trash.png"))); // NOI18N
        LeerenFeld06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeerenFeld06MouseClicked(evt);
            }
        });
        LeerenFeld06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerenFeld06ActionPerformed(evt);
            }
        });
        jPanel10.add(LeerenFeld06);
        LeerenFeld06.setBounds(190, 660, 40, 30);

        AndernFeld01.setBackground(new java.awt.Color(64, 81, 59));
        AndernFeld01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1save.png"))); // NOI18N
        AndernFeld01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AndernFeld01MouseClicked(evt);
            }
        });
        AndernFeld01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AndernFeld01ActionPerformed(evt);
            }
        });
        jPanel10.add(AndernFeld01);
        AndernFeld01.setBounds(230, 420, 40, 30);

        AndernFeld06.setBackground(new java.awt.Color(64, 81, 59));
        AndernFeld06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1save.png"))); // NOI18N
        AndernFeld06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AndernFeld06MouseClicked(evt);
            }
        });
        jPanel10.add(AndernFeld06);
        AndernFeld06.setBounds(230, 660, 40, 30);

        AndernFeld11.setBackground(new java.awt.Color(64, 81, 59));
        AndernFeld11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1save.png"))); // NOI18N
        AndernFeld11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AndernFeld11MouseClicked(evt);
            }
        });
        jPanel10.add(AndernFeld11);
        AndernFeld11.setBounds(230, 900, 40, 30);

        AndernFeld02.setBackground(new java.awt.Color(64, 81, 59));
        AndernFeld02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1save.png"))); // NOI18N
        AndernFeld02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AndernFeld02MouseClicked(evt);
            }
        });
        jPanel10.add(AndernFeld02);
        AndernFeld02.setBounds(530, 420, 40, 30);

        AndernFeld07.setBackground(new java.awt.Color(64, 81, 59));
        AndernFeld07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1save.png"))); // NOI18N
        AndernFeld07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AndernFeld07MouseClicked(evt);
            }
        });
        jPanel10.add(AndernFeld07);
        AndernFeld07.setBounds(530, 660, 40, 30);

        AndernFeld12.setBackground(new java.awt.Color(64, 81, 59));
        AndernFeld12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1save.png"))); // NOI18N
        AndernFeld12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AndernFeld12MouseClicked(evt);
            }
        });
        jPanel10.add(AndernFeld12);
        AndernFeld12.setBounds(530, 900, 40, 30);

        AndernFeld03.setBackground(new java.awt.Color(64, 81, 59));
        AndernFeld03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1save.png"))); // NOI18N
        AndernFeld03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AndernFeld03MouseClicked(evt);
            }
        });
        jPanel10.add(AndernFeld03);
        AndernFeld03.setBounds(830, 420, 40, 30);

        AndernFeld08.setBackground(new java.awt.Color(64, 81, 59));
        AndernFeld08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1save.png"))); // NOI18N
        AndernFeld08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AndernFeld08MouseClicked(evt);
            }
        });
        jPanel10.add(AndernFeld08);
        AndernFeld08.setBounds(830, 660, 40, 30);

        AndernFeld13.setBackground(new java.awt.Color(64, 81, 59));
        AndernFeld13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1save.png"))); // NOI18N
        AndernFeld13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AndernFeld13MouseClicked(evt);
            }
        });
        jPanel10.add(AndernFeld13);
        AndernFeld13.setBounds(830, 900, 40, 30);

        AndernFeld14.setBackground(new java.awt.Color(64, 81, 59));
        AndernFeld14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1save.png"))); // NOI18N
        AndernFeld14.setAutoscrolls(true);
        AndernFeld14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AndernFeld14MouseClicked(evt);
            }
        });
        jPanel10.add(AndernFeld14);
        AndernFeld14.setBounds(1130, 900, 40, 30);

        AndernFeld09.setBackground(new java.awt.Color(64, 81, 59));
        AndernFeld09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1save.png"))); // NOI18N
        AndernFeld09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AndernFeld09MouseClicked(evt);
            }
        });
        jPanel10.add(AndernFeld09);
        AndernFeld09.setBounds(1130, 660, 40, 30);

        AndernFeld04.setBackground(new java.awt.Color(64, 81, 59));
        AndernFeld04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1save.png"))); // NOI18N
        AndernFeld04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AndernFeld04MouseClicked(evt);
            }
        });
        jPanel10.add(AndernFeld04);
        AndernFeld04.setBounds(1130, 420, 40, 30);

        AndernFeld05.setBackground(new java.awt.Color(64, 81, 59));
        AndernFeld05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1save.png"))); // NOI18N
        AndernFeld05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AndernFeld05MouseClicked(evt);
            }
        });
        jPanel10.add(AndernFeld05);
        AndernFeld05.setBounds(1430, 420, 40, 30);

        AndernFeld10.setBackground(new java.awt.Color(64, 81, 59));
        AndernFeld10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1save.png"))); // NOI18N
        AndernFeld10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AndernFeld10MouseClicked(evt);
            }
        });
        jPanel10.add(AndernFeld10);
        AndernFeld10.setBounds(1430, 660, 40, 30);

        Artikel.add(jPanel10);
        jPanel10.setBounds(0, 0, 1580, 980);

        jPanel7.add(Artikel, "card2");

        Kategorie.setLayout(new java.awt.CardLayout());

        Startkassenlayout.setBackground(new java.awt.Color(255, 255, 255));
        Startkassenlayout.setLayout(null);

        jPanel11.setBackground(new java.awt.Color(218, 226, 182));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 2));
        jPanel11.setLayout(null);

        jLabel113.setBackground(new java.awt.Color(45, 3, 59));
        jLabel113.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel113.setText("Reihe 2");
        jLabel113.setOpaque(true);
        jPanel11.add(jLabel113);
        jLabel113.setBounds(30, 390, 90, 250);

        jLabel115.setBackground(new java.awt.Color(255, 255, 255));
        jLabel115.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setText("Spalte 1");
        jLabel115.setOpaque(true);
        jPanel11.add(jLabel115);
        jLabel115.setBounds(130, 390, 160, 40);

        DefinitionKategorie1_2.setBackground(new java.awt.Color(37, 37, 37));
        DefinitionKategorie1_2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        DefinitionKategorie1_2.setForeground(new java.awt.Color(255, 255, 255));
        DefinitionKategorie1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DefinitionKategorie1_2.setText("Highlights");
        DefinitionKategorie1_2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        DefinitionKategorie1_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DefinitionKategorie1_2.setOpaque(true);
        DefinitionKategorie1_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_2MouseExited(evt);
            }
        });
        jPanel11.add(DefinitionKategorie1_2);
        DefinitionKategorie1_2.setBounds(130, 110, 160, 80);

        jLabel117.setBackground(new java.awt.Color(255, 255, 255));
        jLabel117.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel117.setText("Spalte 2");
        jLabel117.setOpaque(true);
        jPanel11.add(jLabel117);
        jLabel117.setBounds(310, 390, 160, 40);

        DefinitionKategorie1_3.setBackground(new java.awt.Color(37, 37, 37));
        DefinitionKategorie1_3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        DefinitionKategorie1_3.setForeground(new java.awt.Color(255, 255, 255));
        DefinitionKategorie1_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DefinitionKategorie1_3.setText("Highlights");
        DefinitionKategorie1_3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        DefinitionKategorie1_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DefinitionKategorie1_3.setOpaque(true);
        DefinitionKategorie1_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_3MouseExited(evt);
            }
        });
        jPanel11.add(DefinitionKategorie1_3);
        DefinitionKategorie1_3.setBounds(310, 110, 160, 80);

        jLabel114.setBackground(new java.awt.Color(255, 255, 255));
        jLabel114.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel114.setText("Spalte 3");
        jLabel114.setOpaque(true);
        jPanel11.add(jLabel114);
        jLabel114.setBounds(500, 390, 160, 40);

        DefinitionKategorie1_4.setBackground(new java.awt.Color(37, 37, 37));
        DefinitionKategorie1_4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        DefinitionKategorie1_4.setForeground(new java.awt.Color(255, 255, 255));
        DefinitionKategorie1_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DefinitionKategorie1_4.setText("Highlights");
        DefinitionKategorie1_4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        DefinitionKategorie1_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DefinitionKategorie1_4.setOpaque(true);
        DefinitionKategorie1_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_4MouseExited(evt);
            }
        });
        jPanel11.add(DefinitionKategorie1_4);
        DefinitionKategorie1_4.setBounds(500, 110, 160, 80);

        jLabel116.setBackground(new java.awt.Color(255, 255, 255));
        jLabel116.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel116.setText("Spalte 4");
        jLabel116.setOpaque(true);
        jPanel11.add(jLabel116);
        jLabel116.setBounds(690, 390, 160, 40);

        DefinitionKategorie1_5.setBackground(new java.awt.Color(37, 37, 37));
        DefinitionKategorie1_5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        DefinitionKategorie1_5.setForeground(new java.awt.Color(255, 255, 255));
        DefinitionKategorie1_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DefinitionKategorie1_5.setText("Highlights");
        DefinitionKategorie1_5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        DefinitionKategorie1_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DefinitionKategorie1_5.setOpaque(true);
        DefinitionKategorie1_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_5MouseExited(evt);
            }
        });
        jPanel11.add(DefinitionKategorie1_5);
        DefinitionKategorie1_5.setBounds(690, 110, 160, 80);

        jLabel125.setBackground(new java.awt.Color(255, 255, 255));
        jLabel125.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel125.setText("Spalte 5");
        jLabel125.setOpaque(true);
        jPanel11.add(jLabel125);
        jLabel125.setBounds(880, 390, 160, 40);

        DefinitionKategorie1_6.setBackground(new java.awt.Color(37, 37, 37));
        DefinitionKategorie1_6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        DefinitionKategorie1_6.setForeground(new java.awt.Color(255, 255, 255));
        DefinitionKategorie1_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DefinitionKategorie1_6.setText("Highlights");
        DefinitionKategorie1_6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        DefinitionKategorie1_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DefinitionKategorie1_6.setOpaque(true);
        DefinitionKategorie1_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_6MouseExited(evt);
            }
        });
        jPanel11.add(DefinitionKategorie1_6);
        DefinitionKategorie1_6.setBounds(880, 110, 160, 80);

        jLabel126.setBackground(new java.awt.Color(255, 255, 255));
        jLabel126.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel126.setText("Spalte 6");
        jLabel126.setOpaque(true);
        jPanel11.add(jLabel126);
        jLabel126.setBounds(1070, 390, 160, 40);

        DefinitionKategorie1_7.setBackground(new java.awt.Color(37, 37, 37));
        DefinitionKategorie1_7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        DefinitionKategorie1_7.setForeground(new java.awt.Color(255, 255, 255));
        DefinitionKategorie1_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DefinitionKategorie1_7.setText("Highlights");
        DefinitionKategorie1_7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        DefinitionKategorie1_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DefinitionKategorie1_7.setOpaque(true);
        DefinitionKategorie1_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DefinitionKategorie1_7MouseExited(evt);
            }
        });
        jPanel11.add(DefinitionKategorie1_7);
        DefinitionKategorie1_7.setBounds(1070, 110, 160, 80);

        jLabel127.setBackground(new java.awt.Color(45, 3, 59));
        jLabel127.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(255, 255, 255));
        jLabel127.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel127.setText("Reihe 1");
        jLabel127.setOpaque(true);
        jPanel11.add(jLabel127);
        jLabel127.setBounds(30, 50, 90, 250);

        jLabel128.setBackground(new java.awt.Color(255, 255, 255));
        jLabel128.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel128.setText("Spalte 1");
        jLabel128.setEnabled(false);
        jLabel128.setOpaque(true);
        jPanel11.add(jLabel128);
        jLabel128.setBounds(130, 50, 160, 40);

        KategorieCombobox1_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KategorieCombobox1_7ActionPerformed(evt);
            }
        });
        jPanel11.add(KategorieCombobox1_7);
        KategorieCombobox1_7.setBounds(1070, 210, 160, 40);

        jLabel130.setBackground(new java.awt.Color(255, 255, 255));
        jLabel130.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel130.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel130.setText("Spalte 2");
        jLabel130.setOpaque(true);
        jPanel11.add(jLabel130);
        jLabel130.setBounds(310, 50, 160, 40);

        jLabel131.setBackground(new java.awt.Color(255, 255, 255));
        jLabel131.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel131.setText("Spalte 3");
        jLabel131.setOpaque(true);
        jPanel11.add(jLabel131);
        jLabel131.setBounds(500, 50, 160, 40);

        jLabel132.setBackground(new java.awt.Color(255, 255, 255));
        jLabel132.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel132.setText("Spalte 4");
        jLabel132.setOpaque(true);
        jPanel11.add(jLabel132);
        jLabel132.setBounds(690, 50, 160, 40);

        jLabel133.setBackground(new java.awt.Color(255, 255, 255));
        jLabel133.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel133.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel133.setText("Spalte 5");
        jLabel133.setOpaque(true);
        jPanel11.add(jLabel133);
        jLabel133.setBounds(880, 50, 160, 40);

        jLabel134.setBackground(new java.awt.Color(255, 255, 255));
        jLabel134.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel134.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel134.setText("Spalte 6");
        jLabel134.setOpaque(true);
        jPanel11.add(jLabel134);
        jLabel134.setBounds(1070, 50, 160, 40);

        DefinitionKategorie2_1.setBackground(new java.awt.Color(37, 37, 37));
        DefinitionKategorie2_1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        DefinitionKategorie2_1.setForeground(new java.awt.Color(255, 255, 255));
        DefinitionKategorie2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DefinitionKategorie2_1.setText("Highlights");
        DefinitionKategorie2_1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        DefinitionKategorie2_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DefinitionKategorie2_1.setOpaque(true);
        DefinitionKategorie2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DefinitionKategorie2_1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DefinitionKategorie2_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DefinitionKategorie2_1MouseExited(evt);
            }
        });
        jPanel11.add(DefinitionKategorie2_1);
        DefinitionKategorie2_1.setBounds(130, 450, 160, 80);

        DefinitionKategorie2_2.setBackground(new java.awt.Color(37, 37, 37));
        DefinitionKategorie2_2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        DefinitionKategorie2_2.setForeground(new java.awt.Color(255, 255, 255));
        DefinitionKategorie2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DefinitionKategorie2_2.setText("Highlights");
        DefinitionKategorie2_2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        DefinitionKategorie2_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DefinitionKategorie2_2.setOpaque(true);
        DefinitionKategorie2_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DefinitionKategorie2_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DefinitionKategorie2_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DefinitionKategorie2_2MouseExited(evt);
            }
        });
        jPanel11.add(DefinitionKategorie2_2);
        DefinitionKategorie2_2.setBounds(310, 450, 160, 80);

        DefinitionKategorie2_3.setBackground(new java.awt.Color(37, 37, 37));
        DefinitionKategorie2_3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        DefinitionKategorie2_3.setForeground(new java.awt.Color(255, 255, 255));
        DefinitionKategorie2_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DefinitionKategorie2_3.setText("Highlights");
        DefinitionKategorie2_3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        DefinitionKategorie2_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DefinitionKategorie2_3.setOpaque(true);
        DefinitionKategorie2_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DefinitionKategorie2_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DefinitionKategorie2_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DefinitionKategorie2_3MouseExited(evt);
            }
        });
        jPanel11.add(DefinitionKategorie2_3);
        DefinitionKategorie2_3.setBounds(500, 450, 160, 80);

        DefinitionKategorie2_4.setBackground(new java.awt.Color(37, 37, 37));
        DefinitionKategorie2_4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        DefinitionKategorie2_4.setForeground(new java.awt.Color(255, 255, 255));
        DefinitionKategorie2_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DefinitionKategorie2_4.setText("Highlights");
        DefinitionKategorie2_4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        DefinitionKategorie2_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DefinitionKategorie2_4.setOpaque(true);
        DefinitionKategorie2_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DefinitionKategorie2_4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DefinitionKategorie2_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DefinitionKategorie2_4MouseExited(evt);
            }
        });
        jPanel11.add(DefinitionKategorie2_4);
        DefinitionKategorie2_4.setBounds(690, 450, 160, 80);

        DefinitionKategorie2_5.setBackground(new java.awt.Color(37, 37, 37));
        DefinitionKategorie2_5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        DefinitionKategorie2_5.setForeground(new java.awt.Color(255, 255, 255));
        DefinitionKategorie2_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DefinitionKategorie2_5.setText("Highlights");
        DefinitionKategorie2_5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        DefinitionKategorie2_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DefinitionKategorie2_5.setOpaque(true);
        DefinitionKategorie2_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DefinitionKategorie2_5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DefinitionKategorie2_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DefinitionKategorie2_5MouseExited(evt);
            }
        });
        jPanel11.add(DefinitionKategorie2_5);
        DefinitionKategorie2_5.setBounds(880, 450, 160, 80);

        DefinitionKategorie2_6.setBackground(new java.awt.Color(37, 37, 37));
        DefinitionKategorie2_6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        DefinitionKategorie2_6.setForeground(new java.awt.Color(255, 255, 255));
        DefinitionKategorie2_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DefinitionKategorie2_6.setText("Highlights");
        DefinitionKategorie2_6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        DefinitionKategorie2_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DefinitionKategorie2_6.setOpaque(true);
        DefinitionKategorie2_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DefinitionKategorie2_6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DefinitionKategorie2_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DefinitionKategorie2_6MouseExited(evt);
            }
        });
        jPanel11.add(DefinitionKategorie2_6);
        DefinitionKategorie2_6.setBounds(1070, 450, 160, 80);

        Speichern1_2.setBackground(new java.awt.Color(255, 255, 153));
        Speichern1_2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Speichern1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Speichern1_2.setText("Speichern");
        Speichern1_2.setOpaque(true);
        Speichern1_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Speichern1_2MouseClicked(evt);
            }
        });
        jPanel11.add(Speichern1_2);
        Speichern1_2.setBounds(130, 260, 160, 40);

        Speichern1_3.setBackground(new java.awt.Color(255, 255, 153));
        Speichern1_3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Speichern1_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Speichern1_3.setText("Speichern");
        Speichern1_3.setOpaque(true);
        Speichern1_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Speichern1_3MouseClicked(evt);
            }
        });
        jPanel11.add(Speichern1_3);
        Speichern1_3.setBounds(310, 260, 160, 40);

        Speichern1_4.setBackground(new java.awt.Color(255, 255, 153));
        Speichern1_4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Speichern1_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Speichern1_4.setText("Speichern");
        Speichern1_4.setOpaque(true);
        Speichern1_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Speichern1_4MouseClicked(evt);
            }
        });
        jPanel11.add(Speichern1_4);
        Speichern1_4.setBounds(500, 260, 160, 40);

        Speichern1_5.setBackground(new java.awt.Color(255, 255, 153));
        Speichern1_5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Speichern1_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Speichern1_5.setText("Speichern");
        Speichern1_5.setOpaque(true);
        Speichern1_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Speichern1_5MouseClicked(evt);
            }
        });
        jPanel11.add(Speichern1_5);
        Speichern1_5.setBounds(690, 260, 160, 40);

        Speichern1_6.setBackground(new java.awt.Color(255, 255, 153));
        Speichern1_6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Speichern1_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Speichern1_6.setText("Speichern");
        Speichern1_6.setOpaque(true);
        Speichern1_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Speichern1_6MouseClicked(evt);
            }
        });
        jPanel11.add(Speichern1_6);
        Speichern1_6.setBounds(880, 260, 160, 40);

        Speichern1_7.setBackground(new java.awt.Color(255, 255, 153));
        Speichern1_7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Speichern1_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Speichern1_7.setText("Speichern");
        Speichern1_7.setOpaque(true);
        Speichern1_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Speichern1_7MouseClicked(evt);
            }
        });
        jPanel11.add(Speichern1_7);
        Speichern1_7.setBounds(1070, 260, 160, 40);

        Speichern2_1.setBackground(new java.awt.Color(255, 255, 153));
        Speichern2_1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Speichern2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Speichern2_1.setText("Speichern");
        Speichern2_1.setOpaque(true);
        Speichern2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Speichern2_1MouseClicked(evt);
            }
        });
        jPanel11.add(Speichern2_1);
        Speichern2_1.setBounds(130, 600, 160, 40);

        Speichern2_2.setBackground(new java.awt.Color(255, 255, 153));
        Speichern2_2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Speichern2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Speichern2_2.setText("Speichern");
        Speichern2_2.setOpaque(true);
        Speichern2_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Speichern2_2MouseClicked(evt);
            }
        });
        jPanel11.add(Speichern2_2);
        Speichern2_2.setBounds(310, 600, 160, 40);

        Speichern2_3.setBackground(new java.awt.Color(255, 255, 153));
        Speichern2_3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Speichern2_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Speichern2_3.setText("Speichern");
        Speichern2_3.setOpaque(true);
        Speichern2_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Speichern2_3MouseClicked(evt);
            }
        });
        jPanel11.add(Speichern2_3);
        Speichern2_3.setBounds(500, 600, 160, 40);

        Speichern2_4.setBackground(new java.awt.Color(255, 255, 153));
        Speichern2_4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Speichern2_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Speichern2_4.setText("Speichern");
        Speichern2_4.setOpaque(true);
        Speichern2_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Speichern2_4MouseClicked(evt);
            }
        });
        jPanel11.add(Speichern2_4);
        Speichern2_4.setBounds(690, 600, 160, 40);

        Speichern2_5.setBackground(new java.awt.Color(255, 255, 153));
        Speichern2_5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Speichern2_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Speichern2_5.setText("Speichern");
        Speichern2_5.setOpaque(true);
        Speichern2_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Speichern2_5MouseClicked(evt);
            }
        });
        jPanel11.add(Speichern2_5);
        Speichern2_5.setBounds(880, 600, 160, 40);

        Speichern2_6.setBackground(new java.awt.Color(255, 255, 153));
        Speichern2_6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Speichern2_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Speichern2_6.setText("Speichern");
        Speichern2_6.setOpaque(true);
        Speichern2_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Speichern2_6MouseClicked(evt);
            }
        });
        jPanel11.add(Speichern2_6);
        Speichern2_6.setBounds(1070, 600, 160, 40);

        KategorieCombobox1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KategorieCombobox1_2ActionPerformed(evt);
            }
        });
        jPanel11.add(KategorieCombobox1_2);
        KategorieCombobox1_2.setBounds(130, 210, 160, 40);

        KategorieCombobox1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KategorieCombobox1_3ActionPerformed(evt);
            }
        });
        jPanel11.add(KategorieCombobox1_3);
        KategorieCombobox1_3.setBounds(310, 210, 160, 40);

        KategorieCombobox1_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KategorieCombobox1_4ActionPerformed(evt);
            }
        });
        jPanel11.add(KategorieCombobox1_4);
        KategorieCombobox1_4.setBounds(500, 210, 160, 40);

        KategorieCombobox1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KategorieCombobox1_5ActionPerformed(evt);
            }
        });
        jPanel11.add(KategorieCombobox1_5);
        KategorieCombobox1_5.setBounds(690, 210, 160, 40);

        KategorieCombobox1_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KategorieCombobox1_6ActionPerformed(evt);
            }
        });
        jPanel11.add(KategorieCombobox1_6);
        KategorieCombobox1_6.setBounds(880, 210, 160, 40);

        KategorieCombobox2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KategorieCombobox2_1ActionPerformed(evt);
            }
        });
        jPanel11.add(KategorieCombobox2_1);
        KategorieCombobox2_1.setBounds(130, 550, 160, 40);

        KategorieCombobox2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KategorieCombobox2_2ActionPerformed(evt);
            }
        });
        jPanel11.add(KategorieCombobox2_2);
        KategorieCombobox2_2.setBounds(310, 550, 160, 40);

        KategorieCombobox2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KategorieCombobox2_3ActionPerformed(evt);
            }
        });
        jPanel11.add(KategorieCombobox2_3);
        KategorieCombobox2_3.setBounds(500, 550, 160, 40);

        KategorieCombobox2_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KategorieCombobox2_4ActionPerformed(evt);
            }
        });
        jPanel11.add(KategorieCombobox2_4);
        KategorieCombobox2_4.setBounds(690, 550, 160, 40);

        KategorieCombobox2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KategorieCombobox2_5ActionPerformed(evt);
            }
        });
        jPanel11.add(KategorieCombobox2_5);
        KategorieCombobox2_5.setBounds(880, 550, 160, 40);

        KategorieCombobox2_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KategorieCombobox2_6ActionPerformed(evt);
            }
        });
        jPanel11.add(KategorieCombobox2_6);
        KategorieCombobox2_6.setBounds(1070, 550, 160, 40);

        Startkassenlayout.add(jPanel11);
        jPanel11.setBounds(40, 200, 1260, 700);

        jPanel12.setLayout(null);

        jLabel143.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel143.setText("Hier können Sie die Anordnung der Kategorien anpassen.");
        jPanel12.add(jLabel143);
        jLabel143.setBounds(20, 70, 460, 40);

        jLabel142.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel142.setText("Kategorieentwurf ändern");
        jPanel12.add(jLabel142);
        jLabel142.setBounds(20, 0, 330, 50);

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/4pexels-codioful-(formerly-gradienta)-7130498.jpg"))); // NOI18N
        jPanel12.add(jLabel110);
        jLabel110.setBounds(-20, 0, 1510, 50);

        jLabel111.setBackground(new java.awt.Color(255, 255, 153));
        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/v960-ning-30.jpg"))); // NOI18N
        jLabel111.setText("jLabel111");
        jPanel12.add(jLabel111);
        jLabel111.setBounds(0, 50, 1500, 810);

        Startkassenlayout.add(jPanel12);
        jPanel12.setBounds(20, 80, 1490, 850);

        Kategorie.add(Startkassenlayout, "card2");

        jPanel7.add(Kategorie, "card3");

        ParentKassenlayout.add(jPanel7);
        jPanel7.setBounds(0, 120, 1580, 990);

        ParentAdmin.add(ParentKassenlayout, "card5");

        Bestellungen.setLayout(null);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(null);

        Bestellübersicht.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bestell_ID", "Abholcode", "Bestellzeit", "Total"
            }
        ));
        jScrollPane23.setViewportView(Bestellübersicht);

        jPanel21.add(jScrollPane23);
        jScrollPane23.setBounds(70, 400, 640, 610);

        jLabel259.setBackground(new java.awt.Color(20, 108, 148));
        jLabel259.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel259.setForeground(new java.awt.Color(255, 255, 255));
        jLabel259.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel259.setText("Bestellungsübersicht");
        jLabel259.setOpaque(true);
        jPanel21.add(jLabel259);
        jLabel259.setBounds(50, 330, 680, 40);

        Detailtabelle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bestell_ID", "Artikelnummer", "Artikelbezeichnung", "Preis"
            }
        ));
        jScrollPane24.setViewportView(Detailtabelle);

        jPanel21.add(jScrollPane24);
        jScrollPane24.setBounds(770, 400, 720, 610);

        jLabel281.setBackground(new java.awt.Color(249, 123, 34));
        jLabel281.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel281.setForeground(new java.awt.Color(255, 255, 255));
        jLabel281.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel281.setText("Filtern");
        jLabel281.setAutoscrolls(true);
        jLabel281.setOpaque(true);
        jLabel281.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel281MouseClicked(evt);
            }
        });
        jPanel21.add(jLabel281);
        jLabel281.setBounds(340, 220, 180, 50);

        jLabel282.setBackground(new java.awt.Color(153, 153, 153));
        jLabel282.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel282.setForeground(new java.awt.Color(255, 255, 255));
        jLabel282.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel282.setText("Filter entfernen");
        jLabel282.setAutoscrolls(true);
        jLabel282.setOpaque(true);
        jLabel282.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel282MouseClicked(evt);
            }
        });
        jPanel21.add(jLabel282);
        jLabel282.setBounds(530, 220, 180, 50);

        Bestellunglöschen.setBackground(new java.awt.Color(249, 123, 34));
        Bestellunglöschen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Bestellunglöschen.setForeground(new java.awt.Color(255, 255, 255));
        Bestellunglöschen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bestellunglöschen.setText("Löschen");
        Bestellunglöschen.setAutoscrolls(true);
        Bestellunglöschen.setOpaque(true);
        Bestellunglöschen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BestellunglöschenMouseClicked(evt);
            }
        });
        jPanel21.add(Bestellunglöschen);
        Bestellunglöschen.setBounds(1210, 220, 180, 50);

        jLabel278.setText("BestelID: ");
        jPanel21.add(jLabel278);
        jLabel278.setBounds(930, 230, 60, 30);

        jLabel280.setText("BestellID");
        jPanel21.add(jLabel280);
        jLabel280.setBounds(110, 230, 70, 40);
        jPanel21.add(Filtern);
        Filtern.setBounds(170, 220, 150, 50);
        jPanel21.add(BestellID);
        BestellID.setBounds(1020, 220, 150, 50);

        jLabel268.setBackground(new java.awt.Color(249, 123, 34));
        jLabel268.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel268.setForeground(new java.awt.Color(255, 255, 255));
        jLabel268.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel268.setText("Eine Bestellung löschen");
        jLabel268.setOpaque(true);
        jPanel21.add(jLabel268);
        jLabel268.setBounds(750, 150, 760, 40);

        jLabel269.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/v960-ning-30.jpg"))); // NOI18N
        jPanel21.add(jLabel269);
        jLabel269.setBounds(750, 370, 760, 660);

        jLabel271.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/v960-ning-11.jpg"))); // NOI18N
        jPanel21.add(jLabel271);
        jLabel271.setBounds(750, 190, 760, 110);

        jLabel272.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/v960-ning-30.jpg"))); // NOI18N
        jPanel21.add(jLabel272);
        jLabel272.setBounds(50, 370, 680, 660);

        jLabel275.setBackground(new java.awt.Color(20, 108, 148));
        jLabel275.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel275.setForeground(new java.awt.Color(255, 255, 255));
        jLabel275.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel275.setText("Detailübersicht");
        jLabel275.setOpaque(true);
        jPanel21.add(jLabel275);
        jLabel275.setBounds(750, 330, 760, 40);

        jLabel276.setBackground(new java.awt.Color(249, 123, 34));
        jLabel276.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel276.setForeground(new java.awt.Color(255, 255, 255));
        jLabel276.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel276.setText("Bestellung filtern");
        jLabel276.setOpaque(true);
        jPanel21.add(jLabel276);
        jLabel276.setBounds(50, 150, 680, 40);

        jLabel277.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/v960-ning-11.jpg"))); // NOI18N
        jPanel21.add(jLabel277);
        jLabel277.setBounds(50, 190, 680, 110);

        Löschanzeige.setBackground(new java.awt.Color(249, 251, 231));
        Löschanzeige.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Löschanzeige.setForeground(new java.awt.Color(102, 0, 102));
        jPanel21.add(Löschanzeige);
        Löschanzeige.setBounds(590, 60, 590, 50);

        jPanel6.setBackground(new java.awt.Color(249, 251, 231));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel267.setBackground(new java.awt.Color(102, 102, 102, 80));
        jLabel267.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel267.setForeground(new java.awt.Color(0, 0, 0));
        jLabel267.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel267.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/55.png"))); // NOI18N
        jLabel267.setText("  Bestellungen");
        jLabel267.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel267MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel267MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel267MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel267, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1179, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel267, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel21.add(jPanel6);
        jPanel6.setBounds(0, 20, 1550, 100);

        Bestellungen.add(jPanel21);
        jPanel21.setBounds(0, 0, 1540, 1080);

        ParentAdmin.add(Bestellungen, "card6");

        Statistiken.setLayout(null);

        StatistikenLabel.setBackground(new java.awt.Color(255, 255, 255));
        StatistikenLabel.setLayout(null);

        Vergleichletztesjahr.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Vergleichletztesjahr.setForeground(new java.awt.Color(255, 255, 255));
        Vergleichletztesjahr.setText("Vergleich letztes Jahr");
        StatistikenLabel.add(Vergleichletztesjahr);
        Vergleichletztesjahr.setBounds(1210, 600, 170, 30);

        Letztesjahr.setForeground(new java.awt.Color(255, 255, 255));
        Letztesjahr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Letztesjahr.setText("Letztes Jahr heute:   CHF");
        StatistikenLabel.add(Letztesjahr);
        Letztesjahr.setBounds(210, 690, 150, 16);

        Frankeheute.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Frankeheute.setForeground(new java.awt.Color(255, 255, 255));
        Frankeheute.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frankeheute.setText("CHF");
        StatistikenLabel.add(Frankeheute);
        Frankeheute.setBounds(180, 580, 100, 50);

        Franken7tage.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Franken7tage.setForeground(new java.awt.Color(255, 255, 255));
        Franken7tage.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Franken7tage.setText("CHF");
        StatistikenLabel.add(Franken7tage);
        Franken7tage.setBounds(840, 580, 120, 50);

        Unterschied7tage.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Unterschied7tage.setForeground(new java.awt.Color(0, 153, 51));
        Unterschied7tage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Unterschied7tage.setText("Keinwert");
        StatistikenLabel.add(Unterschied7tage);
        Unterschied7tage.setBounds(1210, 670, 200, 50);

        Vergleichletztesjahr1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Vergleichletztesjahr1.setForeground(new java.awt.Color(255, 255, 255));
        Vergleichletztesjahr1.setText("Vergleich letztes Jahr");
        StatistikenLabel.add(Vergleichletztesjahr1);
        Vergleichletztesjahr1.setBounds(540, 590, 170, 30);

        Letztesjahr7.setForeground(new java.awt.Color(255, 255, 255));
        Letztesjahr7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Letztesjahr7.setText("Letztes Jahr:   CHF");
        StatistikenLabel.add(Letztesjahr7);
        Letztesjahr7.setBounds(900, 680, 150, 30);

        UmsatzdieseWocheLetztesJahr.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UmsatzdieseWocheLetztesJahr.setForeground(new java.awt.Color(255, 255, 255));
        UmsatzdieseWocheLetztesJahr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UmsatzdieseWocheLetztesJahr.setText("UmsatzWert");
        StatistikenLabel.add(UmsatzdieseWocheLetztesJahr);
        UmsatzdieseWocheLetztesJahr.setBounds(1070, 690, 130, 16);

        Unterschiedtage.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Unterschiedtage.setForeground(new java.awt.Color(0, 153, 51));
        Unterschiedtage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Unterschiedtage.setText("Keinwert");
        StatistikenLabel.add(Unterschiedtage);
        Unterschiedtage.setBounds(570, 670, 110, 50);

        Titelheute.setBackground(new java.awt.Color(102, 102, 102, 178));
        Titelheute.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Titelheute.setForeground(new java.awt.Color(255, 255, 255));
        Titelheute.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titelheute.setText("Total Bruttoumsatz heute");
        StatistikenLabel.add(Titelheute);
        Titelheute.setBounds(140, 490, 580, 40);

        UmsatzletztesJahr.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UmsatzletztesJahr.setForeground(new java.awt.Color(255, 255, 255));
        UmsatzletztesJahr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UmsatzletztesJahr.setText("UmsatzWert");
        StatistikenLabel.add(UmsatzletztesJahr);
        UmsatzletztesJahr.setBounds(400, 690, 90, 16);

        UmsatzdieseWoche.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        UmsatzdieseWoche.setForeground(new java.awt.Color(255, 255, 255));
        UmsatzdieseWoche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UmsatzdieseWoche.setText("UmsatzWert");
        StatistikenLabel.add(UmsatzdieseWoche);
        UmsatzdieseWoche.setBounds(920, 570, 310, 70);

        Umsatzheute.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Umsatzheute.setForeground(new java.awt.Color(255, 255, 255));
        Umsatzheute.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Umsatzheute.setText("UmsatzWert");
        Umsatzheute.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        StatistikenLabel.add(Umsatzheute);
        Umsatzheute.setBounds(280, 580, 220, 50);

        Titel7tage.setBackground(new java.awt.Color(249, 123, 34));
        Titel7tage.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Titel7tage.setForeground(new java.awt.Color(255, 255, 255));
        Titel7tage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titel7tage.setText("Total Bruttoumsatz in den letzten 7 Tagen");
        StatistikenLabel.add(Titel7tage);
        Titel7tage.setBounds(830, 500, 580, 40);

        HeuteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/angryimg (2).png"))); // NOI18N
        StatistikenLabel.add(HeuteLabel);
        HeuteLabel.setBounds(140, 450, 580, 300);

        jPanel22.setBackground(new java.awt.Color(246, 221, 183));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jPanel22.setLayout(null);

        Umsatz7tage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/angryimg (2).png"))); // NOI18N
        jPanel22.add(Umsatz7tage);
        Umsatz7tage.setBounds(740, 100, 580, 300);

        StatistikenLabel.add(jPanel22);
        jPanel22.setBounds(90, 350, 1370, 490);

        jPanel23.setBackground(new java.awt.Color(249, 251, 231));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        TitelStatistiken.setBackground(new java.awt.Color(102, 102, 102, 80));
        TitelStatistiken.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TitelStatistiken.setForeground(new java.awt.Color(0, 0, 0));
        TitelStatistiken.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TitelStatistiken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/images/1chart+diagram+graph+graph+line+graphs+statistics+icon-1320086012050639555.png"))); // NOI18N
        TitelStatistiken.setText("   Statistiken");
        TitelStatistiken.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TitelStatistikenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TitelStatistikenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TitelStatistikenMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(TitelStatistiken, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1171, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(TitelStatistiken, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        StatistikenLabel.add(jPanel23);
        jPanel23.setBounds(0, 20, 1540, 100);

        Statistiken.add(StatistikenLabel);
        StatistikenLabel.setBounds(0, 0, 1540, 1080);

        ParentAdmin.add(Statistiken, "card6");

        Admin.add(ParentAdmin);
        ParentAdmin.setBounds(380, 0, 1540, 1080);

        getContentPane().add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        System.exit(0);
       
    }//GEN-LAST:event_jLabel1MouseClicked

    private void MenuArtikelbewirtschaftungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuArtikelbewirtschaftungMouseClicked
        ParentAdmin.removeAll();
        ParentAdmin.add(Artikelbewirtschaftung);
        ParentAdmin.repaint();
        ParentAdmin.revalidate();

        // Der Codeblock versucht, eine Verbindung zur Datenbank herzustellen und eine Abfrage auszuführen, um Daten aus den Tabellen "artikelliste" und "kategorien" abzurufen.
// Die abgerufenen Daten werden in einer Tabelle angezeigt, die durch das Objekt "Tabelle1" repräsentiert wird.
// Vor dem Hinzufügen neuer Zeilen wird die Tabelle geleert, um sicherzustellen, dass nur die aktuellen Daten angezeigt werden.
// Die abgerufenen Daten werden dann Zeile für Zeile zur Tabelle hinzugefügt.
// Fehlermeldungen werden in der Konsole ausgegeben, falls ein Fehler auftritt.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
                Statement st = con.createStatement();
                String sql = "SELECT a.Artikelnummer, a.Artikelbezeichnung, a.Artikelbeschreibung, k.Kategoriebezeichnung AS Artikelkategorie, a.Kalorien, a.Kohlenhydrate, a.Proteine, a.Fette, a.Artikelzutaten, a.Preis, a.Icon, a.Dauer, a.Vegetarisch, a.Bio, a.Vegan, a.Verfügbar FROM artikelliste a JOIN kategorien k ON a.Kategorie_ID = k.Kategorie_ID";
                ResultSet rs = st.executeQuery(sql);

                DefaultTableModel tblModel = (DefaultTableModel) Tabelle1.getModel();
                tblModel.setRowCount(0); 

                while (rs.next()) {
                    String Artikelnummer = rs.getString("Artikelnummer");
                    String Artikelbezeichnung = rs.getString("Artikelbezeichnung");
                    String Artikelbeschreibung = rs.getString("Artikelbeschreibung");
                    String Artikelkategorie = rs.getString("Artikelkategorie");
                    float Kalorien = rs.getFloat("Kalorien");
                    float Kohlenhydrate = rs.getFloat("Kohlenhydrate");
                    float Proteine = rs.getFloat("Proteine");
                    float Fette = rs.getFloat("Fette");
                    String Zutatenliste = rs.getString("Artikelzutaten");
                    float Preis = rs.getFloat("Preis");
                    String Icon = rs.getString("Icon");
                    int Dauer = rs.getInt("Dauer");
                    String Vegetarisch = rs.getString("Vegetarisch");
                    String Bio = rs.getString("Bio");
                    String Vegan = rs.getString("Vegan");
                    String Verfügbar = rs.getString("Verfügbar");

                    String tbData[] = {Artikelnummer, Artikelbezeichnung, Artikelbeschreibung, Artikelkategorie, String.valueOf(Kalorien), String.valueOf(Kohlenhydrate), String.valueOf(Proteine), String.valueOf(Fette), Zutatenliste, String.valueOf(Preis), Icon, String.valueOf(Dauer), Vegetarisch, Bio, Vegan, Verfügbar};
                    tblModel.addRow(tbData);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

        Artikellistetabelle.setAutoCreateRowSorter(true);
        
    }//GEN-LAST:event_MenuArtikelbewirtschaftungMouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        Admin.setVisible(false);
        Highlight highlight = new Highlight();
        highlight.setVisible(true);

       
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked

           ParentAdmin.removeAll();
        ParentAdmin.add(Statistiken);
        ParentAdmin.repaint();
        ParentAdmin.revalidate();
  
 Umsatz Umsatz = new Umsatz(); // Erzeugung eines Umsatz-Objekts
Umsatz.Umsatz7tage(UmsatzdieseWoche, Mysqllink, username, password);
// Aufruf der Methode UmsatzdieseWoche() des Umsatz-Objekts mit den übergebenen Parametern
Umsatz.UmsatzletztesJahrTag(UmsatzletztesJahr, Mysqllink, username, password);
Umsatz.UmsatzletztesJahr7Tage (UmsatzdieseWocheLetztesJahr,UmsatzdieseWoche,Unterschiedtage,Mysqllink, username, password);
Umsatz.Umsatzheute(Umsatzheute, Mysqllink, username, password);
// Aufruf der Methode Umsatzheute() des Umsatz-Objekts mit den übergebenen Parametern

Vergleich vergleich = new Vergleich(); // Erzeugung eines Vergleich-Objekts
vergleich.Vergleich(UmsatzletztesJahr, Umsatzheute, Unterschiedtage, Unterschied7tage);
// Aufruf der Methode Vergleich() des Vergleich-Objekts mit den übergebenen Parametern






     

    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        ParentAdmin.removeAll();
        ParentAdmin.add(ParentKassenlayout);
        ParentAdmin.repaint();
        ParentAdmin.revalidate();

       
        Kategorie1_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_6.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_7.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_1.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_6.setBackground(new java.awt.Color(51, 51, 51));
      

        try (Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {


            String sql1_2 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql1_2)) {
                pstmt1.setDouble(1, 1.2);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung1_2 = rs1.getString("Kategoriebezeichnung");
                Kategorie1_2.setText(kategoriebezeichnung1_2);
            }

           
            String sql1_3 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt2 = conn.prepareStatement(sql1_3)) {
                pstmt2.setDouble(1, 1.3);
                ResultSet rs2 = pstmt2.executeQuery();
                rs2.next();
                String kategoriebezeichnung1_3 = rs2.getString("Kategoriebezeichnung");
                Kategorie1_3.setText(kategoriebezeichnung1_3);
            }

            
            String sql1_4 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_4)) {
                pstmt3.setDouble(1, 1.4);
                ResultSet rs3 = pstmt3.executeQuery();
                rs3.next();
                String kategoriebezeichnung1_4 = rs3.getString("Kategoriebezeichnung");
                Kategorie1_4.setText(kategoriebezeichnung1_4);
            }

            
            String sql1_5 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_5)) {
                pstmt3.setDouble(1, 1.5);
                ResultSet rs3 = pstmt3.executeQuery();
                rs3.next();
                String kategoriebezeichnung1_5 = rs3.getString("Kategoriebezeichnung");
                Kategorie1_5.setText(kategoriebezeichnung1_5);
            }

          
            String sql1_6 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_6)) {
                pstmt3.setDouble(1, 1.6);
                ResultSet rs3 = pstmt3.executeQuery();
                rs3.next();
                String kategoriebezeichnung1_6 = rs3.getString("Kategoriebezeichnung");
                Kategorie1_6.setText(kategoriebezeichnung1_6);
            }

           
            String sql1_7 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_7)) {
                pstmt3.setDouble(1, 1.7);
                ResultSet rs3 = pstmt3.executeQuery();
                rs3.next();
                String kategoriebezeichnung1_7 = rs3.getString("Kategoriebezeichnung");
                Kategorie1_7.setText(kategoriebezeichnung1_7);
            }

            
            String sql2_1 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_1)) {
                pstmt1.setDouble(1, 2.1);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_1 = rs1.getString("Kategoriebezeichnung");
                Kategorie2_1.setText(kategoriebezeichnung2_1);
            }

       
            String sql2_2 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_2)) {
                pstmt1.setDouble(1, 2.2);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_2 = rs1.getString("Kategoriebezeichnung");
                Kategorie2_2.setText(kategoriebezeichnung2_2);
            }

            
            String sql2_3 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_3)) {
                pstmt1.setDouble(1, 2.3);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_3 = rs1.getString("Kategoriebezeichnung");
                Kategorie2_3.setText(kategoriebezeichnung2_3);
            }

            
            String sql2_4 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_4)) {
                pstmt1.setDouble(1, 2.4);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_4 = rs1.getString("Kategoriebezeichnung");
                Kategorie2_4.setText(kategoriebezeichnung2_4);
            }

          
            String sql2_5 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_5)) {
                pstmt1.setDouble(1, 2.5);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_5 = rs1.getString("Kategoriebezeichnung");
                Kategorie2_5.setText(kategoriebezeichnung2_5);
            }

         
            String sql2_6 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_6)) {
                pstmt1.setDouble(1, 2.6);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_6 = rs1.getString("Kategoriebezeichnung");
                Kategorie2_6.setText(kategoriebezeichnung2_6);
            }

            
//            String sql2_7 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
//            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_7)) {
//                pstmt1.setDouble(1, 2.7);
//                ResultSet rs1 = pstmt1.executeQuery();
//                rs1.next();
//                String kategoriebezeichnung2_7 = rs1.getString("Kategoriebezeichnung");
//                Kategorie2_7.setText(kategoriebezeichnung2_7);
//            }

        } catch (SQLException e) {
            System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
                Statement st = con.createStatement();
                String sql = "SELECT a.Artikelnummer, a.Artikelbezeichnung, k.Kategoriebezeichnung AS Artikelkategorie, a.Verfügbar FROM artikelliste a JOIN kategorien k ON a.Kategorie_ID = k.Kategorie_ID";
                ResultSet rs = st.executeQuery(sql);

                DefaultTableModel tblModel = (DefaultTableModel) Artikeltabelle.getModel();
                tblModel.setRowCount(0); 

                while (rs.next()) {
                    String Artikelnummer = rs.getString("Artikelnummer");
                    String Artikelbezeichnung = rs.getString("Artikelbezeichnung");
                    String Kategorie = rs.getString("Artikelkategorie");
                    String Verfügbar = rs.getString("Verfügbar");

                    String tbData[] = {Artikelnummer, Artikelbezeichnung, Kategorie, Verfügbar};
                    tblModel.addRow(tbData);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

        Artikeltabelle.setAutoCreateRowSorter(true);

        Kategorie1_2.setBackground(new java.awt.Color(64, 81, 59));
        Kategorie1_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_6.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_7.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_1.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_6.setBackground(new java.awt.Color(51, 51, 51));
        

        String kategoriebezeichnung1_4 = Kategorie1_2.getText();

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
               
            }

          
           
            Layout Layout = new Layout();
            Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );

       
        } catch (SQLException e) {
            System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
           
            Layout Layout = new Layout();
            Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        }

        
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
      try {
    Class.forName("com.mysql.cj.jdbc.Driver"); // Laden des MySQL JDBC-Treibers
    try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
        Statement st = con.createStatement(); // Erstellen eines Statement-Objekts
        String sql = "SELECT Artikelnummer, Artikelbezeichnung, Artikelbeschreibung, Artikelkategorie, Kalorien, Kohlenhydrate, Proteine, Fette, AlleZutaten, Icon, Preis, Verfugbar FROM artikelliste";
        ResultSet rs = st.executeQuery(sql); // Ausführen der SQL-Abfrage und Erhalten des ResultSets

        while (rs.next()) {
            // Lesen der Spaltenwerte aus dem Resultset
            String Artikelnummer = rs.getString("Artikelnummer");
            String Artikelbezeichnung = rs.getString("Artikelbezeichnung");
            String Artikelbeschreibung = rs.getString("Artikelbeschreibung");
            String Artikelkategorie = rs.getString("Artikelkategorie");
            String Kalorien = String.valueOf(rs.getFloat("Kalorien"));
            String Kohlenhydrate = String.valueOf(rs.getFloat("Kohlenhydrate"));
            String Proteine = String.valueOf(rs.getFloat("Proteine"));
            String Fette = String.valueOf(rs.getFloat("Fette"));
            String AlleZutaten = rs.getString("AlleZutaten");
            String Icon = rs.getString("Icon");
            String Preis = String.valueOf(rs.getFloat("Preis"));
            String Verfugbar = rs.getString("Verfugbar");

                    String tbData[] = {Artikelnummer, Artikelbezeichnung, Artikelbeschreibung, Artikelkategorie, Kalorien, Kohlenhydrate, Proteine, Fette, AlleZutaten, Icon, Preis, Verfugbar};
                    DefaultTableModel tblModel = (DefaultTableModel) Tabelle1.getModel();

                    tblModel.addRow(tbData);
                    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
                        @Override
                        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                            String verfugbar = (String) table.getValueAt(row, 11);
                            if ("Nein".equals(verfugbar)) {
                                c.setBackground(Color.RED);
                            } else if ("Ja".equals(verfugbar)) {
                                c.setBackground(Color.GREEN);
                            } else {
                                c.setBackground(table.getBackground());
                            }
                            return c;
                        }
                    };
                    Tabelle1.getColumnModel().getColumn(11).setCellRenderer(renderer);

                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_jLabel4MouseClicked

    private void AdddataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdddataMouseClicked
        ParentArtikeldaten.removeAll();
        ParentArtikeldaten.add(Artikelhinzufugen);
        ParentArtikeldaten.repaint();
        ParentArtikeldaten.revalidate();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
                Statement st = con.createStatement();
                String sql = "SELECT a.Artikelnummer, a.Artikelbezeichnung, a.Artikelbeschreibung, k.Kategoriebezeichnung AS Artikelkategorie, a.Kalorien, a.Kohlenhydrate, a.Proteine, a.Fette, a.Artikelzutaten, a.Preis, a.Icon, a.Dauer, a.Vegetarisch, a.Bio, a.Vegan FROM artikelliste a JOIN kategorien k ON a.Kategorie_ID = k.Kategorie_ID";
                ResultSet rs = st.executeQuery(sql);

                DefaultTableModel tblModel = (DefaultTableModel) Artikellistetabelle.getModel();
                tblModel.setRowCount(0);

                while (rs.next()) {
                    String Artikelnummer = rs.getString("Artikelnummer");
                    String Artikelbezeichnung = rs.getString("Artikelbezeichnung");
                    String Artikelbeschreibung = rs.getString("Artikelbeschreibung");
                    String Artikelkategorie = rs.getString("Artikelkategorie");
                    float Kalorien = rs.getFloat("Kalorien");
                    float Kohlenhydrate = rs.getFloat("Kohlenhydrate");
                    float Proteine = rs.getFloat("Proteine");
                    float Fette = rs.getFloat("Fette");
                    String Zutatenliste = rs.getString("Artikelzutaten");
                    float Preis = rs.getFloat("Preis");
                    String Icon = rs.getString("Icon");
                    float Dauer = rs.getFloat("Dauer");
                    String Vegetarisch = rs.getString("Vegetarisch");
                    String Bio = rs.getString("Bio");
                    String Vegan = rs.getString("Vegan");

                    String tbData[] = {Artikelnummer, Artikelbezeichnung, Artikelbeschreibung, Artikelkategorie, String.valueOf(Kalorien), String.valueOf(Kohlenhydrate), String.valueOf(Proteine), String.valueOf(Fette), Zutatenliste, String.valueOf(Preis), Icon, String.valueOf(Dauer), Vegetarisch, Bio, Vegan};
                    tblModel.addRow(tbData);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

        Artikellistetabelle.setAutoCreateRowSorter(true);

    }//GEN-LAST:event_AdddataMouseClicked

    private void ShowdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowdataMouseClicked
        ParentArtikelbewirtschaftung.removeAll();
        ParentArtikelbewirtschaftung.add(Artikeldaten);
        ParentArtikelbewirtschaftung.repaint();
        ParentArtikelbewirtschaftung.revalidate();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
                Statement st = con.createStatement();
                String sql = "SELECT a.Artikelnummer, a.Artikelbezeichnung, a.Artikelbeschreibung, k.Kategoriebezeichnung AS Artikelkategorie, a.Kalorien, a.Kohlenhydrate, a.Proteine, a.Fette, a.Artikelzutaten, a.Preis, a.Icon, a.Dauer, a.Vegetarisch, a.Bio, a.Vegan, a.Verfügbar FROM artikelliste a JOIN kategorien k ON a.Kategorie_ID = k.Kategorie_ID";
                ResultSet rs = st.executeQuery(sql);

                DefaultTableModel tblModel = (DefaultTableModel) Tabelle1.getModel();
                tblModel.setRowCount(0);

                while (rs.next()) {
                    String Artikelnummer = rs.getString("Artikelnummer");
                    String Artikelbezeichnung = rs.getString("Artikelbezeichnung");
                    String Artikelbeschreibung = rs.getString("Artikelbeschreibung");
                    String Artikelkategorie = rs.getString("Artikelkategorie");
                    float Kalorien = rs.getFloat("Kalorien");
                    float Kohlenhydrate = rs.getFloat("Kohlenhydrate");
                    float Proteine = rs.getFloat("Proteine");
                    float Fette = rs.getFloat("Fette");
                    String Zutatenliste = rs.getString("Artikelzutaten");
                    float Preis = rs.getFloat("Preis");
                    String Icon = rs.getString("Icon");
                    int Dauer = rs.getInt("Dauer");
                    String Vegetarisch = rs.getString("Vegetarisch");
                    String Bio = rs.getString("Bio");
                    String Vegan = rs.getString("Vegan");
                    String Verfügbar = rs.getString("Verfügbar");

                    String tbData[] = {Artikelnummer, Artikelbezeichnung, Artikelbeschreibung, Artikelkategorie, String.valueOf(Kalorien), String.valueOf(Kohlenhydrate), String.valueOf(Proteine), String.valueOf(Fette), Zutatenliste, String.valueOf(Preis), Icon, String.valueOf(Dauer), Vegetarisch, Bio, Vegan, Verfügbar};
                    tblModel.addRow(tbData);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

        Artikellistetabelle.setAutoCreateRowSorter(true);
        
    }//GEN-LAST:event_ShowdataMouseClicked

    private void MenuDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuDashboardMouseClicked
        ParentAdmin.removeAll();
        ParentAdmin.add(Startseite);
        ParentAdmin.repaint();
        ParentAdmin.revalidate();
      
    }//GEN-LAST:event_MenuDashboardMouseClicked

    private void jLabel64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel64MouseClicked
      
    }//GEN-LAST:event_jLabel64MouseClicked

    private void jLabel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseClicked
      
    }//GEN-LAST:event_jLabel65MouseClicked

    private void Adddata1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Adddata1MouseClicked
        ParentArtikeldaten.removeAll();
        ParentArtikeldaten.add(Artikellöschen);
        ParentArtikeldaten.repaint();
        ParentArtikeldaten.revalidate();
       
    }//GEN-LAST:event_Adddata1MouseClicked

    private void Adddata2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Adddata2MouseClicked
        ParentArtikeldaten.removeAll();
        ParentArtikeldaten.add(Artikelanzeigen);
        ParentArtikeldaten.repaint();
        ParentArtikeldaten.revalidate();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
                Statement st = con.createStatement();
                String sql = "SELECT a.Artikelnummer, a.Artikelbezeichnung, a.Artikelbeschreibung, k.Kategoriebezeichnung AS Artikelkategorie, a.Kalorien, a.Kohlenhydrate, a.Proteine, a.Fette, a.Artikelzutaten, a.Preis, a.Icon, a.Dauer, a.Vegetarisch, a.Bio, a.Vegan, a.Verfügbar FROM artikelliste a JOIN kategorien k ON a.Kategorie_ID = k.Kategorie_ID";
                ResultSet rs = st.executeQuery(sql);

                DefaultTableModel tblModel = (DefaultTableModel) Tabelle1.getModel();
                tblModel.setRowCount(0); 

                while (rs.next()) {
                    String Artikelnummer = rs.getString("Artikelnummer");
                    String Artikelbezeichnung = rs.getString("Artikelbezeichnung");
                    String Artikelbeschreibung = rs.getString("Artikelbeschreibung");
                    String Artikelkategorie = rs.getString("Artikelkategorie");
                    float Kalorien = rs.getFloat("Kalorien");
                    float Kohlenhydrate = rs.getFloat("Kohlenhydrate");
                    float Proteine = rs.getFloat("Proteine");
                    float Fette = rs.getFloat("Fette");
                    String Zutatenliste = rs.getString("Artikelzutaten");
                    float Preis = rs.getFloat("Preis");
                    String Icon = rs.getString("Icon");
                    int Dauer = rs.getInt("Dauer");
                    String Vegetarisch = rs.getString("Vegetarisch");
                    String Bio = rs.getString("Bio");
                    String Vegan = rs.getString("Vegan");
                    String Verfügbar = rs.getString("Verfügbar");

                    String tbData[] = {Artikelnummer, Artikelbezeichnung, Artikelbeschreibung, Artikelkategorie, String.valueOf(Kalorien), String.valueOf(Kohlenhydrate), String.valueOf(Proteine), String.valueOf(Fette), Zutatenliste, String.valueOf(Preis), Icon, String.valueOf(Dauer), Vegetarisch, Bio, Vegan, Verfügbar};
                    tblModel.addRow(tbData);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

        Artikellistetabelle.setAutoCreateRowSorter(true);

    
    }//GEN-LAST:event_Adddata2MouseClicked

    private void Adddata3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Adddata3MouseClicked
        ParentArtikeldaten.removeAll();
        ParentArtikeldaten.add(Artikelbearbeiten);
        ParentArtikeldaten.repaint();
        ParentArtikeldaten.revalidate();

      
    }//GEN-LAST:event_Adddata3MouseClicked

    private void MenuDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuDashboardMouseEntered

        
        MenuDashboard.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));

       //erstellt eine neue LineBorder mit der Farbe Color.DARK_GRAY und setzt diese als Rahmen des Menüelements MenuDashboard.
       //Dadurch wird der Rahmen um das Menüelement gezeichnet und visuell hervorgehoben.
    }//GEN-LAST:event_MenuDashboardMouseEntered

    private void MenuDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuDashboardMouseExited

        
        MenuDashboard.setBorder(null);

     
    }//GEN-LAST:event_MenuDashboardMouseExited

    private void MenuArtikelbewirtschaftungMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuArtikelbewirtschaftungMouseEntered
        
        MenuArtikelbewirtschaftung.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        
    }//GEN-LAST:event_MenuArtikelbewirtschaftungMouseEntered

    private void MenuArtikelbewirtschaftungMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuArtikelbewirtschaftungMouseExited
      
        MenuArtikelbewirtschaftung.setBorder(null);

    }//GEN-LAST:event_MenuArtikelbewirtschaftungMouseExited

    private void MenuArtikelbewirtschaftungMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuArtikelbewirtschaftungMouseMoved
             
    }//GEN-LAST:event_MenuArtikelbewirtschaftungMouseMoved

    private void jLabel37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseEntered
        jLabel37.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        
    }//GEN-LAST:event_jLabel37MouseEntered

    private void jLabel37MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseExited
        jLabel37.setBorder(null);
    
    }//GEN-LAST:event_jLabel37MouseExited

    private void jLabel36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseEntered
        jLabel36.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));

    
    }//GEN-LAST:event_jLabel36MouseEntered

    private void jLabel36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseExited
        jLabel36.setBorder(null);

       
    }//GEN-LAST:event_jLabel36MouseExited

    private void SupplementDruckenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplementDruckenMouseClicked
       try {
    // Erstelle PrinterJob
    PrinterJob printerJob = PrinterJob.getPrinterJob();

    // Setze Seitenformatierung
    PageFormat pageFormat = printerJob.defaultPage();
    Paper paper = pageFormat.getPaper();
    double width = 8.5 * 72.0; 
    double height = 11 * 72.0; 
    double margin = 72.0; 
    paper.setSize(width, height);
    paper.setImageableArea(margin, margin, width - 2 * margin, height - 2 * margin); 
    pageFormat.setPaper(paper);

    // Erstelle Printable
    Printable printable = Optiontabelle.getPrintable(JTable.PrintMode.FIT_WIDTH, null, null);

    // Setze Printable und Seitenformatierung im PrinterJob
    printerJob.setPrintable(printable, pageFormat);

    // Zeige Druckdialog an und starte den Druckauftrag
    if (printerJob.printDialog()) {
        printerJob.print();
    }
} catch (PrinterException ex) {
    ex.printStackTrace();
}


      
    }//GEN-LAST:event_SupplementDruckenMouseClicked

    private void jLabel58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseClicked
        OptionNummerloschen.setText("");
        OptionBezeichnungloschen.setText("");
        OptionPreisloschen.setText("");

    }//GEN-LAST:event_jLabel58MouseClicked

    private void OptionLöschenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OptionLöschenMouseClicked

       try {
    // Vorbereiteter Statement zum Löschen von Daten aus der Tabelle
    PreparedStatement ps = db.mycon().prepareStatement("DELETE FROM supplements WHERE Supplementnummer = ? AND Supplementbezeichnung = ?");
    
    // Setzen der Parameter für das vorbereitete Statement
    ps.setString(1, OptionNummerloschen.getText());
    ps.setString(2, OptionBezeichnungloschen.getText());

    // Ausführen der Löschoperation in der Datenbank
    ps.executeUpdate();
    
    // Zurücksetzen der Eingabefelder
    OptionNummerloschen.setText("");
    OptionBezeichnungloschen.setText("");
    OptionPreisloschen.setText("");
    
    // Anzeigen einer Erfolgsmeldung
    Loschenausgabe.setText("Daten wurden erfolgreich gelöscht!");

    // Timer zum Entfernen der Erfolgsmeldung nach 5 Sekunden
    javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
        SwingUtilities.invokeLater(() -> {
            Loschenausgabe.setText("");
        });
    });
    timer.setRepeats(false);
    timer.start();
} catch (SQLException e) {
    System.out.println(e);
}


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
                Statement st = con.createStatement();
                String sql = "SELECT Supplementnummer, Supplementbezeichnung, Preis, Verfügbar FROM supplements";
                ResultSet rs = st.executeQuery(sql);

                DefaultTableModel tblModel = (DefaultTableModel) Optiontabelle.getModel();
                tblModel.setRowCount(0); 

                while (rs.next()) {
                    String Supplementnummer = rs.getString("Supplementnummer");
                    String Supplementbezeichnung = rs.getString("Supplementbezeichnung");
                    float Preis = rs.getFloat("Preis");
                    String Verfugbar = rs.getString("Verfügbar");

                    String tbData[] = {Supplementnummer, Supplementbezeichnung, String.valueOf(Preis), Verfugbar};
                    tblModel.addRow(tbData);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_OptionLöschenMouseClicked

    private void jLabel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseClicked

        String Supplementnummer = OptionNummerloschen.getText();
        try {
           
            Connection connection = DriverManager.getConnection(Mysqllink, username, password);

     
            String query = "SELECT * FROM supplements WHERE Supplementnummer = '" + Supplementnummer + "'";

            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

         
            if (resultSet.next()) {
               
                String supplementnummer = resultSet.getString("Supplementnummer");
                String supplementbezeichnung = resultSet.getString("Supplementbezeichnung");
                float preis = resultSet.getFloat("Preis");

                OptionNummerloschen.setText(String.valueOf(supplementnummer));
                OptionBezeichnungloschen.setText(supplementbezeichnung);
                OptionPreisloschen.setText(String.valueOf(preis));

           
            } else {
            
                suchausgabe.setText("Keine Daten gefunden!");
                javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
                 
                    SwingUtilities.invokeLater(() -> {
                        suchausgabe.setText("");
                    });
                });
                timer.setRepeats(false);
                timer.start();

            }

            
            connection.close();
        } catch (SQLException ex) {
            
            System.out.println("Error: " + ex.getMessage());
        }

      
    }//GEN-LAST:event_jLabel57MouseClicked

    private void OptionNummerloschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionNummerloschenActionPerformed

    }//GEN-LAST:event_OptionNummerloschenActionPerformed

    private void jLabel72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseClicked
        String Supplementnummer = Optionnummerbearbeiten.getText();
        try {
           
            Connection connection = DriverManager.getConnection(Mysqllink, username, password);

         
            String query = "SELECT * FROM supplements WHERE Supplementnummer = '" + Supplementnummer + "'";

           
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

          
            if (resultSet.next()) {
                
                String supplementnummer = resultSet.getString("Supplementnummer");
                String supplementbezeichnung = resultSet.getString("Supplementbezeichnung");
                float preis = resultSet.getFloat("Preis");

                Optionnummerbearbeiten.setText(String.valueOf(supplementnummer));
                Optionbezeichnungbearbeiten.setText(supplementbezeichnung);
                Optionpreisbearbeiten.setText(String.valueOf(preis));

              
                Optionnummerbearbeiten.setEnabled(false);
                Optionbezeichnungbearbeiten.setEnabled(true);
                Optionpreisbearbeiten.setEnabled(true);

          
                Optionbezeichnungbearbeiten.setEnabled(true);
                Optionbezeichnungbearbeiten.setBackground(Color.WHITE);
                Optionpreisbearbeiten.setEnabled(true);
                Optionpreisbearbeiten.setBackground(Color.WHITE);

                
            } else {
              
                Anzeigenausgabe.setText("Keine Daten gefunden!");
                javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
                   
                    SwingUtilities.invokeLater(() -> {
                        Anzeigenausgabe.setText("");
                    });
                });
                timer.setRepeats(false);
                timer.start();

            }

       
            connection.close();
        } catch (SQLException ex) {
           
            System.out.println("Error: " + ex.getMessage());
        }

       
    }//GEN-LAST:event_jLabel72MouseClicked

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked

        if (Optionbezeichnungbearbeiten.getText().isEmpty() || Optionpreisbearbeiten.getText().isEmpty()) {
            
        } else {
            String supplementnummerandern = Optionnummerbearbeiten.getText();
            String supplementbezeichnungandern = Optionbezeichnungbearbeiten.getText();
            float supplementpreisandern = Float.parseFloat(Optionpreisbearbeiten.getText());

         
            try {
                Connection connection = DriverManager.getConnection(Mysqllink, username, password);
                String sql = "UPDATE supplements SET Preis = ?, Supplementbezeichnung = ? WHERE Supplementnummer = ?";

                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setFloat(1, supplementpreisandern);
                statement.setString(2, supplementbezeichnungandern);
                statement.setString(3, supplementnummerandern);

                int rowsAffected = statement.executeUpdate(); 

                Optionnummerbearbeiten.setText("");
                Optionbezeichnungbearbeiten.setText("");
                Optionpreisbearbeiten.setText("");

                Optionnummerbearbeiten.setEnabled(true);
                Optionbezeichnungbearbeiten.setEnabled(false);
                Optionpreisbearbeiten.setEnabled(false);

                Andernausgabe.setText("Erfolgreich bearbeitet");

                javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
                    
                    SwingUtilities.invokeLater(() -> {
                        Andernausgabe.setText("");
                    });
                });
                timer.setRepeats(false);
                timer.start();

        
            } catch (SQLException ex) {
               
                System.out.println("Error: " + ex.getMessage());
            }

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
                    Statement st = con.createStatement();
                    String sql = "SELECT Supplementnummer, Supplementbezeichnung, Preis, Verfügbar FROM supplements";
                    ResultSet rs = st.executeQuery(sql);

                    DefaultTableModel tblModel = (DefaultTableModel) Optiontabelle.getModel();
                    tblModel.setRowCount(0); 

                    while (rs.next()) {
                        String Supplementnummer = rs.getString("Supplementnummer");
                        String Supplementbezeichnung = rs.getString("Supplementbezeichnung");
                        float Preis = rs.getFloat("Preis");
                        String Verfugbar = rs.getString("Verfügbar");

                        String tbData[] = {Supplementnummer, Supplementbezeichnung, String.valueOf(Preis), Verfugbar};
                        tblModel.addRow(tbData);
                    }
                }
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e.getMessage());
            }

        }

  
    }//GEN-LAST:event_jLabel71MouseClicked

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseClicked
        Optionnummerbearbeiten.setText("");
        Optionbezeichnungbearbeiten.setText("");
        Optionpreisbearbeiten.setText("");

        Optionnummerbearbeiten.setEnabled(true);
        Optionbezeichnungbearbeiten.setEnabled(false);
        Optionpreisbearbeiten.setEnabled(false);

      
    }//GEN-LAST:event_jLabel70MouseClicked

    private void OptionnummerbearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionnummerbearbeitenActionPerformed
      
    }//GEN-LAST:event_OptionnummerbearbeitenActionPerformed

    private void jLabel59MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseEntered

   
    }//GEN-LAST:event_jLabel59MouseEntered

    private void jLabel59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseClicked
        Random rand = new Random();
        int num = rand.nextInt(99999999) + 10000000;
        OptionNummer.setText(Integer.toString(num));
        
    }//GEN-LAST:event_jLabel59MouseClicked

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
        OptionNummer.setText("");
        OptionBezeichnung.setText("");
        OptionPreis.setText("");
        
    }//GEN-LAST:event_jLabel49MouseClicked

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
        final int MIN_LENGTH = 8; 

        OptionNummer.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkInput();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkInput();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkInput();
            }

            private void checkInput() {
                String input = OptionNummer.getText();

            }
        });

        if (OptionNummer.getText().length() != MIN_LENGTH) {
            JOptionPane.showMessageDialog(jLabel48, "Ungültige Eingabe. Der Supplementnummer muss " + MIN_LENGTH + " Stellen haben.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else if (OptionNummer.getText().length() == MIN_LENGTH) {
            if (OptionNummer.getText().isEmpty() || OptionBezeichnung.getText().isEmpty() || OptionPreis.getText().isEmpty()) {
                JOptionPane.showMessageDialog(jLabel48, "Bitte füllen Sie alle Felder aus", "Input Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                

                    Connection conn = DriverManager.getConnection(Mysqllink, username, password);
                    PreparedStatement ps = conn.prepareStatement("INSERT INTO supplements (Supplementnummer, Supplementbezeichnung, Preis) VALUES (?, ?, ?)");

         
                    ps.setString(1, OptionNummer.getText());
                    ps.setString(2, OptionBezeichnung.getText());
                    ps.setFloat(3, Float.parseFloat(OptionPreis.getText()));

                  
                    ps.executeUpdate();

                    AnzeigeOptionhinzufugen.setText("Erfolgreich hinzugefügt");
                    yyy.setSize(30, 30);

                    javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
                        
                        SwingUtilities.invokeLater(() -> {
                            AnzeigeOptionhinzufugen.setText("");
                            yyy.setSize(30, 0);
                        });
                    });
                    timer.setRepeats(false);
                    timer.start();

                } catch (SQLException e) {
                    System.out.println(e);
                    JOptionPane.showMessageDialog(null, "Fehler beim Einfügen in die Datenbank: " + e.getMessage(), "Datenbankfehler", JOptionPane.ERROR_MESSAGE);
                } catch (NumberFormatException e) {
                    System.out.println(e);
                 
                    JOptionPane.showMessageDialog(null, "Falscher Datentyp eingegeben: " + e.getMessage(), "Eingabefehler", JOptionPane.ERROR_MESSAGE);
                }
                OptionNummer.setText("");
                OptionBezeichnung.setText("");
                OptionPreis.setText("");

            }
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
                Statement st = con.createStatement();
                String sql = "SELECT Supplementnummer, Supplementbezeichnung, Preis, Verfügbar FROM supplements";
                ResultSet rs = st.executeQuery(sql);

                DefaultTableModel tblModel = (DefaultTableModel) Optiontabelle.getModel();
                tblModel.setRowCount(0); 

                while (rs.next()) {
                    String Supplementnummer = rs.getString("Supplementnummer");
                    String Supplementbezeichnung = rs.getString("Supplementbezeichnung");
                    float Preis = rs.getFloat("Preis");
                    String Verfugbar = rs.getString("Verfügbar");

                    String tbData[] = {Supplementnummer, Supplementbezeichnung, String.valueOf(Preis), Verfugbar};
                    tblModel.addRow(tbData);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

        Optiontabelle.setAutoCreateRowSorter(true);

 
    }//GEN-LAST:event_jLabel48MouseClicked

    private void OptionNummerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionNummerActionPerformed


    }//GEN-LAST:event_OptionNummerActionPerformed

    private void jLabel80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MouseClicked
       
    }//GEN-LAST:event_jLabel80MouseClicked

    private void jLabel107MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel107MouseClicked
      ParentAdmin.removeAll();
        ParentAdmin.add(Bestellungen);
        ParentAdmin.repaint();
        ParentAdmin.revalidate();
     
  Tabellen Tabellen = new Tabellen(); // Erzeugung eines Tabellen-Objekts
Tabellen.Bestellungentabelle(Mysqllink,username,password,Bestellübersicht,Detailtabelle); // Abruf Methode Bestellungentabelle
 
 
        


    }//GEN-LAST:event_jLabel107MouseClicked

    private void jLabel107MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel107MouseEntered
     
    }//GEN-LAST:event_jLabel107MouseEntered

    private void jLabel107MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel107MouseExited
        
    }//GEN-LAST:event_jLabel107MouseExited

    private void Adddata5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Adddata5MouseClicked
        ParentArtikeldaten.removeAll();
        ParentArtikeldaten.add(Artikeldetail);
        ParentArtikeldaten.repaint();
        ParentArtikeldaten.revalidate();


    }//GEN-LAST:event_Adddata5MouseClicked

    private void DefinitionKategorie1_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_7MouseClicked
      
    }//GEN-LAST:event_DefinitionKategorie1_7MouseClicked

    private void DefinitionKategorie1_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_7MouseEntered
     
    }//GEN-LAST:event_DefinitionKategorie1_7MouseEntered

    private void DefinitionKategorie1_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_7MouseExited
        
    }//GEN-LAST:event_DefinitionKategorie1_7MouseExited

    private void DefinitionKategorie1_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_2MouseClicked
 
    }//GEN-LAST:event_DefinitionKategorie1_2MouseClicked

    private void DefinitionKategorie1_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_2MouseEntered
       
    }//GEN-LAST:event_DefinitionKategorie1_2MouseEntered

    private void DefinitionKategorie1_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_2MouseExited
     
    }//GEN-LAST:event_DefinitionKategorie1_2MouseExited

    private void DefinitionKategorie1_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_3MouseClicked
        
    }//GEN-LAST:event_DefinitionKategorie1_3MouseClicked

    private void DefinitionKategorie1_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_3MouseEntered
       
    }//GEN-LAST:event_DefinitionKategorie1_3MouseEntered

    private void DefinitionKategorie1_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_3MouseExited
    
    }//GEN-LAST:event_DefinitionKategorie1_3MouseExited

    private void DefinitionKategorie1_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_4MouseClicked
      
    }//GEN-LAST:event_DefinitionKategorie1_4MouseClicked

    private void DefinitionKategorie1_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_4MouseEntered
      
    }//GEN-LAST:event_DefinitionKategorie1_4MouseEntered

    private void DefinitionKategorie1_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_4MouseExited
        
    }//GEN-LAST:event_DefinitionKategorie1_4MouseExited

    private void DefinitionKategorie1_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_5MouseClicked

    }//GEN-LAST:event_DefinitionKategorie1_5MouseClicked

    private void DefinitionKategorie1_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_5MouseEntered
        
    }//GEN-LAST:event_DefinitionKategorie1_5MouseEntered

    private void DefinitionKategorie1_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_5MouseExited
     
    }//GEN-LAST:event_DefinitionKategorie1_5MouseExited

    private void DefinitionKategorie1_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_6MouseClicked
    
    }//GEN-LAST:event_DefinitionKategorie1_6MouseClicked

    private void DefinitionKategorie1_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_6MouseEntered
        
    }//GEN-LAST:event_DefinitionKategorie1_6MouseEntered

    private void DefinitionKategorie1_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_6MouseExited
        
    }//GEN-LAST:event_DefinitionKategorie1_6MouseExited

    private void KategorieCombobox1_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KategorieCombobox1_7ActionPerformed
      
    }//GEN-LAST:event_KategorieCombobox1_7ActionPerformed

    private void DefinitionKategorie2_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie2_1MouseClicked
       
    }//GEN-LAST:event_DefinitionKategorie2_1MouseClicked

    private void DefinitionKategorie2_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie2_1MouseEntered
        
    }//GEN-LAST:event_DefinitionKategorie2_1MouseEntered

    private void DefinitionKategorie2_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie2_1MouseExited
   
    }//GEN-LAST:event_DefinitionKategorie2_1MouseExited

    private void DefinitionKategorie2_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie2_2MouseClicked
     
    }//GEN-LAST:event_DefinitionKategorie2_2MouseClicked

    private void DefinitionKategorie2_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie2_2MouseEntered
        
    }//GEN-LAST:event_DefinitionKategorie2_2MouseEntered

    private void DefinitionKategorie2_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie2_2MouseExited

    }//GEN-LAST:event_DefinitionKategorie2_2MouseExited

    private void DefinitionKategorie2_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie2_3MouseClicked
     
    }//GEN-LAST:event_DefinitionKategorie2_3MouseClicked

    private void DefinitionKategorie2_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie2_3MouseEntered
        
    }//GEN-LAST:event_DefinitionKategorie2_3MouseEntered

    private void DefinitionKategorie2_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie2_3MouseExited

    }//GEN-LAST:event_DefinitionKategorie2_3MouseExited

    private void DefinitionKategorie2_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie2_4MouseClicked
        
    }//GEN-LAST:event_DefinitionKategorie2_4MouseClicked

    private void DefinitionKategorie2_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie2_4MouseEntered
     
    }//GEN-LAST:event_DefinitionKategorie2_4MouseEntered

    private void DefinitionKategorie2_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie2_4MouseExited
      
    }//GEN-LAST:event_DefinitionKategorie2_4MouseExited

    private void DefinitionKategorie2_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie2_5MouseClicked
     
    }//GEN-LAST:event_DefinitionKategorie2_5MouseClicked

    private void DefinitionKategorie2_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie2_5MouseEntered
       
    }//GEN-LAST:event_DefinitionKategorie2_5MouseEntered

    private void DefinitionKategorie2_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie2_5MouseExited
    
    }//GEN-LAST:event_DefinitionKategorie2_5MouseExited

    private void DefinitionKategorie2_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie2_6MouseClicked
      
    }//GEN-LAST:event_DefinitionKategorie2_6MouseClicked

    private void DefinitionKategorie2_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie2_6MouseEntered
       
    }//GEN-LAST:event_DefinitionKategorie2_6MouseEntered

    private void DefinitionKategorie2_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie2_6MouseExited
        
    }//GEN-LAST:event_DefinitionKategorie2_6MouseExited

    private void KategorieCombobox1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KategorieCombobox1_2ActionPerformed
        
    }//GEN-LAST:event_KategorieCombobox1_2ActionPerformed

    private void KategorieCombobox1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KategorieCombobox1_3ActionPerformed
        
    }//GEN-LAST:event_KategorieCombobox1_3ActionPerformed

    private void KategorieCombobox1_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KategorieCombobox1_4ActionPerformed
        
    }//GEN-LAST:event_KategorieCombobox1_4ActionPerformed

    private void KategorieCombobox1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KategorieCombobox1_5ActionPerformed
        
    }//GEN-LAST:event_KategorieCombobox1_5ActionPerformed

    private void KategorieCombobox1_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KategorieCombobox1_6ActionPerformed
        
    }//GEN-LAST:event_KategorieCombobox1_6ActionPerformed

    private void KategorieCombobox2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KategorieCombobox2_1ActionPerformed
        
    }//GEN-LAST:event_KategorieCombobox2_1ActionPerformed

    private void KategorieCombobox2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KategorieCombobox2_2ActionPerformed
        
    }//GEN-LAST:event_KategorieCombobox2_2ActionPerformed

    private void KategorieCombobox2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KategorieCombobox2_3ActionPerformed
        
    }//GEN-LAST:event_KategorieCombobox2_3ActionPerformed

    private void KategorieCombobox2_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KategorieCombobox2_4ActionPerformed
        
    }//GEN-LAST:event_KategorieCombobox2_4ActionPerformed

    private void KategorieCombobox2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KategorieCombobox2_5ActionPerformed
        
    }//GEN-LAST:event_KategorieCombobox2_5ActionPerformed

    private void KategorieCombobox2_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KategorieCombobox2_6ActionPerformed
        
    }//GEN-LAST:event_KategorieCombobox2_6ActionPerformed

    private void Speichern1_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Speichern1_2MouseClicked
        try {
           
            String selectedKategoriebezeichnung = KategorieCombobox1_2.getSelectedItem().toString();

           
            try ( 
                    Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
             
                String sql1 = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
                PreparedStatement pstmt2;
                try (PreparedStatement pstmt1 = conn.prepareStatement(sql1)) {
                    pstmt1.setString(1, selectedKategoriebezeichnung);
                    ResultSet rs = pstmt1.executeQuery();
                    rs.next(); 
                    String selectedKategorieID = rs.getString("Kategorie_ID");

                    
                    DefinitionKategorie1_2.setText(selectedKategoriebezeichnung);

                    
                    String sql2 = "SELECT COUNT(*) AS count FROM kategorielayout WHERE Reihe = ?";
                    pstmt2 = conn.prepareStatement(sql2);
                    pstmt2.setDouble(1, 1.2);
                    ResultSet rs2 = pstmt2.executeQuery();
                    rs2.next(); 
                    int count = rs2.getInt("count");
                    if (count > 0) {
                  
                        String sql3 = "UPDATE kategorielayout SET Kategorie_Nummer = ? WHERE Reihe = ?";
                        try (PreparedStatement pstmt3 = conn.prepareStatement(sql3)) {
                            pstmt3.setString(1, selectedKategorieID);
                            pstmt3.setDouble(2, 1.2);
                            pstmt3.executeUpdate();
                        }
                    } else {
                        
                        String sql4 = "INSERT INTO kategorielayout (Reihe, Kategorie_Nummer) VALUES (?, ?)";
                        try (PreparedStatement pstmt4 = conn.prepareStatement(sql4)) {
                            pstmt4.setDouble(1, 1.2);
                            pstmt4.setString(2, selectedKategorieID);
                            pstmt4.executeUpdate();
                        }
                    }
            
                }
                pstmt2.close();
            }
        } catch (SQLException ex) {
      
        }
        
    }//GEN-LAST:event_Speichern1_2MouseClicked

    private void Speichern1_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Speichern1_3MouseClicked
        try {
           
            String selectedKategoriebezeichnung = KategorieCombobox1_3.getSelectedItem().toString();

          
            try ( 
                    Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
               
                String sql1 = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
                PreparedStatement pstmt2;
                try (PreparedStatement pstmt1 = conn.prepareStatement(sql1)) {
                    pstmt1.setString(1, selectedKategoriebezeichnung);
                    ResultSet rs = pstmt1.executeQuery();
                    rs.next();
                    String selectedKategorieID = rs.getString("Kategorie_ID");

                    
                    DefinitionKategorie1_3.setText(selectedKategoriebezeichnung);

                 
                    String sql2 = "SELECT COUNT(*) AS count FROM kategorielayout WHERE Reihe = ?";
                    pstmt2 = conn.prepareStatement(sql2);
                    pstmt2.setDouble(1, 1.3);
                    ResultSet rs2 = pstmt2.executeQuery();
                    rs2.next(); 
                    int count = rs2.getInt("count");
                    if (count > 0) {
                       
                        String sql3 = "UPDATE kategorielayout SET Kategorie_Nummer = ? WHERE Reihe = ?";
                        try (PreparedStatement pstmt3 = conn.prepareStatement(sql3)) {
                            pstmt3.setString(1, selectedKategorieID);
                            pstmt3.setDouble(2, 1.3);
                            pstmt3.executeUpdate();
                        }
                    } else {
                      
                        String sql4 = "INSERT INTO kategorielayout (Reihe, Kategorie_Nummer) VALUES (?, ?)";
                        try (PreparedStatement pstmt4 = conn.prepareStatement(sql4)) {
                            pstmt4.setDouble(1, 1.3);
                            pstmt4.setString(2, selectedKategorieID);
                            pstmt4.executeUpdate();
                        }
                    }
                   
                }
                pstmt2.close();
            }
        } catch (SQLException ex) {
           
        }
    }//GEN-LAST:event_Speichern1_3MouseClicked

    private void Speichern1_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Speichern1_4MouseClicked
        try {
           
            String selectedKategoriebezeichnung = KategorieCombobox1_4.getSelectedItem().toString();

          
            try ( 
                    Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
                
                String sql1 = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
                PreparedStatement pstmt2;
                try (PreparedStatement pstmt1 = conn.prepareStatement(sql1)) {
                    pstmt1.setString(1, selectedKategoriebezeichnung);
                    ResultSet rs = pstmt1.executeQuery();
                    rs.next(); 
                    String selectedKategorieID = rs.getString("Kategorie_ID");

                   
                    DefinitionKategorie1_4.setText(selectedKategoriebezeichnung);

                    
                    String sql2 = "SELECT COUNT(*) AS count FROM kategorielayout WHERE Reihe = ?";
                    pstmt2 = conn.prepareStatement(sql2);
                    pstmt2.setDouble(1, 1.4);
                    ResultSet rs2 = pstmt2.executeQuery();
                    rs2.next();
                    int count = rs2.getInt("count");
                    if (count > 0) {
                       
                        String sql3 = "UPDATE kategorielayout SET Kategorie_Nummer = ? WHERE Reihe = ?";
                        try (PreparedStatement pstmt3 = conn.prepareStatement(sql3)) {
                            pstmt3.setString(1, selectedKategorieID);
                            pstmt3.setDouble(2, 1.4);
                            pstmt3.executeUpdate();
                        }
                    } else {
                        
                        String sql4 = "INSERT INTO kategorielayout (Reihe, Kategorie_Nummer) VALUES (?, ?)";
                        try (PreparedStatement pstmt4 = conn.prepareStatement(sql4)) {
                            pstmt4.setDouble(1, 1.4);
                            pstmt4.setString(2, selectedKategorieID);
                            pstmt4.executeUpdate();
                        }
                    }
                 
                }
                pstmt2.close();
            }
        } catch (SQLException ex) {
            
        }    
    }//GEN-LAST:event_Speichern1_4MouseClicked

    private void Speichern1_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Speichern1_5MouseClicked
        try {
           
            String selectedKategoriebezeichnung = KategorieCombobox1_5.getSelectedItem().toString();


            try ( 
                    Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
                
                String sql1 = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
                PreparedStatement pstmt2;
                try (PreparedStatement pstmt1 = conn.prepareStatement(sql1)) {
                    pstmt1.setString(1, selectedKategoriebezeichnung);
                    ResultSet rs = pstmt1.executeQuery();
                    rs.next(); 
                    String selectedKategorieID = rs.getString("Kategorie_ID");

                 
                    DefinitionKategorie1_5.setText(selectedKategoriebezeichnung);

                    
                    String sql2 = "SELECT COUNT(*) AS count FROM kategorielayout WHERE Reihe = ?";
                    pstmt2 = conn.prepareStatement(sql2);
                    pstmt2.setDouble(1, 1.5);
                    ResultSet rs2 = pstmt2.executeQuery();
                    rs2.next(); 
                    int count = rs2.getInt("count");
                    if (count > 0) {
                       
                        String sql3 = "UPDATE kategorielayout SET Kategorie_Nummer = ? WHERE Reihe = ?";
                        try (PreparedStatement pstmt3 = conn.prepareStatement(sql3)) {
                            pstmt3.setString(1, selectedKategorieID);
                            pstmt3.setDouble(2, 1.5);
                            pstmt3.executeUpdate();
                        }
                    } else {
                        
                        String sql4 = "INSERT INTO kategorielayout (Reihe, Kategorie_Nummer) VALUES (?, ?)";
                        try (PreparedStatement pstmt4 = conn.prepareStatement(sql4)) {
                            pstmt4.setDouble(1, 1.5);
                            pstmt4.setString(2, selectedKategorieID);
                            pstmt4.executeUpdate();
                        }
                    }
      
                }
                pstmt2.close();
            }
        } catch (SQLException ex) {
       
        }
        
    }//GEN-LAST:event_Speichern1_5MouseClicked

    private void Speichern1_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Speichern1_6MouseClicked
        try {
            
            String selectedKategoriebezeichnung = KategorieCombobox1_6.getSelectedItem().toString();

          
            try ( 
                    Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
              
                String sql1 = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
                PreparedStatement pstmt2;
                try (PreparedStatement pstmt1 = conn.prepareStatement(sql1)) {
                    pstmt1.setString(1, selectedKategoriebezeichnung);
                    ResultSet rs = pstmt1.executeQuery();
                    rs.next();
                    String selectedKategorieID = rs.getString("Kategorie_ID");

                    
                    DefinitionKategorie1_6.setText(selectedKategoriebezeichnung);

                   
                    String sql2 = "SELECT COUNT(*) AS count FROM kategorielayout WHERE Reihe = ?";
                    pstmt2 = conn.prepareStatement(sql2);
                    pstmt2.setDouble(1, 1.6);
                    ResultSet rs2 = pstmt2.executeQuery();
                    rs2.next(); 
                    int count = rs2.getInt("count");
                    if (count > 0) {
                   
                        String sql3 = "UPDATE kategorielayout SET Kategorie_Nummer = ? WHERE Reihe = ?";
                        try (PreparedStatement pstmt3 = conn.prepareStatement(sql3)) {
                            pstmt3.setString(1, selectedKategorieID);
                            pstmt3.setDouble(2, 1.6);
                            pstmt3.executeUpdate();
                        }
                    } else {
                       
                        String sql4 = "INSERT INTO kategorielayout (Reihe, Kategorie_Nummer) VALUES (?, ?)";
                        try (PreparedStatement pstmt4 = conn.prepareStatement(sql4)) {
                            pstmt4.setDouble(1, 1.6);
                            pstmt4.setString(2, selectedKategorieID);
                            pstmt4.executeUpdate();
                        }
                    }
              
                }
                pstmt2.close();
            }
        } catch (SQLException ex) {
            
        }
        
    }//GEN-LAST:event_Speichern1_6MouseClicked

    private void Speichern1_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Speichern1_7MouseClicked
        try {
            
            String selectedKategoriebezeichnung = KategorieCombobox1_7.getSelectedItem().toString();

          
            try ( 
                    Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
             
                String sql1 = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
                PreparedStatement pstmt2;
                try (PreparedStatement pstmt1 = conn.prepareStatement(sql1)) {
                    pstmt1.setString(1, selectedKategoriebezeichnung);
                    ResultSet rs = pstmt1.executeQuery();
                    rs.next(); 
                    String selectedKategorieID = rs.getString("Kategorie_ID");

                   
                    DefinitionKategorie1_7.setText(selectedKategoriebezeichnung);

                   
                    String sql2 = "SELECT COUNT(*) AS count FROM kategorielayout WHERE Reihe = ?";
                    pstmt2 = conn.prepareStatement(sql2);
                    pstmt2.setDouble(1, 1.7);
                    ResultSet rs2 = pstmt2.executeQuery();
                    rs2.next();
                    int count = rs2.getInt("count");
                    if (count > 0) {
                   
                        String sql3 = "UPDATE kategorielayout SET Kategorie_Nummer = ? WHERE Reihe = ?";
                        try (PreparedStatement pstmt3 = conn.prepareStatement(sql3)) {
                            pstmt3.setString(1, selectedKategorieID);
                            pstmt3.setDouble(2, 1.7);
                            pstmt3.executeUpdate();
                        }
                    } else {
                      
                        String sql4 = "INSERT INTO kategorielayout (Reihe, Kategorie_Nummer) VALUES (?, ?)";
                        try (PreparedStatement pstmt4 = conn.prepareStatement(sql4)) {
                            pstmt4.setDouble(1, 1.7);
                            pstmt4.setString(2, selectedKategorieID);
                            pstmt4.executeUpdate();
                        }
                    }
               
                }
                pstmt2.close();
            }
        } catch (SQLException ex) {
       
        }

        
    }//GEN-LAST:event_Speichern1_7MouseClicked

    private void Speichern2_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Speichern2_1MouseClicked
        try {
       
            String selectedKategoriebezeichnung = KategorieCombobox2_1.getSelectedItem().toString();

           
            try ( 
                    Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
          
                String sql1 = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
                PreparedStatement pstmt2;
                try (PreparedStatement pstmt1 = conn.prepareStatement(sql1)) {
                    pstmt1.setString(1, selectedKategoriebezeichnung);
                    ResultSet rs = pstmt1.executeQuery();
                    rs.next();
                    String selectedKategorieID = rs.getString("Kategorie_ID");

                   
                    DefinitionKategorie2_1.setText(selectedKategoriebezeichnung);

                   
                    String sql2 = "SELECT COUNT(*) AS count FROM kategorielayout WHERE Reihe = ?";
                    pstmt2 = conn.prepareStatement(sql2);
                    pstmt2.setDouble(1, 2.1);
                    ResultSet rs2 = pstmt2.executeQuery();
                    rs2.next();
                    int count = rs2.getInt("count");
                    if (count > 0) {
                
                        String sql3 = "UPDATE kategorielayout SET Kategorie_Nummer = ? WHERE Reihe = ?";
                        try (PreparedStatement pstmt3 = conn.prepareStatement(sql3)) {
                            pstmt3.setString(1, selectedKategorieID);
                            pstmt3.setDouble(2, 2.1);
                            pstmt3.executeUpdate();
                        }
                    } else {
                       
                        String sql4 = "INSERT INTO kategorielayout (Reihe, Kategorie_Nummer) VALUES (?, ?)";
                        try (PreparedStatement pstmt4 = conn.prepareStatement(sql4)) {
                            pstmt4.setDouble(1, 2.1);
                            pstmt4.setString(2, selectedKategorieID);
                            pstmt4.executeUpdate();
                        }
                    }
                 
                }
                pstmt2.close();
            }
        } catch (SQLException ex) {
           
        }

        
    }//GEN-LAST:event_Speichern2_1MouseClicked

    private void Speichern2_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Speichern2_2MouseClicked
        try {
         
            String selectedKategoriebezeichnung = KategorieCombobox2_2.getSelectedItem().toString();

         
            try ( 
                    Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {

                String sql1 = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
                PreparedStatement pstmt2;
                try (PreparedStatement pstmt1 = conn.prepareStatement(sql1)) {
                    pstmt1.setString(1, selectedKategoriebezeichnung);
                    ResultSet rs = pstmt1.executeQuery();
                    rs.next();
                    String selectedKategorieID = rs.getString("Kategorie_ID");

                  
                    DefinitionKategorie2_2.setText(selectedKategoriebezeichnung);

                   
                    String sql2 = "SELECT COUNT(*) AS count FROM kategorielayout WHERE Reihe = ?";
                    pstmt2 = conn.prepareStatement(sql2);
                    pstmt2.setDouble(1, 2.2);
                    ResultSet rs2 = pstmt2.executeQuery();
                    rs2.next(); 
                    int count = rs2.getInt("count");
                    if (count > 0) {
                   
                        String sql3 = "UPDATE kategorielayout SET Kategorie_Nummer = ? WHERE Reihe = ?";
                        try (PreparedStatement pstmt3 = conn.prepareStatement(sql3)) {
                            pstmt3.setString(1, selectedKategorieID);
                            pstmt3.setDouble(2, 2.2);
                            pstmt3.executeUpdate();
                        }
                    } else {
                      
                        String sql4 = "INSERT INTO kategorielayout (Reihe, Kategorie_Nummer) VALUES (?, ?)";
                        try (PreparedStatement pstmt4 = conn.prepareStatement(sql4)) {
                            pstmt4.setDouble(1, 2.2);
                            pstmt4.setString(2, selectedKategorieID);
                            pstmt4.executeUpdate();
                        }
                    }
                   
                }
                pstmt2.close();
            }
        } catch (SQLException ex) {
           
        }

        
    }//GEN-LAST:event_Speichern2_2MouseClicked

    private void Speichern2_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Speichern2_3MouseClicked

        try {
         
            String selectedKategoriebezeichnung = KategorieCombobox2_3.getSelectedItem().toString();

         
            try ( 
                    Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
              
                String sql1 = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
                PreparedStatement pstmt2;
                try (PreparedStatement pstmt1 = conn.prepareStatement(sql1)) {
                    pstmt1.setString(1, selectedKategoriebezeichnung);
                    ResultSet rs = pstmt1.executeQuery();
                    rs.next(); 
                    String selectedKategorieID = rs.getString("Kategorie_ID");

                  
                    DefinitionKategorie2_3.setText(selectedKategoriebezeichnung);

                   
                    String sql2 = "SELECT COUNT(*) AS count FROM kategorielayout WHERE Reihe = ?";
                    pstmt2 = conn.prepareStatement(sql2);
                    pstmt2.setDouble(1, 2.3);
                    ResultSet rs2 = pstmt2.executeQuery();
                    rs2.next(); 
                    int count = rs2.getInt("count");
                    if (count > 0) {
                 
                        String sql3 = "UPDATE kategorielayout SET Kategorie_Nummer = ? WHERE Reihe = ?";
                        try (PreparedStatement pstmt3 = conn.prepareStatement(sql3)) {
                            pstmt3.setString(1, selectedKategorieID);
                            pstmt3.setDouble(2, 2.3);
                            pstmt3.executeUpdate();
                        }
                    } else {
                  
                        String sql4 = "INSERT INTO kategorielayout (Reihe, Kategorie_Nummer) VALUES (?, ?)";
                        try (PreparedStatement pstmt4 = conn.prepareStatement(sql4)) {
                            pstmt4.setDouble(1, 2.3);
                            pstmt4.setString(2, selectedKategorieID);
                            pstmt4.executeUpdate();
                        }
                    }
                  
                }
                pstmt2.close();
            }
        } catch (SQLException ex) {
          
        }

        
    }//GEN-LAST:event_Speichern2_3MouseClicked

    private void Speichern2_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Speichern2_4MouseClicked
        try {
           
            String selectedKategoriebezeichnung = KategorieCombobox2_4.getSelectedItem().toString();

            
            try (
                    Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
               
                String sql1 = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
                PreparedStatement pstmt2;
                try (PreparedStatement pstmt1 = conn.prepareStatement(sql1)) {
                    pstmt1.setString(1, selectedKategoriebezeichnung);
                    ResultSet rs = pstmt1.executeQuery();
                    rs.next(); 
                    String selectedKategorieID = rs.getString("Kategorie_ID");

               
                    DefinitionKategorie2_4.setText(selectedKategoriebezeichnung);

                
                    String sql2 = "SELECT COUNT(*) AS count FROM kategorielayout WHERE Reihe = ?";
                    pstmt2 = conn.prepareStatement(sql2);
                    pstmt2.setDouble(1, 2.4);
                    ResultSet rs2 = pstmt2.executeQuery();
                    rs2.next(); 
                    int count = rs2.getInt("count");
                    if (count > 0) {
                     
                        String sql3 = "UPDATE kategorielayout SET Kategorie_Nummer = ? WHERE Reihe = ?";
                        try (PreparedStatement pstmt3 = conn.prepareStatement(sql3)) {
                            pstmt3.setString(1, selectedKategorieID);
                            pstmt3.setDouble(2, 2.4);
                            pstmt3.executeUpdate();
                        }
                    } else {
                    
                        String sql4 = "INSERT INTO kategorielayout (Reihe, Kategorie_Nummer) VALUES (?, ?)";
                        try (PreparedStatement pstmt4 = conn.prepareStatement(sql4)) {
                            pstmt4.setDouble(1, 2.4);
                            pstmt4.setString(2, selectedKategorieID);
                            pstmt4.executeUpdate();
                        }
                    }
                    
                }
                pstmt2.close();
            }
        } catch (SQLException ex) {
           
        }
        
    }//GEN-LAST:event_Speichern2_4MouseClicked

    private void Speichern2_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Speichern2_5MouseClicked
        try {

            String selectedKategoriebezeichnung = KategorieCombobox2_5.getSelectedItem().toString();

       
            try ( 
                    Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
               
                String sql1 = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
                PreparedStatement pstmt2;
                try (PreparedStatement pstmt1 = conn.prepareStatement(sql1)) {
                    pstmt1.setString(1, selectedKategoriebezeichnung);
                    ResultSet rs = pstmt1.executeQuery();
                    rs.next(); 
                    String selectedKategorieID = rs.getString("Kategorie_ID");

                   
                    DefinitionKategorie2_5.setText(selectedKategoriebezeichnung);

                   
                    String sql2 = "SELECT COUNT(*) AS count FROM kategorielayout WHERE Reihe = ?";
                    pstmt2 = conn.prepareStatement(sql2);
                    pstmt2.setDouble(1, 2.5);
                    ResultSet rs2 = pstmt2.executeQuery();
                    rs2.next(); 
                    int count = rs2.getInt("count");
                    if (count > 0) {
                       
                        String sql3 = "UPDATE kategorielayout SET Kategorie_Nummer = ? WHERE Reihe = ?";
                        try (PreparedStatement pstmt3 = conn.prepareStatement(sql3)) {
                            pstmt3.setString(1, selectedKategorieID);
                            pstmt3.setDouble(2, 2.5);
                            pstmt3.executeUpdate();
                        }
                    } else {
                  
                        String sql4 = "INSERT INTO kategorielayout (Reihe, Kategorie_Nummer) VALUES (?, ?)";
                        try (PreparedStatement pstmt4 = conn.prepareStatement(sql4)) {
                            pstmt4.setDouble(1, 2.5);
                            pstmt4.setString(2, selectedKategorieID);
                            pstmt4.executeUpdate();
                        }
                    }
                
                }
                pstmt2.close();
            }
        } catch (SQLException ex) {
            
        }
        
    }//GEN-LAST:event_Speichern2_5MouseClicked

    private void Speichern2_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Speichern2_6MouseClicked
        try {
          
            String selectedKategoriebezeichnung = KategorieCombobox2_6.getSelectedItem().toString();

  
            try ( 
                    Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
              
                String sql1 = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
                PreparedStatement pstmt2;
                try (PreparedStatement pstmt1 = conn.prepareStatement(sql1)) {
                    pstmt1.setString(1, selectedKategoriebezeichnung);
                    ResultSet rs = pstmt1.executeQuery();
                    rs.next(); 
                    String selectedKategorieID = rs.getString("Kategorie_ID");

                    DefinitionKategorie2_6.setText(selectedKategoriebezeichnung);

                   
                    String sql2 = "SELECT COUNT(*) AS count FROM kategorielayout WHERE Reihe = ?";
                    pstmt2 = conn.prepareStatement(sql2);
                    pstmt2.setDouble(1, 2.6);
                    ResultSet rs2 = pstmt2.executeQuery();
                    rs2.next(); 
                    int count = rs2.getInt("count");
                    if (count > 0) {
                     
                        String sql3 = "UPDATE kategorielayout SET Kategorie_Nummer = ? WHERE Reihe = ?";
                        try (PreparedStatement pstmt3 = conn.prepareStatement(sql3)) {
                            pstmt3.setString(1, selectedKategorieID);
                            pstmt3.setDouble(2, 2.6);
                            pstmt3.executeUpdate();
                        }
                    } else {
                        
                        String sql4 = "INSERT INTO kategorielayout (Reihe, Kategorie_Nummer) VALUES (?, ?)";
                        try (PreparedStatement pstmt4 = conn.prepareStatement(sql4)) {
                            pstmt4.setDouble(1, 2.6);
                            pstmt4.setString(2, selectedKategorieID);
                            pstmt4.executeUpdate();
                        }
                    }
                  
                }
                pstmt2.close();
            }
        } catch (SQLException ex) {
            
        }
        
    }//GEN-LAST:event_Speichern2_6MouseClicked

    private void ArtikelnummeranzeigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtikelnummeranzeigeActionPerformed
        
    }//GEN-LAST:event_ArtikelnummeranzeigeActionPerformed

    private void btn_AnzeigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AnzeigeActionPerformed
        
    }//GEN-LAST:event_btn_AnzeigeActionPerformed

    private void btn_AnzeigeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AnzeigeMouseClicked

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
                String sql = "SELECT artikelliste.*, kategorien.Kategoriebezeichnung "
                        + "FROM artikelliste "
                        + "JOIN kategorien ON artikelliste.Kategorie_ID = kategorien.Kategorie_ID "
                        + "WHERE artikelliste.Artikelnummer = ?";
                PreparedStatement st = con.prepareStatement(sql);
                st.setString(1, Artikelnummeranzeige.getText());
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String Artikelnummer = rs.getString("Artikelnummer");
                    String Artikelbezeichnung = rs.getString("Artikelbezeichnung");
                    String Artikelbeschreibung = rs.getString("Artikelbeschreibung");
                    String Kategoriebezeichnung = rs.getString("Kategoriebezeichnung");
                    float Kalorien = rs.getFloat("Kalorien");
                    float Kohlenhydrate = rs.getFloat("Kohlenhydrate");
                    float Proteine = rs.getFloat("Proteine");
                    float Fette = rs.getFloat("Fette");
                    String Zutatenliste = rs.getString("Artikelzutaten");
                    float Preis = rs.getFloat("Preis");
                    String Icon = rs.getString("Icon");
                    int Dauer = rs.getInt("Dauer");
                    String Bio = rs.getString("Bio");
                    String Vegetarisch = rs.getString("Vegetarisch");
                    String Vegan = rs.getString("Vegan");

                    DefaultTableModel model = (DefaultTableModel) Kalorientabelle.getModel();
                    model.setRowCount(0); 
                    model.addRow(new Object[]{"Kalorien", Kalorien + " kcal"});
                    model.addRow(new Object[]{"Kohlenhydrate", Kohlenhydrate + " g"});
                    model.addRow(new Object[]{"Proteine", Proteine + " g"});
                    model.addRow(new Object[]{"Fette", Fette + " g"});

                    Kalorientabelle.setModel(model);

                    
                    Artikelnummeranzeiger.setText(Artikelnummer);
                    Artikelbezeichner.setText(Artikelbezeichnung);
                    Artikelbeschreiber.setText(Artikelbeschreibung);
                    Kategorieanzeiger.setText(Kategoriebezeichnung);
                    Zutatenanzeiger.setText(Zutatenliste);
                    Preisanzeiger.setText(String.format("%.2f", Preis));
                   
                    Artikelbild.setIcon(new ImageIcon(Icon));

                    if (Dauer == 0) {
                        Sofortfeld.setSize(200, 40);
                        Minuten.setSize(100, 0);
                        Daueranzeiger.setSize(80, 0);

                    } else {
                        Sofortfeld.setSize(200, 0);
                        Minuten.setSize(100, 40);
                        Daueranzeiger.setSize(80, 40);
                        Daueranzeiger.setText(String.valueOf(Dauer));

                    }

                    if ("Ja".equals(Bio)) {
                        Biofeld.setSize(50, 90);
                    } else {
                        Biofeld.setSize(70, 0);
                    }

                    if ("Ja".equals(Vegetarisch)) {
                        VegiFeld.setSize(60, 70);
                    } else {
                        VegiFeld.setSize(60, 0);
                    }

                    if ("Ja".equals(Vegan)) {
                        Veganfeld.setSize(70, 90);
                    } else {
                        Veganfeld.setSize(70, 0);
                    }

                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

        
    }//GEN-LAST:event_btn_AnzeigeMouseClicked

    private void Minimizer3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Minimizer3MouseClicked
        Artikelinspektion.setSize(1440, 40);
        Minimizer3.setSize(1440, 0);
        Expander3.setSize(1440, 40);
        
    }//GEN-LAST:event_Minimizer3MouseClicked

    private void Expander3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Expander3MouseClicked
        Artikelinspektion.setSize(1440, 630);
        Minimizer3.setSize(1440, 40);
        Expander3.setSize(1440, 0);
        
    }//GEN-LAST:event_Expander3MouseClicked

    private void Minimizer2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Minimizer2MouseClicked
        Panelartikelliste.setSize(1440, 40);
        Minimizer2.setSize(1440, 0);
        Expander2.setSize(1440, 40);

        Point currentLocationArtikelinspektion = Artikelinspektion.getLocation();
        int newXInspektion = currentLocationArtikelinspektion.x;
        int newYInspektion = currentLocationArtikelinspektion.y - 590;
        Artikelinspektion.setLocation(newXInspektion, newYInspektion);
        
    }//GEN-LAST:event_Minimizer2MouseClicked

    private void Expander2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Expander2MouseClicked
        Minimizer2.setSize(1440, 40);
        Expander2.setSize(1440, 0);
        Panelartikelliste.setSize(1440, 630);

        Point currentLocationArtikelinspektion = Artikelinspektion.getLocation();
        int newXInspektion = currentLocationArtikelinspektion.x;
        int newYInspektion = currentLocationArtikelinspektion.y + 590;
        Artikelinspektion.setLocation(newXInspektion, newYInspektion);
        
    }//GEN-LAST:event_Expander2MouseClicked

    private void jLabel100MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel100MouseEntered
        
    }//GEN-LAST:event_jLabel100MouseEntered

    private void jLabel100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel100MouseClicked
        Random rand = new Random();
        int num = rand.nextInt(99999999) + 10000000;
        Artikelnummer_hinzufugen.setText(Integer.toString(num));
        
    }//GEN-LAST:event_jLabel100MouseClicked

    private void jLabel99MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel99MouseClicked
        Artikelnummer_hinzufugen.setText("");
        Artikelbezeichnung_hinzufugen.setText("");
        Artikelbeschreibung_hinzufugen.setText("");
        Artikelkalorien_hinzufugen.setText("");
        Artikelkohlenhydrate_hinzufugen.setText("");
        Artikelproteine_hinzufugen.setText("");
        Artikelfette_hinzufugen.setText("");
        Artikelzutaten_hinzufugen.setText("");
        Artikelpreis_hinzufugen.setText("");
        Bildpfad.setText("");
        Artikeldauer.setText("");
        Imagezeiger.setIcon(null);
        
    }//GEN-LAST:event_jLabel99MouseClicked

    private void BildhochladenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildhochladenMouseClicked


        String bildpfad = Bildpfad.getText();

        try {
            BufferedImage originalImage = ImageIO.read(new File(bildpfad));
            Image resizedImage = originalImage.getScaledInstance(230, 170, Image.SCALE_DEFAULT);
            ImageIcon imageIcon = new ImageIcon(resizedImage);

         
            Imagezeiger.setIcon(imageIcon);
        } catch (IOException ex) {
            jLabel21.setText("Error: " + ex.getMessage());
        }

      
    }//GEN-LAST:event_BildhochladenMouseClicked

    private void VegiboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VegiboxActionPerformed
        
    }//GEN-LAST:event_VegiboxActionPerformed

    private void jLabel98MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel98MouseClicked
        String artikelnummer = Artikelnummer_hinzufugen.getText();
        String bildpfad = Bildpfad.getText();
        String bildname = artikelnummer + ".jpg";
        File imageFile = new File(bildpfad);
        File destinationFile = new File("src/data/images/article/" + bildname);

        try {
            BufferedImage originalImage = ImageIO.read(imageFile);
            Image resizedImage = originalImage.getScaledInstance(230, 170, Image.SCALE_DEFAULT);
            BufferedImage bufferedResizedImage = new BufferedImage(230, 170, BufferedImage.TYPE_INT_RGB);
            bufferedResizedImage.getGraphics().drawImage(resizedImage, 0, 0, null);
            ImageIcon imageIcon = new ImageIcon(bufferedResizedImage);

            ImageIO.write(bufferedResizedImage, "jpg", destinationFile);
            System.out.println("File copied successfully");

        } catch (IOException ex) {
            jLabel21.setText("Error: " + ex.getMessage());

        }

        final int MIN_LENGTH = 8; 

        Artikelnummer_hinzufugen.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkInput();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkInput();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkInput();
            }

            private void checkInput() {
                String input2 = Artikelnummer_hinzufugen.getText();
            }
        });

        if (Artikelnummer_hinzufugen.getText().length() != MIN_LENGTH) {
            JOptionPane.showMessageDialog(jLabel21, "Ungültige Eingabe. Der Artikelnummer muss " + MIN_LENGTH + " Stellen haben.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else if (Artikelnummer_hinzufugen.getText().length() == MIN_LENGTH) {
            if (Artikelnummer_hinzufugen.getText().isEmpty() || Artikelbezeichnung_hinzufugen.getText().isEmpty() || Artikelpreis_hinzufugen.getText().isEmpty()) {
                JOptionPane.showMessageDialog(jLabel48, "Bitte füllen Sie alle Felder aus", "Input Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try ( 
                        Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {
                    String kategorieSql = "SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?";
                    try (PreparedStatement kategorieStmt = conn.prepareStatement(kategorieSql)) {
                        kategorieStmt.setString(1, KategorieCombobox.getSelectedItem().toString());
                        ResultSet kategorieResult = kategorieStmt.executeQuery();
                        if (kategorieResult.next()) {
                            int kategorieId = kategorieResult.getInt("Kategorie_ID");
                     
                            String sql = "INSERT INTO artikelliste (Artikelnummer, Artikelbezeichnung, Artikelbeschreibung, Kategorie_ID, Kohlenhydrate, Kalorien, Proteine, Fette, Artikelzutaten, Preis, Icon, Dauer, Vegetarisch, Bio, Vegan) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                                pstmt.setString(1, Artikelnummer_hinzufugen.getText());
                                pstmt.setString(2, Artikelbezeichnung_hinzufugen.getText());
                                pstmt.setString(3, Artikelbeschreibung_hinzufugen.getText());
                                pstmt.setInt(4, kategorieId); 
                                pstmt.setFloat(5, Float.parseFloat(Artikelkalorien_hinzufugen.getText()));
                                pstmt.setFloat(6, Float.parseFloat(Artikelkohlenhydrate_hinzufugen.getText()));
                                pstmt.setFloat(7, Float.parseFloat(Artikelproteine_hinzufugen.getText()));
                                pstmt.setFloat(8, Float.parseFloat(Artikelfette_hinzufugen.getText()));
                                pstmt.setString(9, Artikelzutaten_hinzufugen.getText());
                                pstmt.setFloat(10, Float.parseFloat(Artikelpreis_hinzufugen.getText()));
                                pstmt.setString(11, "src/data/images/article/" + bildname);
                                pstmt.setInt(12, Integer.parseInt(Artikeldauer.getText()));
                                pstmt.setString(13, Vegibox.getSelectedItem().toString());
                                pstmt.setString(14, Biobox.getSelectedItem().toString());
                                pstmt.setString(15, Veganbox.getSelectedItem().toString());
                                pstmt.executeUpdate();
                                jLabel21.setText("Erfolgreich hinzugefügt");
                                yyy.setSize(30, 30);
                                javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
                                    
                                    SwingUtilities.invokeLater(() -> {
                                        jLabel21.setText("");
                                        yyy.setSize(30, 0);
                                    });
                                });
                                timer.setRepeats(false);
                                timer.start();
                            } catch (SQLException e) {
                                jLabel21.setText("Error: " + e.getMessage());
                                System.out.println(e);
                                JOptionPane.showMessageDialog(null, "Fehler beim Einfügen in die Datenbank: " + e.getMessage(), "Datenbankfehler", JOptionPane.ERROR_MESSAGE);
                         
                                if (destinationFile.exists()) {
                                    if (destinationFile.delete()) {
                                        System.out.println("Deleted the created image file.");
                                    } else {
                                        System.out.println("Failed to delete the created image file.");
                                    }
                                } else {
                                    System.out.println("The created image file does not exist.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println(e);
                           
                                JOptionPane.showMessageDialog(null, "Falscher Datentyp eingegeben: " + e.getMessage(), "Eingabefehler", JOptionPane.ERROR_MESSAGE);
                            }

                        
                        }
                        Artikelnummer_hinzufugen.setText("");
                        Artikelbezeichnung_hinzufugen.setText("");
                        Artikelbeschreibung_hinzufugen.setText("");
                        Artikelkalorien_hinzufugen.setText("");
                        Artikelkohlenhydrate_hinzufugen.setText("");
                        Artikelproteine_hinzufugen.setText("");
                        Artikelfette_hinzufugen.setText("");
                        Artikelzutaten_hinzufugen.setText("");
                        Artikelpreis_hinzufugen.setText("");
                        Bildpfad.setText("");
                        Artikeldauer.setText("");
                        Imagezeiger.setIcon(null);

                    } catch (SQLException ex) {
                        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
                        Statement st = con.createStatement();
                        String sql = "SELECT Artikelnummer, Artikelbezeichnung, Artikelbeschreibung, Artikelkategorie, Kalorien, Kohlenhydrate, Proteine, Fette, Artikelzutaten, Preis, Icon, Dauer, Vegetarisch, Bio, Vegan FROM artikelliste";
                        ResultSet rs = st.executeQuery(sql);

                        DefaultTableModel tblModel = (DefaultTableModel) Artikellistetabelle.getModel();
                        tblModel.setRowCount(0); 

                        while (rs.next()) {
                            String Artikelnummer = rs.getString("Artikelnummer");
                            String Artikelbezeichnung = rs.getString("Artikelbezeichnung");
                            String Artikelbeschreibung = rs.getString("Artikelbeschreibung");
                            String Artikelkategorie = rs.getString("Artikelkategorie");
                            float Kalorien = rs.getFloat("Kalorien");
                            float Kohlenhydrate = rs.getFloat("Kohlenhydrate");
                            float Proteine = rs.getFloat("Proteine");
                            float Fette = rs.getFloat("Fette");
                            String Zutatenliste = rs.getString("Artikelzutaten");
                            float Preis = rs.getFloat("Preis");
                            String Icon = rs.getString("Icon");
                            float Dauer = rs.getFloat("Dauer");
                            String Vegetarisch = rs.getString("Vegetarisch");
                            String Bio = rs.getString("Bio");
                            String Vegan = rs.getString("Vegan");

                            String tbData[] = {Artikelnummer, Artikelbezeichnung, Artikelbeschreibung, Artikelkategorie, String.valueOf(Kalorien), String.valueOf(Kohlenhydrate), String.valueOf(Proteine), String.valueOf(Fette), Zutatenliste, String.valueOf(Preis), Icon, String.valueOf(Dauer), Vegetarisch, Bio, Vegan};
                            tblModel.addRow(tbData);
                        }
                    }
                } catch (ClassNotFoundException | SQLException e) {
                    System.out.println(e.getMessage());
                }

                Artikellistetabelle.setAutoCreateRowSorter(true);
            }
        }

    }//GEN-LAST:event_jLabel98MouseClicked

    private void BioboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BioboxActionPerformed
        
    }//GEN-LAST:event_BioboxActionPerformed

    private void VeganboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VeganboxActionPerformed
        
    }//GEN-LAST:event_VeganboxActionPerformed

    private void KategorieComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KategorieComboboxActionPerformed
        
    }//GEN-LAST:event_KategorieComboboxActionPerformed

    private void BildpfadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BildpfadActionPerformed
        
    }//GEN-LAST:event_BildpfadActionPerformed

    private void Artikelproteine_hinzufugenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Artikelproteine_hinzufugenActionPerformed
        
    }//GEN-LAST:event_Artikelproteine_hinzufugenActionPerformed

    private void Minimizer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Minimizer1MouseClicked
        Panelartikel.setSize(1440, 40);

        Point currentLocation = Panelartikelliste.getLocation();
        int newX = currentLocation.x;
        int newY = currentLocation.y - 590;
        Panelartikelliste.setLocation(newX, newY);

        Point currentLocationArtikelinspektion = Artikelinspektion.getLocation();
        int newXInspektion = currentLocationArtikelinspektion.x;
        int newYInspektion = currentLocationArtikelinspektion.y - 590;
        Artikelinspektion.setLocation(newXInspektion, newYInspektion);
        Expander1.setSize(1440, 40);
        Minimizer1.setSize(1440, 0);
        
    }//GEN-LAST:event_Minimizer1MouseClicked

    private void Expander1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Expander1MouseClicked
        Panelartikel.setSize(1440, 630);
        
        Point currentLocation = Panelartikelliste.getLocation();
        int newX = currentLocation.x;
        int newY = currentLocation.y + 590;
        Panelartikelliste.setLocation(newX, newY);

        Point currentLocationArtikelinspektion = Artikelinspektion.getLocation();
        int newXInspektion = currentLocationArtikelinspektion.x;
        int newYInspektion = currentLocationArtikelinspektion.y + 590;
        Artikelinspektion.setLocation(newXInspektion, newYInspektion);

        Expander1.setSize(1440, 0);
        Minimizer1.setSize(1440, 40);
        
    }//GEN-LAST:event_Expander1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();
            JTextField textField = Bildpfad; 
            textField.setText(filePath);
            
        }

        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel79MouseClicked
        
    }//GEN-LAST:event_jLabel79MouseClicked

    private void jLabel79MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel79MouseEntered
        
    }//GEN-LAST:event_jLabel79MouseEntered

    private void jLabel79MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel79MouseExited
        
    }//GEN-LAST:event_jLabel79MouseExited

    private void Showdata1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Showdata1MouseClicked

        jPanel7.removeAll();
        jPanel7.add(Artikel);
        jPanel7.repaint();
        jPanel7.revalidate();

        
        Kategorie1_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_6.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_7.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_1.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_6.setBackground(new java.awt.Color(51, 51, 51));
       

        try (Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {


            String sql1_2 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql1_2)) {
                pstmt1.setDouble(1, 1.2);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung1_2 = rs1.getString("Kategoriebezeichnung");
                Kategorie1_2.setText(kategoriebezeichnung1_2);
            }

        
            String sql1_3 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt2 = conn.prepareStatement(sql1_3)) {
                pstmt2.setDouble(1, 1.3);
                ResultSet rs2 = pstmt2.executeQuery();
                rs2.next();
                String kategoriebezeichnung1_3 = rs2.getString("Kategoriebezeichnung");
                Kategorie1_3.setText(kategoriebezeichnung1_3);
            }

     
            String sql1_4 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_4)) {
                pstmt3.setDouble(1, 1.4);
                ResultSet rs3 = pstmt3.executeQuery();
                rs3.next();
                String kategoriebezeichnung1_4 = rs3.getString("Kategoriebezeichnung");
                Kategorie1_4.setText(kategoriebezeichnung1_4);
            }

     
            String sql1_5 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_5)) {
                pstmt3.setDouble(1, 1.5);
                ResultSet rs3 = pstmt3.executeQuery();
                rs3.next();
                String kategoriebezeichnung1_5 = rs3.getString("Kategoriebezeichnung");
                Kategorie1_5.setText(kategoriebezeichnung1_5);
            }


            String sql1_6 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_6)) {
                pstmt3.setDouble(1, 1.6);
                ResultSet rs3 = pstmt3.executeQuery();
                rs3.next();
                String kategoriebezeichnung1_6 = rs3.getString("Kategoriebezeichnung");
                Kategorie1_6.setText(kategoriebezeichnung1_6);
            }

          
            String sql1_7 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_7)) {
                pstmt3.setDouble(1, 1.7);
                ResultSet rs3 = pstmt3.executeQuery();
                rs3.next();
                String kategoriebezeichnung1_7 = rs3.getString("Kategoriebezeichnung");
                Kategorie1_7.setText(kategoriebezeichnung1_7);
            }

 
            String sql2_1 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_1)) {
                pstmt1.setDouble(1, 2.1);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_1 = rs1.getString("Kategoriebezeichnung");
                Kategorie2_1.setText(kategoriebezeichnung2_1);
            }

          
            String sql2_2 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_2)) {
                pstmt1.setDouble(1, 2.2);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_2 = rs1.getString("Kategoriebezeichnung");
                Kategorie2_2.setText(kategoriebezeichnung2_2);
            }

        
            String sql2_3 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_3)) {
                pstmt1.setDouble(1, 2.3);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_3 = rs1.getString("Kategoriebezeichnung");
                Kategorie2_3.setText(kategoriebezeichnung2_3);
            }

 
            String sql2_4 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_4)) {
                pstmt1.setDouble(1, 2.4);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_4 = rs1.getString("Kategoriebezeichnung");
                Kategorie2_4.setText(kategoriebezeichnung2_4);
            }

          
            String sql2_5 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_5)) {
                pstmt1.setDouble(1, 2.5);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_5 = rs1.getString("Kategoriebezeichnung");
                Kategorie2_5.setText(kategoriebezeichnung2_5);
            }

       
            String sql2_6 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_6)) {
                pstmt1.setDouble(1, 2.6);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_6 = rs1.getString("Kategoriebezeichnung");
                Kategorie2_6.setText(kategoriebezeichnung2_6);
            }

           
//            String sql2_7 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
//            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_7)) {
//                pstmt1.setDouble(1, 2.7);
//                ResultSet rs1 = pstmt1.executeQuery();
//                rs1.next();
//                String kategoriebezeichnung2_7 = rs1.getString("Kategoriebezeichnung");
//                Kategorie2_7.setText(kategoriebezeichnung2_7);
//            }

        } catch (SQLException e) {
            System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
                Statement st = con.createStatement();
                String sql = "SELECT a.Artikelnummer, a.Artikelbezeichnung, k.Kategoriebezeichnung AS Artikelkategorie, a.Verfügbar FROM artikelliste a JOIN kategorien k ON a.Kategorie_ID = k.Kategorie_ID";
                ResultSet rs = st.executeQuery(sql);

                DefaultTableModel tblModel = (DefaultTableModel) Artikeltabelle.getModel();
                tblModel.setRowCount(0); 

                while (rs.next()) {
                    String Artikelnummer = rs.getString("Artikelnummer");
                    String Artikelbezeichnung = rs.getString("Artikelbezeichnung");
                    String Kategorie = rs.getString("Artikelkategorie");
                    String Verfügbar = rs.getString("Verfügbar");

                    String tbData[] = {Artikelnummer, Artikelbezeichnung, Kategorie, Verfügbar};
                    tblModel.addRow(tbData);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

        Artikeltabelle.setAutoCreateRowSorter(true);

        
    }//GEN-LAST:event_Showdata1MouseClicked

    private void Showdata2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Showdata2MouseClicked
        jPanel7.removeAll();
        jPanel7.add(Kategorie);
        jPanel7.repaint();
        jPanel7.revalidate();

        try (Connection conn = DriverManager.getConnection(Mysqllink, username, password)) {


            String sql1_2 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql1_2)) {
                pstmt1.setDouble(1, 1.2);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung1_2 = rs1.getString("Kategoriebezeichnung");
                DefinitionKategorie1_2.setText(kategoriebezeichnung1_2);
            }

   
            String sql1_3 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt2 = conn.prepareStatement(sql1_3)) {
                pstmt2.setDouble(1, 1.3);
                ResultSet rs2 = pstmt2.executeQuery();
                rs2.next();
                String kategoriebezeichnung1_3 = rs2.getString("Kategoriebezeichnung");
                DefinitionKategorie1_3.setText(kategoriebezeichnung1_3);
            }

        
            String sql1_4 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_4)) {
                pstmt3.setDouble(1, 1.4);
                ResultSet rs3 = pstmt3.executeQuery();
                rs3.next();
                String kategoriebezeichnung1_4 = rs3.getString("Kategoriebezeichnung");
                DefinitionKategorie1_4.setText(kategoriebezeichnung1_4);
            }

           
            String sql1_5 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_5)) {
                pstmt3.setDouble(1, 1.5);
                ResultSet rs3 = pstmt3.executeQuery();
                rs3.next();
                String kategoriebezeichnung1_5 = rs3.getString("Kategoriebezeichnung");
                DefinitionKategorie1_5.setText(kategoriebezeichnung1_5);
            }


            String sql1_6 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_6)) {
                pstmt3.setDouble(1, 1.6);
                ResultSet rs3 = pstmt3.executeQuery();
                rs3.next();
                String kategoriebezeichnung1_6 = rs3.getString("Kategoriebezeichnung");
                DefinitionKategorie1_6.setText(kategoriebezeichnung1_6);
            }

           
            String sql1_7 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt3 = conn.prepareStatement(sql1_7)) {
                pstmt3.setDouble(1, 1.7);
                ResultSet rs3 = pstmt3.executeQuery();
                rs3.next();
                String kategoriebezeichnung1_7 = rs3.getString("Kategoriebezeichnung");
                DefinitionKategorie1_7.setText(kategoriebezeichnung1_7);
            }

        
            String sql2_1 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_1)) {
                pstmt1.setDouble(1, 2.1);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_1 = rs1.getString("Kategoriebezeichnung");
                DefinitionKategorie2_1.setText(kategoriebezeichnung2_1);
            }

        
            String sql2_2 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_2)) {
                pstmt1.setDouble(1, 2.2);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_2 = rs1.getString("Kategoriebezeichnung");
                DefinitionKategorie2_2.setText(kategoriebezeichnung2_2);
            }

            
            String sql2_3 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_3)) {
                pstmt1.setDouble(1, 2.3);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_3 = rs1.getString("Kategoriebezeichnung");
                DefinitionKategorie2_3.setText(kategoriebezeichnung2_3);
            }

       
            String sql2_4 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_4)) {
                pstmt1.setDouble(1, 2.4);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_4 = rs1.getString("Kategoriebezeichnung");
                DefinitionKategorie2_4.setText(kategoriebezeichnung2_4);
            }

    
            String sql2_5 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_5)) {
                pstmt1.setDouble(1, 2.5);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_5 = rs1.getString("Kategoriebezeichnung");
                DefinitionKategorie2_5.setText(kategoriebezeichnung2_5);
            }

   
            String sql2_6 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_6)) {
                pstmt1.setDouble(1, 2.6);
                ResultSet rs1 = pstmt1.executeQuery();
                rs1.next();
                String kategoriebezeichnung2_6 = rs1.getString("Kategoriebezeichnung");
                DefinitionKategorie2_6.setText(kategoriebezeichnung2_6);
            }

       
//            String sql2_7 = "SELECT k.Kategoriebezeichnung FROM kategorien k INNER JOIN kategorielayout kl ON k.Kategorie_ID = kl.Kategorie_Nummer WHERE kl.Reihe = ?";
//            try (PreparedStatement pstmt1 = conn.prepareStatement(sql2_7)) {
//                pstmt1.setDouble(1, 2.7);
//                ResultSet rs1 = pstmt1.executeQuery();
//                rs1.next();
//                String kategoriebezeichnung2_7 = rs1.getString("Kategoriebezeichnung");
//                DefinitionKategorie2_7.setText(kategoriebezeichnung2_7);
//            }

        } catch (SQLException e) {
            System.out.println("Kategorie nicht gefundne " + e.getMessage());
        }

        
    }//GEN-LAST:event_Showdata2MouseClicked

    private void BildFeld15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld15MouseClicked

        
    }//GEN-LAST:event_BildFeld15MouseClicked

    private void BildFeld15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld15MouseEntered

        
    }//GEN-LAST:event_BildFeld15MouseEntered

    private void BildFeld15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld15MouseExited

        
    }//GEN-LAST:event_BildFeld15MouseExited

    private void Kategorie2_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_1MouseClicked
     
        Kategorie1_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_6.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_7.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_1.setBackground(new java.awt.Color(64, 81, 59));
        Kategorie2_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_6.setBackground(new java.awt.Color(51, 51, 51));
    

        String kategoriebezeichnung1_4 = Kategorie2_1.getText();

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
               
            }

           
           
           Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );

       
        } catch (SQLException e) {
            System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
           
            Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        }
        
    }//GEN-LAST:event_Kategorie2_1MouseClicked

    private void Kategorie2_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_1MouseEntered
        
    }//GEN-LAST:event_Kategorie2_1MouseEntered

    private void Kategorie2_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_1MouseExited
        
    }//GEN-LAST:event_Kategorie2_1MouseExited

    private void DefinitionKategorie1_15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_15MouseClicked
        
    }//GEN-LAST:event_DefinitionKategorie1_15MouseClicked

    private void DefinitionKategorie1_15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_15MouseEntered
        
    }//GEN-LAST:event_DefinitionKategorie1_15MouseEntered

    private void DefinitionKategorie1_15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefinitionKategorie1_15MouseExited
        
    }//GEN-LAST:event_DefinitionKategorie1_15MouseExited

    private void Kategorie2_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_6MouseClicked
   
        Kategorie1_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_6.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_7.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_1.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_6.setBackground(new java.awt.Color(64, 81, 59));
        

        String kategoriebezeichnung1_4 = Kategorie2_6.getText();

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
               
            }

            ArtikelFeld01.setText("01");
           
            Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );

          
        } catch (SQLException e) {
            System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
           
           Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        }
        
    }//GEN-LAST:event_Kategorie2_6MouseClicked

    private void Kategorie2_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_6MouseEntered
        
    }//GEN-LAST:event_Kategorie2_6MouseEntered

    private void Kategorie2_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_6MouseExited
        
    }//GEN-LAST:event_Kategorie2_6MouseExited

    private void Kategorie2_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_4MouseClicked
     
        Kategorie1_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_6.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_7.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_1.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_4.setBackground(new java.awt.Color(64, 81, 59));
        Kategorie2_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_6.setBackground(new java.awt.Color(51, 51, 51));
       

        String kategoriebezeichnung1_4 = Kategorie2_4.getText();

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
               
            }

            ArtikelFeld01.setText("01");
           
           Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );

            
        } catch (SQLException e) {
            System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
           
            Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        }
        
    }//GEN-LAST:event_Kategorie2_4MouseClicked

    private void Kategorie2_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_4MouseEntered
        
    }//GEN-LAST:event_Kategorie2_4MouseEntered

    private void Kategorie2_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_4MouseExited
        
    }//GEN-LAST:event_Kategorie2_4MouseExited

    private void Kategorie1_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_7MouseClicked
      
        Kategorie1_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_6.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_7.setBackground(new java.awt.Color(64, 81, 59));
        Kategorie2_1.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_6.setBackground(new java.awt.Color(51, 51, 51));
   

        String kategoriebezeichnung1_4 = Kategorie1_7.getText();

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
               
            }

            ArtikelFeld01.setText("01");
           
           Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );

        } catch (SQLException e) {
            System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
           
            Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        }        
    }//GEN-LAST:event_Kategorie1_7MouseClicked

    private void Kategorie1_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_7MouseEntered
        
    }//GEN-LAST:event_Kategorie1_7MouseEntered

    private void Kategorie1_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_7MouseExited
        
    }//GEN-LAST:event_Kategorie1_7MouseExited

    private void Kategorie1_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_2MouseClicked
       
        Kategorie1_2.setBackground(new java.awt.Color(64, 81, 59));
        Kategorie1_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_6.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_7.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_1.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_6.setBackground(new java.awt.Color(51, 51, 51));
       

        String kategoriebezeichnung1_4 = Kategorie1_2.getText();

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
               
            }

          
           
            Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );

       
        } catch (SQLException e) {
            System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
           
            Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        }

        
    }//GEN-LAST:event_Kategorie1_2MouseClicked

    private void Kategorie1_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_2MouseEntered
        
    }//GEN-LAST:event_Kategorie1_2MouseEntered

    private void Kategorie1_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_2MouseExited
        
    }//GEN-LAST:event_Kategorie1_2MouseExited

    private void Kategorie1_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_6MouseClicked
      
        Kategorie1_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_6.setBackground(new java.awt.Color(64, 81, 59));
        Kategorie1_7.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_1.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_6.setBackground(new java.awt.Color(51, 51, 51));
      

        String kategoriebezeichnung1_4 = Kategorie1_6.getText();

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
               
            }

            ArtikelFeld01.setText("01");
           
            Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );

          
        } catch (SQLException e) {
            System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
           
            Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        }
        
    }//GEN-LAST:event_Kategorie1_6MouseClicked

    private void Kategorie1_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_6MouseEntered
        
    }//GEN-LAST:event_Kategorie1_6MouseEntered

    private void Kategorie1_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_6MouseExited
        
    }//GEN-LAST:event_Kategorie1_6MouseExited

    private void Kategorie2_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_5MouseClicked
      
        Kategorie1_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_6.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_7.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_1.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_5.setBackground(new java.awt.Color(64, 81, 59));
        Kategorie2_6.setBackground(new java.awt.Color(51, 51, 51));
   

        String kategoriebezeichnung1_4 = Kategorie2_5.getText();

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
               
            }

            ArtikelFeld01.setText("01");
           
           Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );

      
        } catch (SQLException e) {
            System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
           
           Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        }
        
    }//GEN-LAST:event_Kategorie2_5MouseClicked

    private void Kategorie2_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_5MouseEntered
        
    }//GEN-LAST:event_Kategorie2_5MouseEntered

    private void Kategorie2_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_5MouseExited
        
    }//GEN-LAST:event_Kategorie2_5MouseExited

    private void Kategorie1_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_4MouseClicked
        
        Kategorie1_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_4.setBackground(new java.awt.Color(64, 81, 59));
        Kategorie1_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_6.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_7.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_1.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_6.setBackground(new java.awt.Color(51, 51, 51));


        String kategoriebezeichnung1_4 = Kategorie1_4.getText();

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
               
            }

          
           
           Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );

          
        } catch (SQLException e) {
            System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
           
            Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        }
        
    }//GEN-LAST:event_Kategorie1_4MouseClicked

    private void Kategorie1_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_4MouseEntered
        
    }//GEN-LAST:event_Kategorie1_4MouseEntered

    private void Kategorie1_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_4MouseExited
        
    }//GEN-LAST:event_Kategorie1_4MouseExited

    private void Kategorie1_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_5MouseClicked

        Kategorie1_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_5.setBackground(new java.awt.Color(64, 81, 59));
        Kategorie1_6.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_7.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_1.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_6.setBackground(new java.awt.Color(51, 51, 51));
     

        String kategoriebezeichnung1_4 = Kategorie1_5.getText();

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
               
            }

            ArtikelFeld01.setText("01");
           
           Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );

           
        } catch (SQLException e) {
            System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
           
           Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        }        
    }//GEN-LAST:event_Kategorie1_5MouseClicked

    private void Kategorie1_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_5MouseEntered
        
    }//GEN-LAST:event_Kategorie1_5MouseEntered

    private void Kategorie1_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_5MouseExited
        
    }//GEN-LAST:event_Kategorie1_5MouseExited

    private void Kategorie1_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_3MouseClicked
        
        Kategorie1_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_3.setBackground(new java.awt.Color(64, 81, 59));
        Kategorie1_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_6.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_7.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_1.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_6.setBackground(new java.awt.Color(51, 51, 51));
     

        String kategoriebezeichnung1_4 = Kategorie1_3.getText();

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
               
            }

           
            Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );

        
        } catch (SQLException e) {
            System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
           
            Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        }

    }//GEN-LAST:event_Kategorie1_3MouseClicked

    private void Kategorie1_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_3MouseEntered
        
    }//GEN-LAST:event_Kategorie1_3MouseEntered

    private void Kategorie1_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie1_3MouseExited
        
    }//GEN-LAST:event_Kategorie1_3MouseExited

    private void Kategorie2_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_2MouseClicked
     
        Kategorie1_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_6.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_7.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_1.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_2.setBackground(new java.awt.Color(64, 81, 59));
        Kategorie2_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_6.setBackground(new java.awt.Color(51, 51, 51));
        

        String kategoriebezeichnung1_4 = Kategorie2_2.getText();

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
               
            }

         
           
            Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );

        
        } catch (SQLException e) {
            System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
           
            Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        }
        
    }//GEN-LAST:event_Kategorie2_2MouseClicked

    private void Kategorie2_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_2MouseEntered
        
    }//GEN-LAST:event_Kategorie2_2MouseEntered

    private void Kategorie2_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_2MouseExited
        
    }//GEN-LAST:event_Kategorie2_2MouseExited

    private void Kategorie2_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_3MouseClicked

        Kategorie1_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_3.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_6.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie1_7.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_1.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_2.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_3.setBackground(new java.awt.Color(64, 81, 59));
        Kategorie2_4.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_5.setBackground(new java.awt.Color(51, 51, 51));
        Kategorie2_6.setBackground(new java.awt.Color(51, 51, 51));
        

        String kategoriebezeichnung1_4 = Kategorie2_3.getText();

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
               
            }

            
           
            Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );

        } catch (SQLException e) {
            System.out.println("Error retrieving Kategoriebezeichnung: " + e.getMessage());
           
            Layout Layout = new Layout();
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        }
        
    }//GEN-LAST:event_Kategorie2_3MouseClicked

    private void Kategorie2_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_3MouseEntered
        
    }//GEN-LAST:event_Kategorie2_3MouseEntered

    private void Kategorie2_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kategorie2_3MouseExited
        
    }//GEN-LAST:event_Kategorie2_3MouseExited

    private void BildFeld05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld05MouseClicked
        
    }//GEN-LAST:event_BildFeld05MouseClicked

    private void BildFeld05MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld05MouseEntered
        
    }//GEN-LAST:event_BildFeld05MouseEntered

    private void BildFeld05MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld05MouseExited
        
    }//GEN-LAST:event_BildFeld05MouseExited

    private void BildFeld10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld10MouseClicked
        
    }//GEN-LAST:event_BildFeld10MouseClicked

    private void BildFeld10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld10MouseEntered
        
    }//GEN-LAST:event_BildFeld10MouseEntered

    private void BildFeld10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld10MouseExited
        
    }//GEN-LAST:event_BildFeld10MouseExited

    private void BildFeld01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld01MouseClicked
        
    }//GEN-LAST:event_BildFeld01MouseClicked

    private void BildFeld01MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld01MouseEntered
        
    }//GEN-LAST:event_BildFeld01MouseEntered

    private void BildFeld01MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld01MouseExited
        
    }//GEN-LAST:event_BildFeld01MouseExited

    private void BildFeld02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld02MouseClicked
        
    }//GEN-LAST:event_BildFeld02MouseClicked

    private void BildFeld02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld02MouseEntered
        
    }//GEN-LAST:event_BildFeld02MouseEntered

    private void BildFeld02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld02MouseExited
        
    }//GEN-LAST:event_BildFeld02MouseExited

    private void BildFeld03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld03MouseClicked
        
    }//GEN-LAST:event_BildFeld03MouseClicked

    private void BildFeld03MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld03MouseEntered
        
    }//GEN-LAST:event_BildFeld03MouseEntered

    private void BildFeld03MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld03MouseExited
        
    }//GEN-LAST:event_BildFeld03MouseExited

    private void BildFeld04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld04MouseClicked
        
    }//GEN-LAST:event_BildFeld04MouseClicked

    private void BildFeld04MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld04MouseEntered
        
    }//GEN-LAST:event_BildFeld04MouseEntered

    private void BildFeld04MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld04MouseExited
        
    }//GEN-LAST:event_BildFeld04MouseExited

    private void BildFeld06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld06MouseClicked
        
    }//GEN-LAST:event_BildFeld06MouseClicked

    private void BildFeld06MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld06MouseEntered
        
    }//GEN-LAST:event_BildFeld06MouseEntered

    private void BildFeld06MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld06MouseExited
        
    }//GEN-LAST:event_BildFeld06MouseExited

    private void BildFeld07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld07MouseClicked
        
    }//GEN-LAST:event_BildFeld07MouseClicked

    private void BildFeld07MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld07MouseEntered
        
    }//GEN-LAST:event_BildFeld07MouseEntered

    private void BildFeld07MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld07MouseExited
        
    }//GEN-LAST:event_BildFeld07MouseExited

    private void BildFeld08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld08MouseClicked
        
    }//GEN-LAST:event_BildFeld08MouseClicked

    private void BildFeld08MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld08MouseEntered
        
    }//GEN-LAST:event_BildFeld08MouseEntered

    private void BildFeld08MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld08MouseExited
        
    }//GEN-LAST:event_BildFeld08MouseExited

    private void BildFeld09MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld09MouseClicked
        
    }//GEN-LAST:event_BildFeld09MouseClicked

    private void BildFeld09MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld09MouseEntered
        
    }//GEN-LAST:event_BildFeld09MouseEntered

    private void BildFeld09MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld09MouseExited
        
    }//GEN-LAST:event_BildFeld09MouseExited

    private void Image13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image13MouseClicked
        
    }//GEN-LAST:event_Image13MouseClicked

    private void Image13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image13MouseEntered
        
    }//GEN-LAST:event_Image13MouseEntered

    private void Image13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image13MouseExited
        
    }//GEN-LAST:event_Image13MouseExited

    private void BildFeld11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld11MouseClicked
        
    }//GEN-LAST:event_BildFeld11MouseClicked

    private void BildFeld11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld11MouseEntered
        
    }//GEN-LAST:event_BildFeld11MouseEntered

    private void BildFeld11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld11MouseExited
        
    }//GEN-LAST:event_BildFeld11MouseExited

    private void BildFeld12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld12MouseClicked
        
    }//GEN-LAST:event_BildFeld12MouseClicked

    private void BildFeld12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld12MouseEntered
        
    }//GEN-LAST:event_BildFeld12MouseEntered

    private void BildFeld12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld12MouseExited
        
    }//GEN-LAST:event_BildFeld12MouseExited

    private void BildFeld13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld13MouseClicked
        
    }//GEN-LAST:event_BildFeld13MouseClicked

    private void BildFeld13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld13MouseEntered
        
    }//GEN-LAST:event_BildFeld13MouseEntered

    private void BildFeld13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld13MouseExited
        
    }//GEN-LAST:event_BildFeld13MouseExited

    private void BildFeld14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld14MouseClicked
        
    }//GEN-LAST:event_BildFeld14MouseClicked

    private void BildFeld14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld14MouseEntered
        
    }//GEN-LAST:event_BildFeld14MouseEntered

    private void BildFeld14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildFeld14MouseExited
        
    }//GEN-LAST:event_BildFeld14MouseExited

    private void LeerenFeld11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerenFeld11ActionPerformed
        
    }//GEN-LAST:event_LeerenFeld11ActionPerformed

    private void LeerenFeld01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerenFeld01ActionPerformed
        
    }//GEN-LAST:event_LeerenFeld01ActionPerformed

    private void LeerenFeld02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerenFeld02ActionPerformed
        
    }//GEN-LAST:event_LeerenFeld02ActionPerformed

    private void LeerenFeld03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerenFeld03ActionPerformed
        
    }//GEN-LAST:event_LeerenFeld03ActionPerformed

    private void LeerenFeld04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerenFeld04ActionPerformed
        
    }//GEN-LAST:event_LeerenFeld04ActionPerformed

    private void LeerenFeld05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerenFeld05ActionPerformed
        
    }//GEN-LAST:event_LeerenFeld05ActionPerformed

    private void LeerenFeld10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerenFeld10ActionPerformed
        
    }//GEN-LAST:event_LeerenFeld10ActionPerformed

    private void LeerenFeld09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerenFeld09ActionPerformed
        
    }//GEN-LAST:event_LeerenFeld09ActionPerformed

    private void LeerenFeld15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerenFeld15ActionPerformed
        
    }//GEN-LAST:event_LeerenFeld15ActionPerformed

    private void LeerenFeld14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerenFeld14ActionPerformed
        
    }//GEN-LAST:event_LeerenFeld14ActionPerformed

    private void LeerenFeld13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerenFeld13ActionPerformed
        
    }//GEN-LAST:event_LeerenFeld13ActionPerformed

    private void LeerenFeld08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerenFeld08ActionPerformed
        
    }//GEN-LAST:event_LeerenFeld08ActionPerformed

    private void LeerenFeld07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerenFeld07ActionPerformed
        
    }//GEN-LAST:event_LeerenFeld07ActionPerformed

    private void LeerenFeld12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerenFeld12ActionPerformed
        
    }//GEN-LAST:event_LeerenFeld12ActionPerformed

    private void LeerenFeld06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerenFeld06ActionPerformed
        
    }//GEN-LAST:event_LeerenFeld06ActionPerformed

    private void AndernFeld01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AndernFeld01ActionPerformed
        
    }//GEN-LAST:event_AndernFeld01ActionPerformed

    private void AndernFeld01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndernFeld01MouseClicked

        artikelnummer = TextfeldFeld01.getText();
        artikelbezeichnung = ArtikelFeld01.getText();


        Layout Layout = new Layout();
        Layout.commonCode2(Mysqllink, username, password, artikelnummer, artikelbezeichnung);
        
        
       
       
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
           
        TextfeldFeld01.setText("");


        
    }//GEN-LAST:event_AndernFeld01MouseClicked

    private void AndernFeld10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndernFeld10MouseClicked
        artikelnummer = TextfeldFeld10.getText();
        artikelbezeichnung = ArtikelFeld10.getText();

   
          Layout Layout = new Layout();
        Layout.commonCode2(Mysqllink, username, password, artikelnummer, artikelbezeichnung);
        
        
       
      
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
           
        TextfeldFeld10.setText("");
        
    }//GEN-LAST:event_AndernFeld10MouseClicked

    private void AndernFeld02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndernFeld02MouseClicked
        artikelnummer = TextfeldFeld02.getText();
        artikelbezeichnung = ArtikelFeld02.getText();

      
         Layout Layout = new Layout();
        Layout.commonCode2(Mysqllink, username, password, artikelnummer, artikelbezeichnung);
       
       
        
        
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
           
        TextfeldFeld02.setText("");
        
    }//GEN-LAST:event_AndernFeld02MouseClicked

    private void AndernFeld03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndernFeld03MouseClicked
        artikelnummer = TextfeldFeld03.getText();
        artikelbezeichnung = ArtikelFeld03.getText();

       
          Layout Layout = new Layout();
        Layout.commonCode2(Mysqllink, username, password, artikelnummer, artikelbezeichnung);
        
       

           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
           
        TextfeldFeld03.setText("");
        
    }//GEN-LAST:event_AndernFeld03MouseClicked

    private void AndernFeld04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndernFeld04MouseClicked
        artikelnummer = TextfeldFeld04.getText();
        artikelbezeichnung = ArtikelFeld04.getText();

          Layout Layout = new Layout();
        Layout.commonCode2(Mysqllink, username, password, artikelnummer, artikelbezeichnung);
        

       
       
   
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
           
        TextfeldFeld04.setText("");
        
    }//GEN-LAST:event_AndernFeld04MouseClicked

    private void AndernFeld05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndernFeld05MouseClicked
        artikelnummer = TextfeldFeld05.getText();
        artikelbezeichnung = ArtikelFeld05.getText();

          Layout Layout = new Layout();
        Layout.commonCode2(Mysqllink, username, password, artikelnummer, artikelbezeichnung);
       
       
        
      
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
           
        TextfeldFeld05.setText("");
        
    }//GEN-LAST:event_AndernFeld05MouseClicked

    private void AndernFeld06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndernFeld06MouseClicked

        artikelnummer = TextfeldFeld06.getText();
        artikelbezeichnung = ArtikelFeld06.getText();

          Layout Layout = new Layout();
        Layout.commonCode2(Mysqllink, username, password, artikelnummer, artikelbezeichnung);
       
       
        
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        
        TextfeldFeld06.setText("");
        
    }//GEN-LAST:event_AndernFeld06MouseClicked

    private void AndernFeld07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndernFeld07MouseClicked
        artikelnummer = TextfeldFeld07.getText();
        artikelbezeichnung = ArtikelFeld07.getText();

          Layout Layout = new Layout();
        Layout.commonCode2(Mysqllink, username, password, artikelnummer, artikelbezeichnung);
       
       
   
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        TextfeldFeld07.setText("");
        
    }//GEN-LAST:event_AndernFeld07MouseClicked

    private void AndernFeld08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndernFeld08MouseClicked
        artikelnummer = TextfeldFeld08.getText();
        artikelbezeichnung = ArtikelFeld08.getText();

          Layout Layout = new Layout();
        Layout.commonCode2(Mysqllink, username, password, artikelnummer, artikelbezeichnung);
       
       
       
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        TextfeldFeld08.setText("");
        
    }//GEN-LAST:event_AndernFeld08MouseClicked

    private void AndernFeld09MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndernFeld09MouseClicked
        artikelnummer = TextfeldFeld09.getText();
        artikelbezeichnung = ArtikelFeld09.getText();

          Layout Layout = new Layout();
        Layout.commonCode2(Mysqllink, username, password, artikelnummer, artikelbezeichnung);
       
       
  
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        TextfeldFeld09.setText("");
        
    }//GEN-LAST:event_AndernFeld09MouseClicked

    private void AndernFeld11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndernFeld11MouseClicked
        artikelnummer = TextfeldFeld11.getText();
        artikelbezeichnung = ArtikelFeld11.getText();

          Layout Layout = new Layout();
        Layout.commonCode2(Mysqllink, username, password, artikelnummer, artikelbezeichnung);
      
       
       
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
           
        TextfeldFeld11.setText("");
        
    }//GEN-LAST:event_AndernFeld11MouseClicked

    private void AndernFeld12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndernFeld12MouseClicked
        artikelnummer = TextfeldFeld12.getText();
        artikelbezeichnung = ArtikelFeld12.getText();

          Layout Layout = new Layout();
        Layout.commonCode2(Mysqllink, username, password, artikelnummer, artikelbezeichnung);
      
       
        
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        
        TextfeldFeld12.setText("");
        
    }//GEN-LAST:event_AndernFeld12MouseClicked

    private void AndernFeld13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndernFeld13MouseClicked
        artikelnummer = TextfeldFeld13.getText();
        artikelbezeichnung = ArtikelFeld13.getText();

          Layout Layout = new Layout();
        Layout.commonCode2(Mysqllink, username, password, artikelnummer, artikelbezeichnung);
       
       
       
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        TextfeldFeld13.setText("");
        
    }//GEN-LAST:event_AndernFeld13MouseClicked

    private void AndernFeld14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndernFeld14MouseClicked
        artikelnummer = TextfeldFeld14.getText();
        artikelbezeichnung = ArtikelFeld14.getText();

          Layout Layout = new Layout();
        Layout.commonCode2(Mysqllink, username, password, artikelnummer, artikelbezeichnung);
      
       

           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        TextfeldFeld14.setText("");
        
    }//GEN-LAST:event_AndernFeld14MouseClicked

    private void AndernFeld15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndernFeld15MouseClicked
        artikelnummer = TextfeldFeld15.getText();
        artikelbezeichnung = ArtikelFeld15.getText();

          Layout Layout = new Layout();
        Layout.commonCode2(Mysqllink, username, password, artikelnummer, artikelbezeichnung);
       
       
       
           Layout.commonCode(reihe, Mysqllink, username, password, ArtikelFeld01,  ArtikelFeld02, ArtikelFeld03, ArtikelFeld04, ArtikelFeld05, ArtikelFeld06, ArtikelFeld07,
           ArtikelFeld08, ArtikelFeld09, ArtikelFeld10, ArtikelFeld11, ArtikelFeld12, ArtikelFeld13, ArtikelFeld14, ArtikelFeld15,
          
           BildFeld01,  BildFeld02, BildFeld03, BildFeld04, BildFeld05, BildFeld06, BildFeld07,
           BildFeld08, BildFeld09, BildFeld10, BildFeld11, BildFeld12, BildFeld13, BildFeld14, BildFeld15
            );
        TextfeldFeld15.setText("");
        
    }//GEN-LAST:event_AndernFeld15MouseClicked

    private void ArtikeltabelleComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ArtikeltabelleComponentMoved
        
    }//GEN-LAST:event_ArtikeltabelleComponentMoved

    private void jLabel82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseClicked
        try {
           
            PrinterJob printerJob = PrinterJob.getPrinterJob();

         
            PageFormat pageFormat = printerJob.defaultPage();
            Paper paper = pageFormat.getPaper();
            double width = 11 * 72.0; 
            double height = 8.5 * 72.0; 
            double margin = 36.0; 
            paper.setSize(height, width);
            paper.setImageableArea(margin, margin, height - 2 * margin, width - 2 * margin); 
            pageFormat.setPaper(paper);
            pageFormat.setOrientation(PageFormat.LANDSCAPE);

    
            Printable printable = Tabelle1.getPrintable(JTable.PrintMode.FIT_WIDTH, null, null);

  
            printerJob.setPrintable(printable, pageFormat);

           
            if (printerJob.printDialog()) {
                printerJob.print();
            }
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }

        
    }//GEN-LAST:event_jLabel82MouseClicked

    private void btn_Anzeige2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Anzeige2MouseClicked
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
                String sql = "SELECT artikelliste.*, kategorien.Kategoriebezeichnung "
                        + "FROM artikelliste "
                        + "JOIN kategorien ON artikelliste.Kategorie_ID = kategorien.Kategorie_ID "
                        + "WHERE artikelliste.Artikelnummer = ?";
                PreparedStatement st = con.prepareStatement(sql);
                st.setString(1, Artikelnummeranzeige2.getText());
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String Artikelnummer = rs.getString("Artikelnummer");
                    String Artikelbezeichnung = rs.getString("Artikelbezeichnung");
                    String Artikelbeschreibung = rs.getString("Artikelbeschreibung");
                    String Kategoriebezeichnung = rs.getString("Kategoriebezeichnung");
                    float Kalorien = rs.getFloat("Kalorien");
                    float Kohlenhydrate = rs.getFloat("Kohlenhydrate");
                    float Proteine = rs.getFloat("Proteine");
                    float Fette = rs.getFloat("Fette");
                    String Zutatenliste = rs.getString("Artikelzutaten");
                    float Preis = rs.getFloat("Preis");
                    String Icon = rs.getString("Icon");
                    int Dauer = rs.getInt("Dauer");
                    String Bio = rs.getString("Bio");
                    String Vegetarisch = rs.getString("Vegetarisch");
                    String Vegan = rs.getString("Vegan");

                    DefaultTableModel model = (DefaultTableModel) Kalorientabelle2.getModel();
                    model.setRowCount(0); 
                    model.addRow(new Object[]{"Kalorien", Kalorien + " kcal"});
                    model.addRow(new Object[]{"Kohlenhydrate", Kohlenhydrate + " g"});
                    model.addRow(new Object[]{"Proteine", Proteine + " g"});
                    model.addRow(new Object[]{"Fette", Fette + " g"});

                    Kalorientabelle2.setModel(model);

               
                    Artikelnummeranzeiger2.setText(Artikelnummer);
                    Artikelbezeichner2.setText(Artikelbezeichnung);
                    Artikelbeschreiber2.setText(Artikelbeschreibung);
                    Kategorieanzeiger2.setText(Kategoriebezeichnung);
                    Zutatenanzeiger2.setText(Zutatenliste);
                    Preisanzeiger2.setText(String.format("%.2f", Preis));
                    
                    Artikelbild2.setIcon(new ImageIcon(Icon));

                    if (Dauer == 0) {
                        Sofortfeld2.setSize(200, 40);
                        Minuten2.setSize(100, 0);
                        Daueranzeiger2.setSize(80, 0);

                    } else {
                        Sofortfeld2.setSize(200, 0);
                        Minuten2.setSize(100, 40);
                        Daueranzeiger2.setSize(80, 40);
                        Daueranzeiger2.setText(String.valueOf(Dauer));

                    }

                    if ("Ja".equals(Bio)) {
                        Biofeld2.setSize(50, 90);
                    } else {
                        Biofeld2.setSize(70, 0);
                    }

                    if ("Ja".equals(Vegetarisch)) {
                        VegiFeld2.setSize(60, 70);
                    } else {
                        VegiFeld2.setSize(60, 0);
                    }

                    if ("Ja".equals(Vegan)) {
                        Veganfeld2.setSize(70, 90);
                    } else {
                        Veganfeld2.setSize(70, 0);
                    }

                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_btn_Anzeige2MouseClicked

    private void btn_Anzeige2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Anzeige2ActionPerformed
        
    }//GEN-LAST:event_btn_Anzeige2ActionPerformed

    private void Artikelnummeranzeige2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Artikelnummeranzeige2ActionPerformed
        
    }//GEN-LAST:event_Artikelnummeranzeige2ActionPerformed

    private void jLabel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseClicked
        ParentArtikelbewirtschaftung.removeAll();
        ParentArtikelbewirtschaftung.add(Supplemente);
        ParentArtikelbewirtschaftung.repaint();
        ParentArtikelbewirtschaftung.revalidate();

      
        Tabellen Tabellen = new Tabellen();
        Tabellen.MenuTabelleUpdate(Mysqllink,username,password,Optiontabelle);
        
    }//GEN-LAST:event_jLabel61MouseClicked

    private void jLabel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseEntered
        
    }//GEN-LAST:event_jLabel32MouseEntered

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        Supplementparent.removeAll();
        Supplementparent.add(MenuOptionen);
        Supplementparent.repaint();
        Supplementparent.revalidate();

   
               Tabellen Tabellen = new Tabellen();
        Tabellen.MenuTabelleUpdate(Mysqllink,username,password,Optiontabelle);
        
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel141MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel141MouseClicked
        Supplementparent.removeAll();
        Supplementparent.add(Zuordnen);
        Supplementparent.repaint();
        Supplementparent.revalidate();

        Felder Felder = new Felder();
        Felder.UpdateFelder(Mysqllink, username, password,TabelleSupplementverknüpfungen, TabelleArtikelverknüpfungen);
        
    }//GEN-LAST:event_jLabel141MouseClicked

    private void Adddata6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Adddata6MouseClicked
        ParentArtikeldaten.removeAll();
        ParentArtikeldaten.add(Artikelverfügbarkeiten);
        ParentArtikeldaten.repaint();
        ParentArtikeldaten.revalidate();

        Tabellen Tabellen = new Tabellen();
        Tabellen.UpddateVerfügbarkeiten(Mysqllink, username, password, Tabelle_Verfügbarkeiten);
        

        
    }//GEN-LAST:event_Adddata6MouseClicked

    private void jLabel149MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel149MouseClicked
  
       Felder Felder = new Felder();
        Felder.UpdateFelder(Mysqllink, username, password,TabelleSupplementverknüpfungen, TabelleArtikelverknüpfungen);

        
    }//GEN-LAST:event_jLabel149MouseClicked

    private void jLabel183MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel183MouseClicked
        String artikelnummerToDelete = Artikelnummer_auflösen.getText();

        try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
            String sqlDelete = "DELETE FROM artikelverknüpfungen WHERE Artikelnummer = ?";
            PreparedStatement stmtDelete = con.prepareStatement(sqlDelete);
            stmtDelete.setString(1, artikelnummerToDelete);

            int rowsDeleted = stmtDelete.executeUpdate();
            if (rowsDeleted > 0) {
                Felderleeren();
                Artikelanzeige_auflösen.setText("Erfolgreich aufgelöst");
                ok3.setSize(30, 30);
                javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
                   
                    SwingUtilities.invokeLater(() -> {
                        Artikelanzeige_auflösen.setText("");
                        ok3.setSize(30, 0);
                    });
                });
                timer.setRepeats(false);
                timer.start();
            } else {
                Artikelanzeige_auflösen.setText("Nicht erfolgfreich");
                fff3.setSize(30, 30);
                javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
         
                    SwingUtilities.invokeLater(() -> {
                        Artikelanzeige_auflösen.setText("");
                        fff3.setSize(30, 0);
                    });
                });
                timer.setRepeats(false);
                timer.start();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

      
       Felder Felder = new Felder();
        Felder.UpdateFelder(Mysqllink, username, password,TabelleSupplementverknüpfungen, TabelleArtikelverknüpfungen);

        
    }//GEN-LAST:event_jLabel183MouseClicked

    private void jLabel184MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel184MouseClicked
        Felderleeren();
        
    }//GEN-LAST:event_jLabel184MouseClicked

    private void ErstellenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ErstellenMouseClicked

      
        String supplement1 = Supplement1_erstellen.getSelectedItem().toString();
        String supplement2 = Supplement2_erstellen.getSelectedItem().toString();
        String supplement3 = Supplement3_erstellen.getSelectedItem().toString();
        String supplement4 = Supplement4_erstellen.getSelectedItem().toString();
        String artikelnummerErstellen = Artikelnummer_erstellen.getText();


        int supplementID1 = 0;
        int supplementID2 = 0;
        int supplementID3 = 0;
        int supplementID4 = 0;

        try {

            Connection conn = DriverManager.getConnection(Mysqllink, username, password);

        
            String sql1 = "SELECT SupplementID FROM supplements WHERE Supplementbezeichnung = ?";
            PreparedStatement stmt1 = conn.prepareStatement(sql1);
            stmt1.setString(1, supplement1);
            ResultSet rs1 = stmt1.executeQuery();
            if (rs1.next()) {
                supplementID1 = rs1.getInt("SupplementID");
            }

            
            String sql2 = "SELECT SupplementID FROM supplements WHERE Supplementbezeichnung = ?";
            PreparedStatement stmt2 = conn.prepareStatement(sql2);
            stmt2.setString(1, supplement2);
            ResultSet rs2 = stmt2.executeQuery();
            if (rs2.next()) {
                supplementID2 = rs2.getInt("SupplementID");
            }

            
            String sql3 = "SELECT SupplementID FROM supplements WHERE Supplementbezeichnung = ?";
            PreparedStatement stmt3 = conn.prepareStatement(sql3);
            stmt3.setString(1, supplement3);
            ResultSet rs3 = stmt3.executeQuery();
            if (rs3.next()) {
                supplementID3 = rs3.getInt("SupplementID");
            }


            String sql4 = "SELECT SupplementID FROM supplements WHERE Supplementbezeichnung = ?";
            PreparedStatement stmt4 = conn.prepareStatement(sql4);
            stmt4.setString(1, supplement4);
            ResultSet rs4 = stmt4.executeQuery();
            if (rs4.next()) {
                supplementID4 = rs4.getInt("SupplementID");
            }

   
            String sql5 = "SELECT cid FROM artikelliste WHERE Artikelnummer = ?";
            PreparedStatement stmt5 = conn.prepareStatement(sql5);
            stmt5.setString(1, artikelnummerErstellen);
            ResultSet rs5 = stmt5.executeQuery();
            int cid = 0;
            if (rs5.next()) {
                cid = rs5.getInt("cid");
            }

           
            String sql6 = "INSERT INTO artikelverknüpfungen (cid, Artikelnummer, Supplement01, Supplement02, Supplement03, Supplement04) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt6 = conn.prepareStatement(sql6);
            stmt6.setInt(1, cid);
            stmt6.setString(2, artikelnummerErstellen);
            stmt6.setInt(3, supplementID1);
            stmt6.setInt(4, supplementID2);
            stmt6.setInt(5, supplementID3);
            stmt6.setInt(6, supplementID4);
            stmt6.executeUpdate();


            conn.close();

            Felderleeren();
            Fehler_erstellen.setText("Erfolgreich hinzugefügt");
            ok.setSize(30, 30);
            javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
                
                SwingUtilities.invokeLater(() -> {
                    Fehler_erstellen.setText("");
                    ok.setSize(30, 0);
                });
            });
            timer.setRepeats(false);
            timer.start();

        } catch (SQLException ex) {
            ex.printStackTrace();
            Fehler_erstellen.setText("Nicht erfolgfreich");
            fff.setSize(30, 30);
            javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
        
                SwingUtilities.invokeLater(() -> {
                    Fehler_erstellen.setText("");
                    fff.setSize(30, 0);
                });
            });
            timer.setRepeats(false);
            timer.start();
        }

       
        Felder Felder = new Felder();
        Felder.UpdateFelder(Mysqllink, username, password,TabelleSupplementverknüpfungen, TabelleArtikelverknüpfungen);

        
    }//GEN-LAST:event_ErstellenMouseClicked

    private void Leeren_erstellenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Leeren_erstellenMouseClicked
        Felderleeren();

    }//GEN-LAST:event_Leeren_erstellenMouseClicked

    private void jLabel194MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel194MouseClicked
        String artikelnummerErstellen = Artikelnummer_auflösen.getText();

        try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
        
            String sqlCheck = "SELECT COUNT(*) FROM artikelverknüpfungen WHERE Artikelnummer = ?";
            PreparedStatement stmtCheck = con.prepareStatement(sqlCheck);
            stmtCheck.setString(1, artikelnummerErstellen);
            ResultSet rsCheck = stmtCheck.executeQuery();
            rsCheck.next();
            int count = rsCheck.getInt(1);

            if (count != 0) {
              
                String sqlRetrieve = "SELECT artikelbezeichnung FROM artikelliste WHERE Artikelnummer = ?";
                PreparedStatement stmtRetrieve = con.prepareStatement(sqlRetrieve);
                stmtRetrieve.setString(1, artikelnummerErstellen);
                ResultSet rsRetrieve = stmtRetrieve.executeQuery();
                if (rsRetrieve.next()) {
                    String artikelbezeichnung = rsRetrieve.getString("artikelbezeichnung");
                    Artikelanzeige_auflösen.setText(artikelbezeichnung);
                }

               
                String sqlRetrieve2 = "SELECT Supplement01, Supplement02, Supplement03, Supplement04 FROM artikelverknüpfungen WHERE Artikelnummer = ?";
                PreparedStatement stmtRetrieve2 = con.prepareStatement(sqlRetrieve2);
                stmtRetrieve2.setString(1, artikelnummerErstellen);
                ResultSet rsRetrieve2 = stmtRetrieve2.executeQuery();
                if (rsRetrieve2.next()) {
                    int supplement1 = rsRetrieve2.getInt("Supplement01");
                    int supplement2 = rsRetrieve2.getInt("Supplement02");
                    int supplement3 = rsRetrieve2.getInt("Supplement03");
                    int supplement4 = rsRetrieve2.getInt("Supplement04");

                    String sqlRetrieveSupplementBezeichnung = "SELECT Supplementbezeichnung FROM supplements WHERE SupplementID = ?";
                    PreparedStatement stmtRetrieveSupplementBezeichnung = con.prepareStatement(sqlRetrieveSupplementBezeichnung);
                    stmtRetrieveSupplementBezeichnung.setInt(1, supplement1);
                    ResultSet rsSupplement1 = stmtRetrieveSupplementBezeichnung.executeQuery();
                    if (rsSupplement1.next()) {
                        String supplement1Bezeichnung = rsSupplement1.getString("Supplementbezeichnung");
                        Supplement1_auflösen.setText(supplement1Bezeichnung);
                    }

                    stmtRetrieveSupplementBezeichnung.setInt(1, supplement2);
                    ResultSet rsSupplement2 = stmtRetrieveSupplementBezeichnung.executeQuery();
                    if (rsSupplement2.next()) {
                        String supplement2Bezeichnung = rsSupplement2.getString("Supplementbezeichnung");
                        Supplement2_auflösen.setText(supplement2Bezeichnung);
                    }

                    stmtRetrieveSupplementBezeichnung.setInt(1, supplement3);
                    ResultSet rsSupplement3 = stmtRetrieveSupplementBezeichnung.executeQuery();
                    if (rsSupplement3.next()) {
                        String supplement3Bezeichnung = rsSupplement3.getString("Supplementbezeichnung");
                        Supplement3_auflösen.setText(supplement3Bezeichnung);
                    }

                    stmtRetrieveSupplementBezeichnung.setInt(1, supplement4);
                    ResultSet rsSupplement4 = stmtRetrieveSupplementBezeichnung.executeQuery();
                    if (rsSupplement4.next()) {
                        String supplement4Bezeichnung = rsSupplement4.getString("Supplementbezeichnung");
                        Supplement4_auflösen.setText(supplement4Bezeichnung);
                    }
                }
            } else {
                Artikelanzeige_auflösen.setText("Artikel nicht verknüpft");
                fff3.setSize(30, 30);
                javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
                  
                    SwingUtilities.invokeLater(() -> {
                        Artikelanzeige_auflösen.setText("");
                        fff3.setSize(30, 0);
                    });
                });
                timer.setRepeats(false);
                timer.start();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }

        
    }//GEN-LAST:event_jLabel194MouseClicked

    private void Anzeige_erstellenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Anzeige_erstellenMouseClicked
        String artikelnummerErstellen = Artikelnummer_erstellen.getText();

        try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
      
            String sqlCheck = "SELECT COUNT(*) FROM artikelverknüpfungen WHERE Artikelnummer = ?";
            PreparedStatement stmtCheck = con.prepareStatement(sqlCheck);
            stmtCheck.setString(1, artikelnummerErstellen);
            ResultSet rsCheck = stmtCheck.executeQuery();
            rsCheck.next();
            int count = rsCheck.getInt(1);

            if (count == 0) {
                
                String sqlRetrieve = "SELECT artikelbezeichnung FROM artikelliste WHERE Artikelnummer = ?";
                PreparedStatement stmtRetrieve = con.prepareStatement(sqlRetrieve);
                stmtRetrieve.setString(1, artikelnummerErstellen);
                ResultSet rsRetrieve = stmtRetrieve.executeQuery();
                if (rsRetrieve.next()) {
                    String artikelbezeichnung = rsRetrieve.getString("artikelbezeichnung");
                    Artikelanzeige_erstellen.setText(artikelbezeichnung);
                    Artikelnummer_erstellen.setEnabled(false);
                    Supplement1_erstellen.setEnabled(true);
                    Supplement2_erstellen.setEnabled(true);
                    Supplement3_erstellen.setEnabled(true);
                    Supplement4_erstellen.setEnabled(true);

            
                    List<String> supplementBezeichnungen = new ArrayList<>();
                    String sqlRetrieveSupplemente = "SELECT Supplementbezeichnung FROM supplements";
                    PreparedStatement stmtRetrieveSupplemente = con.prepareStatement(sqlRetrieveSupplemente);
                    ResultSet rsRetrieveSupplemente = stmtRetrieveSupplemente.executeQuery();

                    while (rsRetrieveSupplemente.next()) {
                        String supplementBezeichnung = rsRetrieveSupplemente.getString("Supplementbezeichnung");
                        supplementBezeichnungen.add(supplementBezeichnung);
                    }

             
                    Collections.sort(supplementBezeichnungen);

                
                    supplementBezeichnungen.add(0, "");

                    
                    for (String supplementBezeichnung : supplementBezeichnungen) {
                        Supplement1_erstellen.addItem(supplementBezeichnung);
                        Supplement2_erstellen.addItem(supplementBezeichnung);
                        Supplement3_erstellen.addItem(supplementBezeichnung);
                        Supplement4_erstellen.addItem(supplementBezeichnung);
                    }
                }
            } else {
                
                fff.setSize(30, 30);
                Fehler_erstellen.setText("Artikel bereits verknüpft.");
                javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
                
                    SwingUtilities.invokeLater(() -> {
                        Fehler_erstellen.setText("");
                        fff.setSize(30, 0);
                    });
                });
                timer.setRepeats(false);
                timer.start();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        
    }//GEN-LAST:event_Anzeige_erstellenMouseClicked

    private void jLabel204MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel204MouseClicked
        String artikelnummerErstellen = Artikelnummer_bearbeiten.getText();

        try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
      
            String sqlCheck = "SELECT COUNT(*) FROM artikelverknüpfungen WHERE Artikelnummer = ?";
            PreparedStatement stmtCheck = con.prepareStatement(sqlCheck);
            stmtCheck.setString(1, artikelnummerErstellen);
            ResultSet rsCheck = stmtCheck.executeQuery();
            rsCheck.next();
            int count = rsCheck.getInt(1);

            if (count != 0) {
                
                String sqlRetrieve = "SELECT artikelbezeichnung FROM artikelliste WHERE Artikelnummer = ?";
                PreparedStatement stmtRetrieve = con.prepareStatement(sqlRetrieve);
                stmtRetrieve.setString(1, artikelnummerErstellen);
                ResultSet rsRetrieve = stmtRetrieve.executeQuery();
                if (rsRetrieve.next()) {
                    String artikelbezeichnung = rsRetrieve.getString("artikelbezeichnung");
                    Artikelanzeige_bearbeiten.setText(artikelbezeichnung);
                    Artikelnummer_bearbeiten.setEnabled(false);
                    Supplement1_bearbeiten.setEnabled(true);
                    Supplement2_bearbeiten.setEnabled(true);
                    Supplement3_bearbeiten.setEnabled(true);
                    Supplement4_bearbeiten.setEnabled(true);


                    String sqlRetrieveSupplemente = "SELECT Supplementbezeichnung FROM supplements ORDER BY Supplementbezeichnung ASC";
                    PreparedStatement stmtRetrieveSupplemente = con.prepareStatement(sqlRetrieveSupplemente);
                    ResultSet rsRetrieveSupplemente = stmtRetrieveSupplemente.executeQuery();
                    List<String> supplementList = new ArrayList<>();

                
                    supplementList.add("");

                    while (rsRetrieveSupplemente.next()) {
                        String supplementBezeichnung = rsRetrieveSupplemente.getString("Supplementbezeichnung");
                        supplementList.add(supplementBezeichnung);
                    }

                 
                    Collections.sort(supplementList);

     
                    Supplement1_bearbeiten.removeAllItems();
                    Supplement2_bearbeiten.removeAllItems();
                    Supplement3_bearbeiten.removeAllItems();
                    Supplement4_bearbeiten.removeAllItems();

                    for (String supplementBezeichnung : supplementList) {
                        Supplement1_bearbeiten.addItem(supplementBezeichnung);
                        Supplement2_bearbeiten.addItem(supplementBezeichnung);
                        Supplement3_bearbeiten.addItem(supplementBezeichnung);
                        Supplement4_bearbeiten.addItem(supplementBezeichnung);
                    }

                   
                    String sqlRetrieveSupplements = "SELECT Supplement01, Supplement02, Supplement03, Supplement04 FROM artikelverknüpfungen WHERE Artikelnummer = ?";
                    PreparedStatement stmtRetrieveSupplements = con.prepareStatement(sqlRetrieveSupplements);
                    stmtRetrieveSupplements.setString(1, artikelnummerErstellen);
                    ResultSet rsRetrieveSupplements = stmtRetrieveSupplements.executeQuery();

                    if (rsRetrieveSupplements.next()) {
                        int supplement01 = rsRetrieveSupplements.getInt("Supplement01");
                        int supplement02 = rsRetrieveSupplements.getInt("Supplement02");
                        int supplement03 = rsRetrieveSupplements.getInt("Supplement03");
                        int supplement04 = rsRetrieveSupplements.getInt("Supplement04");

                       
                        List<Integer> supplementIDs = Arrays.asList(supplement01, supplement02, supplement03, supplement04);

                        String sqlRetrieveSupplementBezeichnung = "SELECT Supplementbezeichnung FROM supplements WHERE SupplementID = ?";
                        PreparedStatement stmtRetrieveSupplementBezeichnung = con.prepareStatement(sqlRetrieveSupplementBezeichnung);

                     
                        for (int i = 0; i < supplementIDs.size(); i++) {
                            int supplementID = supplementIDs.get(i);
                            stmtRetrieveSupplementBezeichnung.setInt(1, supplementID);
                            ResultSet rsRetrieveSupplementBezeichnung = stmtRetrieveSupplementBezeichnung.executeQuery();
                            if (rsRetrieveSupplementBezeichnung.next()) {
                                String supplementBezeichnung = rsRetrieveSupplementBezeichnung.getString("Supplementbezeichnung");
                                switch (i) {
                                    case 0:
                                        setSelectedItem(Supplement1_bearbeiten, supplementBezeichnung);
                                        break;
                                    case 1:
                                        setSelectedItem(Supplement2_bearbeiten, supplementBezeichnung);
                                        break;
                                    case 2:
                                        setSelectedItem(Supplement3_bearbeiten, supplementBezeichnung);
                                        break;
                                    case 3:
                                        setSelectedItem(Supplement4_bearbeiten, supplementBezeichnung);
                                        break;
                                }
                            }
                        }

                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        
    }//GEN-LAST:event_jLabel204MouseClicked

    private void jLabel205MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel205MouseClicked
        Felderleeren();
        
    }//GEN-LAST:event_jLabel205MouseClicked

    private void jLabel206MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel206MouseClicked

        String supplement1 = Supplement1_bearbeiten.getSelectedItem().toString();
        String supplement2 = Supplement2_bearbeiten.getSelectedItem().toString();
        String supplement3 = Supplement3_bearbeiten.getSelectedItem().toString();
        String supplement4 = Supplement4_bearbeiten.getSelectedItem().toString();

        int supplementID1 = 0;
        int supplementID2 = 0;
        int supplementID3 = 0;
        int supplementID4 = 0;


        String query = "SELECT SupplementID FROM supplements WHERE Supplementbezeichnung = ?";

        try (Connection con = DriverManager.getConnection(Mysqllink, username, password); PreparedStatement stmt = con.prepareStatement(query)) {

            stmt.setString(1, supplement1);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                supplementID1 = rs.getInt("SupplementID");
            } else {
                System.out.println("Supplement1 not found in supplements table.");
            }

            stmt.setString(1, supplement2);
            rs = stmt.executeQuery();
            if (rs.next()) {
                supplementID2 = rs.getInt("SupplementID");
            } else {
                System.out.println("Supplement2 not found in supplements table.");
            }

            stmt.setString(1, supplement3);
            rs = stmt.executeQuery();
            if (rs.next()) {
                supplementID3 = rs.getInt("SupplementID");
            } else {
                System.out.println("Supplement3 not found in supplements table.");
            }

            stmt.setString(1, supplement4);
            rs = stmt.executeQuery();
            if (rs.next()) {
                supplementID4 = rs.getInt("SupplementID");
            } else {
                System.out.println("Supplement4 not found in supplements table.");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


        String artikelnummerErstellen = Artikelnummer_bearbeiten.getText();
        query = "UPDATE artikelverknüpfungen SET Supplement01 = ?, Supplement02 = ?, Supplement03 = ?, Supplement04 = ? WHERE Artikelnummer = ?";

        try (Connection con = DriverManager.getConnection(Mysqllink, username, password); PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setInt(1, supplementID1);
            stmt.setInt(2, supplementID2);
            stmt.setInt(3, supplementID3);
            stmt.setInt(4, supplementID4);
            stmt.setString(5, artikelnummerErstellen);
            stmt.executeUpdate();

            Felderleeren();
            Fehler_bearbeiten.setText("Erfolgreich bearbeitet");
            ok2.setSize(30, 30);
            javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
               
                SwingUtilities.invokeLater(() -> {
                    Fehler_bearbeiten.setText("");
                    ok2.setSize(30, 0);
                });
            });
            timer.setRepeats(false);
            timer.start();

        } catch (SQLException ex) {
            ex.printStackTrace();

            Fehler_erstellen.setText("Nicht erfolgfreich");
            fff2.setSize(30, 30);
            javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
             
                SwingUtilities.invokeLater(() -> {
                    Fehler_bearbeiten.setText("");
                    fff2.setSize(30, 0);
                });
            });
            timer.setRepeats(false);
            timer.start();
        }

      
       Felder Felder = new Felder();
        Felder.UpdateFelder(Mysqllink, username, password,TabelleSupplementverknüpfungen, TabelleArtikelverknüpfungen);

        
    }//GEN-LAST:event_jLabel206MouseClicked

    private void Supplement4_bearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Supplement4_bearbeitenActionPerformed
        
    }//GEN-LAST:event_Supplement4_bearbeitenActionPerformed

    private void BildwahlenbearbeitenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildwahlenbearbeitenMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();
            JTextField textField = Bildpfad_bearbeiten; 
            textField.setText(filePath);
      
        }

        
    }//GEN-LAST:event_BildwahlenbearbeitenMouseClicked

    private void BildwahlenbearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BildwahlenbearbeitenActionPerformed
        
    }//GEN-LAST:event_BildwahlenbearbeitenActionPerformed

    private void Expander4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Expander4MouseClicked
        
    }//GEN-LAST:event_Expander4MouseClicked

    private void Minimizer4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Minimizer4MouseClicked
        
    }//GEN-LAST:event_Minimizer4MouseClicked

    private void Artikelproteine_bearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Artikelproteine_bearbeitenActionPerformed
        
    }//GEN-LAST:event_Artikelproteine_bearbeitenActionPerformed

    private void Bildpfad_bearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bildpfad_bearbeitenActionPerformed
        
    }//GEN-LAST:event_Bildpfad_bearbeitenActionPerformed

    private void Kategoriebox_bearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kategoriebox_bearbeitenActionPerformed
        
    }//GEN-LAST:event_Kategoriebox_bearbeitenActionPerformed

    private void Veganbox_bearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Veganbox_bearbeitenActionPerformed
        
    }//GEN-LAST:event_Veganbox_bearbeitenActionPerformed

    private void Bio_bearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bio_bearbeitenActionPerformed
        
    }//GEN-LAST:event_Bio_bearbeitenActionPerformed

    private void BearbeitenArtikelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BearbeitenArtikelMouseClicked

        try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
            String artikelnummer = Artikelnummer_bearbeitenfeld.getText();
            String artikelbezeichnung = Artikelbezeichnung_bearbeiten.getText();
            String artikelbeschreibung = Artikelbeschreibung_bearbeiten.getText();
            String artikelkategorie = Kategoriebox_bearbeiten.getSelectedItem().toString();
            float kalorien = Float.parseFloat(Artikelkalorien_bearbeiten.getText());
            float proteine = Float.parseFloat(Artikelproteine_bearbeiten.getText());
            float kohlenhydrate = Float.parseFloat(Artikelkohlenhydrate_bearbeiten.getText());
            float fette = Float.parseFloat(Artikelfette_bearbeiten.getText());
            float preis = Float.parseFloat(Artikelpreis_bearbeiten.getText());
            int dauer = Integer.parseInt(Artikeldauer_bearbeiten.getText());
            String artikelzutaten = Artikelzutaten_bearbeiten.getText();
            String icon = Bildpfad_bearbeiten.getText();
            String vegan = Veganbox_bearbeiten.getSelectedItem().toString();
            String vegetarisch = Vegi_bearbeiten.getSelectedItem().toString();
            String bio = Bio_bearbeiten.getSelectedItem().toString();


            String sql = "UPDATE artikelliste SET Artikelbezeichnung = ?, Artikelbeschreibung = ?, Kategorie_ID = (SELECT Kategorie_ID FROM kategorien WHERE Kategoriebezeichnung = ?), Kalorien = ?, Proteine = ?, Kohlenhydrate = ?, Fette = ?, Preis = ?, Dauer = ?, Artikelzutaten = ?, Icon = ?, Vegan = ?, Vegetarisch = ?, Bio = ? WHERE Artikelnummer = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, artikelbezeichnung);
            stmt.setString(2, artikelbeschreibung);
            stmt.setString(3, artikelkategorie);
            stmt.setFloat(4, kalorien);
            stmt.setFloat(5, proteine);
            stmt.setFloat(6, kohlenhydrate);
            stmt.setFloat(7, fette);
            stmt.setFloat(8, preis);
            stmt.setInt(9, dauer);
            stmt.setString(10, artikelzutaten);
            stmt.setString(11, icon);
            stmt.setString(12, vegan);
            stmt.setString(13, vegetarisch);
            stmt.setString(14, bio);
            stmt.setString(15, artikelnummer);

            int rowsAffected = stmt.executeUpdate();

            Kategoriebox_bearbeiten.setEnabled(false);
            Veganbox_bearbeiten.setEnabled(false);
            Vegi_bearbeiten.setEnabled(false);
            Bio_bearbeiten.setEnabled(false);
            Artikelbezeichnung_bearbeiten.setEnabled(false);
            Artikelbeschreibung_bearbeiten.setEnabled(false);
            Artikelkalorien_bearbeiten.setEnabled(false);
            Artikelproteine_bearbeiten.setEnabled(false);
            Artikelkohlenhydrate_bearbeiten.setEnabled(false);
            Artikelfette_bearbeiten.setEnabled(false);
            Artikelpreis_bearbeiten.setEnabled(false);
            Artikeldauer_bearbeiten.setEnabled(false);
            Artikelzutaten_bearbeiten.setEnabled(false);
            Bildwahlenbearbeiten.setEnabled(false);
            Bildhochladenbearbeiten.setEnabled(false);
            Artikelnummer_bearbeitenfeld.setEnabled(true);

            if (rowsAffected > 0) {
        
                System.out.println("Table updated successfully.");
            } else {
          
                System.out.println("No matching record found for Artikelnummer: " + artikelnummer);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        } catch (Exception ex) {
            ex.printStackTrace();
           
        }

        
    }//GEN-LAST:event_BearbeitenArtikelMouseClicked

    private void Vegi_bearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vegi_bearbeitenActionPerformed
        
    }//GEN-LAST:event_Vegi_bearbeitenActionPerformed

    private void BildhochladenbearbeitenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BildhochladenbearbeitenMouseClicked
        String bildpfad = Bildpfad_bearbeiten.getText();

        try {
            BufferedImage originalImage = ImageIO.read(new File(bildpfad));
            Image resizedImage = originalImage.getScaledInstance(230, 170, Image.SCALE_DEFAULT);
            ImageIcon imageIcon = new ImageIcon(resizedImage);

    
            Imagezeiger2.setIcon(imageIcon);
        } catch (IOException ex) {
            jLabel195.setText("Error: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_BildhochladenbearbeitenMouseClicked

    private void FeldLeerenbearbeitenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldLeerenbearbeitenMouseClicked
        Kategoriebox_bearbeiten.setEnabled(false);
        Veganbox_bearbeiten.setEnabled(false);
        Vegi_bearbeiten.setEnabled(false);
        Bio_bearbeiten.setEnabled(false);
        Artikelbezeichnung_bearbeiten.setEnabled(false);
        Artikelbeschreibung_bearbeiten.setEnabled(false);
        Artikelkalorien_bearbeiten.setEnabled(false);
        Artikelproteine_bearbeiten.setEnabled(false);
        Artikelkohlenhydrate_bearbeiten.setEnabled(false);
        Artikelfette_bearbeiten.setEnabled(false);
        Artikelpreis_bearbeiten.setEnabled(false);
        Artikeldauer_bearbeiten.setEnabled(false);
        Artikelzutaten_bearbeiten.setEnabled(false);
        Bildwahlenbearbeiten.setEnabled(false);
        Bildhochladenbearbeiten.setEnabled(false);
        Artikelnummer_bearbeitenfeld.setEnabled(true);

        Artikelbezeichnung_bearbeiten.setText("");
        Artikelbeschreibung_bearbeiten.setText("");
        Artikelkalorien_bearbeiten.setText("");
        Artikelproteine_bearbeiten.setText("");
        Artikelkohlenhydrate_bearbeiten.setText("");
        Artikelfette_bearbeiten.setText("");
        Artikelpreis_bearbeiten.setText("");
        Artikeldauer_bearbeiten.setText("");
        Artikelzutaten_bearbeiten.setText("");
        Bildpfad_bearbeiten.setText("");
        Imagezeiger2.setIcon(null);
        Veganbox_bearbeiten.setSelectedItem(null);
        Vegi_bearbeiten.setSelectedItem(null);
        Bio_bearbeiten.setSelectedItem(null);
        Kategoriebox_bearbeiten.setSelectedItem(null);

        
    }//GEN-LAST:event_FeldLeerenbearbeitenMouseClicked

    private void AnzeigenbearbeitenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnzeigenbearbeitenMouseClicked
        try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
            String artikelnummer = Artikelnummer_bearbeitenfeld.getText();

            
            String sql = "SELECT a.Artikelnummer, a.Artikelbezeichnung, a.Artikelbeschreibung, k.Kategoriebezeichnung AS Artikelkategorie, a.Kalorien, a.Kohlenhydrate, a.Proteine, a.Fette, a.Artikelzutaten, a.Preis, a.Icon, a.Dauer, a.Vegetarisch, a.Bio, a.Vegan FROM artikelliste a JOIN kategorien k ON a.Kategorie_ID = k.Kategorie_ID WHERE a.Artikelnummer = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, artikelnummer);
            ResultSet rs = stmt.executeQuery();

          
            if (rs.next()) {
               
                String artikelbezeichnung = rs.getString("Artikelbezeichnung");
                String artikelbeschreibung = rs.getString("artikelbeschreibung");
                String artikelkategorie = rs.getString("Artikelkategorie");
                float kalorien = rs.getFloat("Kalorien");
                float proteine = rs.getFloat("Proteine");
                float kohlenhydrate = rs.getFloat("Kohlenhydrate");
                float fette = rs.getFloat("Fette");
                float preis = rs.getFloat("Preis");
                int dauer = rs.getInt("Dauer");
                String artikelzutaten = rs.getString("Artikelzutaten");
                String icon = rs.getString("Icon");
                String vegan = rs.getString("Vegan");
                String vegetarisch = rs.getString("Vegetarisch");
                String bio = rs.getString("Bio");

           
                Artikelbezeichnung_bearbeiten.setText(artikelbezeichnung);
                Artikelbeschreibung_bearbeiten.setText(artikelbeschreibung);
                Artikelkalorien_bearbeiten.setText(String.valueOf(kalorien));
                Artikelproteine_bearbeiten.setText(String.valueOf(proteine));
                Artikelkohlenhydrate_bearbeiten.setText(String.valueOf(kohlenhydrate));
                Artikelfette_bearbeiten.setText(String.valueOf(fette));
                Artikelpreis_bearbeiten.setText(String.valueOf(preis));
                Artikeldauer_bearbeiten.setText(String.valueOf(dauer));
                Artikelzutaten_bearbeiten.setText(artikelzutaten);
                Bildpfad_bearbeiten.setText(icon);

               
                ImageIcon imageIcon = new ImageIcon(icon);
                Image image = imageIcon.getImage().getScaledInstance(Imagezeiger2.getWidth(), Imagezeiger2.getHeight(), Image.SCALE_SMOOTH);
                Imagezeiger2.setIcon(new ImageIcon(image));

             
                Veganbox_bearbeiten.setSelectedItem(vegan);
                Vegi_bearbeiten.setSelectedItem(vegetarisch);
                Bio_bearbeiten.setSelectedItem(bio);

                Kategoriebox_bearbeiten.addItem(artikelkategorie);

                try (con) {
              
                    
                    String sql2 = "SELECT kategoriebezeichnung FROM kategorien";
                    PreparedStatement stmt2 = con.prepareStatement(sql2);
                    ResultSet rs2 = stmt2.executeQuery();

              
                    Kategoriebox_bearbeiten.removeAllItems();

         
                    while (rs2.next()) {
                        String kategoriebezeichnung = rs2.getString("kategoriebezeichnung");
                        Kategoriebox_bearbeiten.addItem(kategoriebezeichnung);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    
                } catch (Exception ex) {
                    ex.printStackTrace();
                   
                }

                Kategoriebox_bearbeiten.setSelectedItem(artikelkategorie);

                Artikelnummer_bearbeitenfeld.setEnabled(false);
                Kategoriebox_bearbeiten.setEnabled(true);
                Veganbox_bearbeiten.setEnabled(true);
                Vegi_bearbeiten.setEnabled(true);
                Bio_bearbeiten.setEnabled(true);
                Artikelbezeichnung_bearbeiten.setEnabled(true);
                Artikelbeschreibung_bearbeiten.setEnabled(true);
                Artikelkalorien_bearbeiten.setEnabled(true);
                Artikelproteine_bearbeiten.setEnabled(true);
                Artikelkohlenhydrate_bearbeiten.setEnabled(true);
                Artikelfette_bearbeiten.setEnabled(true);
                Artikelpreis_bearbeiten.setEnabled(true);
                Artikeldauer_bearbeiten.setEnabled(true);
                Artikelzutaten_bearbeiten.setEnabled(true);
                Bildwahlenbearbeiten.setEnabled(true);
                Bildhochladenbearbeiten.setEnabled(true);

            } else {
          
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        } catch (Exception ex) {
            ex.printStackTrace();
         
        }
        
    }//GEN-LAST:event_AnzeigenbearbeitenMouseClicked

    private void Anzeigen_löschenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Anzeigen_löschenMouseClicked
        String artikelnummer = Artikelnummer_löschen.getText();

        try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
            String sql = "SELECT Artikelbezeichnung FROM artikelliste WHERE Artikelnummer = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, artikelnummer);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String artikelbezeichnung = rs.getString("Artikelbezeichnung");
                Anzeiger_löschen.setText(artikelbezeichnung);
            } else {
                Anzeiger_löschen.setText("Keine Daten gefunden");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            
        } catch (Exception ex) {
            ex.printStackTrace();
           
        }

        
    }//GEN-LAST:event_Anzeigen_löschenMouseClicked

    private void jLabel223MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel223MouseClicked
        String artikelnummer = Artikelnummer_löschen.getText();

        try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
            
            String cidRetrieveQuery = "SELECT cid FROM artikelliste WHERE Artikelnummer = ?";
            PreparedStatement cidRetrieveStmt = con.prepareStatement(cidRetrieveQuery);
            cidRetrieveStmt.setString(1, artikelnummer);
            ResultSet cidRetrieveRs = cidRetrieveStmt.executeQuery();

            if (cidRetrieveRs.next()) {
                int cid = cidRetrieveRs.getInt("cid");

              
                String cidCheckQuery = "SELECT * FROM artikellayout WHERE cid = ?";
                PreparedStatement cidCheckStmt = con.prepareStatement(cidCheckQuery);
                cidCheckStmt.setInt(1, cid);
                ResultSet cidCheckRs = cidCheckStmt.executeQuery();

                if (!cidCheckRs.next()) {
                
                    String deleteQuery = "DELETE FROM artikelliste WHERE Artikelnummer = ?";
                    PreparedStatement deleteStmt = con.prepareStatement(deleteQuery);
                    deleteStmt.setString(1, artikelnummer);
                    int rowsDeleted = deleteStmt.executeUpdate();

                    if (rowsDeleted > 0) {
                        Anzeiger_löschen.setText("Artikel erfolgreich gelöscht");
                    } else {
                        Anzeiger_löschen.setText("Keine Daten gefunden.");
                    }
                } else {
                    Anzeiger_löschen.setText("Der Artikel kann nicht gelöscht werden, da Sie im Layout integriert ist.");
                }
            } else {
                Anzeiger_löschen.setText("No matching record found in artikelliste");
            }
            javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
   
                SwingUtilities.invokeLater(() -> {
                    Anzeiger_löschen.setText("");
                    Artikelnummer_löschen.setText("");

                });
            });
            timer.setRepeats(false);
            timer.start();

        } catch (SQLException ex) {
            ex.printStackTrace();
            
        } catch (Exception ex) {
            ex.printStackTrace();
           
        }

        
    }//GEN-LAST:event_jLabel223MouseClicked

    private void jLabel229MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel229MouseClicked
        String artikelnummer = Artikelnummerverfügbarkeiten.getText();

        try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
      
            String sql = "SELECT Artikelbezeichnung, Verfügbar FROM artikelliste WHERE Artikelnummer = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, artikelnummer);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                String artikelbezeichnung = rs.getString("Artikelbezeichnung");
                String verfügbar = rs.getString("Verfügbar");

                Artikelnummerverfügbarkeiten.setEnabled(false);
                BoxVerfügbarkeiten.setEnabled(true);
                Ändern_Verfübbarkeiten.setEnabled(true);
         
                Anzeiger_Verfügbarkeiten.setText(artikelbezeichnung);

             
                BoxVerfügbarkeiten.addItem("Ja");
                BoxVerfügbarkeiten.addItem("Nein");

             
                BoxVerfügbarkeiten.setSelectedItem(verfügbar);
            } else {
         
                Anzeiger_Verfügbarkeiten.setText("Keine Daten gefunden");
                javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
                    
                    SwingUtilities.invokeLater(() -> {
                        Anzeiger_Verfügbarkeiten.setText("");

                    });
                });
                timer.setRepeats(false);
                timer.start();

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            
        } catch (Exception ex) {
            ex.printStackTrace();
           
        }

        
    }//GEN-LAST:event_jLabel229MouseClicked

    private void Ändern_VerfübbarkeitenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ändern_VerfübbarkeitenMouseClicked

        String artikelnummer = Artikelnummerverfügbarkeiten.getText();
        String selectedVerfügbar = BoxVerfügbarkeiten.getSelectedItem().toString();

        try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
           
            String sql = "UPDATE artikelliste SET Verfügbar = ? WHERE Artikelnummer = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, selectedVerfügbar);
            stmt.setString(2, artikelnummer);
            int rowsUpdated = stmt.executeUpdate();

            Artikelnummerverfügbarkeiten.setEnabled(true);

            if (rowsUpdated > 0) {
                Anzeiger_Verfügbarkeiten.setText("Erfolgreich geändert");
            } else {
                Anzeiger_Verfügbarkeiten.setText("Keine Daten gefunden");
            }
            Artikelnummerverfügbarkeiten.setEnabled(true);
            BoxVerfügbarkeiten.setEnabled(false);
            Ändern_Verfübbarkeiten.setEnabled(false);
            BoxVerfügbarkeiten.removeItem("Ja");
            BoxVerfügbarkeiten.removeItem("Nein");
            Artikelnummerverfügbarkeiten.setText("");

           
            Tabellen Tabellen = new Tabellen();
        Tabellen.UpddateVerfügbarkeiten(Mysqllink, username, password, Tabelle_Verfügbarkeiten);
            javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
            
                SwingUtilities.invokeLater(() -> {
                    Anzeiger_Verfügbarkeiten.setText("");

                });
            });
            timer.setRepeats(false);
            timer.start();

        } catch (SQLException ex) {
            ex.printStackTrace();
            
        } catch (Exception ex) {
            ex.printStackTrace();
           
        }

        
    }//GEN-LAST:event_Ändern_VerfübbarkeitenMouseClicked

    private void jLabel146MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel146MouseClicked
        Supplementparent.removeAll();
        Supplementparent.add(VerfügbarkeitenSupplemente);
        Supplementparent.repaint();
        Supplementparent.revalidate();

        Tabellen Tabellen = new Tabellen(); // Erzeugung eines Umsatz-Objekts
        Tabellen.UpddateVerfügbarkeitenSupplemente(Mysqllink,username,password, TabelleVerfügbarkeiten);

        
    }//GEN-LAST:event_jLabel146MouseClicked

    private void SupplementanzeigenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplementanzeigenMouseClicked
        String supplementnummer = Supplementnummer.getText();

        try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
            String sql = "SELECT supplementbezeichnung, Verfügbar FROM supplements WHERE supplementnummer = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, supplementnummer);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String supplementbezeichnung = rs.getString("supplementbezeichnung");
                String verfügbar = rs.getString("Verfügbar");
                Supplementanzeiger.setText(supplementbezeichnung);
                BoxSupplemente.setSelectedItem(verfügbar);

                Supplementnummer.setEnabled(false);
                Supplementanzeigen.setEnabled(false);
                BoxSupplemente.setEnabled(true);
                Supplementeändern.setEnabled(true);

            
                BoxSupplemente.addItem("Ja");
                BoxSupplemente.addItem("Nein");

            } else {
                Supplementanzeiger.setText("Keine Daten gefunden");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        } catch (Exception ex) {
            ex.printStackTrace();
           

        }

        
    }//GEN-LAST:event_SupplementanzeigenMouseClicked

    private void jLabel229MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel229MouseEntered
        
    }//GEN-LAST:event_jLabel229MouseEntered

    private void SupplementeändernMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplementeändernMouseClicked
        String supplementnummer = Supplementnummer.getText();
        String selectedVerfügbar = BoxSupplemente.getSelectedItem().toString();

        try (Connection con = DriverManager.getConnection(Mysqllink, username, password)) {
  
            String sql = "UPDATE supplements SET Verfügbar = ? WHERE Supplementnummer = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, selectedVerfügbar);
            stmt.setString(2, supplementnummer);
            int rowsUpdated = stmt.executeUpdate();

            if (rowsUpdated > 0) {

                Supplementanzeiger.setText("Erfolgreich geändert");
            } else {
                Supplementanzeiger.setText("Keine Daten gefunden");
            }

            BoxSupplemente.removeItem("Ja");
            BoxSupplemente.removeItem("Nein");
            Supplementeändern.setEnabled(false);
            BoxSupplemente.setEnabled(false);
            Supplementnummer.setEnabled(true);
            Supplementanzeigen.setEnabled(true);

             Tabellen Tabellen = new Tabellen();
        Tabellen.UpddateVerfügbarkeiten(Mysqllink, username, password, Tabelle_Verfügbarkeiten);
            javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
            
                SwingUtilities.invokeLater(() -> {
                    Supplementanzeiger.setText("");

                });
            });
            timer.setRepeats(false);
            timer.start();

        } catch (SQLException ex) {
            ex.printStackTrace();
            
        } catch (Exception ex) {
            ex.printStackTrace();
           
        }

      
          Tabellen Tabellen = new Tabellen(); // Erzeugung eines Umsatz-Objekts
        Tabellen.UpddateVerfügbarkeitenSupplemente(Mysqllink,username,password, TabelleVerfügbarkeiten);

        
    }//GEN-LAST:event_SupplementeändernMouseClicked

    private void SupplementanzeigenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplementanzeigenMousePressed

        
    }//GEN-LAST:event_SupplementanzeigenMousePressed

    private void jLabel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseClicked
        ParentArtikelbewirtschaftung.removeAll();
        ParentArtikelbewirtschaftung.add(Kategorien);
        ParentArtikelbewirtschaftung.repaint();
        ParentArtikelbewirtschaftung.revalidate();

     
 Layout Layout = new Layout(); // Erzeugung eines Umsatz-Objekts
Layout.Kategorieupdate(Mysqllink, username, password, FeldKategorie1_2, FeldKategorie1_3, FeldKategorie1_4,FeldKategorie1_5,FeldKategorie1_6,FeldKategorie1_7,FeldKategorie2_1
,FeldKategorie2_2,FeldKategorie2_3,FeldKategorie2_4, FeldKategorie2_5, FeldKategorie2_6);

        
    }//GEN-LAST:event_jLabel62MouseClicked

    private void FeldKategorie1_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie1_4MouseClicked
        
    }//GEN-LAST:event_FeldKategorie1_4MouseClicked

    private void FeldKategorie1_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie1_4MouseEntered
        
    }//GEN-LAST:event_FeldKategorie1_4MouseEntered

    private void FeldKategorie1_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie1_4MouseExited
        
    }//GEN-LAST:event_FeldKategorie1_4MouseExited

    private void FeldKategorie1_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie1_2MouseClicked
        
    }//GEN-LAST:event_FeldKategorie1_2MouseClicked

    private void FeldKategorie1_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie1_2MouseEntered
        
    }//GEN-LAST:event_FeldKategorie1_2MouseEntered

    private void FeldKategorie1_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie1_2MouseExited
        
    }//GEN-LAST:event_FeldKategorie1_2MouseExited

    private void FeldKategorie1_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie1_3MouseClicked
        
    }//GEN-LAST:event_FeldKategorie1_3MouseClicked

    private void FeldKategorie1_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie1_3MouseEntered
        
    }//GEN-LAST:event_FeldKategorie1_3MouseEntered

    private void FeldKategorie1_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie1_3MouseExited
        
    }//GEN-LAST:event_FeldKategorie1_3MouseExited

    private void FeldKategorie1_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie1_7MouseClicked
        
    }//GEN-LAST:event_FeldKategorie1_7MouseClicked

    private void FeldKategorie1_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie1_7MouseEntered
        
    }//GEN-LAST:event_FeldKategorie1_7MouseEntered

    private void FeldKategorie1_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie1_7MouseExited
        
    }//GEN-LAST:event_FeldKategorie1_7MouseExited

    private void FeldKategorie1_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie1_5MouseClicked
        
    }//GEN-LAST:event_FeldKategorie1_5MouseClicked

    private void FeldKategorie1_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie1_5MouseEntered
        
    }//GEN-LAST:event_FeldKategorie1_5MouseEntered

    private void FeldKategorie1_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie1_5MouseExited
        
    }//GEN-LAST:event_FeldKategorie1_5MouseExited

    private void FeldKategorie1_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie1_6MouseClicked
        
    }//GEN-LAST:event_FeldKategorie1_6MouseClicked

    private void FeldKategorie1_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie1_6MouseEntered
        
    }//GEN-LAST:event_FeldKategorie1_6MouseEntered

    private void FeldKategorie1_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie1_6MouseExited
        
    }//GEN-LAST:event_FeldKategorie1_6MouseExited

    private void FeldKategorie2_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie2_1MouseClicked
        
    }//GEN-LAST:event_FeldKategorie2_1MouseClicked

    private void FeldKategorie2_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie2_1MouseEntered
        
    }//GEN-LAST:event_FeldKategorie2_1MouseEntered

    private void FeldKategorie2_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie2_1MouseExited
        
    }//GEN-LAST:event_FeldKategorie2_1MouseExited

    private void FeldKategorie2_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie2_2MouseClicked
        
    }//GEN-LAST:event_FeldKategorie2_2MouseClicked

    private void FeldKategorie2_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie2_2MouseEntered
        
    }//GEN-LAST:event_FeldKategorie2_2MouseEntered

    private void FeldKategorie2_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie2_2MouseExited
        
    }//GEN-LAST:event_FeldKategorie2_2MouseExited

    private void FeldKategorie2_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie2_3MouseClicked
        
    }//GEN-LAST:event_FeldKategorie2_3MouseClicked

    private void FeldKategorie2_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie2_3MouseEntered
        
    }//GEN-LAST:event_FeldKategorie2_3MouseEntered

    private void FeldKategorie2_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie2_3MouseExited
        
    }//GEN-LAST:event_FeldKategorie2_3MouseExited

    private void FeldKategorie2_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie2_4MouseClicked
        
    }//GEN-LAST:event_FeldKategorie2_4MouseClicked

    private void FeldKategorie2_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie2_4MouseEntered
        
    }//GEN-LAST:event_FeldKategorie2_4MouseEntered

    private void FeldKategorie2_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie2_4MouseExited
        
    }//GEN-LAST:event_FeldKategorie2_4MouseExited

    private void FeldKategorie2_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie2_5MouseClicked
        
    }//GEN-LAST:event_FeldKategorie2_5MouseClicked

    private void FeldKategorie2_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie2_5MouseEntered
        
    }//GEN-LAST:event_FeldKategorie2_5MouseEntered

    private void FeldKategorie2_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie2_5MouseExited
        
    }//GEN-LAST:event_FeldKategorie2_5MouseExited

    private void FeldKategorie2_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie2_6MouseClicked
        
    }//GEN-LAST:event_FeldKategorie2_6MouseClicked

    private void FeldKategorie2_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie2_6MouseEntered
        
    }//GEN-LAST:event_FeldKategorie2_6MouseEntered

    private void FeldKategorie2_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeldKategorie2_6MouseExited
        
    }//GEN-LAST:event_FeldKategorie2_6MouseExited

    private void jLabel253MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel253MouseClicked

        reihenwert = 1.2;
        newValue = UmbenennenFeld2.getText();

        Layout Layout = new Layout(); // Erzeugung eines Umsatz-Objekts
        Layout.Kategorieumbennen(Mysqllink,username,password,reihenwert,newValue, jLabel234);
        
        
 
Layout.Kategorieupdate(Mysqllink, username, password, FeldKategorie1_2, FeldKategorie1_3, FeldKategorie1_4,FeldKategorie1_5,FeldKategorie1_6,FeldKategorie1_7,FeldKategorie2_1
,FeldKategorie2_2,FeldKategorie2_3,FeldKategorie2_4, FeldKategorie2_5, FeldKategorie2_6);
      
Felder Felder = new Felder();
Felder.Kategoriefelderleeren(UmbenennenFeld2,UmbenennenFeld3, UmbenennenFeld4, UmbenennenFeld5,UmbenennenFeld6,UmbenennenFeld7, UmbenennenFeld8,UmbenennenFeld9, UmbenennenFeld10,
          UmbenennenFeld11,UmbenennenFeld12, UmbenennenFeld13);

    }//GEN-LAST:event_jLabel253MouseClicked

    private void jLabel254MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel254MouseClicked
        reihenwert = 1.3;
        newValue = UmbenennenFeld3.getText();

     Layout Layout = new Layout(); // Erzeugung eines Umsatz-Objekts
        Layout.Kategorieumbennen(Mysqllink,username,password,reihenwert,newValue, jLabel234);
        
Layout.Kategorieupdate(Mysqllink, username, password, FeldKategorie1_2, FeldKategorie1_3, FeldKategorie1_4,FeldKategorie1_5,FeldKategorie1_6,FeldKategorie1_7,FeldKategorie2_1
,FeldKategorie2_2,FeldKategorie2_3,FeldKategorie2_4, FeldKategorie2_5, FeldKategorie2_6);
      
         
       Felder Felder = new Felder();
Felder.Kategoriefelderleeren(UmbenennenFeld2,UmbenennenFeld3, UmbenennenFeld4, UmbenennenFeld5,UmbenennenFeld6,UmbenennenFeld7, UmbenennenFeld8,UmbenennenFeld9, UmbenennenFeld10,
          UmbenennenFeld11,UmbenennenFeld12, UmbenennenFeld13);  
         
    }//GEN-LAST:event_jLabel254MouseClicked

    private void jLabel255MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel255MouseClicked
        reihenwert = 1.4; 
        newValue = UmbenennenFeld4.getText();


      
         Layout Layout = new Layout(); // Erzeugung eines Umsatz-Objekts
        Layout.Kategorieumbennen(Mysqllink,username,password,reihenwert,newValue, jLabel234);
        
Layout.Kategorieupdate(Mysqllink, username, password, FeldKategorie1_2, FeldKategorie1_3, FeldKategorie1_4,FeldKategorie1_5,FeldKategorie1_6,FeldKategorie1_7,FeldKategorie2_1
,FeldKategorie2_2,FeldKategorie2_3,FeldKategorie2_4, FeldKategorie2_5, FeldKategorie2_6);
        

Felder Felder = new Felder();
Felder.Kategoriefelderleeren(UmbenennenFeld2,UmbenennenFeld3, UmbenennenFeld4, UmbenennenFeld5,UmbenennenFeld6,UmbenennenFeld7, UmbenennenFeld8,UmbenennenFeld9, UmbenennenFeld10,
          UmbenennenFeld11,UmbenennenFeld12, UmbenennenFeld13);
    }//GEN-LAST:event_jLabel255MouseClicked

    private void jLabel256MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel256MouseClicked
        reihenwert = 1.5; 
        newValue = UmbenennenFeld5.getText();

       
         Layout Layout = new Layout(); // Erzeugung eines Umsatz-Objekts
        Layout.Kategorieumbennen(Mysqllink,username,password,reihenwert,newValue, jLabel234);
Layout.Kategorieupdate(Mysqllink, username, password, FeldKategorie1_2, FeldKategorie1_3, FeldKategorie1_4,FeldKategorie1_5,FeldKategorie1_6,FeldKategorie1_7,FeldKategorie2_1
,FeldKategorie2_2,FeldKategorie2_3,FeldKategorie2_4, FeldKategorie2_5, FeldKategorie2_6);

        Felder Felder = new Felder();
Felder.Kategoriefelderleeren(UmbenennenFeld2,UmbenennenFeld3, UmbenennenFeld4, UmbenennenFeld5,UmbenennenFeld6,UmbenennenFeld7, UmbenennenFeld8,UmbenennenFeld9, UmbenennenFeld10,
          UmbenennenFeld11,UmbenennenFeld12, UmbenennenFeld13);
    }//GEN-LAST:event_jLabel256MouseClicked

    private void jLabel257MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel257MouseClicked
        reihenwert = 1.6; 
        newValue = UmbenennenFeld6.getText();

     
         Layout Layout = new Layout(); // Erzeugung eines Umsatz-Objekts
        Layout.Kategorieumbennen(Mysqllink,username,password,reihenwert,newValue, jLabel234);
Layout.Kategorieupdate(Mysqllink, username, password, FeldKategorie1_2, FeldKategorie1_3, FeldKategorie1_4,FeldKategorie1_5,FeldKategorie1_6,FeldKategorie1_7,FeldKategorie2_1
,FeldKategorie2_2,FeldKategorie2_3,FeldKategorie2_4, FeldKategorie2_5, FeldKategorie2_6);
 
      
        
        Felder Felder = new Felder();
Felder.Kategoriefelderleeren(UmbenennenFeld2,UmbenennenFeld3, UmbenennenFeld4, UmbenennenFeld5,UmbenennenFeld6,UmbenennenFeld7, UmbenennenFeld8,UmbenennenFeld9, UmbenennenFeld10,
          UmbenennenFeld11,UmbenennenFeld12, UmbenennenFeld13);
    }//GEN-LAST:event_jLabel257MouseClicked

    private void jLabel246MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel246MouseClicked
        reihenwert = 1.7; 
        newValue = UmbenennenFeld7.getText();
      
         Layout Layout = new Layout(); // Erzeugung eines Umsatz-Objekts
        Layout.Kategorieumbennen(Mysqllink,username,password,reihenwert,newValue, jLabel234);
Layout.Kategorieupdate(Mysqllink, username, password, FeldKategorie1_2, FeldKategorie1_3, FeldKategorie1_4,FeldKategorie1_5,FeldKategorie1_6,FeldKategorie1_7,FeldKategorie2_1
,FeldKategorie2_2,FeldKategorie2_3,FeldKategorie2_4, FeldKategorie2_5, FeldKategorie2_6);
    
      Felder Felder = new Felder();
Felder.Kategoriefelderleeren(UmbenennenFeld2,UmbenennenFeld3, UmbenennenFeld4, UmbenennenFeld5,UmbenennenFeld6,UmbenennenFeld7, UmbenennenFeld8,UmbenennenFeld9, UmbenennenFeld10,
          UmbenennenFeld11,UmbenennenFeld12, UmbenennenFeld13);
    }//GEN-LAST:event_jLabel246MouseClicked

    private void Senden10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Senden10MouseClicked
        reihenwert = 2.1; 
        newValue = UmbenennenFeld8.getText();

         Layout Layout = new Layout(); // Erzeugung eines Umsatz-Objekts
        Layout.Kategorieumbennen(Mysqllink,username,password,reihenwert,newValue, jLabel234);
Layout.Kategorieupdate(Mysqllink, username, password, FeldKategorie1_2, FeldKategorie1_3, FeldKategorie1_4,FeldKategorie1_5,FeldKategorie1_6,FeldKategorie1_7,FeldKategorie2_1
,FeldKategorie2_2,FeldKategorie2_3,FeldKategorie2_4, FeldKategorie2_5, FeldKategorie2_6);

         
         Felder Felder = new Felder();
Felder.Kategoriefelderleeren(UmbenennenFeld2,UmbenennenFeld3, UmbenennenFeld4, UmbenennenFeld5,UmbenennenFeld6,UmbenennenFeld7, UmbenennenFeld8,UmbenennenFeld9, UmbenennenFeld10,
          UmbenennenFeld11,UmbenennenFeld12, UmbenennenFeld13);
    }//GEN-LAST:event_Senden10MouseClicked

    private void Senden11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Senden11MouseClicked
        reihenwert = 2.2; 
        newValue = UmbenennenFeld9.getText();


          Layout Layout = new Layout(); // Erzeugung eines Umsatz-Objekts
        Layout.Kategorieumbennen(Mysqllink,username,password,reihenwert,newValue, jLabel234);
Layout.Kategorieupdate(Mysqllink, username, password, FeldKategorie1_2, FeldKategorie1_3, FeldKategorie1_4,FeldKategorie1_5,FeldKategorie1_6,FeldKategorie1_7,FeldKategorie2_1
,FeldKategorie2_2,FeldKategorie2_3,FeldKategorie2_4, FeldKategorie2_5, FeldKategorie2_6);
   
        Felder Felder = new Felder();
Felder.Kategoriefelderleeren(UmbenennenFeld2,UmbenennenFeld3, UmbenennenFeld4, UmbenennenFeld5,UmbenennenFeld6,UmbenennenFeld7, UmbenennenFeld8,UmbenennenFeld9, UmbenennenFeld10,
          UmbenennenFeld11,UmbenennenFeld12, UmbenennenFeld13);
    }//GEN-LAST:event_Senden11MouseClicked

    private void Senden12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Senden12MouseClicked
        reihenwert = 2.3;
        newValue = UmbenennenFeld10.getText();

    Layout Layout = new Layout(); // Erzeugung eines Umsatz-Objekts
        Layout.Kategorieumbennen(Mysqllink,username,password,reihenwert,newValue, jLabel234);
Layout.Kategorieupdate(Mysqllink, username, password, FeldKategorie1_2, FeldKategorie1_3, FeldKategorie1_4,FeldKategorie1_5,FeldKategorie1_6,FeldKategorie1_7,FeldKategorie2_1
,FeldKategorie2_2,FeldKategorie2_3,FeldKategorie2_4, FeldKategorie2_5, FeldKategorie2_6);
        
         Felder Felder = new Felder();
Felder.Kategoriefelderleeren(UmbenennenFeld2,UmbenennenFeld3, UmbenennenFeld4, UmbenennenFeld5,UmbenennenFeld6,UmbenennenFeld7, UmbenennenFeld8,UmbenennenFeld9, UmbenennenFeld10,
          UmbenennenFeld11,UmbenennenFeld12, UmbenennenFeld13);
    }//GEN-LAST:event_Senden12MouseClicked

    private void Senden13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Senden13MouseClicked
        reihenwert = 2.4; 
        newValue = UmbenennenFeld11.getText();

       Layout Layout = new Layout(); // Erzeugung eines Umsatz-Objekts
        Layout.Kategorieumbennen(Mysqllink,username,password,reihenwert,newValue, jLabel234);
Layout.Kategorieupdate(Mysqllink, username, password, FeldKategorie1_2, FeldKategorie1_3, FeldKategorie1_4,FeldKategorie1_5,FeldKategorie1_6,FeldKategorie1_7,FeldKategorie2_1
,FeldKategorie2_2,FeldKategorie2_3,FeldKategorie2_4, FeldKategorie2_5, FeldKategorie2_6);
     
        Felder Felder = new Felder();
Felder.Kategoriefelderleeren(UmbenennenFeld2,UmbenennenFeld3, UmbenennenFeld4, UmbenennenFeld5,UmbenennenFeld6,UmbenennenFeld7, UmbenennenFeld8,UmbenennenFeld9, UmbenennenFeld10,
          UmbenennenFeld11,UmbenennenFeld12, UmbenennenFeld13);
    }//GEN-LAST:event_Senden13MouseClicked

    private void Senden14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Senden14MouseClicked
        reihenwert = 2.5;
        newValue = UmbenennenFeld12.getText();

         Layout Layout = new Layout(); // Erzeugung eines Umsatz-Objekts
        Layout.Kategorieumbennen(Mysqllink,username,password,reihenwert,newValue, jLabel234);
Layout.Kategorieupdate(Mysqllink, username, password, FeldKategorie1_2, FeldKategorie1_3, FeldKategorie1_4,FeldKategorie1_5,FeldKategorie1_6,FeldKategorie1_7,FeldKategorie2_1
,FeldKategorie2_2,FeldKategorie2_3,FeldKategorie2_4, FeldKategorie2_5, FeldKategorie2_6);
       
         Felder Felder = new Felder();
Felder.Kategoriefelderleeren(UmbenennenFeld2,UmbenennenFeld3, UmbenennenFeld4, UmbenennenFeld5,UmbenennenFeld6,UmbenennenFeld7, UmbenennenFeld8,UmbenennenFeld9, UmbenennenFeld10,
          UmbenennenFeld11,UmbenennenFeld12, UmbenennenFeld13);
    }//GEN-LAST:event_Senden14MouseClicked

    private void Senden15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Senden15MouseClicked
        reihenwert = 2.6; 
        newValue = UmbenennenFeld13.getText();

         Layout Layout = new Layout(); // Erzeugung eines Umsatz-Objekts
        Layout.Kategorieumbennen(Mysqllink,username,password,reihenwert,newValue, jLabel234);
Layout.Kategorieupdate(Mysqllink, username, password, FeldKategorie1_2, FeldKategorie1_3, FeldKategorie1_4,FeldKategorie1_5,FeldKategorie1_6,FeldKategorie1_7,FeldKategorie2_1
,FeldKategorie2_2,FeldKategorie2_3,FeldKategorie2_4, FeldKategorie2_5, FeldKategorie2_6);
     
         Felder Felder = new Felder();
Felder.Kategoriefelderleeren(UmbenennenFeld2,UmbenennenFeld3, UmbenennenFeld4, UmbenennenFeld5,UmbenennenFeld6,UmbenennenFeld7, UmbenennenFeld8,UmbenennenFeld9, UmbenennenFeld10,
          UmbenennenFeld11,UmbenennenFeld12, UmbenennenFeld13);
    }//GEN-LAST:event_Senden15MouseClicked

    private void jLabel267MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel267MouseClicked
        
    }//GEN-LAST:event_jLabel267MouseClicked

    private void jLabel267MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel267MouseEntered
        
    }//GEN-LAST:event_jLabel267MouseEntered

    private void jLabel267MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel267MouseExited
        
    }//GEN-LAST:event_jLabel267MouseExited

    private void BestellunglöschenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BestellunglöschenMouseClicked
String bestellID = BestellID.getText();

try {
    Connection connection = DriverManager.getConnection(Mysqllink, username, password);

 
    String bestellungenDeleteQuery = "DELETE FROM bestellungen WHERE Bestell_ID = ?";
    PreparedStatement bestellungenDeleteStatement = connection.prepareStatement(bestellungenDeleteQuery);
    bestellungenDeleteStatement.setString(1, bestellID);
    bestellungenDeleteStatement.executeUpdate();

  
    String bestellungenDetailDeleteQuery = "DELETE FROM bestellungen_detail WHERE Bestell_ID = ?";
    PreparedStatement bestellungenDetailDeleteStatement = connection.prepareStatement(bestellungenDetailDeleteQuery);
    bestellungenDetailDeleteStatement.setString(1, bestellID);
    bestellungenDetailDeleteStatement.executeUpdate();
     Löschanzeige.setText("Bestell ID " + bestellID + " wurde Erfolgreich gelöscht");
     javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
              
                        SwingUtilities.invokeLater(() -> {
                            Löschanzeige.setText("");
                            yyy.setSize(30, 0);
                        });
                    });
                    timer.setRepeats(false);
                    timer.start();


    bestellungenDeleteStatement.close();
    bestellungenDetailDeleteStatement.close();
    connection.close();
} catch (SQLException e) {
    e.printStackTrace();
}

        Tabellen Tabellen = new Tabellen(); // Erzeugung eines Tabellen-Objekts
Tabellen.Bestellungentabelle(Mysqllink,username,password,Bestellübersicht,Detailtabelle); // Abruf Methode Bestellungentabelle
    }//GEN-LAST:event_BestellunglöschenMouseClicked

    private void jLabel281MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel281MouseClicked
String filterValue = Filtern.getText();

try {
    Connection connection = DriverManager.getConnection(Mysqllink, username, password);

 
    String bestellungenQuery = "SELECT Bestell_ID, Abholcode, Bestellzeit FROM bestellungen WHERE Bestell_ID = ?";
    PreparedStatement bestellungenStatement = connection.prepareStatement(bestellungenQuery);
    bestellungenStatement.setString(1, filterValue);
    ResultSet bestellungenResultSet = bestellungenStatement.executeQuery();


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

    
    String bestellungenDetailQuery = "SELECT bd.Bestell_ID, bd.Preis, bd.Artikelnummer, al.Artikelbezeichnung " +
            "FROM bestellungen_detail bd " +
            "JOIN artikelliste al ON bd.Artikelnummer = al.Artikelnummer " +
            "WHERE bd.Bestell_ID = ?";
    PreparedStatement bestellungenDetailStatement = connection.prepareStatement(bestellungenDetailQuery);
    bestellungenDetailStatement.setString(1, filterValue);
    ResultSet bestellungenDetailResultSet = bestellungenDetailStatement.executeQuery();

    
    DefaultTableModel detailtabelleModel = (DefaultTableModel) Detailtabelle.getModel();


    detailtabelleModel.setRowCount(0);


    while (bestellungenDetailResultSet.next()) {
        Object[] rowData = {
                bestellungenDetailResultSet.getString("Bestell_ID"),
                bestellungenDetailResultSet.getString("Artikelnummer"),
                bestellungenDetailResultSet.getString("Artikelbezeichnung"),
                bestellungenDetailResultSet.getDouble("Preis"),
        };
        detailtabelleModel.addRow(rowData);
    }

   
    bestellungenDetailResultSet.close();
    bestellungenDetailStatement.close();

    connection.close();
} catch (SQLException e) {
    e.printStackTrace();
}

        
    }//GEN-LAST:event_jLabel281MouseClicked

    private void jLabel282MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel282MouseClicked

Tabellen Tabellen = new Tabellen(); // Erzeugung eines Tabellen-Objekts
Tabellen.Bestellungentabelle(Mysqllink,username,password,Bestellübersicht,Detailtabelle); // Abruf Methode Bestellungentabelle
Filtern.setText("");
        
    }//GEN-LAST:event_jLabel282MouseClicked

    private void TitelStatistikenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitelStatistikenMouseClicked
        
    }//GEN-LAST:event_TitelStatistikenMouseClicked

    private void TitelStatistikenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitelStatistikenMouseEntered
        
    }//GEN-LAST:event_TitelStatistikenMouseEntered

    private void TitelStatistikenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitelStatistikenMouseExited
        
    }//GEN-LAST:event_TitelStatistikenMouseExited

    private void MenuDashboard2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuDashboard2MouseClicked
        
    }//GEN-LAST:event_MenuDashboard2MouseClicked

    private void MenuDashboard2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuDashboard2MouseEntered
        
    }//GEN-LAST:event_MenuDashboard2MouseEntered

    private void MenuDashboard2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuDashboard2MouseExited
        
    }//GEN-LAST:event_MenuDashboard2MouseExited

    private void LeerenFeld15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeerenFeld15MouseClicked
      
       Felder Felder = new Felder();
        Felder.LayoutFeldLeeren (TextfeldFeld01,TextfeldFeld02,TextfeldFeld03, TextfeldFeld04,TextfeldFeld05,TextfeldFeld06,TextfeldFeld07, TextfeldFeld08,
            TextfeldFeld09, TextfeldFeld10,TextfeldFeld11, TextfeldFeld12, TextfeldFeld13,TextfeldFeld14, TextfeldFeld15);
        
    }//GEN-LAST:event_LeerenFeld15MouseClicked

    private void jLabel224MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel224MouseClicked
Artikelnummer_löschen.setText("");
        
    }//GEN-LAST:event_jLabel224MouseClicked

    private void LeerenFeld01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeerenFeld01MouseClicked

  Felder Felder = new Felder();
        Felder.LayoutFeldLeeren (TextfeldFeld01,TextfeldFeld02,TextfeldFeld03, TextfeldFeld04,TextfeldFeld05,TextfeldFeld06,TextfeldFeld07, TextfeldFeld08,
            TextfeldFeld09, TextfeldFeld10,TextfeldFeld11, TextfeldFeld12, TextfeldFeld13,TextfeldFeld14, TextfeldFeld15);
    }//GEN-LAST:event_LeerenFeld01MouseClicked

    private void LeerenFeld06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeerenFeld06MouseClicked

          Felder Felder = new Felder();
        Felder.LayoutFeldLeeren (TextfeldFeld01,TextfeldFeld02,TextfeldFeld03, TextfeldFeld04,TextfeldFeld05,TextfeldFeld06,TextfeldFeld07, TextfeldFeld08,
            TextfeldFeld09, TextfeldFeld10,TextfeldFeld11, TextfeldFeld12, TextfeldFeld13,TextfeldFeld14, TextfeldFeld15);
    }//GEN-LAST:event_LeerenFeld06MouseClicked

    private void LeerenFeld11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeerenFeld11MouseClicked

  Felder Felder = new Felder();
        Felder.LayoutFeldLeeren (TextfeldFeld01,TextfeldFeld02,TextfeldFeld03, TextfeldFeld04,TextfeldFeld05,TextfeldFeld06,TextfeldFeld07, TextfeldFeld08,
            TextfeldFeld09, TextfeldFeld10,TextfeldFeld11, TextfeldFeld12, TextfeldFeld13,TextfeldFeld14, TextfeldFeld15);
    }//GEN-LAST:event_LeerenFeld11MouseClicked

    private void LeerenFeld02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeerenFeld02MouseClicked

      Felder Felder = new Felder();
        Felder.LayoutFeldLeeren (TextfeldFeld01,TextfeldFeld02,TextfeldFeld03, TextfeldFeld04,TextfeldFeld05,TextfeldFeld06,TextfeldFeld07, TextfeldFeld08,
            TextfeldFeld09, TextfeldFeld10,TextfeldFeld11, TextfeldFeld12, TextfeldFeld13,TextfeldFeld14, TextfeldFeld15);
    }//GEN-LAST:event_LeerenFeld02MouseClicked

    private void LeerenFeld07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeerenFeld07MouseClicked
    
       Felder Felder = new Felder();
        Felder.LayoutFeldLeeren (TextfeldFeld01,TextfeldFeld02,TextfeldFeld03, TextfeldFeld04,TextfeldFeld05,TextfeldFeld06,TextfeldFeld07, TextfeldFeld08,
            TextfeldFeld09, TextfeldFeld10,TextfeldFeld11, TextfeldFeld12, TextfeldFeld13,TextfeldFeld14, TextfeldFeld15);
    }//GEN-LAST:event_LeerenFeld07MouseClicked

    private void LeerenFeld12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeerenFeld12MouseClicked

     Felder Felder = new Felder();
        Felder.LayoutFeldLeeren (TextfeldFeld01,TextfeldFeld02,TextfeldFeld03, TextfeldFeld04,TextfeldFeld05,TextfeldFeld06,TextfeldFeld07, TextfeldFeld08,
            TextfeldFeld09, TextfeldFeld10,TextfeldFeld11, TextfeldFeld12, TextfeldFeld13,TextfeldFeld14, TextfeldFeld15);
    }//GEN-LAST:event_LeerenFeld12MouseClicked

    private void LeerenFeld03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeerenFeld03MouseClicked
  
   Felder Felder = new Felder();
        Felder.LayoutFeldLeeren (TextfeldFeld01,TextfeldFeld02,TextfeldFeld03, TextfeldFeld04,TextfeldFeld05,TextfeldFeld06,TextfeldFeld07, TextfeldFeld08,
            TextfeldFeld09, TextfeldFeld10,TextfeldFeld11, TextfeldFeld12, TextfeldFeld13,TextfeldFeld14, TextfeldFeld15);
    }//GEN-LAST:event_LeerenFeld03MouseClicked

    private void LeerenFeld08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeerenFeld08MouseClicked
    
      Felder Felder = new Felder();
        Felder.LayoutFeldLeeren (TextfeldFeld01,TextfeldFeld02,TextfeldFeld03, TextfeldFeld04,TextfeldFeld05,TextfeldFeld06,TextfeldFeld07, TextfeldFeld08,
            TextfeldFeld09, TextfeldFeld10,TextfeldFeld11, TextfeldFeld12, TextfeldFeld13,TextfeldFeld14, TextfeldFeld15);
    }//GEN-LAST:event_LeerenFeld08MouseClicked

    private void LeerenFeld13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeerenFeld13MouseClicked
     
        Felder Felder = new Felder();
        Felder.LayoutFeldLeeren (TextfeldFeld01,TextfeldFeld02,TextfeldFeld03, TextfeldFeld04,TextfeldFeld05,TextfeldFeld06,TextfeldFeld07, TextfeldFeld08,
            TextfeldFeld09, TextfeldFeld10,TextfeldFeld11, TextfeldFeld12, TextfeldFeld13,TextfeldFeld14, TextfeldFeld15);
    }//GEN-LAST:event_LeerenFeld13MouseClicked

    private void LeerenFeld04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeerenFeld04MouseClicked
     
       Felder Felder = new Felder();
        Felder.LayoutFeldLeeren (TextfeldFeld01,TextfeldFeld02,TextfeldFeld03, TextfeldFeld04,TextfeldFeld05,TextfeldFeld06,TextfeldFeld07, TextfeldFeld08,
            TextfeldFeld09, TextfeldFeld10,TextfeldFeld11, TextfeldFeld12, TextfeldFeld13,TextfeldFeld14, TextfeldFeld15);
    }//GEN-LAST:event_LeerenFeld04MouseClicked

    private void LeerenFeld09MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeerenFeld09MouseClicked
    
       Felder Felder = new Felder();
        Felder.LayoutFeldLeeren (TextfeldFeld01,TextfeldFeld02,TextfeldFeld03, TextfeldFeld04,TextfeldFeld05,TextfeldFeld06,TextfeldFeld07, TextfeldFeld08,
            TextfeldFeld09, TextfeldFeld10,TextfeldFeld11, TextfeldFeld12, TextfeldFeld13,TextfeldFeld14, TextfeldFeld15);
    }//GEN-LAST:event_LeerenFeld09MouseClicked

    private void LeerenFeld14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeerenFeld14MouseClicked
       
        Felder Felder = new Felder();
        Felder.LayoutFeldLeeren (TextfeldFeld01,TextfeldFeld02,TextfeldFeld03, TextfeldFeld04,TextfeldFeld05,TextfeldFeld06,TextfeldFeld07, TextfeldFeld08,
            TextfeldFeld09, TextfeldFeld10,TextfeldFeld11, TextfeldFeld12, TextfeldFeld13,TextfeldFeld14, TextfeldFeld15);
    }//GEN-LAST:event_LeerenFeld14MouseClicked

    private void LeerenFeld05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeerenFeld05MouseClicked
        
         Felder Felder = new Felder();
        Felder.LayoutFeldLeeren (TextfeldFeld01,TextfeldFeld02,TextfeldFeld03, TextfeldFeld04,TextfeldFeld05,TextfeldFeld06,TextfeldFeld07, TextfeldFeld08,
            TextfeldFeld09, TextfeldFeld10,TextfeldFeld11, TextfeldFeld12, TextfeldFeld13,TextfeldFeld14, TextfeldFeld15);
    }//GEN-LAST:event_LeerenFeld05MouseClicked

    private void LeerenFeld10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeerenFeld10MouseClicked

      Felder Felder = new Felder();
        Felder.LayoutFeldLeeren (TextfeldFeld01,TextfeldFeld02,TextfeldFeld03, TextfeldFeld04,TextfeldFeld05,TextfeldFeld06,TextfeldFeld07, TextfeldFeld08,
            TextfeldFeld09, TextfeldFeld10,TextfeldFeld11, TextfeldFeld12, TextfeldFeld13,TextfeldFeld14, TextfeldFeld15);
    }//GEN-LAST:event_LeerenFeld10MouseClicked


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new Admin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adddata;
    private javax.swing.JLabel Adddata1;
    private javax.swing.JLabel Adddata2;
    private javax.swing.JLabel Adddata3;
    private javax.swing.JLabel Adddata5;
    private javax.swing.JLabel Adddata6;
    private javax.swing.JPanel Admin;
    private javax.swing.JPanel Admin_linkeSpalte;
    private javax.swing.JButton AndernFeld01;
    private javax.swing.JButton AndernFeld02;
    private javax.swing.JButton AndernFeld03;
    private javax.swing.JButton AndernFeld04;
    private javax.swing.JButton AndernFeld05;
    private javax.swing.JButton AndernFeld06;
    private javax.swing.JButton AndernFeld07;
    private javax.swing.JButton AndernFeld08;
    private javax.swing.JButton AndernFeld09;
    private javax.swing.JButton AndernFeld10;
    private javax.swing.JButton AndernFeld11;
    private javax.swing.JButton AndernFeld12;
    private javax.swing.JButton AndernFeld13;
    private javax.swing.JButton AndernFeld14;
    private javax.swing.JButton AndernFeld15;
    private javax.swing.JLabel Andernausgabe;
    private javax.swing.JLabel AnzeigeOptionhinzufugen;
    private javax.swing.JLabel AnzeigeOptionhinzufugen2;
    private javax.swing.JLabel Anzeige_erstellen;
    private javax.swing.JLabel Anzeigen_löschen;
    private javax.swing.JLabel Anzeigenausgabe;
    private javax.swing.JLabel Anzeigenbearbeiten;
    private javax.swing.JLabel Anzeiger_Verfügbarkeiten;
    private javax.swing.JLabel Anzeiger_löschen;
    private javax.swing.JPanel Artikel;
    private javax.swing.JLabel ArtikelFeld01;
    private javax.swing.JLabel ArtikelFeld02;
    private javax.swing.JLabel ArtikelFeld03;
    private javax.swing.JLabel ArtikelFeld04;
    private javax.swing.JLabel ArtikelFeld05;
    private javax.swing.JLabel ArtikelFeld06;
    private javax.swing.JLabel ArtikelFeld07;
    private javax.swing.JLabel ArtikelFeld08;
    private javax.swing.JLabel ArtikelFeld09;
    private javax.swing.JLabel ArtikelFeld10;
    private javax.swing.JLabel ArtikelFeld11;
    private javax.swing.JLabel ArtikelFeld12;
    private javax.swing.JLabel ArtikelFeld13;
    private javax.swing.JLabel ArtikelFeld14;
    private javax.swing.JLabel ArtikelFeld15;
    private javax.swing.JLabel Artikelanzeige_auflösen;
    private javax.swing.JLabel Artikelanzeige_bearbeiten;
    private javax.swing.JLabel Artikelanzeige_erstellen;
    private javax.swing.JPanel Artikelanzeigen;
    private javax.swing.JPanel Artikelbearbeiten;
    private javax.swing.JTextArea Artikelbeschreiber;
    private javax.swing.JTextArea Artikelbeschreiber2;
    private javax.swing.JTextArea Artikelbeschreibung_bearbeiten;
    private javax.swing.JTextArea Artikelbeschreibung_hinzufugen;
    private javax.swing.JPanel Artikelbewirtschaftung;
    private javax.swing.JLabel Artikelbezeichner;
    private javax.swing.JLabel Artikelbezeichner2;
    private javax.swing.JTextField Artikelbezeichnung_bearbeiten;
    private javax.swing.JTextField Artikelbezeichnung_hinzufugen;
    private javax.swing.JLabel Artikelbild;
    private javax.swing.JLabel Artikelbild2;
    private javax.swing.JPanel Artikeldaten;
    private javax.swing.JPanel ArtikeldatenOben;
    private javax.swing.JTextField Artikeldauer;
    private javax.swing.JTextField Artikeldauer_bearbeiten;
    private javax.swing.JPanel Artikeldetail;
    private javax.swing.JTextField Artikelfette_bearbeiten;
    private javax.swing.JTextField Artikelfette_hinzufugen;
    private javax.swing.JPanel Artikelhinzufugen;
    private javax.swing.JPanel Artikelinspektion;
    private javax.swing.JPanel Artikelinspektion1;
    private javax.swing.JTextField Artikelkalorien_bearbeiten;
    private javax.swing.JTextField Artikelkalorien_hinzufugen;
    private javax.swing.JTextField Artikelkohlenhydrate_bearbeiten;
    private javax.swing.JTextField Artikelkohlenhydrate_hinzufugen;
    private javax.swing.JTable Artikellistetabelle;
    private javax.swing.JPanel Artikellöschen;
    private javax.swing.JTextField Artikelnummer_auflösen;
    private javax.swing.JTextField Artikelnummer_bearbeiten;
    private javax.swing.JTextField Artikelnummer_bearbeitenfeld;
    private javax.swing.JTextField Artikelnummer_erstellen;
    private javax.swing.JTextField Artikelnummer_hinzufugen;
    private javax.swing.JTextField Artikelnummer_löschen;
    private javax.swing.JTextField Artikelnummeranzeige;
    private javax.swing.JTextField Artikelnummeranzeige2;
    private javax.swing.JLabel Artikelnummeranzeiger;
    private javax.swing.JLabel Artikelnummeranzeiger2;
    private javax.swing.JTextField Artikelnummerverfügbarkeiten;
    private javax.swing.JTextField Artikelpreis_bearbeiten;
    private javax.swing.JTextField Artikelpreis_hinzufugen;
    private javax.swing.JTextField Artikelproteine_bearbeiten;
    private javax.swing.JTextField Artikelproteine_hinzufugen;
    private javax.swing.JTable Artikeltabelle;
    private javax.swing.JTable Artikeltabelle1;
    private javax.swing.JPanel Artikelverfügbarkeiten;
    private javax.swing.JTextArea Artikelzutaten_bearbeiten;
    private javax.swing.JTextArea Artikelzutaten_hinzufugen;
    private javax.swing.JLabel BearbeitenArtikel;
    private javax.swing.JTextField BestellID;
    private javax.swing.JPanel Bestellungen;
    private javax.swing.JLabel Bestellunglöschen;
    private javax.swing.JTable Bestellübersicht;
    private javax.swing.JPanel BewirtschaftungOben;
    private javax.swing.JPanel BewirtschaftungOben1;
    private javax.swing.JLabel BezeichnungFeld01;
    private javax.swing.JLabel BezeichnungFeld02;
    private javax.swing.JLabel BezeichnungFeld03;
    private javax.swing.JLabel BezeichnungFeld04;
    private javax.swing.JLabel BezeichnungFeld05;
    private javax.swing.JLabel BezeichnungFeld06;
    private javax.swing.JLabel BezeichnungFeld07;
    private javax.swing.JLabel BezeichnungFeld08;
    private javax.swing.JLabel BezeichnungFeld09;
    private javax.swing.JLabel BezeichnungFeld10;
    private javax.swing.JLabel BezeichnungFeld11;
    private javax.swing.JLabel BezeichnungFeld12;
    private javax.swing.JLabel BezeichnungFeld13;
    private javax.swing.JLabel BezeichnungFeld14;
    private javax.swing.JLabel BezeichnungFeld15;
    private javax.swing.JLabel BildFeld01;
    private javax.swing.JLabel BildFeld02;
    private javax.swing.JLabel BildFeld03;
    private javax.swing.JLabel BildFeld04;
    private javax.swing.JLabel BildFeld05;
    private javax.swing.JLabel BildFeld06;
    private javax.swing.JLabel BildFeld07;
    private javax.swing.JLabel BildFeld08;
    private javax.swing.JLabel BildFeld09;
    private javax.swing.JLabel BildFeld10;
    private javax.swing.JLabel BildFeld11;
    private javax.swing.JLabel BildFeld12;
    private javax.swing.JLabel BildFeld13;
    private javax.swing.JLabel BildFeld14;
    private javax.swing.JLabel BildFeld15;
    private javax.swing.JLabel Bildhochladen;
    private javax.swing.JLabel Bildhochladenbearbeiten;
    private javax.swing.JTextField Bildpfad;
    private javax.swing.JTextField Bildpfad_bearbeiten;
    private javax.swing.JButton Bildwahlenbearbeiten;
    private javax.swing.JComboBox<String> Bio_bearbeiten;
    private javax.swing.JComboBox<String> Biobox;
    private javax.swing.JLabel Biofeld;
    private javax.swing.JLabel Biofeld2;
    private javax.swing.JComboBox<String> BoxSupplemente;
    private javax.swing.JComboBox<String> BoxVerfügbarkeiten;
    private javax.swing.JLabel Daueranzeiger;
    private javax.swing.JLabel Daueranzeiger2;
    private javax.swing.JLabel DefinitionKategorie1_15;
    private javax.swing.JLabel DefinitionKategorie1_2;
    private javax.swing.JLabel DefinitionKategorie1_3;
    private javax.swing.JLabel DefinitionKategorie1_4;
    private javax.swing.JLabel DefinitionKategorie1_5;
    private javax.swing.JLabel DefinitionKategorie1_6;
    private javax.swing.JLabel DefinitionKategorie1_7;
    private javax.swing.JLabel DefinitionKategorie2_1;
    private javax.swing.JLabel DefinitionKategorie2_2;
    private javax.swing.JLabel DefinitionKategorie2_3;
    private javax.swing.JLabel DefinitionKategorie2_4;
    private javax.swing.JLabel DefinitionKategorie2_5;
    private javax.swing.JLabel DefinitionKategorie2_6;
    private javax.swing.JTable Detailtabelle;
    private javax.swing.JLabel Erstellen;
    private javax.swing.JLabel Expander1;
    private javax.swing.JLabel Expander2;
    private javax.swing.JLabel Expander3;
    private javax.swing.JLabel Expander4;
    private javax.swing.JLabel Fehler_bearbeiten;
    private javax.swing.JLabel Fehler_erstellen;
    private javax.swing.JLabel FeldKategorie1_2;
    private javax.swing.JLabel FeldKategorie1_3;
    private javax.swing.JLabel FeldKategorie1_4;
    private javax.swing.JLabel FeldKategorie1_5;
    private javax.swing.JLabel FeldKategorie1_6;
    private javax.swing.JLabel FeldKategorie1_7;
    private javax.swing.JLabel FeldKategorie2_1;
    private javax.swing.JLabel FeldKategorie2_2;
    private javax.swing.JLabel FeldKategorie2_3;
    private javax.swing.JLabel FeldKategorie2_4;
    private javax.swing.JLabel FeldKategorie2_5;
    private javax.swing.JLabel FeldKategorie2_6;
    private javax.swing.JLabel FeldLeerenbearbeiten;
    private javax.swing.JTextField Filtern;
    private javax.swing.JLabel Frankeheute;
    private javax.swing.JLabel Franken7tage;
    private javax.swing.JLabel HeuteLabel;
    private javax.swing.JLabel Image13;
    private javax.swing.JLabel Imagezeiger;
    private javax.swing.JLabel Imagezeiger2;
    private javax.swing.JTable Kalorientabelle;
    private javax.swing.JTable Kalorientabelle2;
    private javax.swing.JPanel Kategorie;
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
    private javax.swing.JComboBox<String> KategorieCombobox;
    private javax.swing.JComboBox<String> KategorieCombobox1_2;
    private javax.swing.JComboBox<String> KategorieCombobox1_3;
    private javax.swing.JComboBox<String> KategorieCombobox1_4;
    private javax.swing.JComboBox<String> KategorieCombobox1_5;
    private javax.swing.JComboBox<String> KategorieCombobox1_6;
    private javax.swing.JComboBox<String> KategorieCombobox1_7;
    private javax.swing.JComboBox<String> KategorieCombobox2_1;
    private javax.swing.JComboBox<String> KategorieCombobox2_2;
    private javax.swing.JComboBox<String> KategorieCombobox2_3;
    private javax.swing.JComboBox<String> KategorieCombobox2_4;
    private javax.swing.JComboBox<String> KategorieCombobox2_5;
    private javax.swing.JComboBox<String> KategorieCombobox2_6;
    private javax.swing.JLabel Kategorieanzeiger;
    private javax.swing.JLabel Kategorieanzeiger2;
    private javax.swing.JComboBox<String> Kategoriebox_bearbeiten;
    private javax.swing.JPanel Kategorien;
    private javax.swing.JButton LeerenFeld01;
    private javax.swing.JButton LeerenFeld02;
    private javax.swing.JButton LeerenFeld03;
    private javax.swing.JButton LeerenFeld04;
    private javax.swing.JButton LeerenFeld05;
    private javax.swing.JButton LeerenFeld06;
    private javax.swing.JButton LeerenFeld07;
    private javax.swing.JButton LeerenFeld08;
    private javax.swing.JButton LeerenFeld09;
    private javax.swing.JButton LeerenFeld10;
    private javax.swing.JButton LeerenFeld11;
    private javax.swing.JButton LeerenFeld12;
    private javax.swing.JButton LeerenFeld13;
    private javax.swing.JButton LeerenFeld14;
    private javax.swing.JButton LeerenFeld15;
    private javax.swing.JLabel Leeren_erstellen;
    private javax.swing.JLabel Letztesjahr;
    private javax.swing.JLabel Letztesjahr7;
    private javax.swing.JLabel Loschenausgabe;
    private javax.swing.JLabel Löschanzeige;
    private javax.swing.JLabel MenuArtikelbewirtschaftung;
    private javax.swing.JLabel MenuDashboard;
    private javax.swing.JLabel MenuDashboard2;
    private javax.swing.JPanel MenuOptionen;
    private javax.swing.JLabel Minimizer1;
    private javax.swing.JLabel Minimizer2;
    private javax.swing.JLabel Minimizer3;
    private javax.swing.JLabel Minimizer4;
    private javax.swing.JLabel Minuten;
    private javax.swing.JLabel Minuten2;
    private javax.swing.JPanel Mitarbeiter;
    private javax.swing.JTextField OptionBezeichnung;
    private javax.swing.JTextField OptionBezeichnungloschen;
    private javax.swing.JLabel OptionLöschen;
    private javax.swing.JTextField OptionNummer;
    private javax.swing.JTextField OptionNummerloschen;
    private javax.swing.JTextField OptionPreis;
    private javax.swing.JTextField OptionPreisloschen;
    private javax.swing.JTextField Optionbezeichnungbearbeiten;
    private javax.swing.JTextField Optionnummerbearbeiten;
    private javax.swing.JTextField Optionpreisbearbeiten;
    private javax.swing.JTable Optiontabelle;
    private javax.swing.JPanel Panelartikel;
    private javax.swing.JPanel Panelartikel1;
    private javax.swing.JPanel Panelartikelliste;
    private javax.swing.JPanel ParentAdmin;
    private javax.swing.JPanel ParentArtikelbewirtschaftung;
    private javax.swing.JPanel ParentArtikeldaten;
    private javax.swing.JPanel ParentKassenlayout;
    private javax.swing.JLabel Preisanzeiger;
    private javax.swing.JLabel Preisanzeiger2;
    private javax.swing.JLabel Senden10;
    private javax.swing.JLabel Senden11;
    private javax.swing.JLabel Senden12;
    private javax.swing.JLabel Senden13;
    private javax.swing.JLabel Senden14;
    private javax.swing.JLabel Senden15;
    private javax.swing.JLabel Showdata;
    private javax.swing.JLabel Showdata1;
    private javax.swing.JLabel Showdata2;
    private javax.swing.JLabel Sofortfeld;
    private javax.swing.JLabel Sofortfeld2;
    private javax.swing.JLabel Speichern1_2;
    private javax.swing.JLabel Speichern1_3;
    private javax.swing.JLabel Speichern1_4;
    private javax.swing.JLabel Speichern1_5;
    private javax.swing.JLabel Speichern1_6;
    private javax.swing.JLabel Speichern1_7;
    private javax.swing.JLabel Speichern2_1;
    private javax.swing.JLabel Speichern2_2;
    private javax.swing.JLabel Speichern2_3;
    private javax.swing.JLabel Speichern2_4;
    private javax.swing.JLabel Speichern2_5;
    private javax.swing.JLabel Speichern2_6;
    private javax.swing.JPanel Startkassenlayout;
    private javax.swing.JPanel Startseite;
    private javax.swing.JPanel Statistiken;
    private javax.swing.JPanel StatistikenLabel;
    private javax.swing.JLabel Supplement1_auflösen;
    private javax.swing.JComboBox<String> Supplement1_bearbeiten;
    private javax.swing.JComboBox<String> Supplement1_erstellen;
    private javax.swing.JLabel Supplement2_auflösen;
    private javax.swing.JComboBox<String> Supplement2_bearbeiten;
    private javax.swing.JComboBox<String> Supplement2_erstellen;
    private javax.swing.JLabel Supplement3_auflösen;
    private javax.swing.JComboBox<String> Supplement3_bearbeiten;
    private javax.swing.JComboBox<String> Supplement3_erstellen;
    private javax.swing.JLabel Supplement4_auflösen;
    private javax.swing.JComboBox<String> Supplement4_bearbeiten;
    private javax.swing.JComboBox<String> Supplement4_erstellen;
    private javax.swing.JLabel SupplementDrucken;
    private javax.swing.JLabel Supplementanzeigen;
    private javax.swing.JLabel Supplementanzeiger;
    private javax.swing.JPanel Supplemente;
    private javax.swing.JPanel SupplementeOben;
    private javax.swing.JLabel Supplementeändern;
    private javax.swing.JTextField Supplementnummer;
    private javax.swing.JPanel Supplementparent;
    private javax.swing.JTable Tabelle1;
    private javax.swing.JTable TabelleArtikelverknüpfungen;
    private javax.swing.JTable TabelleSupplementverknüpfungen;
    private javax.swing.JTable TabelleVerfügbarkeiten;
    private javax.swing.JTable Tabelle_Verfügbarkeiten;
    private javax.swing.JTextField TextfeldFeld01;
    private javax.swing.JTextField TextfeldFeld02;
    private javax.swing.JTextField TextfeldFeld03;
    private javax.swing.JTextField TextfeldFeld04;
    private javax.swing.JTextField TextfeldFeld05;
    private javax.swing.JTextField TextfeldFeld06;
    private javax.swing.JTextField TextfeldFeld07;
    private javax.swing.JTextField TextfeldFeld08;
    private javax.swing.JTextField TextfeldFeld09;
    private javax.swing.JTextField TextfeldFeld10;
    private javax.swing.JTextField TextfeldFeld11;
    private javax.swing.JTextField TextfeldFeld12;
    private javax.swing.JTextField TextfeldFeld13;
    private javax.swing.JTextField TextfeldFeld14;
    private javax.swing.JTextField TextfeldFeld15;
    private javax.swing.JLabel Titel7tage;
    private javax.swing.JLabel TitelStatistiken;
    private javax.swing.JLabel Titelheute;
    private javax.swing.JTextField UmbenennenFeld10;
    private javax.swing.JTextField UmbenennenFeld11;
    private javax.swing.JTextField UmbenennenFeld12;
    private javax.swing.JTextField UmbenennenFeld13;
    private javax.swing.JTextField UmbenennenFeld2;
    private javax.swing.JTextField UmbenennenFeld3;
    private javax.swing.JTextField UmbenennenFeld4;
    private javax.swing.JTextField UmbenennenFeld5;
    private javax.swing.JTextField UmbenennenFeld6;
    private javax.swing.JTextField UmbenennenFeld7;
    private javax.swing.JTextField UmbenennenFeld8;
    private javax.swing.JTextField UmbenennenFeld9;
    private javax.swing.JLabel Umsatz7tage;
    private javax.swing.JLabel UmsatzdieseWoche;
    private javax.swing.JLabel UmsatzdieseWocheLetztesJahr;
    private javax.swing.JLabel Umsatzheute;
    private javax.swing.JLabel UmsatzletztesJahr;
    private javax.swing.JLabel Unterschied7tage;
    private javax.swing.JLabel Unterschiedtage;
    private javax.swing.JComboBox<String> Veganbox;
    private javax.swing.JComboBox<String> Veganbox_bearbeiten;
    private javax.swing.JLabel Veganfeld;
    private javax.swing.JLabel Veganfeld2;
    private javax.swing.JLabel VegiFeld;
    private javax.swing.JLabel VegiFeld2;
    private javax.swing.JComboBox<String> Vegi_bearbeiten;
    private javax.swing.JComboBox<String> Vegibox;
    private javax.swing.JPanel VerfügbarkeitenSupplemente;
    private javax.swing.JLabel Vergleichletztesjahr;
    private javax.swing.JLabel Vergleichletztesjahr1;
    private javax.swing.JPanel Zuordnen;
    private javax.swing.JTextArea Zutatenanzeiger;
    private javax.swing.JTextArea Zutatenanzeiger2;
    private javax.swing.JPanel bearbeitenlayout;
    private javax.swing.JButton btn_Anzeige;
    private javax.swing.JButton btn_Anzeige2;
    private javax.swing.JLabel fff;
    private javax.swing.JLabel fff2;
    private javax.swing.JLabel fff3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JLabel ok;
    private javax.swing.JLabel ok2;
    private javax.swing.JLabel ok3;
    private javax.swing.JLabel suchausgabe;
    private javax.swing.JLabel yyy;
    private javax.swing.JLabel Ändern_Verfübbarkeiten;
    // End of variables declaration//GEN-END:variables

    private void Felderleeren() {
        Artikelanzeige_erstellen.setText("");
        Artikelnummer_erstellen.setEnabled(true);
        Artikelnummer_erstellen.setText("");
        Supplement1_erstellen.setEnabled(false);
        Supplement2_erstellen.setEnabled(false);
        Supplement3_erstellen.setEnabled(false);
        Supplement4_erstellen.setEnabled(false);

        Supplement1_erstellen.setSelectedIndex(-1);
        Supplement2_erstellen.setSelectedIndex(-1);
        Supplement3_erstellen.setSelectedIndex(-1);
        Supplement4_erstellen.setSelectedIndex(-1);

        Supplement1_bearbeiten.setEnabled(false);
        Supplement2_bearbeiten.setEnabled(false);
        Supplement3_bearbeiten.setEnabled(false);
        Supplement4_bearbeiten.setEnabled(false);

        Artikelnummer_bearbeiten.setText("");
        Artikelanzeige_bearbeiten.setText("");
        Artikelnummer_bearbeiten.setEnabled(true);

        Supplement1_bearbeiten.setSelectedIndex(-1);
        Supplement2_bearbeiten.setSelectedIndex(-1);
        Supplement3_bearbeiten.setSelectedIndex(-1);
        Supplement4_bearbeiten.setSelectedIndex(-1);

        Artikelnummer_auflösen.setText("");
        Supplement1_auflösen.setText("");
        Supplement2_auflösen.setText("");
        Supplement3_auflösen.setText("");
        Supplement4_auflösen.setText("");
        Artikelanzeige_auflösen.setText("");

    }




 
}
