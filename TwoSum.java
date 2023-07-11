class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j])
                    return new int[] { i, j };
            }
        }
        throw new IllegalArgumentException("No two numbers add up to the target sum.");
    }

    public static void main(String[] a) {
        TwoSum obj = new TwoSum();
        int[] nums = { 1, 2, 4, 6, 7, 8 };
        int target = 3;
        int[] result = obj.twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }

    }
}
