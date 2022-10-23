class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res=0,sum=0;
        int i=0,j=0,k=0;
        int[] nums3 = new int[nums1.length+nums2.length];
        while(i<nums1.length || j<nums2.length)
        {
            if(i<nums1.length && j<nums2.length && nums1[i]<=nums2[j])
            {
                nums3[k] = nums1[i];
                k++;
                i++;
            }
            else if(i<nums1.length && j<nums2.length && nums1[i]>=nums2[j])
            {
                nums3[k] = nums2[j];
                k++;
                j++;
            }
            else if(i<nums1.length)
            {
                nums3[k]=nums1[i];
                k++;
                i++;
            }
            else if(j<nums2.length)
            {
                nums3[k]=nums2[j];
                k++;
                j++;
            }
        }
            if(nums3.length%2==0)
                return (double)(nums3[nums3.length/2]+nums3[nums3.length/2-1])/2;
            else
                return nums3[nums3.length/2];
    }
}
