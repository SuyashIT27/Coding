import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Unit7 {
    public static void main(String[] args) {
        //7.1 Ternary Operator
        //variable=Expression?Expression1:Expression2
        //ternaryOperation();
        //switchStatement();
        //doWhile();
        //forEach();
        //System.out.println(recursion(5));
        //stringFormat();

    }
    public static void ternaryOperation(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:-");
        int num1=sc.nextInt();
        System.out.print("Enter the second number:-");
        int num2=sc.nextInt();
        int isGreater=num1>num2?num1:num2;
        System.out.print("Greatest number is:-"+isGreater);
    }
    public static void switchStatement(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to cheak for the week:-");
        int num=sc.nextInt();
        switch (num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter the number between 1-7");
                break;
                //if breeak is not use then that condition is called fall through condition.
        }
    }
//Introduction of enhanced switch in java 12.
    public static void enhancedSwitch(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to cheak week");
        int num=sc.nextInt();
        String output =switch (num){
            case 1->"Monday";
            case 2->"Tuesday";
            case 3->"Wednesday";
            case 4->"Thursday";
            case 5->"Friday";
            case 6->"Saturday";
            case 7->"Sunday";
            default -> "Enter the number between 1-7.";
        };//use ; here in new switch statement.
    }
    //7.3 Loops(Do-while)
    //in this loop it will run atleast one time even if the condition is not true.
    public static void doWhile(){
       int age;
       do{
           System.out.print("Enter your age:-");
           Scanner sc=new Scanner(System.in);
           age=sc.nextInt();
       } while (age<0||age >100);
        System.out.println("Your age is "+age);
    }
   //7.3 Loop(for)
   //Syntex for(initialisation;condition;update){body of the loop}
    //7.3 Loop(For each)
    public static void forEach(){
        String[] array={"Suyash","Kajal","Mummy","Papa"};
        for(String name:array){
            System.out.println("My favourite person in my life are:-"+name);
        }
    }
    //Recursion means calling itself again and again.
    public static long recursion(int num){
        if(num==1){
            return 1;
        }
       long b= num*recursion(num-1);
        return b;
    }
 /*   Maths Function.
    Key Methods:
    1 abs(): Absolute value.

    2 ceil(): Rounds up.

    3 floor(): Rounds down.

    4 round(): Rounds to nearest integer.

    5 max(), min(): Maximum and minimum of two numbers.

    6 pow(): Power calculation.

    7 sqrt(): Square root.

    8  random(): Random number generation.

    9 exp(), log(): Exponential and logarithmic functions.

    10 Trigonometric functions: sin(), cos(), tan()*/


    //String Format:-
    /*println use + to add stirng this leads to waste of the memory.
    To avoid this printf is used which use %d,s,f and then , var. name.*/
    public static void stringFormat(){
       String a="Suyash";
       int marks=450;
       String subject="Java";
       //using println
        System.out.println("Hello "+a+" your marks in "+subject+" is "+marks+" out of 500.");
       //Using printf
       System.out.printf("Hello %s your marks in %s is %d out of 500.",a,subject,marks);
    }
    /*7.11 Final Keyword :- When applied to a variable, it becomes a constant,it can not be changed.
     The convention for the final keyword is all capital.
    Ex-
    final double PI=3.1416;
    PI=54.58;
        System.out.println(PI);
        This gives error :-java: cannot assign a value to final variable PI*/

}
