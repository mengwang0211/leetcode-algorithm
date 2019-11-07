package io.github.mengwang0211.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution
 */
public class Solution {

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * <p>
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     * <p>
     * 示例:
     * <p>
     * 给定 nums = [2, 7, 11, 15], target = 9
     * <p>
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/two-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param nums   nums
     * @param target target
     * @return the int [ ]
     */
    public int[] twoSum(int[] nums, int target) {
        /**
        *  暴力法
        */
//        int[] index_arr = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target){
//                    index_arr[0] = i;
//                    index_arr[1] = j;
//                }
//            }
//        }
//        return index_arr;

        /**
        *  二次hash表
        */
//        Map<Integer,Integer> map = new HashMap();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i],i);
//        }
//
//        int[] index_arr = new int[2];
//
//        for (int i = 0; i < nums.length; i++) {
//            int tmpDiff = target - nums[i];
//            Integer need = map.get(tmpDiff);
//            if (need != null && need != i){
//                index_arr[0] = need;
//                index_arr[1] = i;
//            }
//        }
//
//        return index_arr;

        /**
        *  一次hash
        */
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    

    /**
     * Main
     *
     * @param args args
     */
    public static void main(String[] args) {
        int[] index_arr = new Solution().twoSum(new int[]{2, 7, 11, 15},18);
        for (int i = 0; i < index_arr.length; i++) {
            System.out.println(index_arr[i]);
        }
    }

}
