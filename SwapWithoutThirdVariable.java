import java.util.*;
public class Test{
    public static void SwapWithoutThirdVariable(int n,int m){
    System.out.println("intial values are n= "+n+" m= "+m);
    n=n+m;
    m=n-m;
    n=n-m;
    System.out.println("Swapped variables are n= "+n + " and m= "+ m);
    //return;
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    SwapWithoutThirdVariable(n,m);
}
}
