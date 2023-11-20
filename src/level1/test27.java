package level1;

import java.util.Arrays;

public class test27 {
    public static void main(String[] args){
        int n = 2;
        int m = 5;
        int a = 0, b=0;
        int[] an = new int[2];
        for(int i = 1; i <= m; i++){
            if(n % i == 0 && m % i == 0){ // 최소공약수
            an[0] = i;
            }
        }
        b = (n * m) / a; // 최대 공배수
        an[0] = a;
        an[1] = b;

        System.out.println(Arrays.toString(an));

    }
}
