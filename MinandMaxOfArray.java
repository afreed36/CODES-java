import java.util.*;
public class Test{
    public static void MinandMax(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The minimum value is "+min);
         for(int j=0;j<=arr.length-1;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        System.out.println("The maximum value is "+max);
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        MinandMax(arr);
    }
}
