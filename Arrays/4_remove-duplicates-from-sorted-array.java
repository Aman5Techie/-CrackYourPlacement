class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer = 0;
        int pointer_num = nums[0];
        int current_ele;
        for(int i = 1;i<nums.length;i++){
            current_ele = nums[i];
            if(pointer_num != current_ele){
                nums[++pointer] = current_ele;
                pointer_num = current_ele;
            }
        }
        return pointer+1;
    }
}