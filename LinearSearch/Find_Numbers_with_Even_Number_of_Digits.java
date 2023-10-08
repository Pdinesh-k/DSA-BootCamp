public class Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int finish = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int target = 1;
            while(nums[i]>=10){
                nums[i]=nums[i]/10;
                target++;
            }
            if(nums[i]%2==0){
                finish++;
            }
        }
        return finish;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6};
        int temp = findNumbers(nums);
        System.out.println(temp);
    }
}
