/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.suanimsatici;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Kayitlar extends javax.swing.JFrame {

    /**
     * Creates new form Kayitlar
     */
    public Kayitlar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblKayit = new javax.swing.JTable();
        btnGetir = new javax.swing.JButton();
        cmbYil = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnGeri = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblIkiHedef = new javax.swing.JLabel();
        lblIkiIcilen = new javax.swing.JLabel();
        lblIkiKalan = new javax.swing.JLabel();
        cmbIkiMiktar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblKayit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tarih", "Hedefiniz", "İçtiğiniz Miktar"
            }
        ));
        jScrollPane1.setViewportView(tblKayit);

        btnGetir.setFont(new java.awt.Font("Bahnschrift", 1, 10)); // NOI18N
        btnGetir.setText("Veriyi Getir");
        btnGetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetirActionPerformed(evt);
            }
        });

        cmbYil.setFont(new java.awt.Font("Bahnschrift", 2, 10)); // NOI18N
        cmbYil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bir yıl seçiniz", "2019", "2020" }));
        cmbYil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbYilActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        btnGeri.setBackground(new java.awt.Color(153, 204, 255));
        btnGeri.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnGeri.setText("Geri");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\icons8-transaction-list-50.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Kayıtlarınız");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("-Miktarlar mililitre cinsinden gösterilmektedir.");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("-Su miktarı yeterli gelmiyorsa hedef miktarını");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("arttırabilirsiniz.");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("-İçtiğiniz miktarın hedefe yakın olmasına");

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("mümkünse eşit olmasına özen gösterin.");

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\icons8-water-100.png")); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGeri)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGeri)
                        .addGap(45, 45, 45))))
        );

        lblIkiHedef.setText("jLabel9");

        lblIkiIcilen.setText("jLabel10");

        lblIkiKalan.setText("jLabel11");

        cmbIkiMiktar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Miktar Seçiniz", "1500", "2400", "3000" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(cmbYil, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIkiHedef, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addComponent(btnGetir)
                                .addGap(50, 50, 50))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblIkiKalan)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblIkiIcilen, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cmbIkiMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(cmbIkiMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGetir)
                    .addComponent(lblIkiHedef))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIkiKalan)
                    .addComponent(lblIkiIcilen))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(4, 4, 4))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Home s=new Home();
        Home.cmbAmount.setSelectedIndex(cmbIkiMiktar.getSelectedIndex());
        Home.lblHedef.setText(lblIkiHedef.getText());
        Home.lblIcilenMiktar.setText(lblIkiIcilen.getText());
        Home.lblKalanMiktar.setText(lblIkiKalan.getText());
        Home.lblHedef.setVisible(false);
        s.setVisible(true);
    }//GEN-LAST:event_btnGeriActionPerformed

    private void btnGetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetirActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Hata:" + e.getMessage());
        }
        Connection baglanti = null;
        try{
            baglanti=DriverManager.getConnection("jdbc:mysql://localhost:3306/waterreminder","root","1999");
        }   catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Hata:" + e.getMessage());
        }

        int Ay=cmbYil.getSelectedIndex();
        switch (Ay) {
            case 1:
            try {
                PreparedStatement uygula=baglanti.prepareStatement("SELECT Tarih, Hedef AS 'Hedefiniz',IcilenMiktari AS 'İçtiğiniz Miktar' FROM waterreminder.reminder WHERE YEAR(Tarih)=2019 ORDER BY Tarih DESC");
                ResultSet rs=uygula.executeQuery();
                tblKayit.setModel(DBUtils.resultSetToTableModel(rs));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
            break;
            case 2:
            try {
                PreparedStatement uygula=baglanti.prepareStatement("SELECT Tarih, Hedef AS 'Hedefiniz',IcilenMiktari AS 'İçtiğiniz Miktar' FROM waterreminder.reminder WHERE YEAR(Tarih)=2020 ORDER BY Tarih DESC");
                ResultSet rs=uygula.executeQuery();
                tblKayit.setModel(DBUtils.resultSetToTableModel(rs));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
            {
                try {
                    baglanti.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Kayitlar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;

            default:
            JOptionPane.showMessageDialog(null,"Bir yıl seçiniz!");
            break;
        }
    }//GEN-LAST:event_btnGetirActionPerformed

    private void cmbYilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbYilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbYilActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kayitlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kayitlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kayitlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kayitlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Kayitlar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnGetir;
    public static javax.swing.JComboBox<String> cmbIkiMiktar;
    private javax.swing.JComboBox<String> cmbYil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblIkiHedef;
    public static javax.swing.JLabel lblIkiIcilen;
    public static javax.swing.JLabel lblIkiKalan;
    private javax.swing.JTable tblKayit;
    // End of variables declaration//GEN-END:variables
}
