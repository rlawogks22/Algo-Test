package level1;

public class test3 { // 나머지가 1이 되는 수 찾기
    public static void main(String[] args) {
        int n = 13;
        int an = 0;

        if(3 <= n && n <= 1000000){
            for(int i = 2; i < n; i++){ // 나머지 1을 구하기 위해 2부터 나누기 시작
                if(n % i == 1){ // 나머지가 1이 되는 가장 먼저의 수를 구함
                    an = i;
                    break; // 수가 구해지면 반복을 멈춤
                }
            }
            System.out.println(an);
        }
    }
}
