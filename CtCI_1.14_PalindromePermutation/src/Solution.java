import java.util.Hashtable;

public class Solution {

    static boolean palindromePermutation(String string1, String string2){

        if (string1.length() != string2.length()){
            return false;
        }

        //creates a new HashTable object called palindromeHT, will be used to store the values of the string
        //and compared against the other string to see if the other string is a permutation or not.
        Hashtable<Character, Integer> palindromeHT = new Hashtable<Character, Integer>();

        //creates a second Hashtable to compare against
        Hashtable<Character, Integer> permutationHT = new Hashtable<Character, Integer>();


        for(int i = 0; i < string1.length(); i++){
            if (!palindromeHT.containsKey(string1.charAt(i))){
                palindromeHT.put(string1.charAt(i), 1);
            }
            else{
                int count = palindromeHT.get(string1.charAt(i)) + 1;
                palindromeHT.put(string1.charAt(i), count);
            }
        }

        for(int i = 0; i < string2.length(); i++){
            if (!permutationHT.containsKey(string2.charAt(i))){
                permutationHT.put(string2.charAt(i), 1);
            }
            else{
                int count = permutationHT.get(string2.charAt(i)) + 1;
                permutationHT.put(string2.charAt(i), count);
            }
        }

        if(permutationHT.equals(palindromeHT)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String tacoCat = "onomatopoeic tattarrattat";
        String tcScrambled = "MOECPNOAOTIO ARTTRTTTAATA";
        tcScrambled = tcScrambled.toLowerCase();

        System.out.println("is Permutation: " + Solution.palindromePermutation(tacoCat, tcScrambled));
    }
}
