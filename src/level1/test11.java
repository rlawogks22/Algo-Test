package level1;
//1-1. 입력된 수가 짝수라면 2로 나눕니다.
//1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
//2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
public class test11 {
    public static void main(String[] args) {
        int num = 6;
        int count = 0;
        int an = 0;
            while (true) {
                an += 1;
                if(num == 1){
                    an = 0;
                    break;
                }
                if (num % 2 == 0) {
                    num = num / 2;
                    if (num == 1) {
                        break;
                    }
                } else if(num % 2 == 1) {
                    num = (num * 3) + 1;
                } else if(an > 500){
                    an = -1;
                    break;
                }
            }
            System.out.println(an);

    }
}
