/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Date;

public class log {
    private int idLog;
    private int idBarang;
    private int jumlahStok;
    private Date restockAt;

    public log(int idLog, int idBarang, int jumlahStok, Date restockAt) {
        this.idLog = idLog;
        this.idBarang = idBarang;
        this.jumlahStok = jumlahStok;
        this.restockAt = restockAt;
    }

    // Getter dan setter untuk setiap properti

    public int getIdLog() {
        return idLog;
    }

    public void setIdLog(int idLog) {
        this.idLog = idLog;
    }

    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

    public void setJumlahStok(int jumlahStok) {
        this.jumlahStok = jumlahStok;
    }

    public Date getRestockAt() {
        return restockAt;
    }

    public void setRestockAt(Date restockAt) {
        this.restockAt = restockAt;
    }
}
