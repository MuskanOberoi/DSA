package Arrays;
class Solution {
    public int largestElement(int[] nums) {
        int largest = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]> largest){
                largest = nums[i];
            }
        }
       
        System.out.println("largest element: " + largest);
         return largest;
    }

    }
public class LargestNum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {4, 1, 7, 9, 2};
        sol.largestElement(arr); // prints and returns the largest element
    }
}
