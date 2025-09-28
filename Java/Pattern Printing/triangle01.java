package patternPrinting;

public class triangle01 {
    private int n;
    public void setN(int n){
        this.n=n;
    }
    public void pattern(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j%2!=0){
                    System.out.print("1");
                }
                else System.out.print("0");
            }
            System.out.println();
        }
    }
}
