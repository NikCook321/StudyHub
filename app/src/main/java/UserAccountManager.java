
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserAccountManager {

    private final Map<String, User> users;


    public UserAccountManager() {
        this.users = new HashMap<>();

    }

    public void createUser(List<String> input) {
        requireArguments(input, 6, "create account \"<Username>\" \"<Password>\" \"<Level of Access>\" \"<First Name>\" \"<Last Name>\" \"<Email>\"");
        User user = new User(input.get(0), input.get(1), input.get(2), input.get(3), input.get(4), input.get(5));
        users.put(String.valueOf(user.getUserID()), user);
    }

    private static void requireArguments(List<String> input, int expected, String usage) {
        if (input.size() != expected) {
            throw new IllegalArgumentException("Usage: " + usage);
        }
    }

    public static void main(String[] args) {
        User admin = new User("john_doe", "password123", "admin", "John", "Doe", "john.doe@example.com");
        System.out.println(admin.toString());
    }
}
