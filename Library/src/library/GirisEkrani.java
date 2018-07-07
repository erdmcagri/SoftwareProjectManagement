package library;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erdem
 */
public class GirisEkrani extends javax.swing.JFrame {

    DefaultListModel dfm = new DefaultListModel();
    DefaultListModel dfm1 = new DefaultListModel();
    DefaultListModel dfm2 = new DefaultListModel();
    public static int oNo;
    String durum;
    final int boyut = 250;
    File dosyaYolu = new File("C:\\Users\\Erdem\\Documents\\NetBeansProjects\\Library\\uye\\QR_Code.png");
    File dosyaYolu1 = new File("C:\\Users\\Erdem\\Documents\\NetBeansProjects\\Library\\kitap\\QR_Code.png");
    File dosyaYolu2 = new File("QR_Code.png");
    File dosyaYolu3 = new File("QR_Code1.png");
    String tarihFormati = "dd:MM:yyyy";
    String gelenTarih;

    public GirisEkrani() {
        initComponents();
        tumKitaplariGoster();
        txtKitapNo.setText(String.valueOf(kitapNoGetir() + 1));
        setTitle("Kütüphane");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        rafta = new javax.swing.JRadioButton();
        kirada = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtAdi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSoyadi = new javax.swing.JTextField();
        txtBolum = new javax.swing.JTextField();
        Telefon = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        uyeQRPanel = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        txtOkulNo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtKitapNo = new javax.swing.JTextField();
        txtKitapYazari = new javax.swing.JTextField();
        txtYayinEvi = new javax.swing.JTextField();
        txtKitapAdi = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        kitapQRPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        kitapKiralaQR = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(jList3);

        buttonGroup1.add(rafta);
        rafta.setText("Rafta");
        rafta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                raftaİtemStateChanged(evt);
            }
        });

        buttonGroup1.add(kirada);
        kirada.setText("Kirada");
        kirada.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kiradaİtemStateChanged(evt);
            }
        });
        kirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kiradaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kitap No", "Kitap Adı", "Yazarı", "Okunma Sayısı"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(rafta)
                        .addGap(42, 42, 42)
                        .addComponent(kirada)))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rafta)
                            .addComponent(kirada))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Kitap Listesi", jPanel1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Adı");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Soyadı");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Okul Numarası");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Bölümü");

        Telefon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Telefon.setText("Telefon");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Üye Ekle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        uyeQRPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout uyeQRPanelLayout = new javax.swing.GroupLayout(uyeQRPanel);
        uyeQRPanel.setLayout(uyeQRPanelLayout);
        uyeQRPanelLayout.setHorizontalGroup(
            uyeQRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );
        uyeQRPanelLayout.setVerticalGroup(
            uyeQRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Tüm Üyeler");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txtOkulNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOkulNoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(Telefon)
                            .addComponent(jLabel3))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOkulNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBolum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(uyeQRPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAdi, txtBolum, txtOkulNo, txtSoyadi, txtTelefon});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Telefon, jLabel1, jLabel2, jLabel3, jLabel4});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton3, jButton6});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtOkulNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtBolum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Telefon)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(uyeQRPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAdi, txtBolum, txtOkulNo, txtSoyadi, txtTelefon});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Telefon, jLabel1, jLabel2, jLabel3, jLabel4});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton3, jButton6});

        jTabbedPane1.addTab("Üye Ekle", jPanel2);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Kitap No");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Kitap Adı");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Kitap Yazarı");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Yayın Evi");

        txtKitapNo.setEditable(false);
        txtKitapNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKitapNoKeyReleased(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Kaydet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        kitapQRPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout kitapQRPanelLayout = new javax.swing.GroupLayout(kitapQRPanel);
        kitapQRPanel.setLayout(kitapQRPanelLayout);
        kitapQRPanelLayout.setHorizontalGroup(
            kitapQRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );
        kitapQRPanelLayout.setVerticalGroup(
            kitapQRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKitapAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYayinEvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKitapYazari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKitapNo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(kitapQRPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel5, jLabel6, jLabel7, jLabel9});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtKitapAdi, txtKitapNo, txtKitapYazari, txtYayinEvi});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKitapNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtKitapAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtKitapYazari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtYayinEvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(kitapQRPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtKitapAdi, txtKitapNo, txtKitapYazari, txtYayinEvi});

        jTabbedPane1.addTab("Kitap Kayıt", jPanel3);

        kitapKiralaQR.setBackground(new java.awt.Color(255, 255, 255));
        kitapKiralaQR.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout kitapKiralaQRLayout = new javax.swing.GroupLayout(kitapKiralaQR);
        kitapKiralaQR.setLayout(kitapKiralaQRLayout);
        kitapKiralaQRLayout.setHorizontalGroup(
            kitapKiralaQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );
        kitapKiralaQRLayout.setVerticalGroup(
            kitapKiralaQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("QR Kodu Okutunuz");

        jTextField7.setEditable(false);

        jTextField8.setEditable(false);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Yeni Kitap Kirala");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Ara");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Daha Önce Alınmış Kitaplar");

        jScrollPane3.setViewportView(jList1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addComponent(kitapKiralaQR, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12)
                    .addComponent(jTextField8)
                    .addComponent(jTextField7)
                    .addComponent(jScrollPane3)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kitapKiralaQR, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kitap Kirala", jPanel4);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Kitabın QR Kodunu Okutunuz");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Beğendim");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Beğenmedim");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("İade Et");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Kitabı Beğendiniz mi?");

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("Ara");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton3)
                    .addComponent(jButton1)
                    .addComponent(jLabel10)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(16, 16, 16)
                        .addComponent(jRadioButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton4)
                        .addGap(57, 57, 57)
                        .addComponent(jButton1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kitap İade", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        YeniKitapKirala y1 = new YeniKitapKirala();
        y1.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Üye ekle
        try {
            Uye p1 = new Uye();
            p1.setOkulno(Long.parseLong(txtOkulNo.getText()));
            p1.setAdi(txtAdi.getText());
            p1.setSoyadi(txtSoyadi.getText());
            p1.setBolum(txtBolum.getText());
            p1.setTelefon(String.valueOf(txtTelefon.getText()));
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(p1);
            em.getTransaction().commit();
            QRCodeOlustur(dosyaYolu, txtOkulNo.getText(), boyut, "png");
            qrKaydet();
            JOptionPane.showMessageDialog(this, "Yeni Üye Kaydı Başarılı");
            txtOkulNo.setText(null);
            txtAdi.setText(null);
            txtSoyadi.setText(null);
            txtBolum.setText(null);
            txtTelefon.setText(null);
            em.close();
            emf.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Üye Kaydı Başarısız Oldu.!");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Kitap kayıt
        try {
            Kitap k1 = new Kitap();
            k1.setKitapno(Integer.parseInt(txtKitapNo.getText()));
            k1.setKitapadi(txtKitapAdi.getText());
            k1.setKitapyazari(txtKitapYazari.getText());
            k1.setYayinevi(txtYayinEvi.getText());
            k1.setAtarih("0");
            k1.setOkunmasayisi(0);
            k1.setBegensayisi(0);
            k1.setBegenmesayisi(0);
            k1.setDurum("Rafta");
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(k1);
            em.getTransaction().commit();
            QRCodeOlustur(dosyaYolu1, txtKitapNo.getText(), boyut, "png");
            qrKaydet1();
            JOptionPane.showMessageDialog(this, "Yeni Kitap Kaydı Başarılı");
            txtKitapNo.setText(null);
            txtKitapAdi.setText(null);
            txtKitapYazari.setText(null);
            txtYayinEvi.setText(null);
            txtKitapNo.setText(String.valueOf(kitapNoGetir() + 1));
            em.close();
            emf.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Kitap Kaydı Başarısız Oldu.!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void raftaİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_raftaİtemStateChanged
        tumRaftakiKitaplariGoster();
    }//GEN-LAST:event_raftaİtemStateChanged

    private void kiradaİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_kiradaİtemStateChanged
        tumKiradakiKitaplariGoster();
    }//GEN-LAST:event_kiradaİtemStateChanged

    private void txtOkulNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOkulNoKeyReleased
        if (txtOkulNo.getText().length() == 0) {
            return;
        }
        try {
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix byteMatrix = qrCodeWriter.encode(txtOkulNo.getText(), BarcodeFormat.QR_CODE, boyut, boyut);
            BufferedImage image = new BufferedImage(boyut, boyut, BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics = (Graphics2D) image.getGraphics();
            graphics.setColor(Color.WHITE);
            graphics.fillRect(0, 0, boyut, boyut);
            graphics.setColor(Color.BLACK);

            for (int i = 0; i < boyut; i++) {
                for (int j = 0; j < boyut; j++) {
                    if (byteMatrix.get(i, j)) {
                        graphics.fillRect(i, j, 1, 1);
                    }
                }
            }
            ImageIO.write(image, "png", dosyaYolu2);
            BufferedImage miQr = ImageIO.read(new File("QR_Code.png"));
            JLabel label = new JLabel(new ImageIcon(miQr));
            Graphics g = uyeQRPanel.getGraphics();
            g.drawImage(miQr, WIDTH, WIDTH, label);
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_txtOkulNoKeyReleased

    private void txtKitapNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKitapNoKeyReleased
        if (txtKitapNo.getText().length() == 0) {
            return;
        }
        try {
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix byteMatrix = qrCodeWriter.encode(txtKitapNo.getText(), BarcodeFormat.QR_CODE, boyut, boyut);
            BufferedImage image = new BufferedImage(boyut, boyut, BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics = (Graphics2D) image.getGraphics();
            graphics.setColor(Color.WHITE);
            graphics.fillRect(0, 0, boyut, boyut);
            graphics.setColor(Color.BLACK);

            for (int i = 0; i < boyut; i++) {
                for (int j = 0; j < boyut; j++) {
                    if (byteMatrix.get(i, j)) {
                        graphics.fillRect(i, j, 1, 1);
                    }
                }
            }
            ImageIO.write(image, "png", dosyaYolu3);
            BufferedImage miQr = ImageIO.read(new File("QR_Code1.png"));
            JLabel label = new JLabel(new ImageIcon(miQr));
            Graphics g = kitapQRPanel.getGraphics();
            g.drawImage(miQr, WIDTH, WIDTH, label);
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_txtKitapNoKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JFileChooser fc = new JFileChooser();
        int rv = fc.showDialog(kitapKiralaQR, null);
        if (rv == JFileChooser.APPROVE_OPTION) {
            String readPath = fc.getSelectedFile().getAbsolutePath();
            try {
                File f = new File(readPath);
                BufferedImage image = ImageIO.read(f);
                LuminanceSource source = new BufferedImageLuminanceSource(image);
                BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
                Reader reader = new MultiFormatReader();
                Result result = reader.decode(bitmap);
                BufferedImage getImage = ImageIO.read(new File(readPath));
                JLabel label1 = new JLabel(new ImageIcon(getImage));
                Graphics g = kitapKiralaQR.getGraphics();
                g.drawImage(getImage, WIDTH - 20, WIDTH - 20, label1);
                oNo = Integer.parseInt(result.getText());
                System.out.println(oNo);
                uyeBul(oNo);
                gecmis(oNo);
            } catch (NotFoundException | ChecksumException | FormatException | IOException ex) {
                Logger.getLogger(GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //kitap iade
        JFileChooser fc = new JFileChooser();
        int rv = fc.showDialog(jPanel6, null);
        if (rv == JFileChooser.APPROVE_OPTION) {
            String readPath = fc.getSelectedFile().getAbsolutePath();
            try {
                File f = new File(readPath);
                BufferedImage image = ImageIO.read(f);
                LuminanceSource source = new BufferedImageLuminanceSource(image);
                BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
                Reader reader = new MultiFormatReader();
                Result result = reader.decode(bitmap);
                BufferedImage getImage = ImageIO.read(new File(readPath));
                JLabel label1 = new JLabel(new ImageIcon(getImage));
                Graphics g = jPanel6.getGraphics();
                g.drawImage(getImage, WIDTH - 20, WIDTH - 20, label1);
                int a = Integer.parseInt(result.getText());
                kitapBul(a);
            } catch (NotFoundException | ChecksumException | FormatException | IOException ex) {
                Logger.getLogger(GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int b = tarihHesapla(gelenTarih);
        int c = 1;
        if (b > 10) {
            JOptionPane.showMessageDialog(this, "Kitabın iade süresi " + b + " gün gecikti.!");
            JOptionPane.showMessageDialog(this, b * c + " tl ödeyiniz.!");
        }

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("update Kitap p set p.durum=:pdurum, p.begenmesayisi=:pbegenmesayisi, p.begensayisi=:pbegensayisi, p.atarih=:patarih WHERE p.kitapno=:pkitapno");

        int begenme = begenmeSayisi(Integer.parseInt(jTextField1.getText()));
        int begen = begenSayisi(Integer.parseInt(jTextField1.getText()));

        q.setParameter("pdurum", "Rafta");
        if (jRadioButton3.isSelected()) {
            begen++;
            q.setParameter("pbegenmesayisi", begenme);
            q.setParameter("pbegensayisi", begen);
        } else if (jRadioButton4.isSelected()) {
            begenme++;
            q.setParameter("pbegenmesayisi", begenme);
            q.setParameter("pbegensayisi", begen);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Kitap Hakkındaki Görüşünüzü Belirtiniz.");
        }
        q.setParameter("patarih", "0");
        q.setParameter("pkitapno", Integer.parseInt(jTextField1.getText()));
        em.getTransaction().begin();
        q.executeUpdate();
        em.getTransaction().commit();
        JOptionPane.showMessageDialog(this, "İşlem Başarılı.");
        jTextField1.setText(null);
        em.close();
        emf.close();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        tumKitaplariGoster();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void kiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kiradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kiradaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        TumUye tu = new TumUye();
        tu.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    void tumKiradakiKitaplariGoster() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT p FROM Kitap p WHERE p.durum =:DURUM");
        if (kirada.isSelected() == true) {
            durum = "Kirada";
        }
        q.setParameter("DURUM", durum);
        jList3.removeAll();
        dfm.removeAllElements();
        List<Kitap> kitapList = q.getResultList();
        for (Kitap k : kitapList) {
            dfm.addElement(k.getKitapadi() + " - " + k.getKitapyazari());
        }
        jList3.setModel(dfm);
        em.close();
        emf.close();
    }

    void tumRaftakiKitaplariGoster() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT p FROM Kitap p WHERE p.durum =:DURUM");
        if (rafta.isSelected() == true) {
            durum = "Rafta";
        }
        q.setParameter("DURUM", durum);
        jList3.removeAll();
        dfm1.removeAllElements();
        List<Kitap> kitapList = q.getResultList();
        for (Kitap k : kitapList) {
            dfm1.addElement(k.getKitapadi() + " - " + k.getKitapyazari());
        }
        jList3.setModel(dfm1);
        em.close();
        emf.close();
    }

    void tumKitaplariGoster() {
        Connection c1;
        try {
            c1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            String sqlIfade = "SELECT KITAPNO,KITAPADI,KITAPYAZARI,OKUNMASAYISI FROM KITAP";
            PreparedStatement s1 = c1.prepareStatement(sqlIfade);
            ResultSet rs = s1.executeQuery();
            ResultSetMetaData md = rs.getMetaData();
            Vector kolonIsimList = new Vector();
            DefaultTableModel tm1 = new DefaultTableModel();
            for (int i = 1; i < md.getColumnCount() + 1; i++) {
                kolonIsimList.add(md.getColumnName(i));
            }
            tm1.setDataVector(null, kolonIsimList);
            while (rs.next()) {
                Vector satir = new Vector(md.getColumnCount());
                satir.add(rs.getInt(1));
                satir.add(rs.getString(2));
                satir.add(rs.getString(3));
                satir.add(rs.getInt(4));
                tm1.addRow(satir);
            }
            jTable1.setModel(tm1);

        } catch (SQLException ex) {
            Logger.getLogger(GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void QRCodeOlustur(File dosyaYolu, String metin, int boyut, String dosyaTuru) throws WriterException, IOException {
        Hashtable hintMap = new Hashtable();
        hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix byteMatrix = qrCodeWriter.encode(metin, BarcodeFormat.QR_CODE, boyut, boyut, hintMap);
        BufferedImage image = new BufferedImage(boyut, boyut, BufferedImage.TYPE_INT_RGB);

        Graphics2D graphics = (Graphics2D) image.getGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, boyut, boyut);
        graphics.setColor(Color.BLACK);

        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                if (byteMatrix.get(i, j)) {
                    graphics.fillRect(i, j, 1, 1);
                }
            }
        }
        ImageIO.write(image, dosyaTuru, dosyaYolu);
        System.out.println("QR Code oluşturuldu.");
    }

    private void qrKaydet() {
        JFileChooser fc = new JFileChooser();
        int rv = fc.showDialog(uyeQRPanel, null);
        if (rv == JFileChooser.APPROVE_OPTION) {
            try {
                String savePath = fc.getSelectedFile().getAbsolutePath() + ".png";
                File f = new File(savePath);
                QRCodeWriter qrCodeWriter = new QRCodeWriter();
                BitMatrix byteMatrix = qrCodeWriter.encode(txtOkulNo.getText(), BarcodeFormat.QR_CODE, boyut, boyut);
                BufferedImage image = new BufferedImage(boyut, boyut, BufferedImage.TYPE_INT_RGB);

                Graphics2D graphics = (Graphics2D) image.getGraphics();
                graphics.setColor(Color.WHITE);
                graphics.fillRect(0, 0, boyut, boyut);
                graphics.setColor(Color.BLACK);

                for (int i = 0; i < boyut; i++) {
                    for (int j = 0; j < boyut; j++) {
                        if (byteMatrix.get(i, j)) {
                            graphics.fillRect(i, j, 1, 1);
                        }
                    }
                }
                ImageIO.write(image, "png", f);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }

    private void qrKaydet1() {
        JFileChooser fc = new JFileChooser();
        int rv = fc.showDialog(kitapQRPanel, null);
        if (rv == JFileChooser.APPROVE_OPTION) {
            try {
                String savePath = fc.getSelectedFile().getAbsolutePath() + ".png";
                File f = new File(savePath);
                QRCodeWriter qrCodeWriter = new QRCodeWriter();
                BitMatrix byteMatrix = qrCodeWriter.encode(txtKitapNo.getText(), BarcodeFormat.QR_CODE, boyut, boyut);
                BufferedImage image = new BufferedImage(boyut, boyut, BufferedImage.TYPE_INT_RGB);

                Graphics2D graphics = (Graphics2D) image.getGraphics();
                graphics.setColor(Color.WHITE);
                graphics.fillRect(0, 0, boyut, boyut);
                graphics.setColor(Color.BLACK);

                for (int i = 0; i < boyut; i++) {
                    for (int j = 0; j < boyut; j++) {
                        if (byteMatrix.get(i, j)) {
                            graphics.fillRect(i, j, 1, 1);
                        }
                    }
                }
                ImageIO.write(image, "png", f);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }

    void uyeBul(int gelen) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT p FROM Uye p WHERE p.okulno = :okulno");
        q.setParameter("okulno", gelen);
        List<Uye> kisiList = q.getResultList();
        for (Uye okulno : kisiList) {
            jTextField7.setText(okulno.getOkulno() + " - " + okulno.getBolum());
            jTextField8.setText(okulno.getAdi() + "  " + okulno.getSoyadi());
        }
        em.close();
        emf.close();
    }

    void kitapBul(int gelen) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT p FROM Kitap p WHERE p.kitapno = :kitapno");
        q.setParameter("kitapno", gelen);
        List<Kitap> kitapList = q.getResultList();
        for (Kitap kitapno : kitapList) {
            jTextField1.setText(String.valueOf(kitapno.getKitapno()) + " - " + kitapno.getKitapadi());
            gelenTarih = kitapno.getAtarih();
        }
        em.close();
        emf.close();
    }

    void gecmis(int a) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT p FROM Okunankitaplar p WHERE p.ono =:ono");
        q.setParameter("ono", a);
        jList1.removeAll();
        dfm2.removeAllElements();
        List<Okunankitaplar> kitapList = q.getResultList();
        for (Okunankitaplar k : kitapList) {
            dfm2.addElement(k.getKitapadi() + " - " + k.getKitapyazari());
        }
        jList1.setModel(dfm2);
        em.close();
        emf.close();
    }

    public int begenmeSayisi(int kitapNo) {
        int begenmeSayisi = 0;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT p FROM Kitap p WHERE p.kitapno = :kitapno");
        q.setParameter("kitapno", kitapNo);
        List<Kitap> kitapList = q.getResultList();
        for (Kitap kitapno : kitapList) {
            begenmeSayisi = kitapno.getBegenmesayisi();
        }
        em.close();
        emf.close();
        return begenmeSayisi;
    }

    public int begenSayisi(int kitapNo) {
        int begenSayisi = 0;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT p FROM Kitap p WHERE p.kitapno = :kitapno");
        q.setParameter("kitapno", kitapNo);
        List<Kitap> kitapList = q.getResultList();
        for (Kitap kitapno : kitapList) {
            begenSayisi = kitapno.getBegensayisi();
        }
        em.close();
        emf.close();
        return begenSayisi;
    }

    public int kitapNoGetir() {
        int kitapNo = 0;
        Connection c1;
        try {
            c1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            String query = "select MAX(KITAPNO) from KITAP";
            PreparedStatement st = c1.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                kitapNo = rs.getInt(1);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return kitapNo;
    }

    public String sistemTarihiniGetir() {
        Calendar takvim = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(tarihFormati);
        return sdf.format(takvim.getTime());
    }

    static int tarihHesapla(String gelenTarih) {
        int gGün = Integer.parseInt(gelenTarih.substring(0, 2));
        int gAy = Integer.parseInt(gelenTarih.substring(3, 5));
        int gYil = Integer.parseInt(gelenTarih.substring(6, 10));

        LocalDate simdi = LocalDate.now();
        LocalDate gelen = LocalDate.of(gYil, gAy, gGün);

        Period p1 = Period.between(gelen, simdi);
        int tarih = p1.getYears() * 365 + p1.getMonths() * 30 + p1.getDays();
        return tarih;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Telefon;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JRadioButton kirada;
    private javax.swing.JPanel kitapKiralaQR;
    private javax.swing.JPanel kitapQRPanel;
    private javax.swing.JRadioButton rafta;
    private javax.swing.JTextField txtAdi;
    private javax.swing.JTextField txtBolum;
    private javax.swing.JTextField txtKitapAdi;
    private javax.swing.JTextField txtKitapNo;
    private javax.swing.JTextField txtKitapYazari;
    private javax.swing.JTextField txtOkulNo;
    private javax.swing.JTextField txtSoyadi;
    private javax.swing.JTextField txtTelefon;
    private javax.swing.JTextField txtYayinEvi;
    private javax.swing.JPanel uyeQRPanel;
    // End of variables declaration//GEN-END:variables
}
