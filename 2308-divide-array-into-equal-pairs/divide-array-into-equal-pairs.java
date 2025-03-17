class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        boolean check=false;
        for(int i=0; i< nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        for(int i=0; i< nums.length;i++){
            if((hm.get(nums[i]))% 2 !=0){
                check=false;
                break;
            }
            else{
                check=true;
            }
        }
        return check;
    }
}