import java.util.*;
class Main {
    public static String meth(String s){
       int n=s.length();
        String temp="";
        for(int i=n-1;i>=0;i--){
            temp=temp+s.charAt(i);
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(meth(s));
    }
}
