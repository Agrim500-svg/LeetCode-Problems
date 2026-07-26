class Solution {
    public int subtractProductAndSum(int n) {
        int digit[]=new int[String.valueOf(Math.abs(n)).length()];
        int i=0;
        while(n>0){
            digit[i] = n % 10;
            i++;
            n=n/10;
        }
        int sum=0;
        int prd=1;
        for(i=0;i<digit.length;i++){
            sum+=digit[i];
            prd*=digit[i];
        }

        return prd-sum;
    }
}