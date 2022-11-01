/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksi;

/**
 *
 * @author Aldy Senda
 */
public class transaksi {
    private String NoNota;
    private String IdHirepoint;
    private String IdCustomer;
    private String IdMobil;
    private String TanggalPinjam;
    private String TanggalKembali;
    private int TotalBayar;
    
    public void setNoNota(String noNota)
    {
        NoNota = noNota;
    }
    public void setIdHirepoint(String idHirepoint)
    {
        IdHirepoint = idHirepoint;
    }
    public void setIdCustomer(String idCustomer)
    {
        IdCustomer = idCustomer;
    }
    public void setIdMobil(String idMobil)
    {
        IdMobil = idMobil;
    }
    public void setTanggalPinjam(String tanggalPinjam)
    {
        TanggalPinjam = tanggalPinjam;
    }
    public void setTanggalKembali(String tanggalKembali)
    {
        TanggalKembali = tanggalKembali;
    }
    public void setTotalBayar(int totalBayar)
    {
        TotalBayar = totalBayar;
    }
    
    public String getNoNota()
    {
        return NoNota;
    }
    public String getIdHirepoint()
    {
        return IdHirepoint;
    }
    public String getIdCustomer()
    {
        return IdCustomer;
    }
    public String getIdMobil()
    {
        return IdMobil;
    }
    public String getTanggalPinjam()
    {
        return TanggalPinjam;
    }
    public String getTanggalKembali()
    {
        return TanggalKembali;
    }
    public int getTotalBayar()
    {
        return TotalBayar;
    }
    
    public transaksi (String noNota, String idHirepoint, String idCustomer, String idMobil,  String tanggalPinjam,  
            String tanggalKembali, int totalBayar)
    {
        setNoNota(noNota);
        setIdHirepoint(idHirepoint);
        setIdCustomer(idCustomer);
        setIdMobil(idMobil);
        setTanggalPinjam(tanggalPinjam);
        setTanggalKembali(tanggalKembali);
        setTotalBayar(totalBayar);
    }
}
