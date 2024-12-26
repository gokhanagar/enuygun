package enums;

public enum USERCREDENTIAL {
    USER1("testgokhan5@gmail.com", "23932393Gc.");

    private final String getUsername;
    private final String getPassword;

    USERCREDENTIAL(String username, String password) {
        this.getUsername = username;
        this.getPassword = password;
    }
    public String getUsername(){
        return getUsername;
    }
    public String getPassword(){
        return getPassword;
    }






















}
