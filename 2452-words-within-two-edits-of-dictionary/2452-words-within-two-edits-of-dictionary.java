class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> list=new ArrayList<>();
        for(String q : queries){
            for(String d : dictionary){
                int r=0;
                for(int i=0;i<q.length();i++){
                    if(q.charAt(i)!=d.charAt(i)){
                        r++;
                    }
                    if(r>2){
                        break;
                    }
                }
                if(r<=2){
                    list.add(q);
                    break;
                }
            }
        }
        return list;
    }
}