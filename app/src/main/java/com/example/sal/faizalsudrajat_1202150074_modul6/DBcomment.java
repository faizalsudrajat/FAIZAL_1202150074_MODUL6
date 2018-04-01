package com.example.sal.faizalsudrajat_1202150074_modul6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DBcomment {
    String userKomentar, isiKomentar, fotoKomentar;

    //Dibutuhkan kosong untuk membaca data
    public DBcomment(){

    }

    //Constructor dari class ini
    public DBcomment(String userKomentar, String isiKomentar, String fotoKomentar) {
        this.userKomentar = userKomentar;
        this.isiKomentar = isiKomentar;
        this.fotoKomentar = fotoKomentar;
    }

    //getter untuk variabel dari class ini
    public String getFotoKomentar() {
        return fotoKomentar;
    }

    public String getUserKomentar() {
        return userKomentar;
    }

    public String getIsiKomentar() {
        return isiKomentar;
    }

}