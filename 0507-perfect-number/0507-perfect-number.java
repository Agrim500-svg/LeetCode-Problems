class Solution {
    public boolean checkPerfectNumber(int num) {
        int fac=1;
        // for(int i=1;i<(num/2)+1;i++){
        //     if(num%i==0){
        //         fac+=i;
        //     } 
        // }
        if(num<=1){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                fac+=i;
                fac+=num/i;
            }
        }
        if(fac==num){
            return true;
        }else{
            return false;
        }
    }
}