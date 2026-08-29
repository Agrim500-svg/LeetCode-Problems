class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> table = new HashMap<>();
        for(int i=0;i<names.length;i++){
            table.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] sorted = new String[names.length];
        for(int i=0;i<heights.length;i++){
            sorted[i]=table.get(heights[heights.length-1-i]);
        }

        return sorted;

    }
}