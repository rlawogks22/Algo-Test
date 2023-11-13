package level1;

public class test12 {
    public static void main(String[] args){
        String[] seoul;
        seoul = new String[]{"111","Jane", "Kim"};
        String an = "";
        int b = 0;
        System.out.println(seoul.length);

        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                b = i;
                break;
            }
        }
        an = "김서방은 "+ b + "에 있다";
        System.out.println(an);


    }
}
