import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sumarray = new int[nums1.length+nums2.length];
        int i=0;
        while(i < nums1.length) {
           
          sumarray[i] = nums1[i];
           i++;
        }
        for(int a=0; a<nums2.length; a++) {
            sumarray[a+i] = nums2[a]; 
        }
        Arrays.sort(sumarray);
        for(int sum : sumarray) {
        }

          
        if (sumarray.length%2 == 1) {
            int middle = sumarray.length/2;
            return sumarray[middle];
        }
        else {
            int middle1 = sumarray.length/2-1;
            int middle2 = middle1+1;

            double newsum = sumarray[middle1] + sumarray[middle2];

            return newsum/2;
        }

    }
    public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums1 = new int[]{1, 3, 5, 7};
    int[] nums2 = new int[]{2, 4, 6, 8};
    double median = solution.findMedianSortedArrays(nums1, nums2);
    System.out.println("Median: " + median);
}

}