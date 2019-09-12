public class Solution {
    public static boolean isUniqueChars(String str){
        //LET US ASSUME THAT WE ARE WORKING WITH THE STANDARD ASCII CHARACTER SET(128 CHARACTERS)
        if(str.length() > 128){ //IF THE STRING IS GREATER THAN 128 CHARACTERS, THEN IT IS NOT POSSIBLE TO HAVE UNIQUE
            return false;
        }

        boolean uniqueCharactors[] = new boolean[128]; //WE ARE ASSUMING THERE ARE 128 UNIQUE CHARACTERS
        for (int i = 0; i < str.length(); i++){
            int maybeUnique = str.charAt(i); //CONVERTING THE CHARACTER TO THE ASCII VALUE
            System.out.println("maybeUnique: " + maybeUnique);
            if (uniqueCharactors[maybeUnique] == true){
                return false;
            }
            else {
                uniqueCharactors[maybeUnique] = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String name = "I am Parth";
        System.out.println("String is unique: " + isUniqueChars(name));
    }
}

//Key Points:
//USE AN ARRAY WITH THE SIZE OF YOUR UNIQUE CHARACTER SET.
//IF ASCII THEN THE ARRAY WILL BE 128 INDEXES, MEANING ALL 128 INDEXES REPRESENT A CHARACTER THAT IS UNIQUE
//THE ARRAY SHOULD BE BOOLEAN WITH A DEFAULT VALUE OF FALSE.
//LOOP THRU THE STRING...STORE THE CHARACTER AT THAT SPECIFIC INDEX INTO AN INTEGER VARIABLE
//THIS INTEGER VARIABLE IS THE NUMERIC REPRESENTATION OR THE ASCII VALUE
//CHECK IN THE ARRAY IF THAT POSITION OF THE NUMERIC REPRESENTATION OF THE ASCII VALUE IS TRUE. IF IT IS, RETURN FALSE
//OTHERWISE RETURN TRUE.
//WE CAN RETURN TRUE OR FALSE AT THE END, IT DOESN'T MATTER...FUNCTION JUST NEEDS A RETURN VALUE
