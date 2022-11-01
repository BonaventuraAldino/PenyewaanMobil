/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import utama.Futama;

/**
 *
 * @author Aldy Senda
 */
public class Fcustomer extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmMhs
     */
    DBcustomer db = new DBcustomer();
    TMcustomer tabelcustomer = new TMcustomer();
    
    public void tampilData()
    {    
        tabelcustomer.setData(db.tampil_semua_customer());
        Jtablecustomer.setModel(tabelcustomer);
    }
    
     public void refreshdata()
    {
        tabelcustomer.setData(db.tampil_semua_customer());
        tabelcustomer.fireTableDataChanged();
        Jtablecustomer.changeSelection(0, 0, false, false);
    }
    
    public Fcustomer() {
        initComponents();
        tampilData();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtablecustomer = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Form Pengolahan Customer");

        Jtablecustomer.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Jtablecustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Index1", "Index2", "Index3", "Index4", "Index5"
            }
        ));
        jScrollPane1.setViewportView(Jtablecustomer);

        btnTambah.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnCari.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnCetak.setText("Cetak Laporan");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCetak)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnCetak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus)
                    .addComponent(btnRefresh)
                    .addComponent(btnCari))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        //Membuat Form        
        Ftambahcustomer formtambah = new Ftambahcustomer(null, true);
        formtambah.setVisible(true);
        formtambah.txtId.setText("");
        formtambah.txtNama.setText("");
        formtambah.txtAlamat.setText("");
        formtambah.txtKota.setText("");
        formtambah.txtTelepon.setText("");
        refreshdata();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        refreshdata();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        //Deteksi Kursor berada dibaris berapa
        try {
            int baris = Jtablecustomer.getSelectedRow();
            String id_customer = (String) tabelcustomer.getValueAt(baris, 0);
            String nama_customer = (String) tabelcustomer.getValueAt(baris, 1);
            Object[] pilihan ={"Ya","Tidak"};
            int jawaban = JOptionPane.showOptionDialog(null, "Anda Yakin Data Customer Dengan ID " +id_customer+ " Dengan Nama "
                     +nama_customer+ " Akan Dihapus?","Peringatan", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                    null, pilihan, pilihan[0]);
            if (jawaban==0)
            {
                db.hapus_customer(id_customer);
                refreshdata();
            }
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Pilih Data Yang Ingin Dihapus !!!");
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        Fupdatecustomer formupdate = new Fupdatecustomer(null, true);
        
        //Melakukan Pengecekan Data Berdasarkan Pilihan Kursor
        int baris = Jtablecustomer.getSelectedRow();
        String id = (String) tabelcustomer.getValueAt(baris, 0);
        customer c = db.pilih_customer(id);
        if (c!= null) {
            formupdate.setForm(c);
            formupdate.setVisible(true);
            refreshdata();
        } else 
        {
            JOptionPane.showMessageDialog(null, "Customer Dengan ID " +id+" Tidak Ditemukan");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        String key;
        key = JOptionPane.showInputDialog(null, "Nama Customer Yang Dicari? Filter/Pencarian"
                , JOptionPane.QUESTION_MESSAGE);
        if (key!=null)
        {
            tabelcustomer.setData(db.filter_customer(key));
            tabelcustomer.fireTableDataChanged();
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
        // Membuat Koneksi
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/db10117122penyewaan","root","");
            
            //Cetak Data
            HashMap param = new HashMap();

            //Ambil File
            File file =  new File("src/CetakCustomer.jasper");
            
            JasperReport jp = (JasperReport) JRLoader.loadObject(file);
            JasperPrint jasperprint = JasperFillManager.fillReport(jp, param, connect);
            JasperViewer.viewReport(jasperprint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error apa "+e.getMessage());
        }
    }//GEN-LAST:event_btnCetakActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Jtablecustomer;
    public javax.swing.JButton btnCari;
    public javax.swing.JButton btnCetak;
    public javax.swing.JButton btnEdit;
    public javax.swing.JButton btnHapus;
    public javax.swing.JButton btnRefresh;
    public javax.swing.JButton btnTambah;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
