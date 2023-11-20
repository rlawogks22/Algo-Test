package level1;

public class test28 {
    public static void main(String[] args){
        int n = 45;
        int an = 0;
        String s = "";
        while (n != 0){ // 3진법 변환
            s += n%3;
            n /= 3;
        }
        an = Integer.parseInt(s,3); // str 문자열을 3진법으로 해석

        System.out.println(s);
        System.out.println(an);

    }
}
