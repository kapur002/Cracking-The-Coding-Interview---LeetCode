public class Solution {
    static boolean isPermutation(String firstString, String secondString){
        if (firstString.length() != secondString.length()){
            return false;
        }

        //Create an array with 128 index, I am using this as a representation of the ascii charset
        int uniqueCharacters[] = new int[128];
        int uniqueCharacters2[] = new int[128];

        for(int i = 0; i < firstString.length(); i++){

            int index = firstString.charAt(i); //get the int ASCII value of the character
            uniqueCharacters[index] = uniqueCharacters[index]+1; //increment the count
        }
        for(int i = 0; i < secondString.length(); i++){
            int index = secondString.charAt(i); //get the int ASCII value of the character
            uniqueCharacters2[index] = uniqueCharacters2[index]+1; //increment the count
        }
        for(int i = 0; i < firstString.length(); i++){
            if(uniqueCharacters[i] != uniqueCharacters2[i]){
                return false;
            }
        }
        return true;
    }

    static String sort(String unsortedString){
        char[] contentOfString = unsortedString.toCharArray();
        java.util.Arrays.sort(contentOfString);
        return new String(contentOfString);
    }

    static boolean simplerPermutation(String firstString, String secondString){
        if(firstString.length() != secondString.length()){
            return false;
        }
        return sort(firstString).equals(sort(secondString));
    }
    public static void main(String[] args) {
        String string1 = "parth";
        String string2 = "aptrh";

        System.out.println("Is Permutation Approach 1: " + Solution.isPermutation(string1, string2));
        System.out.println("Is Permutation Approach 2: " + Solution.simplerPermutation(string1, string2));
    }
}
