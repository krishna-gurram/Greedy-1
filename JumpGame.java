// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 0 || nums == null) return true;
        
        int destination = nums.length- 1;
                
        for(int i = nums.length - 2; i >= 0; i--) {
            if(i + nums[i] >= destination) {
                destination = i;
            }    
        }
        
        return destination == 0;
    }
}