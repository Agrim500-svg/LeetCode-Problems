class Solution {
    public int totalWaviness(int num1, int num2) {
        int cnt=0;
        for(int i=num1;i<=num2;i++){
            List<Integer> digit = new ArrayList<>();
            int j=i;
            while(j>0){
                int d=j%10;
                digit.add(d);
                j/=10;
            }
            if(digit.size()<3){
                continue;
            }
            for(int k=0;k+2<digit.size();k++){
                if(digit.get(k)<digit.get(k+1) && digit.get(k+1)>digit.get(k+2)){
                    cnt++;
                }else if(digit.get(k)>digit.get(k+1) && digit.get(k+1)<digit.get(k+2)){
                    cnt++;
                }
            }
       }
       return cnt; 
    }
}