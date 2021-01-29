import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0,a,b;
        int [] a1=new int[5];//输入数组
        int [] a2=new int[5];//排后的数组
        System.out.println("请输入5个数；");
        for(int i=0;i<5;i++){//录入5个数
            a1[i] =in.nextInt();
        }
        for(int i=0;i<5;i++){
            if(a1[i]!=0){
                a2[i-count]=a1[i];
            }
            else{
                count++;
            }
    }
        for(int i=5-count;i<5;i++){
            a2[i]=0;
        }
        for(int i=0;i<5;i++){
            System.out.println(a2[i]);
        }









    }
}
