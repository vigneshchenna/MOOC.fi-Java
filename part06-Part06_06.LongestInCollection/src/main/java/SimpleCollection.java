
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    String longest="";
    public String longest(){
        
        if(elements.isEmpty()){
            return null;
        }
        
        for(String lng: elements){
            if(longest.length()< lng.length()){
                longest=lng;
            }
        }
        return longest;
    }

}
