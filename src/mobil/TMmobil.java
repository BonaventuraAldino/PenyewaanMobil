/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

import mobil.mobil;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Aldy Senda
 */
public class TMmobil extends AbstractTableModel{
    private ArrayList<mobil> data;
    private String[] namaField = {"Id Mobil","Nama Depot","No Polisi","Merk","Tahun Buat","Isi Silinder","Warna",
        "Bahan Bakar","Status","Harga Sewa"};
    
    public void setData (ArrayList<mobil> dt){
        this.data = dt;
    }
    
    @Override
    public int getColumnCount() {
        return namaField.length;
    }
    
    @Override
    public int getRowCount() {
        return data.size();
    }
    
    @Override
    public String getColumnName(int column) {
        return namaField[column];
    }
    
    @Override
    public Object getValueAt(int baris, int kolom) {
        mobil m = data.get(baris);
        switch(kolom)
        {
            case 0 : return m.getIdMobil();
            case 1 : return m.getIdDepot();
            case 2 : return m.getNoPolisi();
            case 3 : return m.getMerk();
            case 4 : return m.getTahunBuat();
            case 5 : return m.getIsiSilinder();
            case 6 : return m.getWarna();
            case 7 : return m.getBahanBakar();
            case 8 : return m.getStatus();
            case 9 : return m.getHargaSewa();
            default : return null;
        }
    }
}
