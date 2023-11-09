package level1;

//정수 자릿수 더하기
public class test1 {
    public static void main(String[] args) {
        int n = 123;
        int an = 0 ;
        String st = String.valueOf(n); // 정수 물자열 변환
        for(int i = 0; i < st.length(); i++){
            an += Integer.parseInt(String.valueOf(st.charAt(i))); // 물자열을 정수로 변환해 한단어 씩 더하기
        }
        System.out.println(an);

    }
}


