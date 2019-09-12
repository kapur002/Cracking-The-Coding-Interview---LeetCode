import java.lang.Math;

public class Solution {
    static boolean oneEditAway(String firstString, String secondString){

        int firstStringCount = 0;
        int secondStringCount = 0;
        int missingLetter = 0;
        int oneEdit = 0;

        for (int i  = 0; i < firstString.length(); i++){
            firstStringCount = firstStringCount + (int) firstString.charAt(i);
        }
        for (int i = 0; i < secondString.length(); i++){
            secondStringCount = secondStringCount + (int) secondString.charAt(i);
        }
        if (firstStringCount > secondStringCount && firstString.length() != secondString.length()){
            missingLetter = firstStringCount - secondStringCount;
            if (missingLetter >= 65 & missingLetter <= 122){
                return true;
            }
            else return false;
        }
        if (secondStringCount > firstStringCount && firstString.length() != secondString.length()){
            missingLetter = secondStringCount - firstStringCount;
            if(missingLetter >= 65 & missingLetter <= 122){
                return true;
            }
            else return false;
        }

        if (firstString.length() == secondString.length()){
            oneEdit = firstStringCount - secondStringCount;
            oneEdit = Math.abs(oneEdit);
            int letterCount = 0;
            for (int i = 0; i < firstString.length(); i++){
                if (firstString.charAt(i) == secondString.charAt(i)){
                    continue;
                }
                letterCount++;
                if (letterCount > 1){
                    return false;
                }
            }
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        String firstString = "pale";
        String secondString = "palo";

        System.out.println("One Edit Away: " + oneEditAway(firstString, secondString));
    }
}
