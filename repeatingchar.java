import java.util.Scanner;
public class repeatingchar {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string:");
        String a=sc.nextLine();
        int n=a.length();
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a.charAt(i)==a.charAt(j)){
                    System.out.print(a.charAt(i));
                }
            }
        }


    }

}
