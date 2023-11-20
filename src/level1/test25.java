package level1;

import java.util.Arrays;
public class test25 {
    public static void main(String[] args) {
        int[][] arr1 = {{1}, //0 0
                        {2}};//1 0
        int[][] arr2 = {{3},//0 0
                        {4}};//1 0
        int[][] an = {};
        an = arr1;
            for(int i = 0; i < arr1.length; i++){
                for(int j = 0; j<arr1[0].length; j++){
                    an[i][j]  += arr2[i][j];
                }}

            }
        }