package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class  StringUtils {
    public static Character getMiddleCharacter(String string) {
        Character results = string.charAt(string.length()/2);
        return results;
    }

    public static String capitalizeMiddleCharacter(String str) {
        StringBuilder sb = new StringBuilder(str);
        char c = Character.toUpperCase(str.charAt(str.length()/2));
        sb.setCharAt(str.length()/2, c);

        return sb.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        StringBuilder sb = new StringBuilder(str);
        char c = Character.toLowerCase(str.charAt(str.length()/2));
        sb.setCharAt(str.length()/2, c);

        return sb.toString();
    }

    public static Boolean isIsogram(String str) {
        str = str.toLowerCase();
        int length = str.length();
        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < length -1; i++) {
            if(arr[i] == arr[i + 1]){
            return false;
            }else if(arr[i] != arr[i + 1]){
                return true;
            }
        }
        return null;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return (str.matches(".*(.)\\1.*"));
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
//        Pattern pattern = Pattern.compile(".*(.)\\1.*");
//        Matcher matcher = pattern.matcher(str);
        String results = str.replaceAll(".*(.)\\1.*", "");

        return results;
    }

    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.isUpperCase(chars[i])
                                ? Character.toLowerCase(chars[i])
                                : Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }
}
