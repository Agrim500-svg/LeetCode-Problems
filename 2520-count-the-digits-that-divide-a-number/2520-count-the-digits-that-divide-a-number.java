class Solution {
    public int countDigits(int num) {
        int digit[]=new int[Integer.toString(Math.abs(num)).length()];
         int original = num;
        for(int i=0;i<digit.length;i++){
            digit[i] = num%10;
            num=num/10;
        }
        int valid=0;
        for(int i=0;i<digit.length;i++){
            if(digit[i] != 0 && original % digit[i] == 0){
                valid++;
            }
        }
        return valid;
    }
}