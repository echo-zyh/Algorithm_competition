package Algorithm_competition3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: echo Zhao
 * @Descciption:
 * @Date: Created in 9:44 2020/11/11 0011
 * @Modified By:
 */
public class Test {
/*    开灯问题。有n盏灯，编号为1～n。第1个人把所有灯打开，第2个人按下所有编号为2
    的倍数的开关（这些灯将被关掉），第3个人按下所有编号为3的倍数的开关（其中关掉的灯
    将被打开，开着的灯将被关闭），依此类推。一共有k个人，问最后有哪些灯开着？输
    入n和k，输出开着的灯的编号。k≤n≤1000。*/
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int[] arr = new int[1010];
    Arrays.fill(arr,0);

    for (int i = 1 ;i <= b;i++){
        for (int j = 1;j <= a;j++){
            if ((j % i ==0) && arr[j]==0){
                arr[j] = 1;
            }else if (j % i ==0 && arr[j]==1){
                arr[j] = 0;
            }
        }
    }

    for (int j = 1; j <= a ;j++){
        if (arr[j] == 1){
            System.out.println(j);
        }
    }
}
}
