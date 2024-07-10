

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(3);
    }
    public static void printFromNumberToOne(int num){
        int i = 0;
        while(num>i){
            System.out.println(num);
            num--;
        }
    }

}
