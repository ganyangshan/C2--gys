import java.util.Scanner;

public class zuoye {
    public static void main(String[] args) {
//        System.out.println("abcd");
        Scanner in = new Scanner(System.in);
          int a = in.nextInt();
          int count=0;
          while (a>10)
          {
              a=a/10;
              count++;
          }
        System.out.println(count+1);
    }
}
