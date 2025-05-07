import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a dark forest. What do you do?");
        System.out.println("1. Go deeper into the forest");
        System.out.println("2. Turn back");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            System.out.println("You venture deeper and encounter a mysterious figure.");
            System.out.println("Do you:");
            System.outprintln("1. Approach the figure");
            System.out.println("2. Hide");

            choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("The figure offers you a magical sword. You accept and continue your journey.");
            } else if (choice.equals("2")) {
                System.out.println("You hide and the figure disappears. You continue cautiously.");
            } else {
               System.out.println("Invalid choice, you stumble and fall.");
            }
        } else if (choice.equals("2")) {
            System.out.println("You turn back and find your way out of the forest.");
        } else {
            System.out.println("Invalid choice, you remain lost in the forest.");
        }
        System.out.println("Game Over.");
        scanner.close();
    }
}
