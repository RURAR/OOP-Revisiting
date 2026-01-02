// Demonstrates Access Modifiers
class User {
    private String username;

    public void setUsername(String u) {
        username = u;
    }

    public String getUsername() {
        return username;
    }
}

public class UserTest {
    public static void main(String[] args) {
        User u = new User();
        u.setUsername("Imran");
        System.out.println(u.getUsername());
    }
}
