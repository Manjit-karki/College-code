//INFO: Lab work: Abstraction


import java.util.Scanner;

public interface Messaging{
    public String getMessage();
    public void print();
    public String getRecipient();
    default void printConnection(){
        System.out.println("connection is successful");
    } 
}
public class SMS implements Messaging {
    @Override
    public String getMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your message: ");
        return scanner.nextLine();
    }
    @Override
    public String getRecipient() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter recipient mobile number: ");
        String number = scanner.nextLine();
        if (number.length()==10) {
            return number;
        } else {
            return "Invalid mobile number";
        }
    }
    @Override
    public void print() {
        String recipient = getRecipient();
        String message = getMessage();
        if (recipient.equals("Invalid mobile number")) {
            System.out.println("Failed to send message: " + recipient);
        } else {
            System.out.println("Message to " + recipient + ": " + message);
        }
    }
}


public class Email implements Messaging {
    @Override
    public String getMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your message: ");
        return scanner.nextLine();
    }
    @Override
    public String getRecipient() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Email address: ");
        return scanner.nextLine();
    }
    @Override
    public void print() {
        String recipient = getRecipient();
        String message = getMessage();
        System.out.println("Message to " + recipient + ": " + message);
    }
}


public class MessagingService {
    public static void main(String[] args) {
        Messaging sms = new SMS();
        sms.printConnection();
        sms.print();
        System.out.println(); 
        Messaging email = new Email();
        email.printConnection();
        email.print();
    }
}
