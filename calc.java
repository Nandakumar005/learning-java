import java.util.Scanner;
public class calc {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of A:");
        Double a=sc.nextDouble();
        System.out.print("Enter the value of B");
        Double b=sc.nextDouble();
        System.out.println("press 1 for sum:");
        System.out.println("press 2 for sub:");
        System.out.println("press 3 for multiply:");
        System.out.println("press 4 for div");
        System.out.println("press 5 for mod");
        int c=sc.nextInt();
        Double result;
        if (c==1) {
            result=(a+b);
        } else if(c==2) {
            result=(a-b);
        }else if(c==3){
            result=(a*b);
        }else if(c==4){
            result=(a/b);
        }else if(c==5){
            result=(a%b);
        }else{
            System.out.println("Invalid");
            return;
        }
        System.out.println(result);


    }

}
