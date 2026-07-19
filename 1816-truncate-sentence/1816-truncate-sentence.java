class Solution {
    public String truncateSentence(String s, int k) {
        int sp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                sp+=1;
            }
            if(sp==k){
            return s.substring(0,i);
        }
        }
        return s;
    }
     
   
}