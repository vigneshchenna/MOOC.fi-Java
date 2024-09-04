/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Vignesh
 */
public class Stack {
    private ArrayList<String> strings;
    
    public Stack(){
        this.strings = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return this.strings.isEmpty();
    }
    
    public void add(String value){
        this.strings.add(value);
    }
    
    public ArrayList<String> values(){
        
        return this.strings;
    }
    
    public String take(){
        String last = this.strings.get(strings.size()-1);
        this.strings.remove(last);
        return last;
        
    }
}
