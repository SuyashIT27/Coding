import java.util.Scanner;

public class exception1 {
    public static void main(String[] args) {
     try{a();
     }catch (IllegalArgumentException exp){
         System.out.println("Here is the error");
     }

    }
//    public static void division(){
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter numbers");
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        try {
//            System.out.print("The sum of two number is ");
//            int c = a / b;
//        }catch (ArithmeticException exp){
//            System.out.println("Enter the valid number ");
//            System.out.println(exp);
//        }
//// catch(ExceptionType variable);
//// | is used to run either this oe that
//// Catch box is written from more specific to less specific.
//// Throwable contains all the exception
//    }
    public static void  printName(String name)  throws IllegalArgumentException{
            if(name.contains("-")){
                throw new IllegalArgumentException("Name contain-");
            }
            System.out.println(name);
        }
    //example for throw and throws
    public static void a() {
        b("Suyash-verma");
    }
    public static void b(String name) throws IllegalArgumentException{
        if(name.contains("-")){
            throw new IllegalArgumentException("Name contain -");
        }
    }
    }
//throw is a keyword used to explicitly create and throw an exception object inside a method or block.
//throws is a keyword used in a method declaration to inform the caller that the method may pass an exception to it.
//We need to handel the throws exception
//finally will always run


//Custom Exception
// Syntex public class expName extends Exception{};
