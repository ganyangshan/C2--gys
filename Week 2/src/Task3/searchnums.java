package Task3;

import java.util.Scanner;

public class searchnums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要查找的字符串");
        String str =in.next();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){//判断是否是数字
                System.out.printf("%c",ch);

            }
        }
    }
}
