/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Date;

public class penjualan {
    private int id_penjualan;
    private String kd_penjualan;
    private int id_pelanggan;
    private int id_barang;
    private int subtotal_barang;
    private int total_harga;
    private String kasir;
    private Date created_at;
    private Date updated_at;

    public penjualan(int id_penjualan, String kd_penjualan, int id_pelanggan, int id_barang, int subtotal_barang, int total_harga, String kasir, Date created_at, Date updated_at) {
        this.id_penjualan = id_penjualan;
        this.kd_penjualan = kd_penjualan;
        this.id_pelanggan = id_pelanggan;
        this.id_barang = id_barang;
        this.subtotal_barang = subtotal_barang;
        this.total_harga = total_harga;
        this.kasir = kasir;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    // Getter dan setter untuk setiap atribut

    public int getId_penjualan() {
        return id_penjualan;
    }

    public void setId_penjualan(int id_penjualan) {
        this.id_penjualan = id_penjualan;
    }

    public String getKd_penjualan() {
        return kd_penjualan;
    }

    public void setKd_penjualan(String kd_penjualan) {
        this.kd_penjualan = kd_penjualan;
    }

    public int getId_pelanggan() {
        return id_pelanggan;
    }

    public void setId_pelanggan(int id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public int getSubtotal_barang() {
        return subtotal_barang;
    }

    public void setSubtotal_barang(int subtotal_barang) {
        this.subtotal_barang = subtotal_barang;
    }

    public int getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(int total_harga) {
        this.total_harga = total_harga;
    }

    public String getKasir() {
        return kasir;
    }

    public void setKasir(String kasir) {
        this.kasir = kasir;
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
