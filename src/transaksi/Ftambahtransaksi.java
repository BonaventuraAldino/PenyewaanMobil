/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import login.koneksi;

/**
 *
 * @author Aldy Senda
 */
public class Ftambahtransaksi extends javax.swing.JDialog {

    /**
     * Creates new form Ftambahhirepoint
     */
    
    private String tglpeminjaman, tglpengembalian;
    private int intbulanpinjam, intbulankembali;
    private String strbulanpinjam, strbulankembali;

    public Ftambahtransaksi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtNoNota.setEnabled(false);
        txtIdHirepoint.setEnabled(false);
        txtIdCustomer.setEnabled(false);
        txtIdMobil.setEnabled(false);
        txtlamaPinjam.setEnabled(false);
        txtHargaSewa.setEnabled(false);
        txtTotalBayar.setEnabled(false);
        autonumber();
        tampilNamaHirepoint();
        tampilNamaCustomer();
        tampilNamaMobil();
    }
    
    private void autonumber(){
        try{
            Connection c = koneksi.getkoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM transaksi ORDER BY no_nota DESC";
            ResultSet r = s.executeQuery(sql);
            if (r.next()) {
                String NoID = r.getString("no_nota").substring(2);
                String ID = ""+(Integer.parseInt(NoID)+1);
                String Zero = "";
                
                if (ID.length()==1) 
                    {Zero = "0";}
                    else if (ID.length()==2)
                     {Zero = "";}
                txtNoNota.setText("NO" + Zero + ID);
                } else {
                txtNoNota.setText("NO01");
                }
                r.close();
                s.close();
        } catch (Exception e){
            System.out.println("Autonumber Error");
        }
    }
    
    
    public void tampilNamaHirepoint(){
        try {
            //Buat Koneksi Ke jdbc
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db10117122penyewaan", "root","");
             
             //Membuka Query
             Statement stm = conn.createStatement();
             
             //Membuat SQL
             String sql = "SELECT * FROM hirePoint ORDER BY nama_hirePoint ASC";
             
             //Eksekusi Query
             ResultSet rs = stm.executeQuery(sql);
             
             while(rs.next()){
                 Object[] ob = new Object[1];
                 ob[0] = rs.getString("nama_hirePoint");
                 cmbNamaHirepoint.addItem((String) ob[0]);
             }
             rs.close();
             stm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Karena "+ e);
        }  
    }
    
    public void tampilHirepoint(){
        try {
            //Buat Koneksi Ke jdbc
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db10117122penyewaan", "root","");
             
             //Membuka Query
             Statement stm = conn.createStatement();
             
             //Membuat SQL
             String sql = "SELECT * FROM hirePoint WHERE nama_hirePoint='"+cmbNamaHirepoint.getSelectedItem()+"'";
             
             //Eksekusi Query
             ResultSet rs = stm.executeQuery(sql);
             
             while(rs.next()){
                 Object[] ob = new Object[1];
                 ob[0] = rs.getString("id_hirePoint");
                 
                 //Set Data Ke Textfield
                 txtIdHirepoint.setText((String) ob[0]);
             }
             rs.close();
             stm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Karena "+ e);
        }
    }
    
    public void tampilNamaCustomer(){
        try {
            //Buat Koneksi Ke jdbc
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db10117122penyewaan", "root","");
             
             //Membuka Query
             Statement stm = conn.createStatement();
             
             //Membuat SQL
             String sql = "SELECT * FROM customer ORDER BY nama_customer ASC";
             
             //Eksekusi Query
             ResultSet rs = stm.executeQuery(sql);
             
             while(rs.next()){
                 Object[] ob = new Object[1];
                 ob[0] = rs.getString("nama_customer");
                 cmbNamaCustomer.addItem((String) ob[0]);
             }
             rs.close();
             stm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Karena "+ e);
        }  
    }
    public void tampilCustomer(){
        try {
            //Buat Koneksi Ke jdbc
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db10117122penyewaan", "root","");
             
             //Membuka Query
             Statement stm = conn.createStatement();
             
             //Membuat SQL
             String sql = "SELECT * FROM customer WHERE nama_customer='"+cmbNamaCustomer.getSelectedItem()+"'";
             
             //Eksekusi Query
             ResultSet rs = stm.executeQuery(sql);
             
             while(rs.next()){
                 Object[] ob = new Object[1];
                 ob[0] = rs.getString("id_customer");
                 
                 //Set Data Ke Textfield
                 txtIdCustomer.setText((String) ob[0]);
             }
             rs.close();
             stm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Karena "+ e);
        }
    }
    
    public void tampilNamaMobil(){
        try {
            //Buat Koneksi Ke jdbc
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db10117122penyewaan", "root","");
             
             //Membuka Query
             Statement stm = conn.createStatement();
             
             //Membuat SQL
             String sql = "SELECT * FROM mobil ORDER BY no_polisi ASC";
             
             //Eksekusi Query
             ResultSet rs = stm.executeQuery(sql);
             
             while(rs.next()){
                 Object[] ob = new Object[1];
                 ob[0] = rs.getString("no_polisi");
                 cmbNoPolisi.addItem((String) ob[0]);
             }
             rs.close();
             stm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Karena "+ e);
        }  
    }
    
    public void tampilMobil(){
        try {
            //Buat Koneksi Ke jdbc
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db10117122penyewaan", "root","");
             
             //Membuka Query
             Statement stm = conn.createStatement();
             
             //Membuat SQL
             String sql = "SELECT * FROM mobil WHERE no_polisi='"+cmbNoPolisi.getSelectedItem()+"'";
             
             //Eksekusi Query
             ResultSet rs = stm.executeQuery(sql);
             
             while(rs.next()){
                 Object[] ob = new Object[2];
                 ob[0] = rs.getString("id_mobil");
                 ob[1] = rs.getString("harga_sewa");
                 
                 //Set Data Ke Textfield
                 txtIdMobil.setText((String) ob[0]);
                 txtHargaSewa.setText((String) ob[1]);
             }
             rs.close();
             stm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Karena "+ e);
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNoNota = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        cmbNamaHirepoint = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtIdCustomer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblNoPolisi = new javax.swing.JLabel();
        txtIdMobil = new javax.swing.JTextField();
        Status = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtlamaPinjam = new javax.swing.JTextField();
        tanggalPinjamJdate = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        txtIdHirepoint = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbNoPolisi = new javax.swing.JComboBox<>();
        cmbNamaCustomer = new javax.swing.JComboBox<>();
        Status1 = new javax.swing.JLabel();
        tanggalKembaliJdate = new com.toedter.calendar.JDateChooser();
        btnProses = new javax.swing.JButton();
        txtTotalBayar = new javax.swing.JTextField();
        Status2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtHargaSewa = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("No Nota");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Nama Hirepoint");

        btnSimpan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnBatal.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        cmbNamaHirepoint.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmbNamaHirepoint.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Hirepoint --" }));
        cmbNamaHirepoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNamaHirepointActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("ID Customer");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("ID Mobil");

        lblNoPolisi.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblNoPolisi.setText("No Polisi");

        Status.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Status.setText("Tanggal Pinjam");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("Total Bayar");

        tanggalPinjamJdate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tanggalPinjamJdatePropertyChange(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("ID Hirepoint");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Nama Customer");

        cmbNoPolisi.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmbNoPolisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Mobil --" }));
        cmbNoPolisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNoPolisiActionPerformed(evt);
            }
        });

        cmbNamaCustomer.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmbNamaCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Customer --" }));
        cmbNamaCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNamaCustomerActionPerformed(evt);
            }
        });

        Status1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Status1.setText("Tanggal Kembali");

        tanggalKembaliJdate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tanggalKembaliJdatePropertyChange(evt);
            }
        });

        btnProses.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        Status2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Status2.setText("Lama Peminjaman");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("Harga Sewa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdHirepoint, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cmbNamaHirepoint, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNoNota, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Status)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tanggalPinjamJdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNoPolisi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbNoPolisi, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Status2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtlamaPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHargaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Status1)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tanggalKembaliJdate, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbNamaHirepoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdHirepoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoPolisi)
                    .addComponent(cmbNoPolisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIdMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tanggalPinjamJdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Status))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tanggalKembaliJdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Status1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProses)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlamaPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Status2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHargaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnBatal))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(351, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        if (txtIdHirepoint.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "ID Hirepoint Tidak Boleh Kosong!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else if (txtIdCustomer.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "ID Customer Tidak Boleh Kosong!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else if (txtIdMobil.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "ID Mobil Tidak Boleh Kosong!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else if (tanggalPinjamJdate.getDate().equals("")) {
        JOptionPane.showMessageDialog(null, "Tanggal Pinjam Tidak Boleh Kosong!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else if (tanggalKembaliJdate.getDate().equals("")) {
        JOptionPane.showMessageDialog(null, "Tanggal Kembali Tidak Boleh Kosong!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
        JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan!!");
        }
        
        String tanggalPinjam = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tanggalPinjam);
        String tanggalpinjam = String.valueOf(fm.format(tanggalPinjamJdate.getDate()));
        
        String tanggalKembali = "yyyy-MM-dd";
        SimpleDateFormat fl = new SimpleDateFormat(tanggalKembali);
        String tanggalkembali = String.valueOf(fl.format(tanggalKembaliJdate.getDate()));
        
        DBtransaksi db = new DBtransaksi();
        db.tambah_transaksi(new transaksi (txtNoNota.getText(), txtIdHirepoint.getText(), txtIdCustomer.getText(), 
                txtIdMobil.getText(), tanggalpinjam, tanggalkembali, Integer.valueOf(txtTotalBayar.getText())));
        setVisible(false);
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnBatalActionPerformed

    private void cmbNamaHirepointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNamaHirepointActionPerformed
        // TODO add your handling code here:
       tampilHirepoint();
    }//GEN-LAST:event_cmbNamaHirepointActionPerformed

    private void cmbNoPolisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNoPolisiActionPerformed
        // TODO add your handling code here:
        tampilMobil();
    }//GEN-LAST:event_cmbNoPolisiActionPerformed

    private void cmbNamaCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNamaCustomerActionPerformed
        // TODO add your handling code here:
        tampilCustomer();
    }//GEN-LAST:event_cmbNamaCustomerActionPerformed

    private void tanggalPinjamJdatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalPinjamJdatePropertyChange
        // TODO add your handling code here:
        if (tanggalPinjamJdate.getDate() != null) {
            SimpleDateFormat Format = new SimpleDateFormat("dd MMM yyyy");
            //"dd MMM yyyy" untuk format tanggal 06 Des 2017
            tglpeminjaman = Format.format(tanggalPinjamJdate.getDate());
        }
    }//GEN-LAST:event_tanggalPinjamJdatePropertyChange

    private void tanggalKembaliJdatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalKembaliJdatePropertyChange
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (tanggalKembaliJdate.getDate() != null) {
            SimpleDateFormat Format = new SimpleDateFormat("dd MMM yyyy");
            //"dd MMM yyyy" untuk format tanggal 06 Des 2017
            tglpengembalian = Format.format(tanggalKembaliJdate.getDate());
        }
    }//GEN-LAST:event_tanggalKembaliJdatePropertyChange

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        // TODO add your handling code here:
        try {
            int tahunP = Integer.parseInt(tglpeminjaman.substring(7, 11));
            int hariP = Integer.parseInt(tglpeminjaman.substring(0, 2));
            strbulanpinjam = (String) tglpeminjaman.substring(3, 6);
            if (strbulanpinjam.compareTo("Jan") == 0) {
                intbulanpinjam = 1;
            } else if (strbulanpinjam.compareTo("Feb") == 0) {
                intbulanpinjam = 2;
            } else if (strbulanpinjam.compareTo("Mar") == 0) {
                intbulanpinjam = 3;
            } else if (strbulanpinjam.compareTo("Apr") == 0) {
                intbulanpinjam = 4;
            } else if (strbulanpinjam.compareTo("May") == 0) {
                intbulanpinjam = 5;
            } else if (strbulanpinjam.compareTo("Jun") == 0) {
                intbulanpinjam = 6;
            } else if (strbulanpinjam.compareTo("Jul") == 0) {
                intbulanpinjam = 7;
            } else if (strbulanpinjam.compareTo("Aug") == 0) {
                intbulanpinjam = 8;
            } else if (strbulanpinjam.compareTo("Sep") == 0) {
                intbulanpinjam = 9;
            } else if (strbulanpinjam.compareTo("Oct") == 0) {
                intbulanpinjam = 10;
            } else if (strbulanpinjam.compareTo("Nov") == 0) {
                intbulanpinjam = 11;
            } else {
                intbulanpinjam = 12;
            }
            int tahunK = Integer.parseInt(tglpengembalian.substring(7, 11));
            int hariK = Integer.parseInt(tglpengembalian.substring(0, 2));
            strbulankembali = (String) tglpengembalian.substring(3, 6);
            if (strbulankembali.compareTo("Jan") == 0) {
                intbulankembali = 1;
            } else if (strbulankembali.compareTo("Feb") == 0) {
                intbulankembali = 2;
            } else if (strbulankembali.compareTo("Mar") == 0) {
                intbulankembali = 3;
            } else if (strbulankembali.compareTo("Apr") == 0) {
                intbulankembali = 4;
            } else if (strbulankembali.compareTo("May") == 0) {
                intbulankembali = 5;
            } else if (strbulankembali.compareTo("Jun") == 0) {
                intbulankembali = 6;
            } else if (strbulankembali.compareTo("Jul") == 0) {
                intbulankembali = 7;
            } else if (strbulankembali.compareTo("Aug") == 0) {
                intbulankembali = 8;
            } else if (strbulankembali.compareTo("Sep") == 0) {
                intbulankembali = 9;
            } else if (strbulankembali.compareTo("Oct") == 0) {
                intbulankembali = 10;
            } else if (strbulankembali.compareTo("Nov") == 0) {
                intbulankembali = 11;
            } else {
                intbulankembali = 12;
            }
            int hasilHari = hariK - hariP;
            int hasilBulan = (intbulankembali - intbulanpinjam) * 30;
            int hasiltahun = (tahunK - tahunP) * 365;
            int totalwaktu = (hasilHari + hasilBulan + hasiltahun);
            txtlamaPinjam.setText(String.valueOf(totalwaktu));
            int lamaPeminjaman = Integer.parseInt(txtlamaPinjam.getText());
            int hargaSewa = Integer.parseInt(txtHargaSewa.getText());
            int totalBayar = lamaPeminjaman * hargaSewa;
            txtTotalBayar.setText(Integer.toString(totalBayar));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Karena "+ e);
        }
    }//GEN-LAST:event_btnProsesActionPerformed

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
            java.util.logging.Logger.getLogger(Ftambahtransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ftambahtransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ftambahtransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ftambahtransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ftambahtransaksi dialog = new Ftambahtransaksi(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Status;
    private javax.swing.JLabel Status1;
    private javax.swing.JLabel Status2;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnProses;
    private javax.swing.JButton btnSimpan;
    public javax.swing.JComboBox<String> cmbNamaCustomer;
    public javax.swing.JComboBox<String> cmbNamaHirepoint;
    public javax.swing.JComboBox<String> cmbNoPolisi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblNoPolisi;
    private com.toedter.calendar.JDateChooser tanggalKembaliJdate;
    private com.toedter.calendar.JDateChooser tanggalPinjamJdate;
    public javax.swing.JTextField txtHargaSewa;
    public javax.swing.JTextField txtIdCustomer;
    public javax.swing.JTextField txtIdHirepoint;
    public javax.swing.JTextField txtIdMobil;
    public javax.swing.JTextField txtNoNota;
    public javax.swing.JTextField txtTotalBayar;
    public javax.swing.JTextField txtlamaPinjam;
    // End of variables declaration//GEN-END:variables
}
