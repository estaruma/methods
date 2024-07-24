//Write a Java method to display the middle character of a string.
        //Note: a) If the length of the string is odd there will be two middle characters.
        //b) If the length of the string is even there will be one middle character.

public class MiddleCharacter {
    public static void main(String[] args) {
        String testString1 = "purple";
        String testString2 = "lilies";

        System.out.println(testString1 + "': " + getMiddleCharacter(testString1));
        System.out.println(testString2 + "': " + getMiddleCharacter(testString2));
    }

    public static String getMiddleCharacter(String str) {
        int length = str.length();
        int middle = length / 2;

        if (length % 2 == 0) {
            return String.valueOf(str.charAt(middle));
        } else {
            return str.substring(middle - 1, middle + 1);
        }
    }
}
