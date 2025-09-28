package patternPrinting;

public class halfPyramid {
    private int n;
    public void setN(int n){
        this.n=n;
    }
    public void pattern(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
