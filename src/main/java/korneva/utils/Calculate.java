package korneva.utils;

public class Calculate {
    static void main() {
        int[] nums = {18, 25, 100, 0, 99, -5, -25};
        System.out.println(getMax(nums));
        System.out.println(getMin(nums));
        System.out.println(getSumOfArrayElements(nums));
        System.out.println(getEverage(15, 25, 15));
    }

    public static int getMax(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int getMin(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public static int getSumOfArrayElements(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static double getEverage(int a, int b, int c) {
        return (a + b + c) / 3;
    }
}
