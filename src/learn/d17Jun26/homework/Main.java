package learn.d17Jun26.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    List<List<Integer>> matrix1 = new ArrayList<>();
    List<List<Integer>> matrix2 = new ArrayList<>();
    List<List<Integer>> matrix3 = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.runner();
    }

    private void runner() {
        write_master();
        calculate(new ArrayList<>(matrix1), new ArrayList<>(matrix2));
        printFinalInfo(matrix1, matrix2, matrix3);
    }

    private void write_master() {
        List<Integer> tempList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // Value objValue = new Value();

        for (int step = 1; step <= 2; step++)
            if (step == 1) {

                System.out.println("MATRIX 1:");

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        System.out.println("ENTER ["+i+"]["+j+"]: ");
                        int temp = scanner.nextInt();
                        scanner.nextLine();

                        tempList.add(j, temp);
                    }

                    matrix1.add(i, new ArrayList<>(tempList));
                    tempList.clear();
                }

            } else if (step == 2) {

                System.out.println("MATRIX 2:");

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        System.out.println("ENTER ["+i+"]["+j+"]: ");
                        int temp = scanner.nextInt();
                        scanner.nextLine();

                        tempList.add(j, temp);
                    }

                    matrix2.add(i, new ArrayList<>(tempList));
                    tempList.clear();
                }

            } else {
                System.out.println("EXIT 1");
            }
        System.out.println("CALCULATING ...");

    }

//    private void writePrintList(int ln, int col, int value) {
//        List<List<String>> printList = new ArrayList<>();
//
//
//    }

    private void calculate(List<List<Integer>> innerMatrix1, List<List<Integer>> innerMatrix2) {
        List<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int result =  innerMatrix1.get(i).get(j) +  innerMatrix2.get(i).get(j);

                tempList.add(j, result);
            }

            matrix3.add(i, new ArrayList<>(tempList));
        }

    }

    private void printIntegerMatrix(List<List<Integer>> currentMatrix) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j ++) {
                String temp = Integer.toString(currentMatrix.get(i).get(j));
                if (j == 0) {
                    System.out.print("| " + temp);
                } else if (j == 1) {
                    System.out.print(" " + temp);
                } else if (j == 2) {
                    System.out.print(" " + temp + " |");
                }
            }
            System.out.print("\n");
        }

    }

    private void printFinalInfo(List<List<Integer>> innerMatrix1, List<List<Integer>> innerMatrix2, List<List<Integer>> innerMatrix3) {

        System.out.println("THE RESULT OF MATRIX 1 + MATRIX 2:");

        System.out.println("\nMATRIX 1:");
        printIntegerMatrix(innerMatrix1);

        System.out.println("\nMATRIX 2:");
        printIntegerMatrix(innerMatrix2);

        System.out.println("\nMATRIX 1 + MATRIX 2:");
        printIntegerMatrix(innerMatrix3);


    }

}

