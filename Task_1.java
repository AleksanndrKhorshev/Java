import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_1 {
    public static void main(String[] args){
      List<Integer> list = Arrays.asList(1, 3, 4, 6, 7, 8, 3, 1, 2, 3);
      System.out.println("Исходный список:" + list);
      List<Integer> oddList = list.stream().filter(x ->x%2 != 0).collect(Collectors.toList());
      System.out.println("Спсиок без четных чисел:" + oddList);
    }
}
