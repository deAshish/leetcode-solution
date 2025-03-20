class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n= s1.length(), m=s2.length();

        if(n> m) return false;

        //Map to store count of every character in s1 string
        HashMap<Character, Integer> s1Count = new HashMap<>();

        //Map to add count of every character in s2.
        HashMap<Character, Integer> windowCount = new HashMap<>();

        for(int i=0; i< n; i++){
            s1Count.put(s1.charAt(i), s1Count.getOrDefault(s1.charAt(i), 0) +1);
        //Adding every character of s2 till size of s1
            windowCount.put(s2.charAt(i), windowCount.getOrDefault(s2.charAt(i), 0) +1);
        }

        if(windowCount.equals(s1Count)) return true;

        for(int i=n; i< m; i++){
            char addChar = s2.charAt(i);
            char removeChar = s2.charAt(i-n);

            //Add current character to the window
            windowCount.put(addChar, windowCount.getOrDefault(addChar, 0)+1);
            
            //remove character that is left behind window
            if(windowCount.get(removeChar) ==1){
                windowCount.remove(removeChar);
            }else{
                windowCount.put(removeChar, windowCount.getOrDefault(removeChar, 0)-1);
            }

            //compare window with s1 count
            if(windowCount.equals(s1Count)) return true;
        }
        return false;
       
    }
}