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
public class datasetuser {
private ArrayList<Integer> idUser;
private ArrayList<String> nama;
private ArrayList<String> email;
private ArrayList<String> role;
private ArrayList<String> password;
private ArrayList<String> rememberToken;

public datasetuser () {
    idUser = new ArrayList<Integer>();
    nama = new ArrayList<String>();
    email = new ArrayList<String>();
    role = new ArrayList<String>();
    password = new ArrayList<String>();
    rememberToken = new ArrayList<String>();
}

public void insertidUser(int isi){
    this.idUser.add(isi);
}
public ArrayList<Integer> getRecordidUser (){
    return this.idUser;
}

public void insertnama(String isi){
    this.nama.add(isi);
}
public ArrayList<String> getRecordnama(){
    return this.nama;
}

public void insertemail(String isi){
    this.email.add(isi);
}
public ArrayList<String> getRecordemail(){
    return this.email;
}

public void insertrole(String isi){
    this.role.add(isi);
}
public ArrayList<String> getRecordrole (){
    return this.role;
}

public void insertpassword(String isi){
    this.password.add(isi);
}
public ArrayList<String> getRecordpassword(){
    return this.password;
}
public void insertrememberToken(String isi){
    this.rememberToken.add(isi);
}
public ArrayList<String> getRecordremembertoken(){
    return this.rememberToken;
}

public void insertuser(int idUser, String nama, String email, String role, String password, String rememberToken){
    this.idUser.add(idUser);
    this.nama.add(nama);
    this.email.add(email);
    this.role.add(role);
    this.password.add(password);
    this.rememberToken.add(rememberToken);
}
}