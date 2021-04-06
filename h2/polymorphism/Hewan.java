// https://www.dicoding.com/blog/pengertian-polimorfisme-dalam-pemrograman-java/#:~:text=Polimorfisme%20terbagi%20menjadi%20dua%20suku,diterapkan%20juga%20pada%20bahasa%20Java.
// contoh overriding

// abstract = class yang masih dalam bentuk bayangan
abstract class Suara{
    // mendeklarasikan class dan method tipe abstract
    protected abstract void munculsuara();
}

// subclass kucing
class Kucing extends Suara{
    // menggunakan method dari kelas induk abstrack
    @Override
    protected void munculsuara(){
        System.out.println("Suara Kucing : meow meow meow");
    }
}

// subclass burung
class Burung extends Suara{
    protected void munculsuara(){
        System.out.println("Suara Burung : citt citt citt");
    }
}

// hewan
public class Hewan{
    public static void main(String[] args){
        Suara kucing = new Kucing();
        kucing.munculsuara();

        Suara burung = new Burung();
        burung.munculsuara();
    }
}