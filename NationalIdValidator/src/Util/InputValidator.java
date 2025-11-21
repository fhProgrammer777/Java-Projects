package Util;

public class InputValidator {
    public static boolean isNumericCode(String code , int length) {
        return code.matches("\\d{" + length + "}");
    }
}
