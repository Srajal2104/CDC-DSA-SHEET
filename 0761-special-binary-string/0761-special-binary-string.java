class Solution {
    public String makeLargestSpecial(String s) {
        int n=s.length();
        int c=0,j=0;
        List<String> list=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                c++;
            }
            else{
                c--;
            }
            if(c==0){
                list.add('1'+makeLargestSpecial(s.substring(j+1,i))+'0');
                j=i+1;
            }
        }
        Collections.sort(list,Collections.reverseOrder());
        return String.join("",list);
    }
}