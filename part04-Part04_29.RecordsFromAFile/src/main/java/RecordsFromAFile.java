
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        try(Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                
                String[] parts = line.split(",");
                if(Integer.valueOf(parts[1])==1){
                    System.out.println(parts[0]+", age: "+ parts[1]+ " year");
                } else{
                    System.out.println(parts[0]+", age: "+ parts[1]+ " years");
                }
            }
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }

    }
}
