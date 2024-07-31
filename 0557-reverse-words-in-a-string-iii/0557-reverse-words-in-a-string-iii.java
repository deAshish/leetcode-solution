class Solution {
    public String reverseWords(String s) {
        //Converting sentence into string array
        String[] strArray = null;
        strArray = s.split(" ");
        
        for(int i=0; i<strArray.length;i++){
            //Calling reverse function to reverse each string from string array
           String string = reverseStr(strArray[i]);
            strArray[i]= string;
        }
        return String.join(" ", strArray);
    }
    
    // Function to reverse string
    public static String reverseStr(String string){
        char[] charArray = string.toCharArray();
        int left= 0;
        int right = string.length()-1;
        
        // Looping through array of character to reverse it
        while(left < right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++; right--;
        }
        return String.valueOf(charArray);
    }
}