package task1;

import java.util.Scanner;

//1.整数反转
//        给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。
//        如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
public class Demo01 {
    public static void main(String[] args) {
        System.out.println("输入");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println("输出"+changenum(num));

    }
    public static int changenum(int n) {
        if (n == 0) {
            return 0;
        }
        int jadge = 0;
        while (n != 0) {
            jadge = jadge * 10 + n % 10;
        }
        return jadge;
    }}
