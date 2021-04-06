/**
 *
 * @author gladis // applikasi pesan makanan
 */

import java.util.ArrayList;
import java.util.Scanner;

// pesan
class Pesan{
    int makanan(){
        System.out.println("Makanan yang anda pilih adalah ");
        return 0;
    }
}

// user
class User1 extends Pesan{

    public User1(int Id_pesanan){
        ArrayList<Integer> pesanan = new ArrayList<>();
        pesanan.add(Id_pesanan);
        System.out.println(pesanan);
    }
}

// 
class Angkringan{
    public static void main(String[] args) {
        Pesan angkringan = new Pesan();
        User1 user1 = new User1(1);

        // angkringan.makanan();
        System.out.println(user1.makanan());
    }
}