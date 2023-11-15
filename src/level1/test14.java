package level1;

public class test14 {
    public static void main(String[] args) {
        int an = 0;
        int[] ab = {4, 7, 12};
        boolean[] si = {true, false, true};

        for (int i = 0; i < si.length; i++) {
            if (si[i] == true) {
                an += ab[i];
            } else {
                an -= ab[i];
            }
        }
        System.out.println(an);
    }
}
