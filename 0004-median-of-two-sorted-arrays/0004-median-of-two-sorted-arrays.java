class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums3[] = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            nums3[i] = nums1[i];
        }
        for (int j = 0; j < nums2.length; j++) {
            nums3[nums1.length + j] = nums2[j];
        }
        Arrays.sort(nums3);
        int len = nums3.length;
        if (len % 2 == 0) {
            return (double) (nums3[len / 2 - 1] + nums3[len / 2]) / 2;
        } else {
            return (double) nums3[len / 2];
        }
    }
}
