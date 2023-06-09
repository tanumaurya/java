// Question:Given a sentence Str. The task is to write a java code to find whether the given sentence contains all letters of 
// English alphabet (a to z or A to Z).If does not, then print all the missing letters of the alphabet, otherwise print 0.

import java.util.*;

class Main {
    public static void main(String[] args) {
        // String sentence = "the four boxing wizard jumps over the quickly";
        Scanner scn = new Scanner(System.in);

        String sentence = scn.nextLine();
        String missingLetters = getMissingLetters(sentence);
        if (missingLetters.equals("")) {
            System.out.println("0");
        } else {
            System.out.println("Missing letters: " + missingLetters);
        }
    }

    public static String getMissingLetters(String sentence) {
        HashSet<Character> alphabetSet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetSet.add(c);
        }
        // for (char c = 'A'; c <= 'Z'; c++) {
        //     alphabetSet.add(c);
        // }

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            char ch =Character.toLowerCase(c);
            alphabetSet.remove(ch);
            // alphabetSet.remove(Character.toUpperCase(c));
        }

        StringBuilder missingLetters = new StringBuilder();
        for (char c : alphabetSet) {
            missingLetters.append(c);
        }

        return missingLetters.toString();
    }
}
