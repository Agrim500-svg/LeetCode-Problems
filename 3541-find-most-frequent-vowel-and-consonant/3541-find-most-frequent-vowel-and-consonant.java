class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int mv=0;
        int mc=0;
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch =='u'){
                mv=Math.max(mv,freq[i]);
            }else{
                mc=Math.max(mc,freq[i]);
            }
        }
        return mv+mc;
    }
}