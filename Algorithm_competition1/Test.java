package Algorithm_competition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @Author: echo Zhao
 * @Descciption:
 * @Date: Created in 19:25 2020/11/9 0009
 * @Modified By:
 */
public class Test {
    
    //倒三角形
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = a ;i >= 1;i--){
            for (int k = a; k > i ;k--){
                System.out.print(" ");
            }
            for (int j = i+i-1 ;j >= 1 ;j--){
                System.out.print("#");
            }
            for (int l = a ;l > i ;l--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    */
    //韩信点兵
/*
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) !=null){
            String[] strings = str.split(" ");
            int a = Integer.parseInt(strings[0]);
            int b = Integer.parseInt(strings[1]);
            int c = Integer.parseInt(strings[2]);
            boolean istrue = false;
            for (int i = 10 ; i <=100 ;i++){
                if ((i-a) % 3==0 && (i-b) % 5 ==0 && (i-c) % 7 ==0){
                    System.out.println(i);
                    istrue = true;
                    break;
                }

            }
            if (istrue == false){
                System.out.println("No answer");
            }
        }
    }
    */

    //水仙花数
/*
    public static void main(String[] args) {
        int a ;
        int b ;
        int c ;

        for (int i = 100 ; i <= 999;i++){
            int cnt = i;
            a = cnt % 10;
            cnt /=10;
            b = cnt % 10;
            cnt /=10;
            c = cnt % 10;
            if (Math.pow(c,3)+Math.pow(b,3)+Math.pow(a,3) == i){
                System.out.print(i+" ");
            }
        }
    }
*/


    //闰年
    //能被 4 整除的大多是闰年，但能被 100 整除 而不能被 400 整除的年份不是闰年，
    // 如 1900 年是平年，2000 年是闰年。
  /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%4 != 0 || (year%100 ==0 && year/400 != 0)){
            System.out.println(year+"不是闰年");
        }else System.out.println(year+"是闰年");
    }
*/

    //三角形 triangle
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b+c && b < a+c && c < a+b){
            if ((a*a == b*b + c*c) ||(b*b == a*a + c*c ) || (c*c == a*a+b*b)){
                System.out.println("yes");
            }else System.out.println("no");
        }else System.out.println("not a triangle");
    }
 */

    //sin 和 cos
 /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sin = Math.sin(n);
        double cos = Math.cos(n);
        System.out.println(sin+" "+cos);
    }

   */
    //连续和
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1;i <= n;i++){
            sum +=i;
        }
        System.out.println(sum);
    }
    */
    //华氏温度转摄氏温度
 /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);\
        int temp = sc.nextInt();

        double c = (temp-32)*5/9;
        System.out.printf("%.3f",c);
    }

*/
    //avg
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double avg = (a+b+c)/3;
        System.out.printf("%.3f",avg);
    }*/
}
