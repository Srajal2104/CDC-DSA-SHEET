class Solution {
    public int maxProduct(String[] words) {
        int n=words.length;
        int arr[]=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<words[i].length();j++){
                int index=words[i].charAt(j)-'a';
                arr[i] |= (1<<index);
            }
            for(int j=0;j<i;j++){
                if((arr[i]&arr[j])==0){
                    max=Math.max(max,words[i].length()*words[j].length());
                }
            }
        }
        return max;
    }
}