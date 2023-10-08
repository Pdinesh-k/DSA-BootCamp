import java.util.Arrays;
class Solution {
    public char Find_Smallest_Greater_Than_Target(char[] letters, char target) {
        int[] arr = new int[letters.length];
        for(int i = 0 ; i<letters.length ; i++){
            int ascii = (int) letters[i];
            arr[i] = ascii;
        }
        int targetint = (int)target;
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(targetint >= arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }

        }
        if(start < arr.length){
            return (char) arr[start];
        }
        else{
            return letters[0];
        }

    }
    public static void main(String[] args){
        Solution solution = new Solution();
        char[] letters= {};
        char target = '';
        char x = solution.Find_Smallest_Greater_Than_Target(letters,target);
        System.out.println(x);

    }
}
