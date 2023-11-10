package level1;

public class test7 {//정수 제곱근 판별
    public static void main(String[] args){
        double n = 3;
        long x = 0;
        double an = 0;
        an = (long) Math.sqrt(n); //sqrt 제곱 값 구하기
        x = (Math.pow(an,2)==n) ? (long) Math.pow(an+1,2) : -1; //삼항연산자 (an,2)제곱의 값이 n과 같을 경우 양의 정수 : 음의 정수
        System.out.println(x);

    }
}
