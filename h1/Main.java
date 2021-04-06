/**
 *
 * @author gladis
 */

import java.util.ArrayList;

// 1. Structure of Java Programs
public class Main {
    // static in variable
    static int a = 10;
    static int b = 20;

    // method main
    public static void main(String[] args) {

        System.out.println("========== 1. Introduce ==========");
        System.out.println("Nama saya adalah " + My_Name());

        System.out.println("========== 2. Variables ==========");
        Variables();

        System.out.println("========== 3. Variable Constant ==========");
        Constant();

        System.out.println("========== 4. Operator Aritmatika ==========");
        Aritmatika();

        System.out.println("========== 5. Operator Assigment ==========");
        OperatorAssigment();

        System.out.println("========== 6. Increment & Decrement ==========");
        IncDec();

        System.out.println("========== 7. Relasional / Perbandingan ==========");
        Relasional();

        System.out.println("========== 8. Operator Logika / Boolean ==========");
        Boolean();

        System.out.println("========== 9. Operator Ternary ==========");
        Ternary();

        System.out.println("========== 10. Array ==========");
        Array();

        System.out.println("========== 11. Array List ==========");
        ArrayLists();

        System.out.println("========== 12. Decision ==========");
        Decision();

        System.out.println("========== 13. Repitition ==========");
        Repitition();

        System.out.println("========== 14. Exception Handling ==========");
        ExceptionHandling();

        System.out.println("========== 15. Method non void with parameter ==========");
        int hasil = tambahkan(1, 2);
        System.out.println("Hasil pertambahan adalah " + hasil);
    }

    // introduce (method yg mereturn data)
    static String My_Name(){
        String name = "Dinda Gladis";
        return name;
    }

    // variables
    static void Variables(){
        String a = "Test";
        int b = 10;
        double c = 19.99;
        char d = 'Y';
        boolean e = false;

        System.out.println("Type variable String : " + a);
        System.out.println("Type variable Interger : " + b);
        System.out.println("Type variable Double : " + c);
        System.out.println("Type variable Char : " + d);
        System.out.println("Type variable Boolean : " + e);
    }

    // constant (variabel yg nilainya tidak bisa dirubah)
    static void Constant(){
        final double phi = 3.14;
        // double phi = 0;
        System.out.println(phi);
    }

    // aritmatika / operator matematika
    static void Aritmatika(){
        int hasil;

        hasil = a + b;
        System.out.println("Hasil dari pertambahan = " + hasil);
        hasil = a * 2;
        System.out.println("Hasil dari perkalian = " + hasil);
    }

    // operator assigment (memberikan suatu nilai untuk suatu variabel)
    static void OperatorAssigment(){
        a += a; // = a + a
        System.out.println("Hasil dari pertambahan a = " + a);

        b *= b; // = b * b
        System.out.println("Hasil dari perkalian b = " + b);

        a *= 2;
        System.out.println("Hasil dari perkalian a = " + a);
    }

    // 6. increment decrement (menambah var sebanyak 1 angka / mengurangi var sebanyak 1 angka)
    static void IncDec(){
        int c = 5;
        int d = 5;
        int e = 5;
        int f = 5;

        int postincrement = c++; // a
        int preincrement = ++d; // a + 1
        
        int postdecrement = e--; // b
        int predecrement = --f; // b -1
        
        

        System.out.println("Post-Increment = " + postincrement);
        System.out.println("Pre-Increment = " + preincrement);
        System.out.println("Post-Decrement = " + postdecrement);
        System.out.println("Pre-Decrement = " + predecrement);
    }

    //  perbandingan / relasional (untuk membandingkan 2 buah nilai)
    static void Relasional(){
        boolean hasil;

        hasil = (a == b);
        System.out.println("Hasil dari a = b adalah " + hasil);

        hasil = (b > a);
        System.out.println("Hasil dari a > b adalah " + hasil);
    }

    // logika / boolean (operator yg dipakai untuk menghasilkan boolean dari 2 kondisi / lebih)
    static void Boolean(){
        boolean kondisi1 = true;
        boolean kondisi2 = false;
        boolean hasil;

        hasil = (kondisi1 && kondisi2);
        System.out.println("Hasil dari operator && adalah " + hasil);
        hasil = (kondisi1 || kondisi2);
        System.out.println("Hasil dari operator || adalah " + hasil);
        hasil = !kondisi1;
        System.out.println("Hasil dari opertor ! adalah " + hasil);
    }

    // operator ternary (operator yg melibatkan 3 buah operand / penulisan singkat ifelse)
    static void Ternary(){
        int nilaiTerbesar;
        int nilaiTerkecil;
        String bilangan;

        nilaiTerbesar = (a > b) ? a : b;
        nilaiTerkecil = (a < b) ? a : b;
        bilangan = ((a%2) == 0?"Genap":"Ganjil" );

        System.out.println("Nilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
        System.out.println("Nilai 10 adalah bilangan " + bilangan);
    }

    // array (kumpulan data yg memiliki tipe sama)
    static void Array(){
        String[] nama = {"Dinda", "Gladis", "Surya", "Dara"};
        int[] a = new int[13];

        a[0] = 3;
        a[1] = 2;

        System.out.println("List dara array dari variabel A adalah " + a[0]);
        System.out.println("Isi data array urutan ke-2 adalah " + nama[1]);
    }

    // array list (array yg panjangnya dapat diubah)
    static void ArrayLists(){
        ArrayList<String> siswa = new ArrayList<>();
        siswa.add("T1");
        siswa.add("T2");
        System.out.println("Data jika ditambah method add() adalah " + siswa);

        System.out.println("Data jika menggunakan method get(1) adalah "+ siswa.get(1));

        siswa.set(1, "T3");
        System.out.println("Data jika menggunakan method set() adalah "+ siswa);

        siswa.remove(1);
        System.out.println("Data jika menggunakan method remove(1) adalah "+ siswa);
    }

    // decision (percabangan )
    static void Decision(){
        boolean kondisi = false;

        // if else
        if(kondisi == true){
            System.out.println("Kondisi benar");
        }else{
            System.out.println("Kondisi salah");
        }

        // nested if
        boolean sudaMenikah = true;
        int umur = 24;

        if(sudaMenikah){
            if(umur <= 18){
                System.out.println("Menikah muda");
            }else{
                System.out.println("Wajar sudah menikah");
            }
        }else{
            System.out.println("Masih jomblo ya");
        }

        // switch case
        String siswa = "Jokowi";

        switch(siswa){
            case "Selena":
                System.out.println("Seorang penyanyi");
                break;

            case "Jokowi":
                System.out.println("Seorang presiden");
                break;

            case "Atta":
                System.out.println("Youtuber");
                break;
        }
    }

    // repitition / perulangan
    static void Repitition(){

        // for
        for(int i = 1; i <= 4; i++){
            System.out.println("Angka ke- " + i);
        }

        // while
        while(a < 11){
            System.out.println("Angka ke- " + a++);
        }

        // do while
        do{
            System.out.println("Angka ke- " + a++);
        }while(a < 11);
    }

    // exception handling (membuat bug program sebagai objek, sehingga dapat berjalan normal)
    static void ExceptionHandling(){
        try{
            int[] angka = {1, 2, 3};
            System.out.println(angka[10]);
        }catch (Exception e){
            System.out.println("Waduh error");
        }finally {
            System.out.println("try catch berhasil dijalankan");
        }
    }

    // method non void
    static int tambahkan(int n1, int n2){
        return n1 + n2;
    }

}
