package Task3;
//第三题：小数转分数
//        编写一个程序，实现将小数转为分数的功能
import java.math.BigDecimal;
import java.util.Scanner;

public class turn {//部分在网上查找得
    public static void main(String[] args) {
        int z,l,b,c;
        double x,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextDouble();
        z=(int)n;//得到整数部分
        BigDecimal p=new BigDecimal(n);//查找得到，精确计算
        BigDecimal q=new BigDecimal(z);
        BigDecimal y=p.subtract(q);
        x=y.setScale(8,   BigDecimal.ROUND_HALF_UP).doubleValue();
        String a=""+x;
        l=a.length()-2;//小数点几位
        b=(int)Math.pow(10,l);//小数部分化为整数
        c=(int)(b*x);
        if(c==0)
            System.out.println(n);
        else if(c==1)
            System.out.println(c+z*b+"\\"+b);
        else if(c!=0)//分子分母化简过程
        {
            for(int i=c;i>1;i--)
            {
                if(b%i==0&&c%i==0)
                {
                    b=b/i;
                    c=c/i;
                    System.out.println(c+z*b+"\\"+b);
                    break;
                }
                else if((b%i!=0||c%i!=0)&&i==2)
                {
                    System.out.println(c+z*b+"\\"+b);
                    break;
                }
                else
                    continue;
            }
        }

    }

}
