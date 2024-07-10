
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longest = 0;
        String name = "";
        int sum =0;
        int count=0;
        while(true){
            String words = scanner.nextLine();
            if(words.equals("")){
                break;
            }
            String[] parts = words.split(",");
            int length = Integer.valueOf(parts[0].length());
            if(length> longest){
                longest = length;
                name = parts[0];
            }
            
            sum += Integer.valueOf(parts[1]);
            count++;
        }
        
        System.out.println("Longest name: "+name);
        System.out.println("Average of the birth years: "+(1.0*sum/count));

    }
}
