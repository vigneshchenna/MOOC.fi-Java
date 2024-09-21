
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

    public void ifEmpty() {
        if (this.elements.isEmpty()) {
            System.out.println("The collection characters is empty.");
        }
    }

    @Override
    public String toString() {

        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        String list = "";
        for (String item : this.elements) {
            if (this.elements.size() == 1) {
                list = list + item;
            } else {
                list = list +item+"\n";
            }
        }
        if (this.elements.size() == 1) {
            return "The collection " + this.name + " has " + this.elements.size() + " element:\n" + elements.get(0);
        }
        return "The collection " + this.name + " has " + this.elements.size() + " elements:\n" + list;
    }
}
