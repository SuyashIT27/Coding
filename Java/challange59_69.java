import java.util.Scanner;

public class challange59_69 {
    public static void main(String[] args){
        System.out.println("This is from question 59-69");
        //passwordCheaker();
        //numberGussing();
       // multiplicationTabel(5);
        //forPrime(12);
        //intergerArray();
       // occrance();
       // readInput();
       // positiveSum();
        printEven();
    }
    //Q-59 W.A.P using do while loop to find the password cheaker until a vaild password is entered?
    public static void passwordCheaker(){
        String correctPassword="Suyash@java";
        Scanner sc=new Scanner(System.in);
        String givenPassword="";
        do {
            System.out.print("Enter the password:-");
            givenPassword=sc.next();
        }while (!correctPassword.equals(givenPassword));
        System.out.println("Your password is correct Unlocking!");
    }
   //Q-60 Using do while implement nuber guessing game?
    public static void numberGussing(){
        System.out.println("HINT! the number is the year in which legend Suyash was born.");
        int ans=2004;
        int givenAns=0;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.print("Enter the number:- ");
             givenAns=sc.nextInt();
        }while(givenAns!=ans);
        System.out.println("Yes!that's the correct answer.");
    }
    //Q61-W.A.P using for loop for multiplication of a table.
    public static void multiplicationTabel(int num){
        for(int i=1;i<=10;i++){
            int multi=i*num;
            System.out.println(num+"*"+i+"="+multi);
        }
    }
    //Q-62 W.A.P to check if it is prime or not using for loop?
    public static void forPrime(int num){
        boolean result=true;
        for(int i=1;i<num;i++){
             result=num%i==0;
             break;
        }
        if(result){
            System.out.println("The given number"+num+"is prime");
        }
        else System.out.println("The given number "+num+" is not prime");
    }
    //Q-63 W.A.P to find the max. value in an integer array?
    public static void intergerArray(){
        int[] arr={1,400,7,93,86};
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The lagest interger in an array is"+max);

    }
    //Q-64 Using for each loop find the occurences of a specific element in an array?
    public static void occrance(){
        int[] arr={22,86,22,78,22};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to find:- ");
        int num=sc.nextInt();
        int result=0;
        for(int one:arr){
            if (one==num) result++;
        }
        System.out.println("The element "+num+" Occurs "+result+" times.");
    }
    //Q-65 using break take input from the user and break when exit is given by the user.
    public static void readInput(){
        Scanner sc=new Scanner(System.in);
        String Given="";
        do {
            System.out.print("Enter the input you want ");
            Given=sc.next();
            System.out.println("You have given :- "+Given);
        }while(!Given.equals("exit"));
        System.out.println("You come out of the input loop");
    }
 //Q-66 using continue statement give the sum of all the postive number ignore the negative number?
 public static void positiveSum(){
        Scanner sc=new Scanner(System.in);
        int num=0;
        int sum=0;
        String input="";
        do{
            System.out.print("Enter the postive number:- ");
            num=sc.nextInt();
            if(num<0){
                System.out.println("Error:Please enter the positive number. ");
                System.out.println("do you want to exit type exit else press any button.");
                input=sc.next();
                continue;
            }
            else{
                sum+=num;
                System.out.println("do you want to exit type exit else press any button.");
                input=sc.next();
            }
        }while(!input.equals("exit"));
     System.out.println("The sum of the entered number is "+sum);
 }
    //Q-67-using continue statement print only the even number use continue for odd.
    public static void printEven() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int value : arr) {
             if (value%2==0) System.out.print(value+" ");
        }
    }
}
