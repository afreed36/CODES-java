import java.util.*;
class Main {
    public static boolean IsPrime(int n){
      if(n<=1)
        return false;
      for(int i=2;i<=Math.sqrt(n);i++){
          if(n%i==0)
            return false;
      }
      return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(IsPrime(n)){
            System.out.println(n+" "+"is Prime");
    }
    else{
        System.out.println(n+" "+"is not a Prime");
    }
}
}
