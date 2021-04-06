/**
 *
 * @author gladis // applikasi mengirim pesan sosmed
 */

import java.util.Scanner;
import java.util.ArrayList;

abstract class Rest{
    abstract void menu();
}

// makanan
class Makanan extends Rest{

    @Override
    void menu(){
        // variable
        String[] nama_makanan = {"Nasi Goreng", "Mie Goreng"};
    }
}

// main
class Restaurant{
    public static void main(String[] args){
        // create objek
        // Rest menu1 = new Rest();
        int pilihan_menu = 0;

        do{
            // create new scanner
            Scanner baca = new Scanner(System.in);
            // ============== show =================
            // menu1.menu();
            System.out.print("Pilih menu yang kamu mau : ");
            System.out.println("1. Makanan || 2. Minuman");
            pilihan_menu = baca.nextInt();
            // ============== condition ===============
            // MenuCondition(pilihan_menu);
        }while(pilihan_menu != 3);

        // test
        // System.out.println("Pilihanmu "+ pilihan_menu);
        // Data_pesanan(1);

    }

    static void MenuCondition(int pilihan_menu){
        // create new scanner
        Scanner baca = new Scanner(System.in);
        switch (pilihan_menu){
            // makanan
            case 1:
                System.out.println("== Berikut menu makanannya, mau pilih yang mana ? ==");
                System.out.print("1. Nasi Oseng - Oseng Tempe || 2. Nasi Teri");
                // user input yang dipilih
                int input = baca.nextInt();
                String pesanan = "";
                // check
                if(input == 1){
                    pesanan = "Nasi Oseng - Oseng";
                }else if(input == 2){
                    pesanan = "Nasi Teri";
                }else{
                    System.out.print("Jangan input yang lain ya");
                }
                // save data to array
                Data_pesanan(pesanan);
                break;
            // minuman
            case 2:
                System.out.println("== Berikut menu minumannya, mau pilih yang mana ? ==");
                System.out.print("1. Es Teh || 2. Es Jeruk");
                // user input yang dipilih
                // int pesanan = baca.nextInt();
                // eksekusi
                // Data_pesanan(pesanan);
                break;
            // exit
            case 3:
                System.out.println("== Terimakasih sudah mampir :3 ==");
                break;
        }
    }

    static void Data_pesanan(String pesanan){
        // declaration array pesanan
        ArrayList<String> list_pesanan = new ArrayList<>();
        list_pesanan.add(pesanan);
        System.out.println("Pesananmu adalah " + list_pesanan);
    }
}