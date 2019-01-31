import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        System.out.println("The idea of the game is the following: user sets the range of numbers in which\n" +
                "computer will create 3 random numbers. Than the computer asks the user to enter\n" +
                "3 numbers. This process continues until all 3 numbers are guessed (in this case\n" +
                "user wins) or if user made 10 attempts and did not guessed all 3 numbers (in this\n" +
                "case user loses).");
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        if (min > max) {
            max = min + max;
            min = max - min;
            max = max - min;
        }
        while (max - min < 10) {
            System.out.println("Warning!!!");
            min = sc.nextInt();
            max = sc.nextInt();

        }

        int c = (int) Math.floor(Math.random() * (max - min) + min);
        System.out.println("Enter the numbers");
        int d = sc.nextInt();
        line(c, d, sc);
    }


    public static void line(int c, int d, Scanner sc) {
        for (int i = 0; i < 10; i++) {
            if (c == d) {
                System.out.println("Congrats! You won the game with " + (10 - i) + "attempt/attempts");
                break;
            } else {
                System.out.println("You Lose. You have " + (10 - i) + "attempt/attempts");
                d = sc.nextInt();
            }

        }

    }
}
