class Solution {
    public boolean checkDivisibility(int n) {
        int number=n;
        int sum=0;
        int prd=1;
        while(n>0){
            int d=n%10;
            n/=10;
            sum+=d;
            prd*=d;
        }
        // System.out.println(sum);
        // System.out.println(prd);
        if(number%(sum+prd)!=0){
            return false;
        }else{
            return true;
        }
    }
}