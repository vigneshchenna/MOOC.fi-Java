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

public class Record {

    private ArrayList<Integer> pointsList;
    public Record() {
        this.pointsList = new ArrayList<>();
    }

    public void addPoints(int points) {
        if (points < 101 && points > -1) {
            pointsList.add(points);
        }
        
    }

    public void print(){
        double sum =0;
        double passingSum = 0;
        int numberOfPassing = 0;
        
        for(int points:pointsList){
            sum = sum + points;
            if(points>=50){
                passingSum = passingSum + points;
                numberOfPassing++;
            }
        }
        
        System.out.println("Point average (all): "+sum/pointsList.size());
        if(numberOfPassing>0){
            System.out.println("Point average (passing): "+passingSum/numberOfPassing);
        } else{
            System.out.println("Point average (passing): -");
        }
        
        System.out.println("Pass percentage: "+(100.0*numberOfPassing)/pointsList.size());
        
        System.out.println("Grade distribution:");
        for(int i = 5; i>=0;i--){
            System.out.println(i + ": "+ printStars(i));
        }
    }
    
    private String printStars(int grade){
        int howManyStars =0;
        
        for(Integer points:pointsList){
            if(convertToGrade(points)==grade){
                howManyStars++;
            }
        }
        return stars(howManyStars);
    }
    
    private String stars(int n){
        String stars = "";
        
        for(int i = 0; i<n;i++){
            stars += "*";
        }
        return stars;
    }
    
    private int convertToGrade(int pointAmount){
        int grade = 5;
        if(pointAmount <50){
            grade =0;
        } else if(pointAmount <60){
            grade =1;
        } else if(pointAmount <70){
            grade =2;
        } else if (pointAmount <80){
            grade =3;
        } else if(pointAmount <90){
            grade =4;
        }
        return grade;
    }
    
    
}
