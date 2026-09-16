class Solution {
    public int findNthDigit(int n) {
        long d=1;
        long cnt=9;
        long st=1;
        while(n>d*cnt){
            n-=d*cnt;
            d++;
            cnt*=10;
            st*=10;
        }
        long nm=st+(n-1)/d;
        int idx=(int)((n-1)%d);
        String s=String.valueOf(nm);
        return s.charAt(idx)-'0';
    }
}