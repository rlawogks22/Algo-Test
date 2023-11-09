package level1;

import java.util.Arrays;

public class test4 { // x만큼 간격이 있는 n개의 숫자
    //함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
    public static void main(String[] args){
        int x = 2;
        int n = 5;
        int a = 0;
        long[] an = new long[n]; // n개의 리스트 생성
        for(int i = 0; i < n; i++){ //n 개 만큼 증가
            a += x; // a 에 n개 만큼 x를 더함
            an[i] = a; // a를 리스트에 더함
            System.out.println(an[i]);
        }
        }

    }
