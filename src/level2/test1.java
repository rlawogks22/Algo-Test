package level2;

public class test1 {
    public static void main(String[] args){ // 시저암호
        String s = "AB";
        int n = 1;
        String answer = "";
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isLowerCase(ch)){
                ch = (char) ((ch - 'a' + n) % 26 +'a'); //소문자
            }else if(Character.isUpperCase(ch)){
                ch = (char) ((ch - 'A' + n) % 26 +'A'); // 대문자
            }
            answer += ch;
        }
        System.out.println(answer);

    }
}
