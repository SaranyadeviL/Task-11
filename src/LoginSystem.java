import java.util.Scanner;

public class LoginSystem {

    private static final String Username = "admin";
    private static final String Password = "test@123";

    public static void login(String username, String password) throws IncorrectPasswordException {
        if (!Username.equals(username) || !Password.equals(password)) {
            throw new IncorrectPasswordException(" Incorrect username or password ");
        }
        System.out.println("Login Successful");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the username");
        // user input
        String Username = scanner.nextLine();
        System.out.println("Enter the password");
        String Password = scanner.nextLine();
        try {
            login(Username, Password);
            System.out.println("Login Successful");
        } catch (IncorrectPasswordException e){
            System.out.println("Login failed :" + e.getMessage);
    }
        scanner.close();
    }
}
