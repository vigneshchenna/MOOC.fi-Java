
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String fileName = scan.nextLine();
        
        System.out.println("Team: ");
        String team = scan.nextLine();
        int wins =0;
        
        ArrayList<Game> games = readFromFile(fileName);
        
        ArrayList<Game> teamGames = new ArrayList<>();
        
        for(Game game:games){
            if(team.equals(game.getHomeTeam())|| team.equals(game.getAwayTeam())){
                teamGames.add(game);
            }
        }
        
        System.out.println("Games: "+ teamGames.size());
        
        
        
        for(Game game:teamGames){
            if(game.winnerTeam(team)){
                wins++;
            }
        }
        
        System.out.println("Wins: "+ wins);
        System.out.println("Losses: "+ (teamGames.size()-wins));
        
        
    }
    
    public static ArrayList<Game> readFromFile(String fileName){
        ArrayList<Game> games = new ArrayList<>();
        
        try(Scanner scan = new Scanner(Paths.get(fileName))){
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                
                String[] parts = line.split(",");
                
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int awayPoints = Integer.valueOf(parts[3]);
                
                games.add(new Game(homeTeam, awayTeam, homePoints, awayPoints));
            } 
        } catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
        
        return games;
    }

}
