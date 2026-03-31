import java.util.Scanner;
public class palindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string or value:");
        String a=sc.nextLine();
        String b="";
        for (int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);
        }
        if(a.equals(b)){
            System.out.print("Yes " +a+ "  is a palindrome:");
        }else{
            System.out.print(a+" It is not a palindrome:");
        }


    }

}
