import java.util.*;
public class largestinarray {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the list size:");
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                System.out.print("enter the numbers:");
                list.add(sc.nextInt());
            }
            int largest=list.get(0);
            for(int i=1;i<n;i++){
                if(list.get(i)>largest){
                    largest=list.get(i);
                }
            }
            System.out.println("largest number in the list is:" + largest);
        }


        }
        
    }


