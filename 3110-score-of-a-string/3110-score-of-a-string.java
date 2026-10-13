class Solution {
    public int scoreOfString(String s) {
        int score=0;
        int i=0;
        int j=1;
        while(j<s.length()){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            int as1=ch1;
            int as2=ch2;
            int diff=as1-as2;
            score+=Math.abs(diff);
            i++;
            j++;
        }
        return score;
    }
}