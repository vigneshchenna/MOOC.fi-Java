/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vignesh
 */

import java.util.ArrayList;


public class Room {
    private ArrayList<Person> persons;
    
    public Room(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        return persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    public Person shortest(){
        if(persons.isEmpty()){
            return null;
        }
        Person shortest= persons.get(0);
        for(Person shrt: persons){
            if(shortest.getHeight()>shrt.getHeight()){
                shortest =shrt;
            }
        }
        return shortest;
    }
    
    public Person take(){
        if(persons.isEmpty()){
            return null;
        }
        Person shrtest = shortest();
        
        persons.remove(shortest());
        
        return shrtest;
    }
}
