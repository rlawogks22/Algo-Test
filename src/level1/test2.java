package level1;

public class test2 {//약수 구하기

    public static void main(String[] args) {
        int n = 5;
        int an = 0;
        if (0 < n && n <= 3000) { // 0 초과 3000이하
            for (int i = 1; i < n+1; i++) {//1부터 n까지(n의 경우 n-1의 값 까지기에 1을 추가)
                if (n % i == 0) { // n 나누기 i 의 나머지가 0인 경우만 true
                    an += i;
                }
            }
            System.out.println(an);
        }
    }
}
