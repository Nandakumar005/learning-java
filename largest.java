import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        System.out.print("Enter the value a:");
        double a=sc.nextDouble();
        System.out.print("Enter the value b:");
        double b=sc.nextDouble();
        System.out.print("Enter the value c:");
        double c=sc.nextDouble();
        if(a>b && a>c){
        System.out.print("a is the largest:");
        }else if(b>c && b>a){
        System.out.print("b is the largest:");}
        else
        System.out.print("c is the greatest:");
        }
} 
}
