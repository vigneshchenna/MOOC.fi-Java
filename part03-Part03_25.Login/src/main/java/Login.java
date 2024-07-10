
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] username = {"alex", "emma"};
        String[] password = {"sunshine", "haskell"};

        System.out.println("Enter username: ");
        String un = scanner.nextLine();
        System.out.println("Enter password: ");
        String pw = scanner.nextLine();
        checkLogin(username, password, un, pw);
    }

    //public static void
    public static void checkLogin(String[] username, String[] password, String un, String pw) {
        int index =0;
        boolean check = false;
        for (int i = 0; i < username.length; i++) {
            if (un.equals(username[i])) {
                check = true;
                index = i;
            }
        }
        String fail = "Incorrect username or password!";
        if (check == false) {
            System.out.println(fail);
        }

        if (check == true) {
            if (pw.equals(password[index])) {
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println(fail);
            }
        }

    }
}
