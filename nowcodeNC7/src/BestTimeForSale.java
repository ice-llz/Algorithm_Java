import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: liulingzhou
 * @Date: 2021/2/19 23:41
 * @descption
 */


public class BestTimeForSale {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m];
        System.arraycopy(nums, 0, nums,0,m);
        int count = 0;
        for (int i = 0; i < nums1.length - 1; i = i + 2) {
            if (nums[count] > nums2[count]) {
                nums1[i] = nums2[count];
                nums1[i + 1] = nums[count];
            } else {
                nums1[i] = nums[count];
                nums1[i + 1] = nums2[count];
            }
            count++;
        }
    }

    public static void main(String[] args) {
        System.out.println(("abdaca"));
    }
}