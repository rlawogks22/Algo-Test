package level1;

public class test21 {
    public static void main(String[] args){
        int left = 13;
        int right = 17;
        int count = 1; // 약수의 개수
        int an = 0;
        for (int i = left; i <= right; i++) {
            count = 1;
            for(int j=1; j<=i/2; j++){
                if(i%j == 0)count++;
            }
            if(count % 2 == 0) an +=i;
            else  an -= i;

        }
        System.out.println(an);

    }
}
