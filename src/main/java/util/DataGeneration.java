package util;

public class DataGeneration {

    public String generateUniqueTradeName() {
        int x = (int) (Math.random() * 1000);
        String tradeName = "yauhen21" + x;
        return tradeName;
    }

    public String generateUniqueMobilePhone() {
        int x = (int) (Math.random() * 1000000000);
        String mobilePhone = "971" + x;
        return mobilePhone;
    }
}
