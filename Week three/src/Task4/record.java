package Task4;

import java.util.LinkedHashMap;
import java.util.Map;

//4.wordCount（用 hashMap 实现）
//        输入一串由英文单词组成的字符串，现在需要统计出每个英文字母出现的频数。
//        注意：字母区分大小写
public class record {
    public static void main(String[] args) {//网上搜索相关方法！！！！！！！

            String str = "sdfragdafgffffsssaaa";
            getchar(str);
        }

        static void getchar (String str){
            Map<Character, Integer> nU = new LinkedHashMap<Character, Integer>();

            for (char i = 'a'; i <= 'z'; i++) {//遍历小写
                int count = 0;
                String string = str;

                while (string.indexOf(String.valueOf(i)) >= 0) {//遍历字符串
                    string = string.substring(string.indexOf(String.valueOf(i)) + 1);//右移一个
                    count++;
                }
                if (count != 0) {//代表有某个字母
                    nU.put(i, count);//put上字母和对应个数
                }
            }

            for (char i = 'A'; i <= 'Z'; i++) {//遍历大写，方法同上
                int count = 0;
                String string = str;
                while (string.indexOf(String.valueOf(i)) >= 0) {
                    string = string.substring(string.indexOf(String.valueOf(i)) + 1);
                    count++;
                }
                if (count != 0) {
                    nU.put(i, count);
                }
            }
            System.out.println(nU);
        }
    }
