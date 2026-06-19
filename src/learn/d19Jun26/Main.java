package learn.d19Jun26;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
    }

    private void no_1() {
        try
                (BufferedWriter writer = new BufferedWriter(new FileWriter("test19Jun26.txt")))
        {

            String nama = "Hansen";
            String alamat = "Jl Jalan No. 4";
            int umur = 0;
            String hobi = "Bermain game";

            writer.write(String.format("""
                    ====================
                        BIODATA DIRI
                    ====================
                    Nama: %s
                    Alamat: %s
                    Umur: %d
                    Hobi: %s
                    ====================
                    """, nama, alamat, umur, hobi));
            writer.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void no_2() {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Masukkan umur Anda dalam tahun:");
//        String age = scanner.nextLine();
//
//        int day = Integer.parseInt(age) * 365;
//
//        System.out.printf("Umur Anda (%s) tahun adalah %d hari", age, day);

        System.out.println("Masukkan umur Anda dalam tahun:");
        int age = scanner.nextInt();

        System.out.printf("Umur Anda (%s) tahun adalah %d hari", age, age * 365);
    }
}


