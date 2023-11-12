package level1;
/*양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고,
 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.*/
public class test9 { // 하샤드 수
    public static void main(String[] args){
     int x = 12;
     int a = 0;
     boolean an;
     String st = String.valueOf(x);
     int[] y = new int[st.length()];
     for(int i = 0; i<y.length; i++){
         y[i] +=  Integer.parseInt(String.valueOf(st.charAt(i))); // 숫자 배열로 만들기
         a += y[i]; // 각각의 자릿수 더하기
        }
        an = (x % a == 0) ? true : false; //삼항연산자로 x 나누기 x자릿수 합의 나누어지는지 확인
        System.out.println(an);
    }
}
