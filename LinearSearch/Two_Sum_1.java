import java.util.Scanner;
import java.util.Arrays;
public class Two_Sum_1 {
    public static int[] twoSum(int[] nums, int target) {
        int [] temp = new int[0];
        int [] arr = Arrays.copyOf(temp,temp.length+2);
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int ans = nums[i] + nums[j];
                if(ans == target){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [] nums = new int[5];
        for(int i=0 ; i<nums.length; i++){
            nums[i] = input.nextInt();
        }
        int target = input.nextInt();
        int[] result = twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
