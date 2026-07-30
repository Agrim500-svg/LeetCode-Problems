class Solution {
    public int countSeniors(String[] details) {
        int old=0;
        for (int i = 0; i < details.length; i++) {
            String s=details[i];
            int age=Integer.parseInt(s.substring(11, 13));
            if (age>60){
                old++;
            }
        }
        return old;
    }
}