class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        int n=rowIndex;
        for(int i=1;i<=n;i++){
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=0;j<list.size()-1;j++){
                row.add(list.get(j)+list.get(j+1));
            }
            row.add(1);
            list=row;
        }
        return list;
    }
}