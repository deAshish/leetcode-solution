class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = bs(nums, target, true);
        int r = bs(nums, target, false);
        return new int[] {l,r};
    }
       
       static int bs(int[] arr, int target, boolean first){
        int ans = -1;
        int start=0, end = arr.length-1;
        while(start <=end){
            int mid = start + (end -start)/2;
            if(target < arr[mid]) end = mid-1;
            else if(target > arr[mid]) start = mid +1;
            else{
                ans = mid;
                if(first) end = mid -1;
                else start = mid +1;
            }
        }
        return ans;
       }
    
}