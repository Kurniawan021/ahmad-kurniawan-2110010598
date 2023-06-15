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
public class datasetstok {
private ArrayList<Integer> idStok;
private ArrayList<Integer> idBarang;
private ArrayList<Integer> jumlahBarang;

public datasetstok () {
    idStok = new ArrayList<Integer>();
    idBarang = new ArrayList<Integer>();
    jumlahBarang= new ArrayList<Integer>();
}

public void insertidStok(int isi){
    this.idStok.add(isi);
}
public ArrayList<Integer> getRecordidStok (){
    return this.idStok;
}

public void insertidBarang(int isi){
    this.idBarang.add(isi);
}
public ArrayList<Integer> getRecordidBarang(){
    return this.idBarang;
}

public void insertjumlahBarang(int isi){
    this.jumlahBarang.add(isi);
}
public ArrayList<Integer> getRecordjumlahBarang(){
    return this.jumlahBarang;
}

public void insertlog(int idStok, int idBarang, int jumlahBarang){
    this.idStok.add(idStok);
    this.idBarang.add(idBarang);
    this.jumlahBarang.add(jumlahBarang);
}
}    