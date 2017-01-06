package year_2017.january;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by chaoqunshe on 1/5/17.
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int numsSize = nums.length;
        int[] returnNums = new int[2];
        loop:
        for (int i = 0; i <= numsSize - 2; i++) {
            int temp = nums[i];
            for (int j = i + 1; j <= numsSize - 1; j++) {
                if (temp + nums[j] == target) {
                    returnNums = new int[]{i, j};
                    break loop;
                } else {
                    returnNums = new int[]{0, 0};
                }
            }
        }
        return returnNums;
    }
}
