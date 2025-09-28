
import java.util.Scanner;

public class arrayaddition {
    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:-");
        int row=sc.nextInt();
        System.out.println("Enter the number  of columns");
        int cols=sc.nextInt();
        // 2d array
        int sum[][]=new int[row] [cols];
        int data[][]=new int[row][cols];
        int data1[][]=new int[row][cols];

        //Enter the element
        System.out.println("Enter the matrix data");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                data[i][j]=sc.nextInt();
            }
        }
        //print of the matrix
        System.out.println("Your matrix 1 is:-");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(data[i][j]+"\t");
            }
            System.out.println();
        }

        //Enter the element
        System.out.println("Enter the matrix data os second matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                data1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Your matrix 2 is:-");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(data1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("The sum of these two matrix is:-");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                sum[i][j]=data[i][j]+data1[i][j];
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }






    }
}
