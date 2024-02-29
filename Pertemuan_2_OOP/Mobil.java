/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_2_OOP;

/**
 *
 * @author ACER
 */
class Mobil {

    String merk;
    String model;
    int tahunProduksi;
    String warna;

    Mobil() {
    }

    Mobil(String merk, String model, int tahunProduksi, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
        this.warna = warna;
    }

    String getMerk() {
        return merk;
    }

    void setMerk(String merk) {
        this.merk = merk;
    }

    void maju() {
        System.out.println("Mobil berjalan maju");
    }

    void mundur() {
        System.out.println("Mobil berjalan mundur");
    }

    void isiBensin(int uang) {
        System.out.println("Mobil telah diisi bensin sebanyak Rp " + uang);
    }
}
