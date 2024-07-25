package org.example;
import java.util.Scanner;

public class ChatBot {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a Scanner object to read user input

        //calling methods to perform chatbot functions
        greetUser(scanner);
        repeatName(scanner);
        guessAge(scanner);
        countToNumber(scanner);
        testProgrammingKnowledge(scanner);


    }
// Method to greet the user and ask for their name

    public static void greetUser(Scanner scanner) {
        System.out.println("Hello! I'm your Chat Bot friend!");
        System.out.println("What's your name?");
    }

    public static void repeatName(Scanner scanner) {
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");
    }

    public static void guessAge(Scanner scanner) {
        System.out.println("Let me guess your age?");

        //guessing age using age ranges

        int lowerBound = 0;
        int upperBound = 100;

        int guess;
        String response;

        //Qs to narrow down the age range
        System.out.println("Did you graduate high school before 2005? (yes/no)");
        response = scanner.nextLine();
        if (response.equals("yes")) {
            upperBound = 35; //assuming person is 18 in 2005
            lowerBound = 18;
        }
        System.out.println("Do you know what a floppy disc is? (yes/no)");
        response = scanner.nextLine();
        if (response.equals("yes")) {
            upperBound = (upperBound < 35) ? upperBound : 45;
        } else {
            lowerBound = (upperBound > 18) ? lowerBound : 25;
        }
        while (true) {
            guess = (lowerBound + upperBound) / 2;
            System.out.println("Your age is " + guess + "?. If not, respond with 'higher', 'lower', or 'correct') ");

            response = scanner.nextLine();
            if (response.equalsIgnoreCase("higher")) {
                lowerBound = (lowerBound + upperBound) / 2;

            } else if (response.equalsIgnoreCase("lower")) {
                upperBound = (lowerBound + upperBound) / 2;
            } else if (response.equalsIgnoreCase("correct")) {
                System.out.println("Yay! I guessed your age correctly.");
                break;
            } else {
                System.out.println("Invalid response. Please respond with 'higher', 'lower', or 'correct'.");
            }
        }
    }

    public static void countToNumber(Scanner scanner) {
        System.out.println("Enter any number and I can count it for you:");

        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println(i);
        }
        scanner.nextLine();

    }

    public static void testProgrammingKnowledge(Scanner scanner) {
        System.out.println("Let's test your Programming Knowledge.");
        System.out.println("Why would you choose an ArrayList over an array in Java?");
        System.out.println("a) ArrayList has a fixed size, while an array is dynamic.");
        System.out.println("b) ArrayList can grow and shrink in size dynamically, while an array has a fixed size.");
        System.out.println("c) ArrayList is more memory efficient than an array.");
        System.out.println("d) ArrayList does not allow duplicate elements, while an array does.");

        String answer;
        while (true) {
            answer = scanner.nextLine();
            if (answer.equals("b")) {
                System.out.println("Yay! You guessed correctly.");
                break;
            } else {
                System.out.println("Please, try again.");
            }
        }
    }
}


