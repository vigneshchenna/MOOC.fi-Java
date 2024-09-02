/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vignesh
 */
public class Archive {
    private String identifier;
    private String name;
    
    public Archive(String id, String name){
        this.identifier = id;
        this.name = name;
    }
    
    public String getIdentifier(){
        return this.identifier;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Archive)){
            return false;
        }
        
        Archive comparedTo = (Archive) compared;
        
        return this.identifier.equals(comparedTo.identifier);
    }
    
    
}
