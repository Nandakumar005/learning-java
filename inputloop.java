import java.util.Scanner;
public class inputloop {
    public static void main(String[]args){
       try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        while(a!=0) {
           a=sc.nextInt();
        }
        System.out.println(a);
       }

    }

}
