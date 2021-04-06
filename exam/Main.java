/**
 *
 * @author gladis // applikasi pesan makanan
 */

import java.util.ArrayList;
import java.util.Scanner;

// class main

class Data(){
    public data(String [] strArray){
        // declaration array pesanan
        ArrayList<String> pesanan = new ArrayList<>();
        // input / add pesanan from parameter
        foreach(strArray in str){
            pesanan.add(str);
        }
        System.out.println("Pesanan mu adalah " + pesanan);
    }
}

class Menu extends Data(){
    String nama;

    public Makanan(){

    }

    public Minuman(){

    }
}

public class Main{
    public static void main(String[] args){
        // create new scanner
        Scanner baca = new Scanner(System.in);
        // print for interface
        System.out.println("== Selamat data di Angkringan serba 5000. Silahkan pilih yang ingin dipesan ya :==");
        System.out.print("1. Makanan || 2. Minuman || 3. Exit");
        // user input menu yang dipilih
        int menu = baca.nextInt();
        // eksekusi method data
        Data_menu(menu); // -> disini user milih menu

        
    }

    static void Data_menu(int menu){
        // create new scanner
        Scanner baca = new Scanner(System.in);
        // menu
        switch (menu){
            // makanan
            case 1:
                System.out.println("== Berikut menu makanannya, mau pilih yang mana ? ==");
                System.out.print("1. Nasi Oseng - Oseng Tempe || 2. Nasi Teri");
                // user input yang dipilih
                int pesanan = baca.nextInt();
                // eksekusi
                Data_pesanan(pesanan);
            // minuman
            case 2:
                System.out.println("== Berikut menu minumannya, mau pilih yang mana ? ==");
                System.out.print("1. Es Teh || 2. Es Jeruk");
                // user input yang dipilih
                int pesanan = baca.nextInt();
                // eksekusi
                Data_pesanan(pesanan);
            // exit
            case 3:
                System.out.println("== Terimakasih sudah mampir :3 ==");
                break;
        }

    }
}
