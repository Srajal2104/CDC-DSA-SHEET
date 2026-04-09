class Solution {
    public List<String> letterCombinations(String digits) {
        String letters[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res=new ArrayList<>();
        generate(res,letters,digits,new StringBuilder(),0);
        return res;
    }
    public void generate(List<String> res,String letters[],String digits,StringBuilder curr,int n){
        if(n==digits.length()){
            res.add(curr.toString());
            return;
        }
        int r=digits.charAt(n)-'0';
        for(int i=0;i<letters[r].length();i++){
            curr.append(letters[r].charAt(i));
            generate(res,letters,digits,curr,n+1);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}