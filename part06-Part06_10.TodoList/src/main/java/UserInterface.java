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

public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }
            processCommand(command);
        }
    }
    
    public void processCommand(String command){
        if(command.equals("add")){
            add();
        } else if(command.equals("list")){
            list();
        } else if (command.equals("remove")){
            remove();
        }
    }
    
    public void add(){
        System.out.println("To add:");
        String task = scanner.nextLine();
        this.list.add(task);
    }
    
    public void list(){
        this.list.print();
    }
    
    public void remove(){
        System.out.println("Which one is removed?");
        int number = Integer.valueOf(scanner.nextLine());
        this.list.remove(number);
    }
}
