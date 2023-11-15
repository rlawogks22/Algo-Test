package level1;

import java.util.Arrays;

//0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수
// 를 return 하도록 solution 함수를 완성해주세요.
public class test16 {//없는 숫자 더하기
    public static void main(String[] args){
        int[] num = {1,2,3,4,6,7,8,0};
        int an = 0;
        for(int i = 0; i < num.length; i++){
            an += num[i];
            }
        an = 45 - an;
        System.out.println(an);
        }
    }

