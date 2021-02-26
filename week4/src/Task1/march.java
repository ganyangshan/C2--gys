package Task1;
//输入一个原字符串（string）和子串（pattern），要求返回子串在原字符串中首次出现的位置。
//        示例一：
//        输入：abcfgjkl
//        fgj
//        输出：3
//        示例二：
//        输入：helloworldoo
//        worlla
//        输出：-1
public class march {
    private static int[] F;
    public static int March(String A, String B) {
        char[] a = A.toCharArray();//转换为字符串数组
        char[] b = B.toCharArray();
        int n = a.length;
        int m = b.length;

        for(int i = 0; i < n - m + 1; i ++) {
            int j = 0;
            while(j < m && b[j] == a[i + j])//某个字母相同时
                j++;
            if(j == m) {//并且相同的部分与后者相同时返回正确值
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a=March("hellow","llow");
        System.out.println(a);
    }

}
