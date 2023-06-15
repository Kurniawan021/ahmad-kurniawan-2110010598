/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Date;

public class pelanggan {
    private int id_pelanggan;
    private String kd_pelanggan;
    private String nama_pelanggan;
    private String alamat;
    private String kota;
    private String telp;
    private String status;
    private String jk;
    private Date created_at;
    private Date updated_at;

    public pelanggan(int id_pelanggan, String kd_pelanggan, String nama_pelanggan, String alamat, String kota, String telp, String status, String jk, Date created_at, Date updated_at) {
        this.id_pelanggan = id_pelanggan;
        this.kd_pelanggan = kd_pelanggan;
        this.nama_pelanggan = nama_pelanggan;
        this.alamat = alamat;
        this.kota = kota;
        this.telp = telp;
        this.status = status;
        this.jk = jk;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    // Getter dan setter untuk setiap atribut

    public int getId_pelanggan() {
        return id_pelanggan;
    }

    public void setId_pelanggan(int id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    public String getKd_pelanggan() {
        return kd_pelanggan;
    }

    public void setKd_pelanggan(String kd_pelanggan) {
        this.kd_pelanggan = kd_pelanggan;
    }

    public String getNama_pelanggan() {
        return nama_pelanggan;
    }

    public void setNama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
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
