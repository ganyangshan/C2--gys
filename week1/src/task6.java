import money.pp;

import java.util.Scanner;

//6. 编写一个银行账户类，类的构成包括：
//        数据成员：用户的账户名称、用户的账户余额;
//        方法包括：开户（设置账户名称及余额, 利用构造方法完成)；查询余额
public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        pp b = new pp();
        System.out.println("选择开户请按1，选择查询请按2.");
        int a = in.nextInt();
        switch (a){
            case 1: {
                for (int i = 0; b.name[i] != 'a'&&i<19; i++) {//一直录入，直到输入1.。。。。。有点不合实际
                    System.out.println("请输入账户名称");
                    b.name[i] = in.next().charAt(0);
                    System.out.println("存款金额");
                    b.money[i] = in.nextInt();
                }
            }
            case 2:{
                System.out.println("请输入要查找的账户名称");
                b.name[20] = in.next().charAt(0);
                for(int i=0;i<19;i++){
                    if(b.name[20]==b.name[i]){
                        System.out.println("用户名称"+b.name[i]+"余额"+b.money);
                        break;
                    }
                    else{
                        System.out.println("没有此人！");
                        break;
                    }
                }
            }
        }
    }
}