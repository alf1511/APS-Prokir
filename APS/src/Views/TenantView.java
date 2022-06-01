/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.CustomerController;
import Controllers.OrderController;
import Controllers.TenantController;
import core.Validator;
import core.View;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class TenantView extends javax.swing.JFrame {

    public static Object[] auth = new Object[4];
    TenantController tc = new TenantController();
    OrderController oc = new OrderController();
    CustomerController cc = new CustomerController();
            
    public TenantView() {
        initComponents();
        tenantHome.setText(String.valueOf(TenantView.auth[1]));
        ResultSet a = tc.getTenantMenu(String.valueOf(TenantView.auth[2]));
        View.showData(a,tabelMenu);
        ResultSet b = tc.incomingOrders((Integer)TenantView.auth[0]);
        View.showData(b, pesananMasuk);
        konfirmasi.setVisible(false);
        terimatolak.setVisible(false);
    }
    
    public void refresh(){
        konfirmasi.setVisible(false);
        terimatolak.setVisible(false);
        isiPesanan.clearSelection();
        pesananMasuk.clearSelection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tenantHome = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        isiPesanan = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pesananMasuk = new javax.swing.JTable();
        refresh = new javax.swing.JButton();
        konfirmasi = new javax.swing.JButton();
        terimatolak = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namaMenu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        hargaMenu = new javax.swing.JTextField();
        tambahMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMenu = new javax.swing.JTable();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tenantHome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tenantHome.setText("Tenant");

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        isiPesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        }
    );
    jScrollPane2.setViewportView(isiPesanan);

    jLabel4.setText("Pesanan Masuk");

    pesananMasuk.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {

        }
    )
    {
        public boolean isCellEditable(int row, int column){
            return false;
        }
    }
    );
    pesananMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            pesananMasukMouseClicked(evt);
        }
    });
    jScrollPane3.setViewportView(pesananMasuk);

    refresh.setText("Refresh");
    refresh.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            refreshActionPerformed(evt);
        }
    });

    konfirmasi.setText("Konfirmasi");
    konfirmasi.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            konfirmasiActionPerformed(evt);
        }
    });

    terimatolak.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Terima", "Tolak" }));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(konfirmasi)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
            .addContainerGap())
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(terimatolak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(terimatolak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(refresh)
                .addComponent(konfirmasi))
            .addContainerGap())
    );

    jPanel2.setBackground(new java.awt.Color(51, 255, 51));

    jLabel1.setText("Tambah Menu");

    jLabel2.setText("Nama Menu :");

    jLabel3.setText("Harga Menu :");

    tambahMenu.setText("Tambah");
    tambahMenu.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tambahMenuActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(namaMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(hargaMenu)))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tambahMenu))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jLabel1)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addGap(18, 18, 18)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(namaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(hargaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(tambahMenu)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    tabelMenu.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {

        }
    )
    {
        public boolean isCellEditable(int row, int column){
            return false;
        }
    }
    );
    jScrollPane1.setViewportView(tabelMenu);

    logout.setText("Logout");
    logout.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            logoutActionPerformed(evt);
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
                    .addComponent(tenantHome, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(tenantHome)
                .addComponent(logout))
            .addGap(40, 40, 40)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahMenuActionPerformed
        // TODO add your handling code here:
        if(hargaMenu.getText().equals("") || namaMenu.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Isi semua field.");
            return;
        }
        
        if(Validator.isNumeric(hargaMenu.getText())){
            Object[] data = {auth[0], namaMenu.getText(), hargaMenu.getText()};
            tc.menuAdd(data);
            namaMenu.setText("");
            hargaMenu.setText("");
            View.refreshTable(tabelMenu);
            ResultSet a = tc.getTenantMenu(String.valueOf(TenantView.auth[2]));
            View.showData(a, tabelMenu);
            JOptionPane.showMessageDialog(this, "Menu berhasil ditambahkan.");
        }
        else JOptionPane.showMessageDialog(this, "Masukan nominal dengan tepat.");
    }//GEN-LAST:event_tambahMenuActionPerformed

    private void pesananMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesananMasukMouseClicked
        // TODO add your handling code here:
        terimatolak.setVisible(true);
        konfirmasi.setVisible(true);
        int idOrder = (Integer)pesananMasuk.getValueAt(pesananMasuk.getSelectedRow(), 0);
        ResultSet a = tc.menuOfAnOrder((Integer)TenantView.auth[0], idOrder);
        View.refreshTable(isiPesanan);
        View.showData(a, isiPesanan);
    }//GEN-LAST:event_pesananMasukMouseClicked

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_refreshActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        for(int i = 0; i < 4; i++){
            TenantView.auth[i]= null;
        }
        new LoginView().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void konfirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konfirmasiActionPerformed
        // TODO add your handling code here:
        int idOrder = (Integer)pesananMasuk.getValueAt(pesananMasuk.getSelectedRow(), 0);
        int idTenant = (Integer)TenantView.auth[0];
        int idMeja = oc.getMejaOrder(idOrder);
        if(terimatolak.getSelectedItem().equals("Tolak")){
            try {
                tc.rejectOrder(idOrder);
                oc.statusRejected(idOrder);
            } catch (SQLException ex) {
                Logger.getLogger(TenantView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            try {
                tc.acceptOrder(idOrder, idTenant);
                if(oc.checkConf(idOrder)==oc.countTenantInvolved(idOrder)){
                    oc.statusAccepted(idOrder);
                    cc.updateSaldo(oc.getIdCustomer(idOrder), oc.getTotalHarga(idOrder));
                    oc.updateMejaTidakTersedia(idMeja);
                }
            } catch (SQLException ex) {
                Logger.getLogger(TenantView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Berhasil mengkonfirmasi.");
            View.refreshTable(pesananMasuk);
            ResultSet b = tc.incomingOrders((Integer)TenantView.auth[0]);
            View.showData(b, pesananMasuk);
            refresh();
        }
    }//GEN-LAST:event_konfirmasiActionPerformed

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
            java.util.logging.Logger.getLogger(TenantView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TenantView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TenantView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TenantView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TenantView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hargaMenu;
    private javax.swing.JTable isiPesanan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton konfirmasi;
    private javax.swing.JButton logout;
    private javax.swing.JTextField namaMenu;
    private javax.swing.JTable pesananMasuk;
    private javax.swing.JButton refresh;
    private javax.swing.JTable tabelMenu;
    private javax.swing.JButton tambahMenu;
    private javax.swing.JLabel tenantHome;
    private javax.swing.JComboBox<String> terimatolak;
    // End of variables declaration//GEN-END:variables
}