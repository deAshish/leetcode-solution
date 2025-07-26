/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start =0, end = mountainArr.length() -1;
        //Find pick value of the mountainArr
        int pick = findPick(start, end, mountainArr);
        //search target index in first half i.e. increasing of the array and store result
        int result1 = bsAsc(start, pick, mountainArr, target);
        if(result1 != -1) return result1;
        //Search on the second half i.e. decreasing array
        return bsDec(pick+1, end, mountainArr, target);
    }

    static int findPick(int start, int end, MountainArray arr){
        while(start < end){
            int mid = start + (end -start)/2;
            int midVal = arr.get(mid);
            int nextVal = arr.get(mid+1);
        if(midVal > nextVal) end = mid;
        else{
            start = mid +1;
        }
            }
            return start;
    }

    static int bsAsc(int start, int end, MountainArray arr, int target){
        while(start <= end){
            int mid = start + (end - start)/2;
            int midVal = arr.get(mid);
            if(midVal == target) return mid;
            else if(midVal < target) start = mid +1;
            else{
                end = mid -1;
            }
        }
        return -1;
    }

    static int bsDec(int start, int end, MountainArray arr, int target){
        while(start <= end){
            int mid = start + (end - start)/2;
            int midVal = arr.get(mid);
            if(midVal == target) return mid;
            else if(midVal < target) end = mid -1;
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}