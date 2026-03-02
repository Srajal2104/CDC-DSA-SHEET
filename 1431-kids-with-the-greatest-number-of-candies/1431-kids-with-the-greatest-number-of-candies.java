class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        List<Boolean> list=new ArrayList<>(n);
        int max=0;
        for(int candy : candies){
            max=Math.max(max,candy);
        }
        for(int candy : candies){
            list.add(candy+extraCandies>=max);
        }
        return list;
    }
}