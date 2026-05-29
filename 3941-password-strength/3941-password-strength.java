class Solution {
    public int passwordStrength(String password) {
        int c=0;
        HashSet<Character> hs=new HashSet<>();
        for(char ch : password.toCharArray()){
            if(hs.contains(ch))   continue;
            else{
                hs.add(ch);
                if(ch>='a' && ch<='z')  c+=1;
                else if(ch>='A' && ch<='Z')  c+=2;
                else if(ch>='0' && ch<='9')  c+=3;
                else  c+=5;
            }
        }
        return c;
    }
}