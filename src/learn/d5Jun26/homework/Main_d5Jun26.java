package learn.d5Jun26.homework;


public class Main_d5Jun26 {
    public static void main(String[] args) {
          
    }

    private void no_6() {
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

    private static void no_2_1() {

        int i = 0;

        while (i <= 5) {
            System.out.println(i);
            i ++;
        }
    }

    private static void no_2_2() {

        int i = 6;

        do {
            System.out.println(i);
            i ++;
        } while(i <= 5);

    }
}



