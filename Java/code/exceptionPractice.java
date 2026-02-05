import java.util.Scanner;

public class exceptionPractice {
    public static void main(String[] args) {
           try{division();}catch(ArithmeticException e){
               System.out.println("Cannot divide by zero");
        };
        }
        public static void division() throws ArithmeticException{
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter two number");
            int a=sc.nextInt(), b=sc.nextInt();
            if (b==0){
                throw new  ArithmeticException("Cannot divide by zero.");
            }else{
                System.out.println(a/b);
            }
        }
    }


