import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class listadd {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>();
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("how much");

            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                System.out.print("enter the numbers to add:");
                numbers.add(sc.nextInt());
            }
            System.out.println(numbers);



        }

        
    }

}
