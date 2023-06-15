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
public class datasetlog {
private ArrayList<Integer> idLog;
private ArrayList<Integer> idBarang;
private ArrayList<Integer> jumlahStok;

public datasetlog () {
    idLog = new ArrayList<Integer>();
    idBarang = new ArrayList<Integer>();
    jumlahStok= new ArrayList<Integer>();
}

public void insertidLog(int isi){
    this.idLog.add(isi);
}
public ArrayList<Integer> getRecordidLog (){
    return this.idLog;
}

public void insertidBarang(int isi){
    this.idBarang.add(isi);
}
public ArrayList<Integer> getRecordidBarang(){
    return this.idBarang;
}

public void insertjumlahStok(int isi){
    this.jumlahStok.add(isi);
}
public ArrayList<Integer> getRecordjumlahStok(){
    return this.jumlahStok;
}

public void insertlog(int idLog, int idBarang, int jumlahStok){
    this.idLog.add(idLog);
    this.idBarang.add(idBarang);
    this.jumlahStok.add(jumlahStok);
}
}    