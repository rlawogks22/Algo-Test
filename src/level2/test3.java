package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test3 {
    public static void main(String[] args){
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        String[] an = {};
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < strings.length; i++){
            arr.add(""+strings[i].charAt(n)+strings[i]); // strings[i].charAt(n) : 기존 문자열의 n 번째 수 구하는 열
        }
        Collections.sort(arr);
        an = new String[arr.size()];
        for(int i = 0; i<arr.size(); i++){
            an[i] = arr.get(i).substring(1,arr.get(i).length());
        }
        System.out.println(Arrays.toString(an));

    }
}
