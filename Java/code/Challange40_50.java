import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Challange40_50 {
    public static void main(String[] args) {
        //sumAvrage();
       // occurrences();
        //sorted();
        //deleting();
        //reverse();
//palindrome();
        //mergeArray();
    }
    //Q-40 Sum and average of all element in am array?
    public static void sumAvrage(){
        int[] arr=new int[5];
        arr=new int[]{1,2,3,4,5,6};
        int sum=0;
        int avg=0;
        for(int i=1;i<=5;i++){
            int num=arr[i];
            sum+=num;
        }
    avg=sum/5;
        System.out.println("The sum of the array is:-"+sum);
        System.out.println("The avarage of the array is-"+avg);
    }
    //Q-41 W.A.P to create the number of occurrences of an element in an array.
    public static void occurrences(){
        int count=0;
        System.out.println("Program to find the number of occurrence.");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements want:- ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the element at index"+i+" ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element to check for the occourences:- ");
        int find=sc.nextInt();
        for(int element:arr){
            if (element==find) count++;
        }
        System.out.printf("The element %d occours %d times",find,count);
    }
   //Q-43 W.A.P check if the given array is sorted
    public static void sorted(){
        int[] arr=new int[5];
        arr=new int[]{1,2,3,4,5,6};
        boolean test=true;
        for(int i=0;i<5;i++) {
            if (arr[i] > arr[i + 1]) {
                test = false;
                break;
            }
        }
            if(test) System.out.println("The array is sort.");
            else System.out.println("The array is not sort.");
    }
    //Q-44 return a new array deleting a specific element?
//    public static void deleting(){
//        int[]arr=new int[5];
//        int[] newArray=new int[4];
//        arr=new int[]{11,28,38,4,55};
//        System.out.print("Enter the element you want to delete:-");
//        Scanner sc=new Scanner(System.in);
//        int position=sc.nextInt();
//        int arrayFound=-1;
//        for(int i=0;i<5;i++){
//            if (arr[i]==position){
//                arrayFound=i;
//                break;
//            }
//            if (arrayFound == -1) {
//                System.out.println("Element not found.");
//
//            }
//
//            int j=0;
//            for(int k=0;k<4;k++){
//                if(i==arrayFound) continue;
//                else{
//                    newArray[j++]=arr[k];
//                }
//            }
//        }
//        for(int arr3:newArray){
//            System.out.print(arr3+" ");
//
//        }
//    }
//W.A.P to reverse an array?
    public static void reverse(){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int length=arr.length;
        int[] newArr=new int[length];
        int end=length-1;
        for(int i=0;i<length;i++){
           newArr[i]=arr[end];
           end--;
        }
        System.out.println("New array is" );
        for (int arr1:newArr){
            System.out.print(arr1+" ");
        }
    }
    //Q-46 W.A.P TO check for palindrome or not?
    public static void palindrome(){
        int[] arr={1,2,3,3,2,2};
        int start=0;
        int end=arr.length-1;
        boolean result=true;
        while(start<end){
            if(arr[start]!=arr[end]) {result=false;
                ; break;}
            start ++;
            end --;
        }
        if (result){
            System.out.println("The given array is palindrome");
        }
        else System.out.println("The given array is not palindrome.");
    }
//Q-47 W.A.P to merge to sorted array?
   /* public static void mergeArray(){
        int[] arr1={1,5,3,7};
        int[] arr2={2,6,4,8,9};
        int i=0,j=0,k=0;
        while(i<arr1.length||j<arr2.length){
            if(i==arr1.length||arr2[j]]<arr1[i]&&arr[])
        }
    }*/
    }

