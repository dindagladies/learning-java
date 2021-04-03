// References : https://www.wildantechnoart.net/2017/10/apa-itu-method-void-return-static-pada-java.html
// 1.  Method void = method yg tidak mengembalikan nilai / mereturn
/*
    Ex : void Test(){
        perintah ..
    }
*/
// 2. Method non-void (Return) = method yang mereturn data
/*
    Ex : String test(){
        perintah ..
        return variable;
    }
*/
// 3. Method static = Bisa digunakan pada method / variabel. Jika menggunakan method ini, kita tidak perlu menginisialisasi suatu class
/*
    Ex : 
    publc class tutorial{
        // static untuk variable
        Static String nama;
        Static int tahun;
        
        public  function void(String[] args){

        }

        // static untuk method return / non-void
        static int Umur(){}

        // static untuk method void
        static void Nilai(){}
    }

    Conclude :
    Variabel bisa dipanggil jika ada static nya. Jika tidak ada static nya, yg digunakan method non-void untuk mereturn data
*/