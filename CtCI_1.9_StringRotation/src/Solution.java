public class Solution {

    static boolean isRotation(String s1, String s2){
        int len = s1.length();

        //We want to make sure that both strings are of equal length and not empty
        if(s2.length() == len && len > 0){
            String s1s1 = s1 + s1;
            return s1s1.contains(s2);
        }

        return false;
    }
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        System.out.println("Is Substring: " + isRotation(s1, s2));
    }
}
