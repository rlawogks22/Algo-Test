package level1;

import java.util.Arrays;
import java.util.Collections;

public class test22 {
    public static void main(String[] args){
        String s = "Zbcdefg";
        String an = "";
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());//로꾸커 정렬
        for (String a : arr) {
            an += a;
        }
        System.out.println(an);
    }
}
