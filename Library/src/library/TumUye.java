package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erdem
 */
public class TumUye extends javax.swing.JFrame {

    public TumUye() {
        initComponents();
        tumPersonel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void tumPersonel() {
        Connection c1;
        try {
            c1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            String sqlIfade = "SELECT OKULNO, ADI, SOYADI, BOLUM, TELEFON FROM UYE";
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
                satir.add(rs.getString(4));
                satir.add(rs.getString(5));
                tm1.addRow(satir);
            }
            jTable1.setModel(tm1);

        } catch (SQLException ex) {
            Logger.getLogger(TumUye.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TumUye().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
