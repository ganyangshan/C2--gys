package Task3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

//3. 现获取到用户输入的一段字符串（可从键盘录入），例如：aaaabbbcccccdd。请编写程序
//        获取其中无重复的字符组成一个新的字符串，即：abcd。请不要改变字符的输入顺序。
//        提示：可以利用 set 集合的去重
public class abcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入字符串：");
        String s = scanner.nextLine();
        String[] c = s.split("");
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        for (int i = 0; i < c.length; i++) {
            strings.add(c[i]);
        }
        System.out.println(strings);
    }
}
