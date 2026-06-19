package learn.d17Jun26.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    List<List<Integer>> matrix1 = new ArrayList<>();
    List<List<Integer>> matrix2 = new ArrayList<>();
    List<List<Integer>> matrix3 = new ArrayList<>();

    List<List<String>> guideMatrix = new ArrayList<>(List.of(
            new ArrayList<>(List.of("x", "x", "x")),
            new ArrayList<>(List.of("x", "x", "x")),
            new ArrayList<>(List.of("x", "x", "x"))
    ));

    public static void main(String[] args) {
        Main main = new Main();
        main.runner();
    }

    private void runner() {
        writeMasterNew();
        calculate(new ArrayList<>(matrix1), new ArrayList<>(matrix2));
        printFinalInfo(matrix1, matrix2, matrix3);
    }

    private void write_master() {
        List<Integer> tempList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // Value objValue = new Value();

        for (int step = 1; step <= 2; step++) {
            if (step == 1) {

                System.out.println("MATRIX 1:");

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        System.out.println("ENTER [" + i + "][" + j + "]: ");
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

                        System.out.println("ENTER [" + i + "][" + j + "]: ");
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
        }
        System.out.println("CALCULATING ...");

    }

    private void writeMasterNew() {

        List<Integer> tempList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int step = 1; step <= 2; step++) {


            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    if (step == 1) {
                        System.out.println("===============\nMATRIX 1:");
                    } else {
                        System.out.println("===============\nMATRIX 2:");
                    }

                    printGuideMatrix(i, j);

                    System.out.println("""
                            The current spot is marked with 'o'
                            """);

                    System.out.println("ENTER THE VALUE ON CURRENT SPOT: ");
                    int temp = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("CURRENT VALUES OF THE CURRENT MATRIX:");
                    forGuideMatrixValues(i, j, temp);

                    tempList.add(j, temp);
                }

                if (step == 1) {
                    matrix1.add(i, new ArrayList<>(tempList));
                } else {
                    matrix2.add(i, new ArrayList<>(tempList));
                }

                tempList.clear();
            }
            resetTempGuideMatrix();
            System.out.println();
        }

        System.out.println("CALCULATING...");

    }

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

    private void printGuideMatrix(int idx1, int idx2) {

        List<List<String>> tempguideMatrix = new ArrayList<>(guideMatrix);

        tempguideMatrix.get(idx1).set(idx2, "o");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j ++) {
                String temp = tempguideMatrix.get(i).get(j);
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

        tempguideMatrix.get(idx1).set(idx2, "x");
    }

    private void forGuideMatrixValues(int idx1, int idx2, int newValue) {

        List<List<String>> tempguideMatrix = new ArrayList<>(guideMatrix);

        tempguideMatrix.get(idx1).set(idx2, Integer.toString(newValue));

        System.out.print("\n");
    }

    private void resetTempGuideMatrix() {

        List<List<String>> tempGuideMatrix = new ArrayList<>(guideMatrix);
        

    }


}



