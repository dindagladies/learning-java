/**
 *
 * @author gladis
 * https://www.petanikode.com/java-oop-inheritance/
 */

// class main
public class Main {
    // Inheritance (Pewarisan)

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