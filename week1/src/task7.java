import java.util.Scanner;

public class task7 {
    public static void A(int[] t, int a, int b, int c, int d) {//加法
        t[0] = a + c;
        t[1] = b + d;
    }
    public static void B(int [] t,int a, int b, int c, int d) {//减法
        t[0] = a - c;
        t[1] = b - d;
    }
    public static void C(int[] t, int a, int b, int c, int d) {//乘法
        t[0] = a * c - b * d;
        t[1] = a * d + b * c;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] t=new int [2];
        t[0]=0;
        t[1]=0;
        System.out.println("请输入运算的实部和虚部");
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        int d= in.nextInt();
        A(t,a,b,c,d);
        if(t[1]>=0) {
            System.out.println(t[0] + "+" + t[1] + "i");
        }
        else{
            System.out.println(t[0] + "-"+(-t[1]) + "i");
        }
        B(t,a,b,c,d);
        if(t[1]>=0) {
            System.out.println(t[0] + "+" + t[1] + "i");
        }
        else{
            System.out.println(t[0] + "-"+(-t[1]) + "i");
        }
        C(t,a,b,c,d);
        if(t[1]>=0) {
            System.out.println(t[0] + "+" + t[1] + "i");
        }
        else{
            System.out.println(t[0] + "-"+(-t[1]) + "i");
        }
    }
}














