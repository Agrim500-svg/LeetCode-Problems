class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        String s= Arrays.toString(nums);
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==(char)(digit+'0')){
                cnt++;
            }
        }
        return cnt;
    }
}