class Solution {
    public boolean checkPerfectNumber(int num) {
        int fac=0;
        for(int i=1;i<(num/2)+1;i++){
            if(num%i==0){
                fac+=i;
            } 
        }
        if(fac==num){
            return true;
        }else{
            return false;
        }
    }
}