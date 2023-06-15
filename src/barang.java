/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Date;

public class barang {
    private int id_barang;
    private String kd_barang;
    private String nama_barang;
    private int harga_barang;
    private String jenis_barang;
    private String satuan;
    private String pemasok;
    private Date created_at;
    private Date updated_at;

    public barang(int id_barang, String kd_barang, String nama_barang, int harga_barang, String jenis_barang, String satuan, String pemasok, Date created_at, Date updated_at) {
        this.id_barang = id_barang;
        this.kd_barang = kd_barang;
        this.nama_barang = nama_barang;
        this.harga_barang = harga_barang;
        this.jenis_barang = jenis_barang;
        this.satuan = satuan;
        this.pemasok = pemasok;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    // getter dan setter
    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public String getKd_barang() {
        return kd_barang;
    }

    public void setKd_barang(String kd_barang) {
        this.kd_barang = kd_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getHarga_barang() {
        return harga_barang;
    }

    public void setHarga_barang(int harga_barang) {
        this.harga_barang = harga_barang;
    }

    public String getJenis_barang() {
        return jenis_barang;
    }

    public void setJenis_barang(String jenis_barang) {
        this.jenis_barang = jenis_barang;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getPemasok() {
        return pemasok;
    }

    public void setPemasok(String pemasok) {
        this.pemasok = pemasok;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}
