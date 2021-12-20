public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int start=0,end=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[start++] = nums[i];
                end++;
            }
        }
        return end;
    }
}