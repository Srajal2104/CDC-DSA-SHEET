class Solution {
    public List<Integer> partitionLabels(String s) {
        int n=s.length();
        int last[]=new int[26];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            last[s.charAt(i)-'a']=i;
        }
        int maxLast=0,prevEnd=-1;
        for(int i=0;i<n;i++){
            maxLast=Math.max(maxLast,last[s.charAt(i)-'a']);
            if(i==maxLast){
                list.add(i-prevEnd);
                prevEnd=i;
            }
        }
        return list;
    }
}