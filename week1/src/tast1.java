import java.util.Scanner;

import static java.lang.System.out;

public class tast1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        out.println("请输入体重（kg)");
        double weight=in.nextDouble();
        out.println("请输入身高（cm)");
        double height=in.nextDouble();
        double BMI = weight/(height*height);
         if (BMI<18.5) {
            out.println("过轻");
        }
        else if (BMI>=18.5&&BMI<25) {
            out.println("正常");
        }
        else if (BMI>=25&&BMI<28) {
            out.println("过胖");
        }
        else if (BMI>=28&&BMI<=32) {
             out.println("肥胖");
         } else {
            out.println("非常肥胖");
        }
    }
}
