package level1;

public class test18 {
    public static void main(String[] args){//가운데 글자 가져오기
        String s = "abcdef";
        char[] arr = s.toCharArray();
        String an = "";
        for (int i = 0; i < arr.length; i++){
            if(i == arr.length/2){
                an += arr[i];
            }else if(arr.length % 2 == 0 && i == arr.length/2-1) {
                an += arr[i];
            }
        }
        System.out.println(an);
    }
}
