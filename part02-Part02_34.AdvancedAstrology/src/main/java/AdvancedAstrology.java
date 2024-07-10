
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int stars = 0;
        while (stars < number) {
            System.out.print("*");
            stars++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int spaces = 0;
        while (spaces < number) {
            System.out.print(" ");
            spaces++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int stars = 1;
        int spaces = size;
        while (stars <= size) {
            printSpaces(spaces-1);
            spaces--;
            printStars(stars);
            stars++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int stars = 1;
        int spaces = height;
        while (stars <= height) {
            printSpaces(spaces-1);
            spaces--;
            printStars(2 * stars - 1);
            stars++;
        }

        int i = 0;
        while (i < 2) {
            printSpaces(height - 2);
            printStars(3);
            i++;
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
