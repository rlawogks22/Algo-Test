package level2;

import java.util.Arrays;

public class test2 { // 숫자 문자열과 영단어
    public static void main(String[] args) {
        String s = "one4seveneight";
        int answer = 0;
        String[] sarr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++) {
            s = s.replace(sarr[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        System.out.println(answer);
    }
}
