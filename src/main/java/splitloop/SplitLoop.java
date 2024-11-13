package splitloop;

import java.util.ArrayList;
import java.util.Arrays;

public class SplitLoop {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * 2);
            sum += numbers.get(i);
        }
        System.out.println(sum);

    }
}
