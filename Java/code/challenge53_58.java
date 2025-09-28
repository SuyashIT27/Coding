import java.util.Scanner;

public class challenge53_58 {
    public static void main(String[] args){
        //minimum();
        //oddEven();
        //absoluteValue();
       // scoreMeter();
       // month(18);
calculator(45,30,'f');
    }
    //Q-53-W.A.P to find the minimum of two number.
    public static void minimum(){
        System.out.println("Enter the number to check for smallest number. ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:-");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:-");
        int num2=sc.nextInt();
        int minimumNumber=num1<num2?num1:num2;
        System.out.println("The smallest number is:-"+minimumNumber);
    }
//Q-54 W.A.P check for odd or even?
public static void oddEven(){
    System.out.print("Enter the number to test:");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    String test=num%2==0?"Even":"Odd";
    System.out.println("The given number is "+test);
}
//Q-55 W.A.P to calculate a absolute value?
    public static void absoluteValue(){
        System.out.print("Enter the number:-");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<0){
            num=-num;
            System.out.println(num);
        }
        else System.out.println(num);
    }
    //Q-56 W.A.P to make student's score meter.
    public static void scoreMeter(){
        System.out.print("Enter the number:-");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String  meter=num>80?"High":num>=50?"Moderate":"Low";
        System.out.println("The result is "+meter);
    }
    //Q-57 W.A.P TO print the month of the year?
    public static void month(int num){
        switch (num){
            case 1-> System.out.println("January");
            case 2-> System.out.println("Feb.");
            case 3-> System.out.println("March");
            case 4-> System.out.println("April");
            case 5-> System.out.println("May");
            case 6-> System.out.println("June");
            case 7-> System.out.println("July");
            case 8-> System.out.println("August");
            case 9-> System.out.println("september");
            case 10-> System.out.println("Oct");
            case 11-> System.out.println("November");
            case 12-> System.out.println("December");
            default -> System.out.println("Error:Enter the number between 1-12");

        }
    }
    //Q-58 W.A.P to make a calculator using switch?
    public static void calculator(int num1,int num2,char operation ){
        int result=switch (operation){
            case '-' ->num1-num2;//use '' for string
            case '+'->num1+num2;
            case '/'->num1/num2;
            case '*'->num1*num2;
            default -> 91188;
        };
        if (result==91188) System.out.println("Enter the correct operation");
        else System.out.println("The result is "+result);
    }
}
