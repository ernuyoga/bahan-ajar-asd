package Pertemuan_13_Searching;

public class Searching {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 12, 34, 38, 40, 42, 51};

        int data = 4;
        int lin = linearSearch(arr, data);
        int bin = binarySearch(arr, data);

        if (lin != -1) {
            System.out.println("Data ditemukan");
        }
        else {
            System.out.println("Data tidak ditemukan");
        }
        if (bin != -1) {
            System.out.println("Data ditemukan");
        }
        else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public static int linearSearch(int[] arr, int data) {
        System.out.println("Linear: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int data) {
        int l = 0;
        int r = arr.length - 1;
        int m = (l + r)/2;
        System.out.println("Binary: ");
        while (l <= r) {
            m = (l + r)/2;
            System.out.println(arr[m]);
            // data ditemukan pada indeks tengah
            if (data == arr[m]) {
                return m;
            }
            // data lebih kecil dari elemen tengah
            if (data < arr[m]) {
                r = m - 1; // ubah batas atas
            }
            // data lebih besar dari elemen tengah
            if (data > arr[m]) {
                l = m + 1; // ubah batas bawah
            }
        }
        return -1;
    }
}
