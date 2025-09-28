package patternPrinting;

public class invertedHalfPyramid {
    private int n;
    public void setN(int n) {
        this.n = n;
    }
    public void pattern() {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}