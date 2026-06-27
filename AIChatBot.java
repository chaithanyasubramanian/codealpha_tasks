import java.util.Scanner;
public class AIChatBot{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("===== AI CHATBOT =====");
        String s;
        do{
        System.out.print("YOU: ");
        s=sc.nextLine();
        switch(s.toLowerCase()){
            case "hello":
                System.out.println("Bot: Hello! Nice to meet you.");
                break;
            case "bye":
                System.out.println("Bot: Goodbye! Have a nice day!");
                break;
            case "how are you":
                System.out.println("Bot: I am doing great! Thank you for asking.");
                break;
            case "what is your name":
                System.out.println("Bot: I'm a simple Java AI Chatbot created to answer basic questions.");
                break;
            case "who created you":
                System.out.println("Bot: I was created by Chaithanya using Java.");
                break;
            case "good morning":
                System.out.println("Bot: Good Morning! Have a wonderful day!");
                break;

            case "thank you":
                System.out.println("Bot: You're welcome!");
                break;

            case "what can you do":
                System.out.println("Bot: I can answer simple questions and have a basic conversation.");
                break;

            case "who are you":
                System.out.println("Bot: I'm your Java AI ChatBot.");
                break;
            default:
                System.out.println("Bot: Sorry, I don't understand.");
        }
    }while(!s.equalsIgnoreCase("Bye"));
    sc.close();
}}