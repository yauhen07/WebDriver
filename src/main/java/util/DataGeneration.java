package util;

public class DataGeneration {
    private static final String DEFAULT_USER_NAME = "yauhen21";
    private static final String DEFAULT_PHONE = "971";

    public static String generateUniqueTradeName() {
        int x = (int) (Math.random() * 1000);
        return DEFAULT_USER_NAME + x;
    }

    public static String generateUniqueMobilePhone() {
        int x = (int) (Math.random() * 1000000000);
        return DEFAULT_PHONE + x;
    }
}
