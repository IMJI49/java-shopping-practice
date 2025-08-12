package javaproject.util;

public class SecurityUtil {
    public static String santizeInput(String input) {
        
        return input == null ? null : input.replaceAll("[<>\"\'\\]", "");
    }
}
