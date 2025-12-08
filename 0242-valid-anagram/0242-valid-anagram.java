import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()==t.length()){
            char[] scharArray= s.toCharArray();
            char[] tcharArray=t.toCharArray();
             Arrays.sort(scharArray);
             Arrays.sort(tcharArray);
             boolean result=Arrays.equals(scharArray,tcharArray);
             if(result){
                return true;
             }
             else{
                return false;
             }
        }
        else{
            return false;
        }
        }
 }
