package level1;

public class test30 {
    public static void main(String[] args) {
        int[] num = {-2,3,0,2,-5};
        int count = 0;
        int an = 0;

        for(int i = 0; i < num.length; i++){
            for(int j = i+1; j<num.length; j++){
                for (int k = j+1; k<num.length; k++){
                    if(num[i] + num[j] + num[k] == 0){
                        an++;
                    }
                }
            }
        }
        System.out.println(an);

    }
}
