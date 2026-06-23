package learn.d22Jun26;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        Main main = new Main();

        Scanner scanner = new Scanner(System.in);

        String userOpt;
        boolean isContinue = true;

        while (isContinue) {
            main.clearScreen();

            System.out.println("DATABASE PERPUSTAKAAN");
            System.out.println("1.\tLihat seluruh buku");
            System.out.println("2.\tCari data buku");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");

            System.out.print("\n\nPilihan Anda: ");
            userOpt = scanner.next();

            scanner.nextLine();

            switch (userOpt) {
                case "1":
                    System.out.println("\n===============");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("===============\n");
                    main.showData();
                case "2":
                    System.out.println("\n===============");
                    System.out.println("CARI BUKU");
                    System.out.println("===============\n");
                    break;
                case "3":
                    System.out.println("\n===============");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("===============\n");

                    System.out.println("Masukkan tahun buku:");
                    String year = scanner.nextLine();

                    System.out.println("Masukkan judul buku:");
                    String title = scanner.nextLine();

                    System.out.println("Masukkan penerbit buku:");
                    String publisher = scanner.nextLine();

                    System.out.println("Masukkan penulis buku:");
                    String author = scanner.nextLine();

                    main.addData(year, author, publisher, title);
                    break;
                case "4":
                    System.out.println("\n===============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("===============\n");
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============\n");
                    break;
                default:
                    System.err.println("\nInput Anda tidak valid\nSilahkan pilih lagi (1-5)");
            }

            isContinue = main.getYesNo("Apakah Anda ingin melanjutkan?");

        }

    }

    private void showData() throws IOException{
        FileReader fileInput;
        BufferedReader reader = null;
        
        try {
            fileInput = new FileReader("database.txt");
            reader = new BufferedReader(fileInput);
        } catch (Exception e) {
            System.err.println("Database tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
        }

        System.out.println("\n| No |\tTahun     |\tPenulis                    |\tPenerbit                    |\tJudul Buku");
        System.out.println("============================================================================================");
        
        String data = reader.readLine();
        int dataNum = 0;
        
        while (data != null) {
            dataNum++;
            
            StringTokenizer strToken = new StringTokenizer(data,",");
            strToken.nextToken();
            System.out.printf("| %2d ", dataNum);
            System.out.printf("|\t%4s  ", strToken.nextToken());
            System.out.printf("|\t%-20s  ", strToken.nextToken());
            System.out.printf("|\t%-20s  ", strToken.nextToken());
            System.out.printf("|\t%s  ", strToken.nextToken());

            System.out.println();
            
            data = reader.readLine();
            
        }
        System.out.println("============================================================================================");
    }

    private boolean getYesNo (String msg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + msg + " (y/n)");

        String userOpt = scanner.next().toLowerCase();

        while (!userOpt.equalsIgnoreCase("y") && !userOpt.equalsIgnoreCase("n")) {
            System.err.println("Pilihan Anda bukan y atau n");
            System.out.println("\n" + msg + " (y/n)?");
            userOpt = scanner.next();
        }

        return userOpt.equalsIgnoreCase("y");
    }

    private void findData() {

    }

    private void addData (String year, String author, String publisher, String title) throws IOException{

        FileReader fileInput = new FileReader("database.txt");
        BufferedReader reader = new BufferedReader(fileInput);
        BufferedWriter writer = new BufferedWriter(new FileWriter("database.txt"));

        String original = reader.;
        System.out.println(original);
        writer.write(original);

        writer.write(String.format("%s,%s,%s,%s", year, author, publisher, title));

        System.out.println("[INFO] TASK COMPLETED - addData");

    }

    private void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception e) {
            System.err.println("Tidak bisa clear screen\n");
        }
    }
}
