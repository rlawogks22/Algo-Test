package level1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.stream.IntStream;

public class test15 {
    public static void main(String[] args) {
        String ph = "0103333344444";
        char[] arr = ph.toCharArray();
        String an = "";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 4) {
                an += '*';
            } else {
                an += arr[i];
            }
        }
        System.out.println(an);
    }
}
