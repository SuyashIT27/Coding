package patternPrinting;

public class floydTriangle {
    private int n;
    public void setN(int n){
        this.n=n;
    }
    public void pattern(){
        int m=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }
    }
}
