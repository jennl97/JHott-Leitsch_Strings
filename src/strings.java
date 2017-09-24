import java.util.Scanner;


public class strings {
    public static void main (String[] args){
        int correctAnswer = 0;
        String userInput;
        Scanner scanner = new Scanner(System.in);

        System.out.println("General Trivia Quiz");
        System.out.println("  ");


        System.out.println("Where does Batman live?");
        userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("Gotham")){
            System.out.println("That is correct");
            correctAnswer++;
       } else {
            System.out.println("That is incorrect");
        }

        System.out.println("What sport is Babe Ruth famous for?");
        userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("Baseball")){
            System.out.println("That is correct");
            correctAnswer++;

        } else {
            System.out.println("That is incorrect");
        }
        System.out.println("Who is Peter Pan's sidekick?");
        userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("Tinkerbell")){
            System.out.println("That is correct");
            correctAnswer++;
        } else {
            System.out.println("That is incorrect");
        }
        System.out.println("What is the Hunchback of Notre Dame's name?");
        userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("Quasimodo")){
            System.out.println("That is correct");
            correctAnswer++;
        } else {
            System.out.println("That is incorrect");
        }
        System.out.println("Who turns everything they touch to gold?");
        userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("Midas")){
            System.out.println("That is correct");
            correctAnswer++;
        } else {
            System.out.println("That is incorrect");
        }

        System.out.println("You got " + correctAnswer + " correct");
    }
}
