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
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        if (joke.isBlank()) {
            return;
        }
        jokes.add(joke);
    }

    public String drawJoke() {
        if(jokes.isEmpty()){
            return "Jokes are in short supply.";
        }
        Random draw = new Random();
        int index = draw.nextInt(jokes.size());
        return jokes.get(index);
    }

    public void printJokes() {
        if(jokes.isEmpty()){
            return;
        }
        
        for (int i = 0; i < jokes.size(); i++) {
            System.out.println(jokes.get(i));
        }
    }
}
