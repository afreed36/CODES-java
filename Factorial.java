import java.util.*;
public class Test{
    public static int Fact(int n){
        if(n==1) return 1;
        else if(n<1) return 0;
        return(n*Fact(n-1));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Fact(n));
    }
}
