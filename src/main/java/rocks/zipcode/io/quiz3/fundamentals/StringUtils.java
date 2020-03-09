package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String newString = "";
        for (int i = 0; i < str.length() ; i++) {
            if (i != indexToCapitalize){
                newString += str.charAt(i);
            }
            else newString += str.toUpperCase().charAt(indexToCapitalize);
        }
        return newString;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if (baseString.charAt(indexOfString) == characterToCheckFor){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        String[] allSubs = new String[getNumberOfSubStrings(string)];
        for (int i = 0; i < string.length() ; i++) {
            System.out.println(string.substring(i));
            allSubs[i] = string.substring(i);

        }
        return allSubs;
    }

    public static Integer getNumberOfSubStrings(String input){
        Integer count = input.length() * (input.length()+1) / 2 - 1;
        return count;
    }
}
