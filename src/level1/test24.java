package level1;

public class test24 {//문자열 다루기 기본

    public static void main(String[] args) {
        String s = "a2314";
        boolean an = true;
        if (s.length() <= 8 && s.length() >= 1) {
            if (s.length() == 4 || s.length() == 6) {
                try {
                    Integer.parseInt(s); // 문자열을 숫자로 변환 가능 하면 true
                    an = true;
                } catch (NumberFormatException ex){
                    an = false; // 불가하면 falase 예외처리로 돌아가게 만듬
                }
            } else {
                {
                    an = false;
                }
            }
            System.out.println(an);
        }
    }
}

