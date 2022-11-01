/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

/**
 *
 * @author Aldy Senda
 */
public class customer {
    private String IdCustomer;
    private String NamaCustomer;
    private String AlamatCustomer;
    private String KotaCustomer;
    private String TeleponCustomer;
    
    public void setId(String id)
    {
        IdCustomer = id;
    }
    public void setNama(String nama)
    {
        NamaCustomer = nama;
    }
    public void setAlamat(String alamat)
    {
        AlamatCustomer = alamat;
    }
    public void setKota(String kota)
    {
        KotaCustomer = kota;
    }
    public void setTelepon(String telepon)
    {
        TeleponCustomer = telepon;
    }
    
    public String getId()
    {
        return IdCustomer;
    }
    public String getNama()
    {
        return NamaCustomer;
    }
    public String getAlamat()
    {
        return AlamatCustomer;
    }
    public String getKota()
    {
        return KotaCustomer;
    }
    public String getTelepon()
    {
        return TeleponCustomer;
    }
    
    public customer (String id, String nama, String alamat, String kota, String telepon)
    {
        setId(id);
        setNama(nama);
        setAlamat(alamat);
        setKota(kota);
        setTelepon(telepon);
    }
}
