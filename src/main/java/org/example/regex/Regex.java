package org.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
//        Pattern pattern=Pattern.compile("b*");
//        Pattern pattern=Pattern.compile("World$",Pattern.LITERAL);
//        Pattern pattern=Pattern.compile("^ello");
//        Pattern pattern=Pattern.compile("hello",Pattern.CASE_INSENSITIVE);
//        Pattern pattern=Pattern.compile("hello|salam",Pattern.CASE_INSENSITIVE);
//        Pattern pattern = Pattern.compile("[Hbc]");
//        Pattern pattern = Pattern.compile("[^H]");
//       Pattern pattern = Pattern.compile("[0-9]");
//       Pattern pattern = Pattern.compile("[a-b]");
//      Pattern pattern = Pattern.compile("[^a-zA-Z]");
//      Pattern pattern = Pattern.compile("H+");
        Pattern pattern = Pattern.compile("H?");

        Matcher matcher = pattern.matcher("HHHelloWorld");
        System.out.println(matcher.find());
    }
}
