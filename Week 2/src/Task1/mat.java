package Task1;

import java.sql.SQLOutput;
import java.util.Scanner;
/*把第一行放在最后一列，把第二行放在倒数第二列，依次这样放。
*/
public class mat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入方阵的阶数");
        int n = in.nextInt();
        int a[][] = new int[n][n];
        System.out.println("请输入n阶方阵");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("方阵顺时针旋转90度后结果为");
        for (int j = 0; j < n; j++) {
            for (int i = n - 1; i >= 0; i--) {
                System.out.printf(String.valueOf(a[i][j]));
            }
        }
    }
}

