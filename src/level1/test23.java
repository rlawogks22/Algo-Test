package level1;

public class test23 {// 부족한돈 계산

    public static void main(String[] args) {
        int pr = 3;
        int mo = 20;
        int co = 4;
        long an = 0;
            for (int i = 1; i <= co; i++) {
                an += i * pr;
            }
            an = (an < mo) ? 0 : (an - mo);
//        if(an < mo){
//            an = 0;
//        } else {
//            an -= mo;
//        }
        System.out.println(an);

    }

}
