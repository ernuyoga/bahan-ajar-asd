package Pertemuan_2_Generic;

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
