package com.concavenp.cscodeprojects.arraysandstrings;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dave on 6/2/16.
 *
 * Problem: 1.1
 *
 * Question:  Implement an algorithm to determine if a string has all unique characters.  What if you cannot se
 * additional data structures?
 */
public class IsUnique {

    /**
     * A traditional way of checking for string uniqueness.
     *
     * @param input The String to be check
     * @return True is the unique
     */
    public static boolean isUnique(String input) {
        // Start with the assumption that the string is unique
        boolean result = true;

        Set<Character> unique = new HashSet<>();

        // Iterate over all of the characters in the input string
        for (char character : input.toCharArray() ) {
            // Return false if set already contained a the same character
            if (!unique.add(character)) {
                result = false;
                break;
            }
        }

        return result;
    }

    /**
     * Print formatted output based on the result of uniqueness.
     *
     * @param input The string to be checked for uniqueness
     */
    public static void check(String input) {
        System.out.print( "Is \"" + input + "\" unique? ");
        if (isUnique(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] argv) {
        check("hello");
        check("there");
        check("partner");
        check("up");
        check("down");
    }

}
