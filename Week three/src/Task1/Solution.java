package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//*1.三数之和：给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a， b，c ，使得 a + b + c =target。请你找出所有满足条件且不重复的三元组。
//        注意：答案中不可以包含重复的三元组。
//public List<List<Integer>> threeSum(int[] nums,int target) { }
public class Solution {
    public List<List<Integer>> threeSum(int[] nums, int target) {//在网上搜索了相关方法
        Arrays.sort(nums);//先排序
        int n = nums.length;
        List<List<Integer>> R = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] > 0 ) {//排序后，若开始就大于0，后面就一定不可能等于0，于是退出循环。
                break;
            }
            if(nums[i]==nums[i-1]){//如果有重复 则越过该数据继续循环
                continue;
            }
            int l = i + 1;//从头开始指向下标
            int r = n - 1;//从末尾开始
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] ==target ) {
                    List<Integer> t = new ArrayList<>();
                    t.add(nums[i]);
                    t.add(nums[l]);
                    t.add(nums[r]);
                    R.add(t);//满足条件的则add在返回结果上
                    while (l < r && nums[l] == nums[l + 1]) {//越过重复的数据下标移动
                        l++;
                    }
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    l++;
                    r--;
                } else if (nums[i] + nums[l] + nums[r] > target) {//如果大了，大的数对应的下标向前移动
                    r--;
                } else {//如果小了，小的数对应的下标向后移
                    l++;
                }
            }
        }
        return R;
    }

}
