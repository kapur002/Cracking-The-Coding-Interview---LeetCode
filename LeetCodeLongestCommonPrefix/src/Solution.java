public class Solution {

    public static String longestCommonPrefix(String[] strs) {

        //lets check if the array of strings is empty or null
        if(strs.length == 0 || strs == null){
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++){
            //We will use our first element of the array as the basis
            //to build our longest prefix off of. If the first element's
            //first letter is not common with the other array element's first
            //letter then we will automatically know that there is nothing
            //in common and can incorporate this into our if statement

            //NOTE: As i increments, we will check the next position in first
            //element
            char position = strs[0].charAt(i);

            //we will will check every element in the array after the first element
            //as the first element is being used to check against each next element
            for (int j = 1; j < strs.length; j++){
                if (i == strs[j].length() || position != strs[j].charAt(i)){
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0]; //if we went thru the whole loop and didn't return
        //this means that the first index of the array is the longest
        //common prefix in itself
    }

    public static void main(String[] args) {
        String[] arr = new String[] {"aa", "a"};

        System.out.println(Solution.longestCommonPrefix(arr));
    }
}
