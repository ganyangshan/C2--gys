package Task5;
//数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没
//        有，返回-1。
//        示例一：
//        输入：[1,2,5,9,5,9,5,5,5]
//        输出：5
public class znum {
    private static int findnum(int[]arr){
        int answer = 0; // 出现次数超过一半的数；
        int count = 0; // 只要最终count > 0，那么对应的findNum就是出现次数超过一半的数；

        for (int i = 0; i < arr.length; i++)
        {
            if (count == 0) // count为0时，表示当前的findNum需要重选；
            {
                answer = arr[i];
                count = 1;
            }
            else
            {
                if (answer == arr[i])
                    count++;
                else
                    count--;//若
            }
        }
        if(count<0){
            return -1;
        }
        else {
            return answer;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,9,5,9,5,5,5};
        System.out.println("数组中主要元素是"+findnum(arr));
    }
}
