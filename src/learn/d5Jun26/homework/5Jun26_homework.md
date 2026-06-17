# 1.

Output = ```3```

> a % b = ?
> 
> 15 % 4 = 3

> 15 = 4 * 3 + 3
> 
> 15 = 12 + 3

% --> sisa pembagian

# 2.

Katakanlah ada sebuah program game yang mempunyai beberapa level

Runtimenya menggunakan sebuah while loop

Strukturnya(file ini hanya men-handle front-end untuk graphics):
```
...

sprite declarations


while (run == True) { 
    ...
    switch (code) {
        case 1: // error loading data
            ...
            infinite standard while loop
        case 2: // homepage
            ...
        case 3: // level 1
            ...
        
        ...
    }
    ...
}
```

Ada program lain diluar file ini(SDL, Database(Storing/Collecting database, etc), file untuk men-handle audio, etc)

variable ```run``` milik file lain
variable ```code``` di deklarasikan diluar file ini di bagian back-end program, disana nilainya terus diubah-ubah
berdasarkan graphic apa saja yang perlu ditampilkan di layar

While loop diatas digunakan untuk menggambar sprite yang ada

In the case of database nya corrupted, progra harus menunjukkan pada user sebuah error message(case 1 di switch case)
Tapi sebab variable ```run``` juga men-handle loop lain untuk audio, maka saat error terjadi(ditemukannya corruption pada database)
variable ```run``` nilainya False; variable ```code``` sudah diubah nilainya.
Tetapi program masih perlu menunjukkan error message, bukan layar kosong/hitam; dimana hal itu mustahil jika kita menggunakan
while loop biasa seperti di atas.
Karena ```run``` sudah False dan tak ada cara untuk menampilkan graphics baik karena loop-nya sudah mati
dan tak ada sprite yang digambar.

Dengan do-while loop nya masih akan berjalan 1x walau ```run == false```.
Dimana menjadi memungkinkan untuk men-print error message tersebut dengan mencabangkan ke sebuah infinite while loop untuk menggambar
sprite yang diperlukan untuk membuat error message tersebut

*Tentunya pada saat ini user hanya bisa men-close window program*




# 3.

Output:
```
1
2
4
5
```

Karena statement if nya
saat nilai i == 3, if statement itu
bernilai true sehingga "continue" dijalankan

Dalam kasus i != 3, if statement = false = tak ada percabangan

continue --> men skip ke iterasi berikutnya,
perintah print di-skip

# 4.

jawaban: b dan d

untuk b
> tipe data = double, nilai = str

untuk d
> tipe data = char, nilai = str --> petik 2

# 5.

Ya, output = ```A```

```
if (nilai >= 90) {              nilai >= 90 True
    System.out.println("A");
} else if (nilai >= 75) {
    System.out.println("B");
} else if (nilai >= 60) {
    System.out.println("C");
} else {
    System.out.println("Tidak Lulus");
}
```

kondisi pertama dicocokkan terlebih dahulu,
dan me return true
Maka "A" di print

# 6.

```
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
```