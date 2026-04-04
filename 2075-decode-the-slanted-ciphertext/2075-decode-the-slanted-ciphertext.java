class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int n=encodedText.length();
        StringBuilder sb=new StringBuilder("");
        if(rows==1){
            return encodedText;
        }
        int col=n/rows;
        for(int i=0;i<col;i++){
           int r=0;
           int c=i;
           while(r<rows && c<col){
               sb.append(encodedText.charAt(r*col+c));
               r++;
               c++;
           }
        }
        return sb.toString().stripTrailing();
    }
}