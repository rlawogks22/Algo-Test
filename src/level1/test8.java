package level1;

import java.util.Arrays;
import java.util.Comparator;

public class test8 {//정수 내립차순으로 배치하기
    public static void main(String[] args){
        long n = 118372;
        String answer = "";
        String st = String.valueOf(n);
        int[] arr = new int[st.length()];
        for(int i = 0; i < arr.length; i++){
            arr[i] += Integer.parseInt(String.valueOf(st.charAt(i)));// 숫자 문자 배열로 변경
        }
        Integer[] an = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(an, Comparator.reverseOrder()); // 숫자 내림차순으로 정렬
        for(int j = 0; j < an.length; j++){
            answer += an[j]; // 문자열에 더하기
        }
        Long.parseLong(answer); // 문자열 정수로 변경
        System.out.println(answer);
    }
}
