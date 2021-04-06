/**
 *
 * @author gladis
 * Object Oriented Programming 
 * = pemograman berorientasi objek
 * = Pada OOP, Fungsi dan variabel dibungkus dalam sebuah objek atau class yang dapat saling berinteraksi, sehingga membentuk sebuah program
 */

// class main
public class Main {
    // 2. Constructur
    // Method khusus yang akan dieksekusi pada saat pembuatan objek (instance)
    // Method yang namanya persis  dengan nama class nya
    // bisa dengan parameter

    String name;

    // Contructure
    Main(String n){
        this.name = n;
    }

    public static void main(String[] args){
        Main departement1 = new Main("Teknik Informatika");
        System.out.println("Nama Departementnya adalah " + departement1.name);
    }
}