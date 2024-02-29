/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_2_OOP;

/**
 *
 * @author ACER
 */
class Main {

    public static void main(String[] args) {
        Mobil mobilLama = new Mobil();
        Mobil mobilBaru = new Mobil("toyota", "agya", 2018, "merah");

        System.out.println(mobilLama.getMerk());
        System.out.println(mobilBaru.getMerk());

        mobilLama.setMerk("daihatsu");
        System.out.println(mobilLama.getMerk());

        mobilBaru.maju();
        mobilBaru.mundur();

        mobilBaru.isiBensin(50000);
    }
}
