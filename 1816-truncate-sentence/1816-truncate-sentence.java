class Solution {
    public String truncateSentence(String s, int k) {
        int sp=0;
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                sp+=1;
            }
            if(sp==k){
                break;
            }
            res = res + s.charAt(i);
        
        }
        return res;
       
    }
     
   
}