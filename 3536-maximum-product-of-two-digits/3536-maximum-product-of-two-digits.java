class Solution {
    public int maxProduct(int n) {
        int[] digit = Integer.toString(n)
                      .chars()
                      .map(c -> c - '0')
                      .toArray();
        Arrays.sort(digit);
        int res=digit[digit.length-1]*digit[digit.length-2];
        return res;
    }
    
}