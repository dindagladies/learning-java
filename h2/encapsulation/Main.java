/**
 *
 * @author gladis
 * https://www.wildantechnoart.net/2017/11/belajar-konsep-encapsulation-pada-java.html
 */

// class main
public class Main {
    // Encapsulation
    // untuk membungkus suatu data / variabel sehingga data tersebut tidak bisa diakses oleh class lain

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