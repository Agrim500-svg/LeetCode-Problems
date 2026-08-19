class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> large = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                less.add(nums[i]);
            }else if(nums[i]==pivot){
                equal.add(nums[i]);
            }else{
                large.add(nums[i]);
            }
        }
        List<Integer> res = new ArrayList<>(less);
        res.addAll(equal);
        res.addAll(large);
        int[] res_f=new int[res.size()];
        for(int i=0;i<res.size();i++){
            res_f[i]=res.get(i);
        }
        return res_f;
    }
}