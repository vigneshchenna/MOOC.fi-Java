
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points_list;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points_list = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points_list.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double sumOfGrades() {
        int sum =0;
        
        for(int i =0; i<grades.size(); i++){
            sum = sum + grades.get(i);
        }
        
        return sum;
    }

    public double averageOfGrades() {

        if (grades.isEmpty()) {
            return -1;
        }
        double avg = sumOfGrades()/grades.size();
        return avg;
    }
    
    public double sumOfPoints(){
        int sum =0;
        for(int i =0;i<points_list.size();i++){
            sum = sum + points_list.get(i);
        }
        return sum;
    }
    
    public double averageOfPoints(){
        if(points_list.size()==0){
            return -1;
        }
        
        return sumOfPoints()/points_list.size();
    }
}
