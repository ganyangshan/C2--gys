package task2;

import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        System.out.println("请输入要爬的梯数");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(getanwer(n));
    }
    public static int getanwer(int n){
        if(n==1){
            return  1;
        }
        if (n==2){
            return  2;
        }
        int arr[] = new int[100];
        arr[1]=1;
        arr[2]=2;
        for (int i = 3; i <=n ; i++) {//当N>3时，最后一项等于前两项的和。由前几项找规律易得
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}
