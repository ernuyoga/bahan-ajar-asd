package Pertemuan_2_Generic;

class Printer<T> {

    T something;

    Printer(T something) {
        this.something = something;
    }
    
    void cetak() {
        System.out.println(something);
    }
    
    void cetakPintar() {
        if (something instanceof String) {
            System.out.println(something + " adalah object bertipe data String");
        } else if (something instanceof Integer){
            System.out.println(something + " adalah object bertipe data Integer");
        }
    }
}
