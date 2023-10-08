class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                int[] arr = new int[2];
                arr[0] = mid;
                arr[1] = mid;
                int left = mid-1;
                int right = mid+1;
                while( right < nums.length && nums[right] == target){
                    arr[1] = right;
                    right++;
                }
                while(left >=0 && nums[left] == target){
                    arr[0] = left;
                    left--;
                }
                return arr;
            }
        }
        int[] arr1 = {-1,-1};
        return arr1;
    }
    public static void main(String[] args){
        int[] nums={};
        int target = 1;
        Solution solution = new Solution();
        int[] Result = solution.searchRange(nums,target);
        System.out.println(Arrays.toString(Result));
    }
}