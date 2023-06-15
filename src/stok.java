/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Date;

public class stok {
    private int idStok;
    private int idBarang;
    private int jumlahBarang;
    private Date insertedAt;

    public stok(int idStok, int idBarang, int jumlahBarang, Date insertedAt) {
        this.idStok = idStok;
        this.idBarang = idBarang;
        this.jumlahBarang = jumlahBarang;
        this.insertedAt = insertedAt;
    }

    // Getter dan setter untuk setiap properti

    public int getIdStok() {
        return idStok;
    }

    public void setIdStok(int idStok) {
        this.idStok = idStok;
    }

    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public Date getInsertedAt() {
        return insertedAt;
    }

    public void setInsertedAt(Date insertedAt) {
        this.insertedAt = insertedAt;
    }
}
