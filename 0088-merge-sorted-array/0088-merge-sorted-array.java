class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m, j =0 ; j < n ;j++){
            nums1[i] = (nums2[j]);
            i++;
        }
        
        for(int i=0; i< nums1.length -1; i++){
            for(int j = i+1; j < nums1.length; j++){
                if(nums1[i] > nums1[j]){
                    nums1[i] = nums1[i] + nums1[j];
                    nums1[j] = nums1[i] - nums1[j];
                    nums1[i] = nums1[i] - nums1[j];
                }
            }
        }
        
        
    }
}