
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container1 = new Container();
        Container container2 = new Container();
        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            String input = scan.nextLine();

            String[] parts = input.split(" ");
            String command = parts[0];
            if (command.equals("quit")) {
                break;
            }
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                container1.add(amount);
            }
            if (command.equals("move")) {
                if (amount > container1.contains()) {
                    container2.add(container1.contains());
                    container1.remove(100);
                }
                if (amount > 0 && amount<=container1.contains()) {
                    container2.add(amount);
                    container1.remove(amount);
                }
                
            }
            if (command.equals("remove")) {
                container2.remove(amount);
            }

        }
    }

}
