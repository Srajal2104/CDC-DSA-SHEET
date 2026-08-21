class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0,c=0;
        for(String e : events){
            if(e.equals("W")){
                c++;
            }
            else if(e.equals("WD") || e.equals("NB")){
                score++;
            }
            else{
                score+=Integer.parseInt(e);
            }
            if(c==10)  break;
        }
        return new int[]{score,c};
    }
}