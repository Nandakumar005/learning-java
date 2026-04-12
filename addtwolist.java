import java.util.*;

class addtwolist {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(2, 4, 3);
        List<Integer> l2 = Arrays.asList(5, 6, 4);
        int num1 = 0, num2 = 0;
        for (int i = l1.size() - 1; i >= 0; i--) {
            num1 = num1 * 10 + l1.get(i);
        }
        for (int i = l2.size() - 1; i >= 0; i--) {
            num2 = num2 * 10 + l2.get(i);
        }
        int sum = num1 + num2;
        List<Integer> result = new ArrayList<>();
        while (sum > 0) {
            result.add(sum % 10);
            sum /= 10;
        }
        System.out.println(result);
    }
}