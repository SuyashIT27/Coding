import java.sql.SQLOutput;
import java.util.Scanner;

public class QP28_39 {
    public static void main(String[] args) {
        //multiTable();
        //oddSum();
        //factorial();
        //sumDigit();


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
   Scanner num = new Scanner(System.in);
        System.out.print("Enter the number:-");
        int num1 = num.nextInt();
        if (num1 == 1) {
            System.out.println("Not Prime");
        }
        for (int i = 2; i <= num1; i++) {


            if (num1 % i == 0) {
                System.out.println("It is not prime number.");
                break;
            } else {
                System.out.println("the given number is prime.");
                break;
            }

        }
    }
      //Q-35 w.a.p to reverse the digit of the number?
    public static void reverse() {
        System.out.print("Enter the number to reverse:-");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int reverse = 0;
        while (num1 != 0) {
            int num2 = num1 % 10;
            reverse = reverse * 10 + num2;
            num1 = num1 / 10;
        }
        System.out.println("Reversed number: " + reverse);
    }
     //Q-36 Print a fibonacci series ?
    public static void  fiboSeries(){
        System.out.print("Enter the number:-");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("The sum of fibo. series is "+sum);
    }
   //Q-37 cheack for the armstrong number?
    public static void anstrongNumber(int num){
        int orginal=num;
        int result=0;
       String power=String.valueOf(num); //This convert int ino string.
        int power1=power.length();
        while(num!=0){
            int num1=num%10;
            result+=Math.pow(num1,power1);
            num=num/10;

        }
        if (result==orginal) System.out.println("The given number is amstroung");
        else System.out.println("The given number is not anstroung.");
    }
    //Q-38 Number is palindrome?
    public static void palindrome(int num){
        int orginal=num;
        int rev=0;
        while(num!=0){
            int num1=num%10;
            rev=rev*10;
            rev+=num1;
            num/=10;
        }
       // System.out.println(rev+" "+orginal);
        if(orginal==rev) System.out.println("The number is palindrome");
        else System.out.println("The number is not paildrome.");
    }
}
