package level1;

public class test20 {//내적
    public static void main(String[] args){
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        int an = 0;

        for(int i = 0; i < a.length; i++){
            an += a[i] * b[i];
        }
        System.out.println(an);


    }
}
