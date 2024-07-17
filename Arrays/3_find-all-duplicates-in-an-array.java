class Solution {
    // 1 2 2 3 3 4 7 8  
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> answer = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i++){
            int index = Math.abs(nums[i]);
            if(nums[index - 1] < 0){
                answer.add(index);
            }

            nums[index-1] = -nums[index-1];
        }
        return answer;
    }
}