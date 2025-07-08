import java.util.*;
public class Test{
    public static boolean IsPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        System.out.println("The prime numbers from "+start+" to "+end);
        for(int i=start;i<=end;i++){
            if(IsPrime(i)){
                System.out.print(" "+i);
            }
        }
    }
}
