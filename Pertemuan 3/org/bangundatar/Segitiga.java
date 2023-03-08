package org.bangundatar;
/*
 * Nama File    : Segitiga.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : File Class Segitiga dengan memiliki pewarisan dari Poligon
 * Tanggal      : 8 Maret 2023
 */

import org.poligon.Poligon;

public class Segitiga extends Poligon {
    private  double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return 0.5*alas*tinggi;
    }

    public void printInfo(){
        System.out.println("Bangun Segitiga bersisi "+this.jumlahSisi);
    }


}
