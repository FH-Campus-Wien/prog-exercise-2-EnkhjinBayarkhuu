package at.ac.fhcampuswien;


//import javax.security.sasl.SaslServer;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

public class App {

    //todo Task 1
    private static final DecimalFormat dfs= new DecimalFormat ("0.00");
    public void largestNumber() {
        // input your solution here
        Scanner sc = new Scanner(System.in);
        double bigger_num = 0;
        int number = 1;
        double input = 1;

        do {
            System.out.print("Number "+number+": ");
            input = sc.nextDouble();


            if(input>bigger_num)
            {
                bigger_num = input;
            }
            number++;

        } while (input > 0);

        if(bigger_num>0){
            System.out.println("The largest number is " +dfs.format(bigger_num));
        }
        else if (input <= 0){
            System.out.println("No number entered.");
        }
    }

    //todo Task 2
    public void stairs() {
        // input your solution here
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int zahl = sc.nextInt();
        if (zahl < 0) {
            System.out.println("Invalid number!");
        } else {
            int z = 1;
            for (int i = 1; i <= zahl; i++) {
                for (int j = 1; j <= i; j++) {

                    System.out.print(z + " ");
                    z++;
                }
                System.out.println("");
            }
        }
    }

    //todo Task 3
    public void printPyramid() {
        // input your solution here
        int rows = 6, k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print(" ");
            }
            while (k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }

            System.out.println();
        }
        // help from: https://www.programiz.com/java-programming/examples/pyramid-pattern
    }

    //todo Task 4
    public void printRhombus() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        int h = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.next().charAt(0);
        int j;

        if (h % 2 == 1) {
            for (int i = 0; i <= h/2; i++) {
                for (j = i; j < h/2; j++) {
                    System.out.print(" ");
                }
                for (int k = 0 - i; k <= i; k++) {
                    System.out.print((char) (c - Math.abs(k)));
                }
                System.out.println();
            }
            for (int i = h / 2; i > 0; i--) {
                for (j = i; j <= h / 2; j++) {
                    System.out.print(" ");
                }
                for (int k = 0 - 1; k <= i - 1; k++) {
                    if(i == 1)
                    {
                        System.out.print((char) (c - Math.abs(0)));
                        i--;

                    } else {

                        System.out.print((char) (c - Math.abs(k)));
                    }
                }
                System.out.println( );
            }
        }else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 5
    private static final DecimalFormat df= new DecimalFormat ("0.00");
    public void marks(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        int number = 1;
        double input = 1.0;
        double average = 0.000;
        double sum = 0.0;
        int fives = 0;
        do {
            System.out.print("Mark "+number+ ": ");
            input = sc.nextInt();
            if(input > 5) {
                System.out.println("Invalid mark!");
            }
            else {
                sum = sum+input;
                if(input == 5)
                {
                    fives ++;
                    number++;
                }
                else if (input >=1 && input <5)
                {
                    number++;
                }
            }
            }
        while (input > 0);

        if(sum/(number-1) >=0) {
            average = sum/(number-1);

            System.out.println("Average: " + df.format(average));
        }
        else {
            average = 0.00;
            System.out.println("Average: " + df.format(average));
        }

     //   System.out.println("Average: " + df.format(average));
        System.out.println("Negative marks: " + fives);
    }

    //todo Task 6
    public void happyNumbers() {
        // input your solution here
        {
        Scanner scanner = new Scanner(System.in);
        int number, r = 1, num, sum = 0;
        System.out.print("n: ");
        number = scanner.nextInt();
        num = number;
        while (num > 9)
        {
            while (num > 0)
            {
            r = num % 10;
            sum = sum + (r * r);
            num = num / 10;
            }
        num = sum;
        sum = 0;
        }
        if (num == 1) {
            System.out.println("Happy number!");
        } else {
            System.out.println("Sad number!");
        }
    }
    // help from: https://www.efaculty.in/java-programs/happy-number-program-in-java
        // Happy number is a natural number that reaches 1.
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}