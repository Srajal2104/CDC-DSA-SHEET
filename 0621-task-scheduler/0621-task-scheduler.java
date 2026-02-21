class Solution {
    public int leastInterval(char[] tasks, int n) {
        int t=tasks.length;
        int freq[]=new int[26];
        for(char task : tasks){
            freq[task-'A']++;
        }
        Arrays.sort(freq);
        int c=freq[25]-1;
        int j=c*n;             // j=no. of gaps
        for(int i=24;i>=0;i--){
            j-=Math.min(c,freq[i]);
        }
        return j<0 ? t : t+j;
    }
}