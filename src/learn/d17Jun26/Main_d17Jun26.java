package learn.d17Jun26;

import java.util.Scanner;

public class Main_d17Jun26 {
    public static void main(String[] args) {

        Main_d17Jun26 main = new Main_d17Jun26();
        main.try_2();

    }

    private void try_1() {
        int a = 5;
        int b = 10;

        System.out.println("KALKULATOR SEDERHANA");

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " x " + b + " = " + (a * b));
        System.out.println(a + " : " + b + " = " + (a / b));
    }

    private void try_2() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double firstNum = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Enter the second number: ");
        double secondNum = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("""
                ENTER THE OPERATION METHOD
                1. Addition
                2. Subtraction
                3. Division
                4. Multiplication
                
                YOUR INTENDED OPERATION METHOD: 
                """);
        int type = scanner.nextInt();

        scanner.close();

        switch (type) {
            case 1:
                System.out.println("\nThe result of " + firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
                break;
            case 2:
                System.out.println("\nThe result of " + firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
                break;
            case 3:
                System.out.println("\nThe result of " + firstNum + " : " + secondNum + " = " + (firstNum / secondNum));
                break;
            case 4:
                System.out.println("\nThe result of " + firstNum + " x " + secondNum + " = " + (firstNum * secondNum));
                break;
            default:
                System.out.println("\nERROR!    (!-!)");
                break;
        }




    }
}
