class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            int pos = 'z'-ch+1;
            int indx = i+1;
            sum+=indx*pos;
        }
        return sum;
    }
}