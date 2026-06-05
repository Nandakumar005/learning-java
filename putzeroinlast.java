import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class putzeroinlast {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(
           Arrays.asList(10,34,0,50,0,3));
        
        int count=0;
        while(list.remove(Integer.valueOf(0))){
            count++;
        }
        for(int i=0;i<count;i++){
            list.add(0);
        }
        System.out.println(list);

        
        
    }

}
