public class StringCalculateMaxSum {
    public static int calculateMaxSum(int[] nums) {
        int largest = -100;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                sum += nums[i];
            }
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        if (sum == 0) {
            return largest;
        } else {
            return sum;
        }
    }
}
