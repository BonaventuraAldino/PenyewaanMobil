/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Aldy Senda
 */
public class TMcustomer extends AbstractTableModel{
    
    private ArrayList<customer> data;
    private String[] namaField = {"IdCustomer","NamaCustomer","AlamatCustomer","KotaCustomer","TeleponCustomer"};
    
    public void setData (ArrayList<customer> dt){
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
        customer c = data.get(baris);
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
