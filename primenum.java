import java.util.Scanner;
public class primenum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        Boolean isprime=true;
        for (int i=2;i<=n/2;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
    if(isprime){
    System.out.print("is prime");
    }else{
    System.out.print("not prime");
    }
}
}





