public class varagars {
    public static void main(String[] args) {
   sum(5,6,8,3,1,7);
    }
    //Using varArgs Syntex data type... variable name
    public static  void sum(int... a){
        int sum=0;
        for (int i : a) {
           sum=sum+i;
        }
        System.out.println(sum);
    }
}
