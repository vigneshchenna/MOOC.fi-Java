
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest =0;
        int count=0;
        while(true){
            String detail = scanner.nextLine();
            if(detail.equals("")){
                break;
            }
            
            String[] split = detail.split(",");
            if(Integer.valueOf(split[1])>oldest){
                oldest = Integer.valueOf(split[1]);
            }
            count++;
        }
        if(count >0){
            System.out.println("Age of the oldest: "+oldest);
        }
    }
}
