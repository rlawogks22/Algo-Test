package level1;

import java.util.Arrays;
import java.util.Scanner;

public class test26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//행
        int b = sc.nextInt();//열


        for(int i = 0; i < b; i++){
            for(int j = 0; j < a; j++){
                System.out.print('*');
                }
            System.out.println();
            }

        }
    }

