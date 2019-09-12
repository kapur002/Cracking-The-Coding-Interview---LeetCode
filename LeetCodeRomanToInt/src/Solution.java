import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        //get the length of the string
        int lengthOfString = s.length();

        //get the value of the last roman num in string given the key (from lengthOfString)
        int sum = map.get(s.charAt(lengthOfString - 1));

        //start at the second to last position and loop until you reach first position
        for (int i = lengthOfString - 2; i >= 0; --i) {
            //
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                sum -= map.get(s.charAt(i));
            } else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println("Hello World!"); // Display string

        System.out.println("Roman number converted to Integer is: " + Solution.romanToInt("III"));
    }
}
