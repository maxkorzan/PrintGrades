import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String i = "y";

        //while loop to repeat prompt
        while (i.equalsIgnoreCase("y")) {
            //prompt user for score
            System.out.print("Enter an exam score: ");
            int score = keyboard.nextInt();

            //determining letter grade for score
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

            //prompting user to repeat or exit program
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
