/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Date;

public class main_menu {
    public static void main(String[] args) {
        // Contoh penggunaan class Barang
        barang barang = new barang(1, "B001", "Laptop", 10000000, "Elektronik", "Unit", "ABC Ltd", new Date(), new Date());
        System.out.println("Informasi Barang :");
        System.out.println("ID Barang: " + barang.getId_barang());
        System.out.println("Kode Barang: " + barang.getKd_barang());
        System.out.println("Nama Barang: " + barang.getNama_barang());
        System.out.println("Harga Barang: " + barang.getHarga_barang());
        System.out.println("Jenis Barang: " + barang.getJenis_barang());
        System.out.println("Satuan: " + barang.getSatuan());
        System.out.println("Pemasok: " + barang.getPemasok());
        System.out.println("Created At: " + barang.getCreated_at());
        System.out.println("Updated At: " + barang.getUpdated_at());

        // Contoh penggunaan class Pelanggan
        pelanggan pelanggan = new pelanggan(1, "P001", "John Doe", "Jl. Pahlawan No. 123", "Jakarta", "0812345678", "Aktif", "L", new Date(), new Date());
        System.out.println("\nInformasi Pelanggan :");
        System.out.println("ID Pelanggan: " + pelanggan.getId_pelanggan());
        System.out.println("Kode Pelanggan: " + pelanggan.getKd_pelanggan());
        System.out.println("Nama Pelanggan: " + pelanggan.getNama_pelanggan());
        System.out.println("Alamat: " + pelanggan.getAlamat());
        System.out.println("Kota: " + pelanggan.getKota());
        System.out.println("Telepon: " + pelanggan.getTelp());
        System.out.println("Status: " + pelanggan.getStatus());
        System.out.println("Jenis Kelamin: " + pelanggan.getJk());
        System.out.println("Created At: " + pelanggan.getCreated_at());
        System.out.println("Updated At: " + pelanggan.getUpdated_at());

        penjualan penjualan = new penjualan(1, "PJ001", 1, 1, 5, 5000000, "John", new Date(), new Date());
        System.out.println("\nInformasi Penjualan :");
        System.out.println("ID Penjualan: " + penjualan.getId_penjualan());
        System.out.println("Kode Penjualan: " + penjualan.getKd_penjualan());
        System.out.println("ID Pelanggan: " + penjualan.getId_pelanggan());
        System.out.println("ID Barang: " + penjualan.getId_barang());
        System.out.println("Subtotal Barang: " + penjualan.getSubtotal_barang());
        System.out.println("Total Harga: " + penjualan.getTotal_harga());
        System.out.println("Kasir: " + penjualan.getKasir());
        System.out.println("Created At: " + penjualan.getCreated_at());
        System.out.println("Updated At: " + penjualan.getUpdated_at());
    }
}
