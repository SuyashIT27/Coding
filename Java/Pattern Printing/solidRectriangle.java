package patternPrinting;
import java.util.Scanner;
public class solidRectriangle {
    private int n;
    private int m;
    public void  setM(int m){
        this.m=m;
    }
    public void setN(int n){
        this.n=n;
    }
    public int getN(){
        return n;
    }
    public int getM(){
        return m;
    }
    public void pattern(){
        for(int i=1;i<=m;i++){
            System.out.print("\n");
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
        }
    }


}
