/**
 * @Author: liulingzhou
 * @Date: 2021/2/18 21:56
 * @descption
 */
public class Main {
    public static int arrayPairSum(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result += nums[i];
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int nums[] = {1, 4, 3, 2};
        System.out.println(arrayPairSum(nums));
        quickSort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static void quickSort(int[] arr, int low, int high) {
        int start, end, mid;
        start = low;
        end = high;
        mid = arr[start];
        while (start < end) {
            while (start < end && arr[start] < mid) {
                start++;
            }
            while (start < end && arr[end] > mid) {
                end--;
            }
            int i = arr[start];
            arr[start] = arr[end];
            arr[end] = i;
            System.out.println("git测试");
        }
    }
}