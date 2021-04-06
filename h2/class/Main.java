/**
 *
 * @author gladis
 * Object Oriented Programming 
 * = pemograman berorientasi objek
 * = Pada OOP, Fungsi dan variabel dibungkus dalam sebuah objek atau class yang dapat saling berinteraksi, sehingga membentuk sebuah program
 * https://www.w3schools.com/java/ref_keyword_this.asp
 */

// class main
public class Main {
    // 1. Class & Object
        // Class adalah untuk mengumpulkan prosedur / fungsi dan variabel dalam satu tempat
        // Class adalah rancangan atau blue print dari sebuah object
        // Object adalah sebuah variabel yang merupakan intance atau perwujudan dari Class
        // Variabel == atribut ==  properti
        // Fungsi == method
    
    // declare variable
    String name;
    String address;
    String phoneNumber;

    public Main(String n, String a, String p){
        this.name = n;
        this.address = a;
        this.phoneNumber = p;
    }

    // static void introduce(){
    //     // Console.WriteLine("Hi, my name is " + name + "I live at " + address + "My phone number is " + phoneNumber);
    //     System.out.println(name, address, phoneNumber);
    // }

    public static void main(String[] args){
        Main p1 = new Main("Dinda", "Yogyakarta", "123");
        // p1.introduce();

        System.out.println(p1);
    }
}