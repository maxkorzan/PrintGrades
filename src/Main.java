import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String i = "y";

        //prompt user for score
        //System.out.print("Enter an exam score: ");
        //int score = keyboard.nextInt();

        while (i.equalsIgnoreCase("y")) {
            System.out.print("Enter an exam score: ");
            int score = keyboard.nextInt();

            if (score >= 90)
                System.out.println("Great job. Your grade is A.");
            else if (score >= 80)
                System.out.println("Good job. Your grade is B.");
            else if (score >= 70)
                System.out.println("Meh. Your grade is C.");
            else if (score >= 60)
                System.out.println("Good job. Your grade is D.");
            else {
                System.out.println("Go back to school");
            }

            while(true) {
                System.out.print("Do you want to enter another score (Y/N)? ");
                i = keyboard.next();

                if(i.equalsIgnoreCase("y")){
                    break;
                } else if(i.equalsIgnoreCase("n")){
                    break;
                } else {
                    System.out.println("Incorrect input, please try again.");
                }
            }
        }
    }
}
