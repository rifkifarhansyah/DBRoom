package com.rifki.dbroom;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*

30/04/2020
membuat keseluruhan program dan tampilan

nim   : 10117193
nama  : Rifki Farhansyah
kelas : if-5

 */
@Entity
public class AktivisEntity {

    @PrimaryKey(autoGenerate = true)
    private int idAktivis;
    @ColumnInfo(name = "namaAktivis")
    private String namaAktivis;
    @ColumnInfo(name = "emailAktivis")
    private String emailAktivis;
    @ColumnInfo(name = "zonaTugas")
    private String zonaTugas;

    public int getIdAktivis() {
        return idAktivis;
    }

    public void setIdAktivis(int idAktivis) {
        this.idAktivis = idAktivis;
    }

    public String getNamaAktivis() {
        return namaAktivis;
    }

    public void setNamaAktivis(String namaAktivis) {
        this.namaAktivis = namaAktivis;
    }

    public String getEmailAktivis() {
        return emailAktivis;
    }

    public void setEmailAktivis(String emailAktivis) {
        this.emailAktivis = emailAktivis;
    }

    public String getZonaTugas() {
        return zonaTugas;
    }

    public void setZonaTugas(String zonaTugas) {
        this.zonaTugas = zonaTugas;
    }
}