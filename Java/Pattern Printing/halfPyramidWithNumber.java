package patternPrinting;

public class halfPyramidWithNumber {
    private int n;
    public void setN(int n){
        this.n=n;
    }
    public void patten(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
