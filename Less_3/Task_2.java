package Less_3;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task_2 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(12, 38, 47, 106, 72, 8, 32, 19, 2, 83);
        int min = Collections.min(list);
        int max = Collections.max(list);
        int sum = 0;
        for (Integer num: list) {
            sum += num;
        }
        int avg = sum/list.size();
        System.out.println("min:" + min);
        System.out.println("max:" + max);
        System.out.println("avg:" + avg);
        
    }
}
