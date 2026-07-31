class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        String digit= String.valueOf(x);
        int sum=0;
        for(int i=0;i<digit.length();i++){
            sum+=Character.getNumericValue(digit.charAt(i));
        }
        if(x%sum==0){
            return sum;
        }else{
            return -1;
        }
    }
}