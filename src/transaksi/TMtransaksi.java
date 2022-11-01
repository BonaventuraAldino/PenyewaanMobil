/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksi;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Aldy Senda
 */
public class TMtransaksi extends AbstractTableModel{

    private ArrayList<transaksi> data;
    private String[] namaField = {"No Nota","Nama Hirepoint","Nama Customer","No Polisi","Tanggal Pinjam","Tanggal Kembali",
        "Total Harga"};
    
    public void setData (ArrayList<transaksi> dt){
        this.data = dt;
    }
    
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return namaField.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return namaField[column];
    }

    @Override
    public Object getValueAt(int baris, int kolom) {
       transaksi m = data.get(baris);
        switch(kolom)
        {
            case 0 : return m.getNoNota();
            case 1 : return m.getIdHirepoint();
            case 2 : return m.getIdCustomer();
            case 3 : return m.getIdMobil();
            case 4 : return m.getTanggalPinjam();
            case 5 : return m.getTanggalKembali();
            case 6 : return m.getTotalBayar();
            default : return null;
        }
    }
}
