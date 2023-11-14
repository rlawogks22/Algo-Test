package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class test13 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 9, 7, 10};
        int divisor = 5;
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0)
                list.add(arr[i]);
        }

        if(list.size() == 0){
            answer = new int[]{-1};
        }else{
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            Arrays.sort(answer);
        }
        System.out.println(Arrays.toString(answer));
    }
}
