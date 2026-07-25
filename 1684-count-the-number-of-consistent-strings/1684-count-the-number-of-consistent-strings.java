// class Solution {
//     public int countConsistentStrings(String allowed, String[] words) {
//         int cons=0;
//         for(int i=0;i<words.length;i++){
//             for(int j=0;j<allowed.length();j++){
//                 if(words[i].charAt(i)== allowed.charAt(j)){
//                     cons+=1;
//                 }
//             }
            
//         }
//         return cons;
//     }
// }

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            int i;
            for (i = 0; i < word.length(); i++) {
                if (allowed.indexOf(word.charAt(i)) == -1) {
                    break;
                }
            }
            if (i == word.length()) {
                count++;
            }
        }
        return count;
    }
}