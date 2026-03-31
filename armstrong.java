import java.util.Scanner;
public class armstrong {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a value:");
        int n=sc.nextInt();
        int real=n;
        int digit=0;
        while(n!=0){
            n=n/10;
            digit++;
        }
        n=real;
        int sum=0;
        while(n!=0){
            int num=n%10;
            int power=1;
            for (int i=0;i<digit;i++){
                power=power*digit;
            }
            sum+=power;
            n=n/10;
        }
        if(sum==real){
            System.out.println("Yes "+real+" is an armstrong number:");
            } else {
                System.out.println("No "+real+" is not an armstrong number:");
            }
        }
    }


