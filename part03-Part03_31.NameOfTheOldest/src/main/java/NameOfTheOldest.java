
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int oldest =-1;
        while(true){
            String detail = scanner.nextLine();
            if(detail.equals("")){
                break;
            }
            String[] parts = detail.split(",");
            if(Integer.valueOf(parts[1])> oldest){
                oldest=Integer.valueOf(parts[1]);
                name = parts[0];
            }
        }

        System.out.println("Name of the oldest: "+name);

    }
}
