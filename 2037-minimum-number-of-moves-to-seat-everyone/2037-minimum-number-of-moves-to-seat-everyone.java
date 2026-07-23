class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int minop = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        // System.out.println(Arrays.toString(seats));
        // System.out.println(Arrays.toString(students));
        // return 0;
        
        for(int i=0;i<students.length;i++){
            
            minop += Math.abs(students[i]-seats[i]);
        }
        
        return minop;
    }
}