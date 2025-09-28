package patternPrinting;

public class invertedHalfPyramidWithNumber {
    private int n;
    public void setN(int n){
        this.n=n;
    }
    public void pattern(){
        for(int i=n;i>=1;i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
