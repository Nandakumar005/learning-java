import java.util.Scanner;
public class refresh {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)) {
            System.out.print("Enter the integer A:");
            int a=sc.nextInt();
            System.out.print("Enter the integer B:");
            int b=sc.nextInt();
            int result=(a+b);
            System.out.println(result);
        }
    }
}
        
    

