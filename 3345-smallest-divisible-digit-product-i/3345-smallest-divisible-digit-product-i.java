class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;;i++){
            int digit=1;
            int tem=i;
            while (tem>0){
                digit*= tem%10;
                tem=tem/10;
                System.out.println(digit);
            }
            if(digit%t==0){
                return i;
            }
        }
    }
}