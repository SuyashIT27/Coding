import java.sql.SQLOutput;
import java.util.Scanner;

public class QP28_39 {
    public static void main(String[] args) {
        //multiTable();
        //oddSum();
        //factorial();
        sumDigit();


    }

    //Q-28 WAP that prints the multiplication table for a given number.
    public static void multiTable() {
        int n = 10;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = input.nextInt();
        System.out.println("Table of" + x + "is");
        for (int i = 1; i <= 10; i++) {
            int mul = i * x;
            System.out.println(x + "*" + i + "=" + mul);
        }
    }

    //Q-29
    public static void oddSum() {
        int sum = 0;
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("the sum of even number from 1 to " + num + "is " + sum);
    }

    //Q-30 calculate the factorial of the given number .
    public static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to find the factorial od a number :-");
        int num = input.nextInt();
        int mul = 1;
        for (int i = num; i > 0; i--) {
            mul = mul * i;
        }
        System.out.println(mul);
    }

    //Q-31 Sum of the digit of number ?
    public static void sumDigit() {
        System.out.println("Enter the digit-");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        while (num > 0) {
            int num2 = num % 10;
            sum = sum + num2;
            num = num / 10;
        }
        System.out.println("The sum of the number is " + sum);
    }

    //Q-32 Least common multiple(LCM)?
    public static void LCM() {


    }
    //Q-33 Greatest common divisor?
    public static void GCD(){

    }
    //Q-34 Prime number ?
    public static void primeNumer(){

    }
}