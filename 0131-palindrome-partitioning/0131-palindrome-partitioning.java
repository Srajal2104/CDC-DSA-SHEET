class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> list=new ArrayList<>();
        palindromepartition(0,list,ans,s);
        return ans;
    }

    public boolean palindrome(String s,int left,int right){
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public void palindromepartition(int idx,List<String> list,List<List<String>> ans,String str){
        if(idx==str.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<str.length();i++){
            if(palindrome(str,idx,i)){
                list.add(str.substring(idx,i+1));
                palindromepartition(i+1,list,ans,str);
                list.remove(list.size()-1);
            }
        }
    }
}