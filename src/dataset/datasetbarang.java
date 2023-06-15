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
public class datasetbarang {
private ArrayList<Integer> id_barang;
private ArrayList<String> kd_barang;
private ArrayList<String> nama_barang;
private ArrayList<Integer> harga_barang;
private ArrayList<String> jenis_barang;
private ArrayList<String> satuan;
private ArrayList<String> pemasok;

public datasetbarang () {
    id_barang = new ArrayList<Integer>();
    kd_barang = new ArrayList<String>();
    nama_barang = new ArrayList<String>();
    harga_barang = new ArrayList<Integer>();
    jenis_barang = new ArrayList<String>();
    satuan = new ArrayList<String>();
    pemasok = new ArrayList<String>();
}

public void insertid_barang(int isi){
    this.id_barang.add(isi);
}
public ArrayList<Integer> getRecordid_barang (){
    return this.id_barang;
}

public void insertkd_barang(String isi){
    this.kd_barang.add(isi);
}
public ArrayList<String> getRecordkd_barang(){
    return this.kd_barang;
}

public void insertnama_barang(String isi){
    this.nama_barang.add(isi);
}
public ArrayList<String> getRecordnama_barang(){
    return this.nama_barang;
}

public void insertharga_barang(int isi){
    this.harga_barang.add(isi);
}
public ArrayList<Integer>getRecordharga_barang (){
    return this.harga_barang;
}

public void insertjenis_barang(String isi){
    this.jenis_barang.add(isi);
}
public ArrayList<String> getRecordjenis_barang (){
    return this.jenis_barang;
}

public void insertsatuan(String isi){
    this.satuan.add(isi);
}
public ArrayList<String> getRecordsatuan(){
    return this.satuan;
}
public void insertpemasok(String isi){
    this.pemasok.add(isi);
}
public ArrayList<String> getRecordpemasok(){
    return this.pemasok;
}

public void insertbarang(int id_barang, String kd_barang, String nama_barang, int harga_barang, String jenis_barang, String satuan, String pemasok){
    this.id_barang.add(id_barang);
    this.kd_barang.add(kd_barang);
    this.nama_barang.add(nama_barang);
    this.harga_barang.add(harga_barang);
    this.jenis_barang.add(jenis_barang);
    this.satuan.add(satuan);
    this.pemasok.add(pemasok);
}
}
