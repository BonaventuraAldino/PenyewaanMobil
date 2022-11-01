/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hirepoint;

import hirepoint.*;
/**
 *
 * @author Aldy Senda
 */
public class hirepoint {
    private String IdHirepoint;
    private String NamaHirepoint;
    private String AlamatHirepoint;
    private String KotaHirepoint;
    private String TeleponHirepoint;
    
    public void setId(String id)
    {
        IdHirepoint = id;
    }
    public void setNama(String nama)
    {
        NamaHirepoint = nama;
    }
    public void setAlamat(String alamat)
    {
        AlamatHirepoint = alamat;
    }
    public void setKota(String kota)
    {
        KotaHirepoint = kota;
    }
    public void setTelepon(String telepon)
    {
        TeleponHirepoint = telepon;
    }
    
    public String getId()
    {
        return IdHirepoint;
    }
    public String getNama()
    {
        return NamaHirepoint;
    }
    public String getAlamat()
    {
        return AlamatHirepoint;
    }
    public String getKota()
    {
        return KotaHirepoint;
    }
    public String getTelepon()
    {
        return TeleponHirepoint;
    }
    
    public hirepoint (String id, String nama, String alamat, String kota, String telepon)
    {
        setId(id);
        setNama(nama);
        setAlamat(alamat);
        setKota(kota);
        setTelepon(telepon);
    }
}
