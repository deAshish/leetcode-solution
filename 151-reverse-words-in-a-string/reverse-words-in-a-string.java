class Solution {
    public String reverseWords(String s) {

        //trim any extra whitespace
        s=s.trim().replaceAll("\\s+", " ");
        //change string into char array
        char[] charA = s.toCharArray();
        //reverse whole sentence
        reverse(charA, 0, charA.length-1);

        //reverese every word
        int start =0;
        for(int end=0; end<=charA.length; end++){
            if(end == charA.length || charA[end]==' '){
                reverse(charA, start, end-1);
                start = end+1;
            }
        }
        return new String(charA);

    }
    //helper function to reverese a array
    public void reverse(char[] c, int left, int right){
        while(left < right){
            char temp = c[left];
            c[left++] = c[right];
            c[right--]=temp;
        }
    }
}