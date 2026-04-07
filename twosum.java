import java.util.Scanner;
import java.util.ArrayList;
public class twosum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the target value: ");
        int a=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.print("enter the array size: ");
        int size = sc.nextInt();
        for(int i = 0; i < size; i++){
            int input = sc.nextInt();
            arr.add(input);
        }
        System.out.print(arr);
        for (int i=0;i<size;i++) {
            for (int j=i+1;j<size;j++){
                if(arr.get(i)+arr.get(j)==a){
                    System.out.println(arr.get(i)+", "+arr.get(j));
                }
            }
        }
        
        
        
        
        
    }

}
