/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hirepoint;

import hirepoint.*;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Aldy Senda
 */
public class TMhirepoint extends AbstractTableModel{
    
    private ArrayList<hirepoint> data;
    private String[] namaField = {"Id Hirepoint","Nama Hirepoint","Alamat Hirepoint","Kota Hirepoint","Telepon Hirepoint"};
    
    public void setData (ArrayList<hirepoint> dt){
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
    public Object getValueAt(int baris, int kolom) {
        hirepoint c = data.get(baris);
        switch(kolom)
        {
            case 0 : return c.getId();
            case 1 : return c.getNama();
            case 2 : return c.getAlamat();
            case 3 : return c.getKota();
            case 4 : return c.getTelepon();
            default : return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return namaField[column];
    }
}
