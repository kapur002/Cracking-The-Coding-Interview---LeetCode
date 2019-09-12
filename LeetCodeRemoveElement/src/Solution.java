public class Solution {
    public static int removeElement(int[] nums, int val) {

        //variable for the array length
        int arraySize = nums.length;
        int numsFound = 0;
        for (int i = 0; i < arraySize -1; i++){
            for(int j = 0; j < arraySize - i - 1; j++){
                if(nums[j] == val){
                    //shift the value to the left
                    int temp = nums[j]; //holds val
                    nums[j] = nums[j+1]; //shift the element that is not val to the right
                    nums[j+1] = temp; //shifts val to the left by putting it in the element that is not val's place
                }
            }
        }

        for(int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                numsFound++;
            }
        }
        return (arraySize-numsFound);
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(Solution.removeElement(nums, 2));

        System.out.print("[");
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ", ");
        }
        System.out.print("]\n");
    }
}
