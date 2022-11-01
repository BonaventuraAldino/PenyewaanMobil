/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author Aldy Senda
 */
public class mobil {
    private String IdMobil;
    private String IdDepot;
    private String NoPolisi;
    private String Merk;
    private String TahunBuat;
    private String IsiSilinder;
    private String Warna;
    private String BahanBakar;
    private String Status;
    private int HargaSewa;
    
    public void setIdMobil(String idMobil)
    {
        IdMobil = idMobil;
    }
    public void setIdDepot(String idDepot)
    {
        IdDepot = idDepot;
    }
    public void setNoPolisi(String noPolisi)
    {
        NoPolisi = noPolisi;
    }
    public void setMerk(String merk)
    {
        Merk = merk;
    }
    public void setTahunBuat(String tahunBuat)
    {
        TahunBuat = tahunBuat;
    }
    public void setIsiSilinder(String isiSilinder)
    {
        IsiSilinder = isiSilinder;
    }
    public void setWarna(String warna)
    {
        Warna = warna;
    }
    public void setBahanBakar(String bahanBakar)
    {
        BahanBakar = bahanBakar;
    }
    public void setStatus(String status)
    {
        Status = status;
    }
    public void setHargaSewa(int hargaSewa)
    {
        HargaSewa = hargaSewa;
    }
    
    public String getIdMobil()
    {
        return IdMobil;
    }
    public String getIdDepot()
    {
        return IdDepot;
    }
    public String getNoPolisi()
    {
        return NoPolisi;
    }
    public String getMerk()
    {
        return Merk;
    }
    public String getTahunBuat()
    {
        return TahunBuat;
    }
    public String getIsiSilinder()
    {
        return IsiSilinder;
    }
    public String getWarna()
    {
        return Warna;
    }
    public String getBahanBakar()
    {
        return BahanBakar;
    }
    public String getStatus()
    {
        return Status;
    }
    public int getHargaSewa()
    {
        return HargaSewa;
    }
    
    public mobil (String idMobil, String idDepot, String noPolisi, String Merk, String tahunBuat, String isiSilinder, String warna, 
            String bahanBakar, String status, int hargaSewa)
    {
        setIdMobil(idMobil);
        setIdDepot(idDepot);
        setNoPolisi(noPolisi);
        setMerk(Merk);
        setTahunBuat(tahunBuat);
        setIsiSilinder(isiSilinder);
        setWarna(warna);
        setBahanBakar(bahanBakar);
        setStatus(status);
        setHargaSewa(hargaSewa);
    }
}
