import java.util.Arrays;

public class Solution {

    public static void URLify(char[] originalStr, int trueLength){
        int spaceCount = 0, index, i = 0;

        //FINDING THE NUMBER OF SPACES IN THE ORIGINAL STRING
        for(i = 0; i < trueLength; i++){
            if (originalStr[i] == ' '){
                spaceCount++;
            }
        }

        //CALCULATING THE LENGTH OF THE NEW CHARACTER ARRAY
        index = trueLength + (spaceCount * 2);
        originalStr = Arrays.copyOf(originalStr, index);

        if(trueLength < originalStr.length) originalStr[trueLength] = '\0'; //End of array

        for(i = trueLength-1; i >= 0; i--){
            if(originalStr[i] == ' '){
                originalStr[index - 1] = '0';
                originalStr[index - 2] = '2';
                originalStr[index - 3] = '%';
                index = index - 3;
            }else{
                originalStr[index - 1] = originalStr[i];
                index--;
            }
        }
    }
    public static void main(String[] args) {

        String name = "Parth is Awesome";
        char [] nameChar;
        nameChar = name.toCharArray();

        Solution.URLify(nameChar, nameChar.length);

        for (int i = 0; i < nameChar.length; i++){
            System.out.print(nameChar[i]);
        }
    }
}
