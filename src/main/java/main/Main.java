package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println(isValidLength("Hello@1", 20));  // Should print true
        System.out.println(isValidLength("hello", 20));  // Should print false
        System.out.println(isValidLength("Hello @1", 20));  // Should print false (contains space)
    }

    public static boolean isValidLength(String input, int maxLength) {

        String regex = String.format("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!\"#$%%&'()*+,-./:;<=>?@[\\\\]^_`{|}~])\\S{1,%d}$", maxLength);

        // Create a regex pattern dynamically to check string length and other conditions
        Pattern pattern = Pattern.compile(regex);

        // Match the input string against the pattern
        Matcher matcher = pattern.matcher(input);

        // Return whether the input matches the pattern
        return matcher.matches();
    }
}
