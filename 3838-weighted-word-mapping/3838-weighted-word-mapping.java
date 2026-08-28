class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        HashMap<Character,Integer> weigh=new HashMap<>();
        for(int i=0;i<weights.length;i++){
            weigh.put((char)('a'+i),weights[i]);
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<words.length;i++){
            int sum=0;
            for(int j=0;j<words[i].length();j++){
                sum+=weigh.get(words[i].charAt(j));
            }
            int r=sum%26;
            char map=(char)('z'-r);
            ans.append(map);
        }
        return ans.toString();
         


    }
}