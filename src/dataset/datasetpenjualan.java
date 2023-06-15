/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class datasetpenjualan {
private ArrayList<Integer> id_penjualan;
private ArrayList<String> kd_penjualan;
private ArrayList<Integer> id_pelanggan;
private ArrayList<Integer> id_barang;
private ArrayList<Integer> subtotal_barang;
private ArrayList<Integer> total_harga;
private ArrayList<String> kasir;

public datasetpenjualan () {
    id_penjualan = new ArrayList<Integer>();
    kd_penjualan = new ArrayList<String>();
    id_pelanggan = new ArrayList<Integer>();
    id_barang = new ArrayList<Integer>();
    subtotal_barang = new ArrayList<Integer>();
    total_harga = new ArrayList<Integer>();
    kasir = new ArrayList<String>();
}

public void insertid_penjualan(int isi){
    this.id_penjualan.add(isi);
}
public ArrayList<Integer> getRecordid_penjualan (){
    return this.id_penjualan;
}

public void insertkd_penjualan(String isi){
    this.kd_penjualan.add(isi);
}
public ArrayList<String> getRecordkd_penjualan(){
    return this.kd_penjualan;
}

public void insertid_pelanggan(int isi){
    this.id_pelanggan.add(isi);
}
public ArrayList<Integer> getRecordid_pelanggan(){
    return this.id_pelanggan;
}

public void insertid_barang(int isi){
    this.id_barang.add(isi);
}
public ArrayList<Integer> getRecordid_barang(){
    return this.id_barang;
}

public void insertsubtotal_barang(int isi){
    this.subtotal_barang.add(isi);
}
public ArrayList<Integer> getRecordsubtotal_barang(){
    return this.subtotal_barang;  
}

public void inserttotal_harga(int isi){
    this.total_harga.add(isi);
}
public ArrayList<Integer> getRecordtotal_harga(){
    return this.total_harga; 
}

public void insertkasir(String isi){
    this.kasir.add(isi);
}
public ArrayList<String> getRecordkasir(){
    return this.kasir;
}             
public void insertbarang(int id_penjualan, String kd_penjualan, int id_pelanggan, int id_barang, int subtotal_barang, int total_harga, String kasir){
    this.id_penjualan.add(id_penjualan);
    this.kd_penjualan.add(kd_penjualan);
    this.id_pelanggan.add(id_pelanggan);
    this.id_barang.add(id_barang);
    this.subtotal_barang.add(subtotal_barang);
    this.total_harga.add(total_harga);
    this.kasir.add(kasir);
}
}    