package level1;
//두 정수 사이의 합
public class test10 {
    public static void main(String[] args){
        int a = 5;
        int b = 3;
        long answer = 0;
        if(b > a || b == a){
            for(int i = a; i <= b; i++){
                answer += i;
            }
        } else if(a > b){
            for(int i = b; i <= a; i++){
                answer += i;
            }
        }
        System.out.println(answer);
    }

}
