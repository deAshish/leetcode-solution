class Solution {
    public boolean isIsomorphic(String s, String t) {
        //paper=> p,a,p,e,r 
        //title=> t,i,t,l,e  
        if(s.length() != t.length()) return false;
        // char[] array1 = s.toCharArray();?
        // char[] array2 = t.toCharArray();
        boolean flag = true;
        
        HashMap<Character, Character> sTot = new HashMap<>();
        HashMap<Character, Character> tTos = new HashMap<>();
        
        
        for(int i=0; i < s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if(sTot.containsKey(charS)){
                if(sTot.get(charS) != charT)
                    return false;
            }
            else{
                sTot.put(charS, charT);
            }
            if(tTos.containsKey(charT)){
                if(tTos.get(charT) != charS)
                    return false;
            }
            else{
                tTos.put(charT,charS);
            }
            
        
    }
        return true;
    }
    
}