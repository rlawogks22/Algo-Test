package level1;

import java.util.Arrays;

public class test29 {
    public static void main(String[] args) {
        String s = "try hello world";
        String answer = "";
        String[] sarr = s.split("");
        int a = 0;

        for(String ss : sarr){
            a = ss.contains(" ") ? 0 : a +1;
            answer += a%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        System.out.println(answer);
    }

}

