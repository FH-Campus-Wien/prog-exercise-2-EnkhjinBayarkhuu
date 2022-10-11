package at.ac.fhcampuswien;

//import javax.security.sasl.SaslServer;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        }

    //todo Task 2
    public void stairs(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int zahl = sc.nextInt();
        if (zahl < 0) {
            System.out.println("Invalid number!");
        } else {
        int z = 1;
        for (int i = 1; i<=zahl; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(z+" ");
                z++;
            }
            System.out.println("");
        }
        }
        // help from: https://www.programiz.com/java-programming/examples/pyramid-pattern
    }

    //todo Task 3
    public void printPyramid(){
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
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
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