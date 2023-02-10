class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int b = i + 1; b < nums.length; b++) {
                if (nums[i] + nums[b] == target) {
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = b;
                    return result;
                }
            }
        }
        return null;
    }

        public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices of the two numbers: " + result[0] + ", " + result[1]);
    }
}

