class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        int carry = 0;
        List<Integer> result = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {
            int digit = (k % 10) + num[i] + carry;
            carry = digit / 10;
            result.add(0, digit % 10);
            k /= 10;
        }

        while (k > 0) {
            int digit = (k % 10) + carry;
            carry = digit / 10;
            result.add(0, digit % 10);
            k /= 10;
        }

        if (carry > 0) {
            result.add(0, carry);
        }

        return result;
    }
}