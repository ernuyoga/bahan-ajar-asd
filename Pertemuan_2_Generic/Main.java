/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_2_Generic;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        Printer<String> motor = new Printer<>("beat mberrr");
        motor.cetak();
        
        Printer<Integer> umur = new Printer<>(20);
        umur.cetak();
        
        motor.cetakPintar();
        umur.cetakPintar();
    }
}
