package level1;

import java.util.Arrays;
import java.util.Map;

public class test17 {
    public static void main(String[] args){
        int[] arr = {10};

        int min = arr[0];
        int[] answer = new int[arr.length-1];
        if(arr.length == 1){
            answer = new int[]{-1};
        }

        for(int i = 0; i < arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        int index = 0;
        for(int j = 0; j < arr.length; j++) {
                if (arr[j] == min) {
                    continue;
                }
                answer[index++] = arr[j];

        }
        System.out.println(min);
        System.out.println(Arrays.toString(answer));
    }
}
