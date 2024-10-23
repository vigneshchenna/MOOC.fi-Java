/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vignesh
 */
import java.util.*;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            processCommand(command);
        }
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("search")) {
            search();
        } else {
            System.out.println("Unknown commmand");
        }

    }

    public void add() {
        System.out.println("Word: ");
        String word = scanner.nextLine();
        System.out.println("Translation: ");
        String translation = scanner.nextLine();
        this.dictionary.add(word, translation);
    }

    public void search() {
        System.out.println("To be translated: ");
        String word = scanner.nextLine();

        if (this.dictionary.translate(word) == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + this.dictionary.translate(word));
        }
    }
}
