class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        // System.out.println(Arrays.toString(seats));
        // System.out.println(Arrays.toString(students));
        // return 0;
        int minop = 0;
        for(int i=0;i<students.length;i++){
            for(int j=i;j<=i;j++){
                minop += Math.abs(students[i]-seats[j]);
            }
        }
        return minop;
    }
}