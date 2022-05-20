package GUI;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import Code.connect;
import java.io.File;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class dataobat extends javax.swing.JFrame {

    DefaultTableModel model;
    private Object Keterangan;
    private DefaultTableModel DftTblMdl;
    private String SQL; 
    private Object jTable;
    /**
     * Creates new form dataobat
     */
    public dataobat() {
       initComponents();
         setLocationRelativeTo(null);
        tampilkan();
    }
    private void reset(){
        kd_obat.setText("");
        nama_obat.setText("");
        satuan.setText(""); 
        buttonGroup1.clearSelection();
        harga.setText("");
        stok.setText("");
    }
    
    private void tampilkan() {
        DftTblMdl = new DefaultTableModel();
        DftTblMdl.addColumn("KODE OBAT");
        DftTblMdl.addColumn("NAMA OBAT");
        DftTblMdl.addColumn("SATUAN");
        DftTblMdl.addColumn("JENIS");
        DftTblMdl.addColumn("HARGA");
        DftTblMdl.addColumn("STOK");
        tblobat.setModel(DftTblMdl);
         Connection conn = connect.getConnection();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select * from tb_barang";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while (res.next()) {
               DftTblMdl.addRow(new Object[]{
                    res.getString("kd_obat"),
                    res.getString("nama_obat"),
                    res.getString("satuan"),
                    res.getString("jenis"),
                    res.getString("satuan"),
                    res.getString("harga"),
                    res.getString("stok")
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(dataobat.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kd_obat = new javax.swing.JTextField();
        nama_obat = new javax.swing.JTextField();
        satuan = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        stok = new javax.swing.JTextField();
        tablet = new javax.swing.JRadioButton();
        kapsul = new javax.swing.JRadioButton();
        cair = new javax.swing.JRadioButton();
        sirup = new javax.swing.JRadioButton();
        simpan = new javax.swing.JButton();
        update = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblobat = new javax.swing.JTable();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("DATA OBAT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel2.setText("KODE OBAT");

        jLabel3.setText("NAMA OBAT");

        jLabel4.setText("SATUAN");

        jLabel5.setText("JENIS");

        jLabel6.setText("HARGA");

        jLabel7.setText("STOK");

        buttonGroup1.add(tablet);
        tablet.setText("TABLET");

        buttonGroup1.add(kapsul);
        kapsul.setText("KAPSUL");

        buttonGroup1.add(cair);
        cair.setText("CAIR");
        cair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cairActionPerformed(evt);
            }
        });

        buttonGroup1.add(sirup);
        sirup.setText("SIRUP");
        sirup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sirupActionPerformed(evt);
            }
        });

        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        keluar.setText("KELUAR");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        tblobat.setModel(new javax.swing.table.DefaultTableModel(
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
        tblobat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblobatMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblobat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(simpan))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(kd_obat, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nama_obat, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(satuan, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tablet, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(stok)
                                    .addComponent(harga))
                                .addGap(10, 10, 10)
                                .addComponent(kapsul, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cair, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sirup, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(update)
                                .addGap(18, 18, 18)
                                .addComponent(hapus)
                                .addGap(18, 18, 18)
                                .addComponent(keluar)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(kd_obat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tablet)
                    .addComponent(kapsul)
                    .addComponent(cair)
                    .addComponent(sirup))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nama_obat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(satuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(update)
                    .addComponent(hapus)
                    .addComponent(keluar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cairActionPerformed

    private void sirupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sirupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sirupActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
              try {
            String buttonGroup1 = null;
       if(tablet.isSelected()){
           buttonGroup1="tablet";
       }else if(kapsul.isSelected()){
           buttonGroup1="kapsul";
       }else if(cair.isSelected()){
           buttonGroup1="cair";
       }else if(sirup.isSelected()){
           buttonGroup1="sirup";
       }
           Connection conn = connect.getConnection();
            conn.createStatement().executeUpdate("insert into tb_barang values"+"('"
                    +kd_obat.getText()
                    +"','"+nama_obat.getText()
                    +"','"+satuan.getText()
                    +"','"+buttonGroup1
                    +"','"+harga.getText()
                    +"','"+stok.getText()+"')");
            reset();tampilkan();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ada Data Yang Belum Di Isi!!");
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
          try {
           Connection conn = connect.getConnection();
            conn.createStatement().executeUpdate("delete from tb_barang where kd_obat='"+kd_obat.getText()+"'");
            
             tampilkan();
             reset();
        } catch (SQLException ex) {
            Logger.getLogger(dataobat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
                   try {
            String buttonGroup1 = null;
       if(tablet.isSelected()){
           buttonGroup1="tablet";
       }else if(kapsul.isSelected()){
           buttonGroup1="kapsul";
       }else if(cair.isSelected()){
           buttonGroup1="cair";
       }else if(sirup.isSelected()){
           buttonGroup1="sirup";
       }
            Connection conn = connect.getConnection();
            conn.createStatement().executeUpdate("update tb_barang set nama='"
                    +nama_obat.getText()
                    +"',satuan'"+satuan.getText()
                    +"',jenis'"+buttonGroup1
                    +"',harga'"+harga.getText()
                    +"',stok'"+stok.getText()
                    +"'where kd_obat='"+kd_obat.getText()+"'");
            
            reset();tampilkan();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ada Data Yang Belum Di Isi!!");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void tblobatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblobatMouseClicked
        // TODO add your handling code here:
          int i = tblobat.getSelectedRow();
          
        if(i>-1){
        kd_obat.setText(model.getValueAt(i,0).toString());
        nama_obat.setText(model.getValueAt(i,1).toString());
        satuan.setText(model.getValueAt(i,2).toString());
        String buttonGroup1= model.getValueAt(i,3).toString();
        if(buttonGroup1.equals("tablet")){
        tablet.setSelected(true);
        }else if(buttonGroup1.equals("kapsul")){
        kapsul.setSelected(true);
        }else if(buttonGroup1.equals("cair")){
        cair.setSelected(true);
        }else if(buttonGroup1.equals("sirup")){
        sirup.setSelected(true);
        }
        harga.setText(model.getValueAt(i,4).toString());
        stok.setText(model.getValueAt(i,5).toString());
  
        }
    }//GEN-LAST:event_tblobatMouseClicked

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
            java.util.logging.Logger.getLogger(dataobat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataobat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataobat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataobat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new dataobat().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cair;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton kapsul;
    private javax.swing.JTextField kd_obat;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField nama_obat;
    private javax.swing.JTextField satuan;
    private javax.swing.JButton simpan;
    private javax.swing.JRadioButton sirup;
    private javax.swing.JTextField stok;
    private javax.swing.JRadioButton tablet;
    private javax.swing.JTable tblobat;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
