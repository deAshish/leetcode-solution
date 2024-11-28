class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n= nums.length;
        int count1 = 0, count2 = 0, element1=-1, element2=-1;
        List<Integer> result = new ArrayList<>();
        for(int element: nums){
            if(element == element1){
                count1++;
            }
            else if(element == element2){
                count2++;
            }
            else if(count1 == 0){
                element1 = element;
                count1++;
            }
            else if(count2 == 0){
                element2 = element;
                count2++;
            }
            else{
                count1--;
                count2--;
            }

        }

        count1 = 0;
        count2 = 0;

        for(int element: nums){
            if(element1 == element) count1++;
            if(element2 == element) count2++;
        }

        if(count1 > n/3){
            result.add(element1);
        }
         if(count2 > n/3 && element1 != element2){
            result.add(element2);
        }
        // if(result.size() == 2 && result.get(0) > result.get(1))
        

        return result;
    }
}