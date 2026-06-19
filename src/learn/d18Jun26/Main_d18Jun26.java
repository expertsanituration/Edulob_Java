package learn.d18Jun26;

import java.util.Scanner;

public class Main_d18Jun26 {
    Scanner scanner = new Scanner(System.in);
    StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {
        Main_d18Jun26 main = new Main_d18Jun26();
        main.no_1();
        main.no_2();
        main.no_3();
    }

    private void no_1() {
        clearBuilder();

        System.out.println("Nama depan:");
        String namaDepan = scanner.nextLine();

        System.out.println("Nama belakang:");
        String namaBelakang = scanner.nextLine();

        builder.append(namaDepan);
        builder.append(" ");
        builder.append(namaBelakang);

        String finalName = builder.toString();

        System.out.println("Nama Lengkap Anda: " + finalName);
    }

    private void no_2() {
        clearBuilder();

        String original = "Saya belajar ";

        System.out.print(original);

        String nama = scanner.nextLine();

        builder.append(original);
        builder.append(nama);

        String finalName = builder.toString();

        System.out.println(finalName);

    }

    private void no_3() {
        clearBuilder();

        String original = "Pemograman";

        builder.append(original);
        builder.insert(2, 'r');

        String finalStr = builder.toString();

        System.out.println(finalStr);

    }

    private void clearBuilder() {
        if (!builder.isEmpty()) {
            int len = builder.length();
            builder.delete(0, len);
        }
    }
}
