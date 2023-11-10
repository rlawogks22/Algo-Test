package level1;

import java.util.Arrays;

public class test5 {
    public static void main(String[] args){
        long n = 12345;
        String st = String.valueOf(n); // 정수 물자열 변환
        int[] arr = new int[st.length()]; // 문자열의 길이만큼 정수 배열을 생성
        for(int i = 0; i < arr.length; i++){
            arr[i] += Integer.parseInt(st.substring(arr.length-i-1,arr.length-i));// 자릿값을 하나씩 빼며 값도 하나씩 빼기
       }
        System.out.println(Arrays.toString(arr));





//        System.out.println(Arrays.toString(arr));
//        System.out.println("========================================================================");
//        for(int i = 1; i < an.length; i++) {
//            an[i] = Integer.parseInt(Arrays.toString(arr));
//            System.out.println(an[i]);
//        }
//        System.out.println(Arrays.toString(arr));
    }
}
