class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String rev="";
            for(int j=words[i].length()-1;j>=0;j--){
                rev=rev+words[i].charAt(j);
            }
            if(words[i].equals(rev)){
                return words[i];
            }
        }
        return "";
    }
}