package kurachkina.utils;

public class Calculate {
    public int getMax(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int getMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public int getSumOfArrayElements(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public double getEverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
}