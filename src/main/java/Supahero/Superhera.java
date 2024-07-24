package Supahero;
import java.util.Scanner;
public class Superhera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's write a story about a superhero");
        System.out.println("Who is the hero of our story?");
        String Legend = scanner.nextLine();
        System.out.println("What's the hero's superpower?");
        String Ability = scanner.nextLine();
        System.out.println("Here is the story: ");
        System.out.println("There was once a hero named " + Legend + " Who had the ability of " + Ability +
                "\n As " + Legend + " Grew older, they saw that hey were needed");
        System.out.println(Legend + " Used the almighty " + Ability + " to save the world");

    }
}

