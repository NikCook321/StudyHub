public class User extends Account {

    public User(String username, String password, String permissionLevel, String firstName, String lastName, String email) {

        super(username, password, permissionLevel, firstName, lastName, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + getUsername() + '\'' +
                ", password='" + getPasswordHash() + '\'' +
                ", permissionLevel='" + getPermissionLevel() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", userID=" + getUserID() + '\'' +
                '}';
    }
}
