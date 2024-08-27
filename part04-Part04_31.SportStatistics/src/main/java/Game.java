/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vignesh
 */
public class Game {
    private String homeTeam;
    private String awayTeam;
    private int homePoints;
    private int awayPoints;
    
    public Game(String hTeam, String aTeam, int hPoints, int aPoints){
        this.homeTeam = hTeam;
        this.awayTeam = aTeam;
        this.homePoints = hPoints;
        this.awayPoints = aPoints;
    }
    
    public String getHomeTeam(){
        return this.homeTeam;
    }
    
    public String getAwayTeam(){
        return this.awayTeam;
    }
    
    public boolean winnerTeam(String teamName){
        if((teamName.equals(this.homeTeam)&& this.homePoints>this.awayPoints)|| (teamName.equals(this.awayTeam)&& awayPoints> homePoints)){
            return true;
        }
        
    
        return false;
    }
    
}
