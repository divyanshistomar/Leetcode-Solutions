class Solution {
    public int findClosest(int x, int y, int z) {
        int first=Math.abs(z-x);
        int sec=Math.abs(z-y);
        if(first>sec){
            return 2;
        }
        else if(first<sec){
            return 1;
        }
        else{
            return 0;
        }
    }
}