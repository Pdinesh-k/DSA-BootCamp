import java.util.Scanner;
import java.util.Arrays;
public class Median_of_Two_Sorted_Arrays_4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1,0,newArray,0,nums1.length);
        System.arraycopy(nums2,0,newArray,nums1.length,nums2.length);
        int length = newArray.length;
        Arrays.sort(newArray);
        if(length%2==0){
            int Median = length/2;
            double ans = (newArray[Median] + newArray[Median-1])/2.0;
            return ans;
        }
        else{
            int median = (length-1)/2;
            return newArray[median];
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] nums1 = new int[6];
        int[] nums2 = new int[6];
        for(int i=0 ; i<nums1.length ; i++){
            nums1[i] = input.nextInt();
        }

        for(int j=0 ; j<nums2.length ; j++){
            nums2[j] = input.nextInt();
        }
        double result = findMedianSortedArrays(nums1,nums2);
        System.out.println(result);
    }
}
