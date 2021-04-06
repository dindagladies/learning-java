/**
 *
 * @author gladis
 * https://www.petanikode.com/java-oop-inheritance/
 */

// class main
public class Main {
    // Polymorphism / Polimorfisme

    // === contoh overloading ===
    // tipe double
    static double maxNumber(double a, double b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    // type int
    static int maxNumber(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    // main
    public static void main(String[] args){
        System.out.println(maxNumber(1.7, 2.7));
        System.out.println(maxNumber(1, 2));
    }
}