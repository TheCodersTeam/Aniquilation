package io.github.thecodersteam.aniquilation.utils;

public class StringUtils {

    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static String invertCase(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return str;
        }
        StringBuilder builder = new StringBuilder(strLen);

        char ch = 0;
        for (int i = 0; i < strLen; i++) {
            ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
            } else if (Character.isTitleCase(ch)) {
                ch = Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
            }
            builder.append(ch);
        }
        return builder.toString();
    }

    public static String upperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    public static String lowerCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }

    public static boolean startsWith(String str, String start, boolean caseSensitive) {
        if (str == null || start == null) {
            return (str == null && start == null);
        }
        if (start.length() > str.length()) {
            return false;
        }

        return str.regionMatches(caseSensitive, 0, start, 0, start.length());
    }

    public static boolean endsWith(String str, String end, boolean caseSensitive) {
        if (str == null || end == null) {
            return (str == null && end == null);
        }
        if (end.length() > str.length()) {
            return false;
        }

        int offset = str.length() - end.length();
        return str.regionMatches(caseSensitive, offset, end, 0, end.length());
    }
    
    private StringUtils() {}

}
