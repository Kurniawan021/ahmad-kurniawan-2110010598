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
public class datasetpelanggan {
private ArrayList<Integer> id_pelanggan;
private ArrayList<String> kd_pelanggan;
private ArrayList<String> nama_pelanggan;
private ArrayList<String> alamat;
private ArrayList<String> kota;
private ArrayList<String> telp;
private ArrayList<String> status;
private ArrayList<String> jk;

public datasetpelanggan () {
    id_pelanggan = new ArrayList<Integer>();
    kd_pelanggan = new ArrayList<String>();
    nama_pelanggan = new ArrayList<String>();
    alamat = new ArrayList<String>();
    kota = new ArrayList<String>();
    telp = new ArrayList<String>();
    status = new ArrayList<String>();
    jk = new ArrayList<String>();
}

public void insertid_pelanggan(int isi){
    this.id_pelanggan.add(isi);
}
public ArrayList<Integer> getRecordid_pelanggan (){
    return this.id_pelanggan;
}

public void insertkd_pelanggan(String isi){
    this.kd_pelanggan.add(isi);
}
public ArrayList<String> getRecordkd_pelanggan(){
    return this.kd_pelanggan;
}

public void insertnama_pelanggan(String isi){
    this.nama_pelanggan.add(isi);
}
public ArrayList<String> getRecordnama_pelanggan(){
    return this.nama_pelanggan;
}

public void insertalamat(String isi){
    this.alamat.add(isi);
}
public ArrayList<String>getRecordalamat (){
    return this.alamat;
}

public void insertkota(String isi){
    this.kota.add(isi);
}
public ArrayList<String> getRecordkota (){
    return this.kota;
}

public void inserttelp(String isi){
    this.telp.add(isi);
}
public ArrayList<String> getRecordtelp(){
    return this.telp;
}
public void insertstatus(String isi){
    this.status.add(isi);
}
public ArrayList<String> getRecordstatus(){
    return this.status;
}
public void insertjk(String isi){
    this.jk.add(isi);
}
public ArrayList<String> getRecordjk(){
    return this.jk;
}             
public void insertbarang(int id_pelanggan, String kd_pelanggan, String nama_pelanggan, String alamat, String kota, String telp, String status, String jk){
    this.id_pelanggan.add(id_pelanggan);
    this.kd_pelanggan.add(kd_pelanggan);
    this.nama_pelanggan.add(nama_pelanggan);
    this.alamat.add(alamat);
    this.kota.add(kota);
    this.telp.add(telp);
    this.status.add(status);
    this.jk.add(jk);
}
}    