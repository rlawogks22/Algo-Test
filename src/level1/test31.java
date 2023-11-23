package level1;

import java.util.Arrays;

public class test31 {
    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";
        int an = 0;


        int a = p.length();
        long b = Long.parseLong(p);

        for(int i = 0; i < t.length() - a +1; i++){
            long c = Long.parseLong(t.substring(i, i + a));
            if(c <= b) an++;
        }
        System.out.println(an);
    }
}

