package patternPrinting;

public class hollowRectriangle {
 private int n;
 private int m;
 public void setN(int n){
     this.n=n;
 }
 public void setM(int m){
     this.m=m;
 }
 public int getN(){
     return n;
 }
 public int getM(){
     return m;
 }
public void pattern(){
     for(int i=1;i<=n;i++){
         for(int j=1;j<=m;j++){
             if(i==1||i==n||j==1||j==m){
                 System.out.print("*");
             }
             else{
                 System.out.print(" ");
             }
         }
         System.out.println("\n");
     }
}
}

