package level1;

public class test19 {//수박수박수?
    public static void main(String[] args){
        int n = 7;
        String an = "";
        for(int i =0; i < n; i++){
            an += (i%2 == 0) ? "수":"박";
        }
        System.out.println(an);

    }
}
