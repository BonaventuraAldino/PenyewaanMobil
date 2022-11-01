/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depot;

import depot.*;

/**
 *
 * @author Aldy Senda
 */
public class depot {
    private String IdDepot;
    private String NamaDepot;
    private String AlamatDepot;
    private String KotaDepot;
    private String TeleponDepot;
    
    public void setId(String id)
    {
        IdDepot = id;
    }
    public void setNama(String nama)
    {
        NamaDepot = nama;
    }
    public void setAlamat(String alamat)
    {
        AlamatDepot = alamat;
    }
    public void setKota(String kota)
    {
        KotaDepot = kota;
    }
    public void setTelepon(String telepon)
    {
        TeleponDepot = telepon;
    }
    
    public String getId()
    {
        return IdDepot;
    }
    public String getNama()
    {
        return NamaDepot;
    }
    public String getAlamat()
    {
        return AlamatDepot;
    }
    public String getKota()
    {
        return KotaDepot;
    }
    public String getTelepon()
    {
        return TeleponDepot;
    }
    
    public depot (String id, String nama, String alamat, String kota, String telepon)
    {
        setId(id);
        setNama(nama);
        setAlamat(alamat);
        setKota(kota);
        setTelepon(telepon);
    }
}
