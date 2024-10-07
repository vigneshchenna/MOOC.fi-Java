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

public class Package {
    
    private ArrayList<Gift> gifts = new ArrayList<>();
    
    public Package(){
        
    }
    
    public void addGift(Gift gift){
        gifts.add(gift);
    }
    
    public int totalWeight(){
        int tweight=0;
        
        for(int i =0; i<gifts.size();i++){
            tweight +=gifts.get(i).getWeight();
        }
        return tweight;
    }
    
}
