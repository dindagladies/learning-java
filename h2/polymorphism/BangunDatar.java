// menghitung
class Menghitung{
    float luas(){
        System.out.println("Menghitung luas bangun datar");
        return 0;
    }

    float keliling(){
        System.out.println("Menghitung keliling bangun datar");
        return 0;
    }
}

// persegi
class Persegi extends Menghitung{
    int sisi;

    public Persegi(int sisi){
        this.sisi = sisi;
    }

    @Override
    public float luas(){
        // rumus
        return this.sisi * this.sisi;
    }

    @Override
    public float keliling(){
        // rumus
        return this.sisi * 4;
    }
}

// lingkaran
class Lingkaran extends Menghitung {
    int r;

    public Lingkaran(int r) {
        this.r = r;
    }
    
    @Override
    public float luas(){
        // rumus
        return (float) (Math.PI * r * r);
    }
    
    @Override
    public float keliling(){
        // rumus
        return (float) (2 * Math.PI * r);
    }
    
}

public class BangunDatar {
    public static void main(String[] args) {
        
        Menghitung bangunDatar = new Menghitung();
        Persegi persegi = new Persegi(4);
        Lingkaran lingkaran = new Lingkaran(50);
        
        // memanggil method luas dan keliling | menampilkan interface
        bangunDatar.luas();
        bangunDatar.keliling();
        // memanggil methos luas dan keliling sesuai class nya
        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("keliling persegi: " + persegi.keliling());
        System.out.println("Luas lingkaran: " + lingkaran.luas());
        System.out.println("keliling lingkaran: " + lingkaran.keliling());
    }
}