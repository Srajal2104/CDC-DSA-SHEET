class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int n=asteroids.length;
        Arrays.sort(asteroids);
        long c=mass;
        for(int i=0;i<n;i++){
            if(asteroids[i]>c){
                return false;
            }
            c+=asteroids[i];
        }
        return true;
    }
}