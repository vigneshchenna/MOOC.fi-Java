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

public class Hold {
    private int maxWeight;
    private int currWeight=0;
    private ArrayList<Suitcase> hold;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        hold = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight()==0){
            return;
        }
        if(suitcase.totalWeight()+currWeight <= maxWeight){
            hold.add(suitcase);
            currWeight += suitcase.totalWeight();
        }
    }
    
    public String toString(){
        return hold.size()+" suitcases ("+currWeight+" kg)";
    }
    
    public void printItems(){
        if(hold.isEmpty()){
            System.out.println("no items (0 kg)");;
        }
        if(hold.size()==1){
            System.out.println("1 item ("+currWeight+" kg)");
        }
        for(Suitcase items : hold){
            items.printItems();
        }
    }
}
