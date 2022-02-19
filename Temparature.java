package temparature;

import java.util.Scanner;

public class Temparature {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int temparature;

        System.out.print("What is the temperature? ");
        temparature = scanner.nextInt();
        scanner.close();
        if (temparature < 5) {
            System.out.println("You should ski");
        } else if (5 <= temparature && temparature <= 15) {
            System.out.println("You should go to the movies");
        } else if (15 < temparature && temparature <= 25) {
            System.out.println("You should have a picnic");
        } else {
            System.out.println("You should swim");
        }
    }
}
