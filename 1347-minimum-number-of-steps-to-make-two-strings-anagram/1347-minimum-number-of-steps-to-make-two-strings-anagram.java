class Solution {
    public int minSteps(String s, String t) {
        int cnt=0;
        HashMap<Character,Integer> freqs=new HashMap<>();
        HashMap<Character,Integer> freqt=new HashMap<>();
        for(int i=0;i<s.length();i++){
            freqs.put(s.charAt(i),freqs.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i=0;i<t.length();i++){
            freqt.put(t.charAt(i),freqt.getOrDefault(t.charAt(i), 0) + 1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(freqt.get(ch)>freqs.getOrDefault(ch,0)){
                cnt++;
                freqt.put(ch,freqt.get(ch)-1);
            }
        }
        return cnt;
    }
    
}