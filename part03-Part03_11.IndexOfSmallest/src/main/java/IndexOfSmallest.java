
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 9999) {
                break;
            }
            list.add(num);
        }
        int number=9999;
        for(int i=0;i<list.size();i++){
            if(list.get(i)<number){
                number=list.get(i);
            }
        }
        System.out.println("Smallest number: "+number);
        for(int i =0;i<list.size();i++){
            if(list.get(i)==number){
                System.out.println("Found at index: "+i);
            }
        }

    }
}
