/**
 *
 * @author gladis
 * https://www.wildantechnoart.net/2017/11/access-modifier-pada-java.html
 * https://www.mahirkoding.com/mengenal-access-modifier-pada-bahasa-java/
 */

// class main
public class Main {
    // 2. Access Modifier
    // Adalah hak akses yang diberikan kepada variabel, method, class
    // yang bertujuan untuk menjaga integritas dari data ketika ingin diakses oleh objek lain.
    // Sehingga kita bisa membatasi resource2 mana saja yg dapat diakses oleh objek tertentu
    // Public, Private, Protected

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