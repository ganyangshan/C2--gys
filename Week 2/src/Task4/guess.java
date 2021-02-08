package Task4;

import java.util.Scanner;

public class guess {
    static int an = 100;

    public static int guess(int i) {
        if (i > an) {
            return 1;
        } else if (i < an) {
            return 2;
        } else
            return 3;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("欢迎来到猜数游戏，请输入你猜测的数字:");

        for (; ; ) {
            int i = in.nextInt();
            if (guess(i) == 1) {
                System.out.println("猜的有点大，再猜一次吧！");
            } else if (guess(i) == 2) {
                System.out.println("猜的有点小，再猜一次吧！");
            } else if (guess(i) == 3) {
                System.out.println("恭喜你猜对了！");
                break;
            }
        }
    }
}