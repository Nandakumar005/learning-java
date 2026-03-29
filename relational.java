import java.util.Scanner;
public class relational {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        double a=sc.nextInt();
        if (a>0) {
            System.out.print("It is a positive number");
        } else if (a<0) {
            System.out.print("It is a negative number");
        }else
            System.out.print("zero");
    }
}
