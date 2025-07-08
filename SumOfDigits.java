import java.util.*;
public class Test{
    public static int SumOfDigits(int n){
        int temp;
        int sum=0;
        while(n!=0){
            temp=n%10;
            sum=sum+temp;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=SumOfDigits(n);
        System.out.println("The Sum of Digits are "+res);
    }
}
