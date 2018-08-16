package businessobject;

public class User {
    private static final String ADMIN_LOGIN = "yauhen_valodzin@epam.com.qa";
    private static final String ADMIN_PASSWORD = "Ceakt_1234";
    private String login;
    private String password;

    public User() {
        this.login = ADMIN_LOGIN;
        this.password = ADMIN_PASSWORD;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
