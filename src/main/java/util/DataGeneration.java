package util;

public class DataGeneration {

    public static String generateUniqueTradeName() {
        int x = (int) (Math.random() * 1000);
        return "yauhen21" + x;
    }

    public static String generateUniqueMobilePhone() {
        int x = (int) (Math.random() * 1000000000);
        return "971" + x;
    }
}
