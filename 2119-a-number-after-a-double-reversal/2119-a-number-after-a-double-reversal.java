class Solution {
    private int reverse(int n){
        int r=0;
        while(n!=0){
            int digit=n%10;
            r=r*10+digit;
            n=n/10;
        }
        return r;
    }

    public boolean isSameAfterReversals(int num) {
        int reverse1 = reverse(num);
        int reverse2 = reverse(reverse1);
        if(num==reverse2){
            return true;
        }else{
            return false;
        }
    }
}