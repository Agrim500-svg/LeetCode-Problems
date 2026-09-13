class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> s=new HashSet<>();
        while(n!=1){
            if(s.contains(n)){
                return false;
            }
            s.add(n);
            int x=0;
            while(n>0){
                int d=n%10;
                x+=d*d;
                n/=10;
            }
            n=x;
        }
        return true;
    }
}