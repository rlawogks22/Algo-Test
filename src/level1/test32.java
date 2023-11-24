package level1;

public class test32 {
    public static void main(String[] args){
        int[][] size = {{60,50},{30,70},{60,30},{80,40}};//w 가로 두면 중 가장 긴 부분, h 세로 두변중 가장 작은 부분
        int an = 0;
        int max_w = 0;
        int max_h = 0;

        for(int i = 0; i<size.length; i++){
            int w = Math.max(size[i][0],size[i][1]); //w 가로 두 변 중 가장 긴 부분
            int h = Math.min(size[i][0],size[i][1]); //h 세로 두 변 중 가장 작은 부분
            max_w = Math.max(max_w,w);
            max_h = Math.max(max_h,h);
        }
        an = max_w*max_h;
        System.out.println(an);
    }
}
