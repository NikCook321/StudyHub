
/**
 * used as base for all accounts, regardless of authorisation
 */
public abstract class Account {
    
    //username
    private final String Username;

    //password
    private final String PasswordHash;

    //userID
    private static long UserID = 1000;
    
    private final String UserIDString; // Convert to string for demonstration purposes

    //permission level of the account
    private final String PermissionLevel;

    private String FirstName;

    private String LastName;

    private String Email;

    //creates a new account with the given username and password
    protected Account(String username, String password, String permissionLevel, String firstName, String lastName, String email) {
        this.Username = username;
        this.PasswordHash = password;
        this.PermissionLevel = permissionLevel;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Email = email;
        this.UserIDString = String.valueOf(UserID++); // Convert to string for demonstration purposes
    }

    public String getUsername() {
        return Username;
    }

    public String getPasswordHash() {
        return PasswordHash;
    }

    public String getUserID() {
        return UserIDString;
    }

    public String getPermissionLevel() {
        return PermissionLevel;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }


}
