/*Steps to make any function lambda expression
1. Remove modifier
2. Remove return type
3. Remove method name
4. Place arrow*/
public class LambdaFunction {
    public static void main(String[] args) {
        //lambda function
        Runnable s=()->{
            System.out.println("Hello how are you");
        };
        s.run();
        // we not need to add the return keyword
//        Runnable b=(str)->{str.length();};

    }
    //normal function
    private static void hello(){
        System.out.println("hello how are you");
    }


}
