package com.atguowang.thirdinterview.javabase;

/**
 * @author webstart
 * @time 2020/10/22/11:24
 * @description 力扣第一题，关于两数之和的
 **/


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**1. 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍
 *
 *  给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class LeetcodeFirst {

    public static void main(String[] args) {
        int[] nums = new int[10];
        LeetcodeFirst.twoSumDemo(nums, 9);
//        LeetcodeFirst.twoSumDemo( nums,11);


    }

    public static int[] twoSumDemo(int[] nums, int target) {
        //两数之和
        //1.初始化数

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    //打印
                    System.out.println("当前的目标target的地址是" + i + "和" + j);
                }
            }
        }
        return nums;
    }


    public static int[] twoSumDemoMap(int[] nums, int target) {

        int result[] = new int[2];

        Map<Integer, Integer> data = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            data.put(i, nums[i]);
        }
        //将数据直接temp=>
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (data.containsKey(temp) && data.get(temp) != i) {
                result[0] = data.get(temp);
                result[1] = i;
            }
            data.put(nums[i], i);
        }
        return result;
    }
}













