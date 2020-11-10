package Algorithm_competition2;

import java.awt.image.AffineTransformOp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @Author: echo Zhao
 * @Descciption:
 * @Date: Created in 16:39 2020/11/10 0010
 * @Modified By:
 */
public class Test {

    
    //排列
/*
   *//* 用1，2，3，…，9组成3个三位数abc，def和ghi，每个数字恰好使用一次，要
    求abc：def：ghi＝1：2：3。按照“abc def ghi”的格式输出所有解，每行一个解。*//*
    public static void main(String[] args) {
        for (int abc = 123;abc <= 333;abc++){
            int def = 2*abc;
            int ghi = 3*abc;
            result(abc,def,ghi);
        }
    }

    public static void result(int a, int b,int c){
        int[] arr = new int[9];
        int[] k = new int[3];
        k[0]= a;
        k[1] = b;
        k[2] = c;
        int sum = 0;
        int mul = 1;
        int m = 0;
        for (int i = 0;i < arr.length; i++){
            arr[i] = k[m]%10;
            k[m] = k[m] / 10;
            if (k[m] == 0){
                m++;
            }
        }

        for (int i = 0 ;i < arr.length; i++){
            sum += arr[i];
            mul *= arr[i];
        }

        if (sum == 45 && mul== 362880){
            System.out.println(a+" "+b+" "+c);
        }
    }

    */
    //分数化小数
    /*输入正整数a，b，c，输出a/b的小数形式，精确到小数点后c位。a，b≤10 6 ，c≤100。输
    入包含多组数据，结束标记为a＝b＝c＝0。*/
/*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] str = br.readLine().split(" ");
            if (Integer.parseInt(str[0]) == 0 && Integer.parseInt(str[1]) == 0 && Integer.parseInt(str[2]) == 0) {
                return;
            }

            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int c = Integer.parseInt(str[2]);
            double cnt = (double) a/b;
            String s = "%."+c+"f";
            System.out.printf(s,cnt);
        }
    }

*/

    //子序列的和
/*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] str = br.readLine().split(" ");
            if (Integer.parseInt(str[0])==0 && Integer.parseInt(str[1])==0){
                return;
            }
            long a = Integer.parseInt(str[0]);
            long b = Integer.parseInt(str[1]);
            double sum = 0;
            for (long i = a; i <= b ;i++){
                sum += (double) 1/(i*i);
            }
            System.out.printf("%.5f\n",sum);
        }
    }*/
}
