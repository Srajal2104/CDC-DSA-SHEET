class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        int freq[]=new int[10];
        int c=0;
        for(int d : digits){
            freq[d]++;
        }
        for(int i=1;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<9;k+=2){
                    freq[i]--;
                    freq[j]--;
                    freq[k]--;
                    if(freq[i]>=0 && freq[j]>=0 && freq[k]>=0){
                        c++;
                    }
                    freq[i]++;
                    freq[j]++;
                    freq[k]++;
                }
            }
        }
        return c;
    }
}