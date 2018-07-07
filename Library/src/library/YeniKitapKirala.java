package library;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Erdem
 */
public class YeniKitapKirala extends javax.swing.JFrame {

    public YeniKitapKirala() {
        initComponents();
    }

    String tarihFormati= "dd:MM:yyyy";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 250));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Kitabın QR Kodunu Okutunuz");

        jButton1.setText("Ara");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Onay");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Vazgeç");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addComponent(jTextField2)
                                .addComponent(jTextField3)
                                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(jTextField5)
                                .addComponent(jTextField6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fc = new JFileChooser();
        int rv = fc.showDialog(jPanel1, null);
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
                Graphics g = jPanel1.getGraphics();
                g.drawImage(getImage, WIDTH - 20, WIDTH - 20, label1);
                int a = Integer.parseInt(result.getText());
                kitapBul(a);
            } catch (NotFoundException | ChecksumException | FormatException | IOException ex) {
                Logger.getLogger(GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Okunankitaplar o1 = new Okunankitaplar();
            GirisEkrani g1 = new GirisEkrani();
            o1.setOkno(getRowNumber() + 1);
            System.out.println(g1.oNo);
            o1.setOno(BigInteger.valueOf(g1.oNo));
            o1.setKitapadi(jTextField1.getText());
            o1.setKitapyazari(jTextField2.getText());

            //kitap durumu güncellenecek
            int b = okunmaSayisi(Integer.parseInt(jTextField3.getText()));
            String tarih = sistemTarihiniGetir();
            guncelle(Integer.parseInt(jTextField3.getText()), b, tarih);

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(o1);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(this, "Kitap "+ tarih + " tarihinden itibaren 10 gün kiralanmıştır.");
            setVisible(false);
            em.close();
            emf.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "İşlem Başarısız.!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    void kitapBul(int gelen) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT p FROM Kitap p WHERE p.kitapno = :kitapno");
        q.setParameter("kitapno", gelen);
        List<Kitap> kitapList = q.getResultList();
        for (Kitap kitapno : kitapList) {
            jTextField3.setText(String.valueOf(kitapno.getKitapno()));
            jTextField1.setText(kitapno.getKitapadi());
            jTextField2.setText(kitapno.getKitapyazari());
            jTextField4.setText(String.valueOf(kitapno.getOkunmasayisi()) + " kişi bu kitabı okudu.");
            jTextField5.setText(String.valueOf(kitapno.getBegensayisi()) + " kişi beğendi.");
            jTextField6.setText(String.valueOf(kitapno.getBegenmesayisi()) + " kişi beğenmedi.");
        }
        em.close();
        emf.close();
    }

    public int getRowNumber() {
        int numberRow = 0;
        Connection c1;
        try {
            c1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            String query = "select count(*) from Okunankitaplar";
            PreparedStatement st = c1.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                numberRow = rs.getInt(1);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return numberRow;
    }

    public int okunmaSayisi(int kitapNo) {
        int okunmaSayisi = 0;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT p FROM Kitap p WHERE p.kitapno = :kitapno");
        q.setParameter("kitapno", kitapNo);
        List<Kitap> kitapList = q.getResultList();
        for (Kitap kitapno : kitapList) {
            okunmaSayisi = kitapno.getOkunmasayisi();
        }
        em.close();
        emf.close();
        return okunmaSayisi;
    }

    void guncelle(int kitapNo, int a, String tarih) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("update Kitap p set p.okunmasayisi=:pokunmasayisi, p.atarih=:patarih, p.durum=:pdurum WHERE p.kitapno=:pkitapno");

        q.setParameter("pokunmasayisi", a + 1);
        q.setParameter("pdurum", "Kirada");
        q.setParameter("patarih", tarih);
        q.setParameter("pkitapno", kitapNo);

        em.getTransaction().begin();
        q.executeUpdate();
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public String sistemTarihiniGetir() {
        Calendar takvim = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(tarihFormati);
        return sdf.format(takvim.getTime());
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YeniKitapKirala().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
