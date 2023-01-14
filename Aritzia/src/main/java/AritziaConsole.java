import persistence.JsonReader;
import persistence.JsonWriter;

import java.util.Scanner;

public class AritziaConsole {
    private static String JSON_STORE;
    private Client client;
    private final Scanner userInput;
    private JsonWriter jsonWriter;
    private JsonReader jsonReader;
    String selection = "";


    public AritziaConsole(){
        userInput = new Scanner(System.in);
        System.out.println("Hi, this is Ari, your personal stylist @ Aritzia. \n How can I help you today?");
        startSurvey();

    }

    private void startSurvey() {
        System.out.println("What is your name?");
        selection = userInput.next();
        client = new Client(selection);
        System.out.println("Welcome " + selection + "!");
        System.out.println("What is your age?");
        selection = userInput.next();
        client.setAge(selection);
        System.out.println("Your age: " + selection);
        System.out.println("Which word best describes your job?" +
                "\n Medical \n Office  / Teaching \n Manual labor / Contruction \n Service Industry / Retail");
        selection = userInput.next();
        client.setIndustry(selection);
        System.out.println("Thank you for your answers! We'll now ask some basic questions in order to give you" +
                "the best possible recommendations.");
        System.out.println("Question 1: personality");
        System.out.println("Question 2: lunch or dinner?");
        System.out.println("Question 3: neutrals or colour");
        System.out.println("Question 4: mountain or beach person?");
        System.out.println("Style icon?");
        System.out.println("Occasion");
        System.out.println();
    }


}
