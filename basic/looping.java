// References : https://www.maribelajarcoding.com/2020/02/perulangan-looping-pada-java.html#:~:text=Perulangan%20atau%20looping%20merupakan%20sebuah,%2C%20while%20dan%20do%2Dwhile.&text=Perulangan%20jenis%20ini%20digunakan%20untuk,yang%20telah%20diketahui%20jumlah%20banyaknya.

// For = Pengulangan yang telah diketahui junlah banyaknya
// Example :
int i;
for(i = 0; i<5; i++){
    System.out.print(i + ". ");
}

// Foreach = 

// While = Melakukan pengecekan kondisi diawal blok statement. Jika kondisi sesuai, maka mengeksekusi perulangan.
int i = 0
while(i<0){
    System.out.println(i);
    i++;
}


// Do While = Melakukan pengecekan kondisi diakhir blok statement. Jika kondisi sesuai, maka mengeksekusi perulangan.
int n = 5;
int i = 0;
do{
    System.out.println(i)
    i++;
}while( i<n);