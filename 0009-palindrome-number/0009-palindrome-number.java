class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        // System.out.println(rev);
        if(str.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
}