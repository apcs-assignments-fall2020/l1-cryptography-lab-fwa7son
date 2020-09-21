import java.util.Scanner;

// almost done --- doesnt pass tests
// I have developed a coding framwork that I could easily fix with more time.

public class Caesar {
    public static String encryptCaesar(String message) {
        String ReturnString = "";
        int MessageLen = message.length();
        for (int i = 0; i<MessageLen;i++){
            if (((message.charAt(i) >= 65) && (message.charAt(i)<87)) || ((message.charAt(i)>= 97) && (message.charAt(i)<119))) {
                ReturnString += (char)(message.charAt(i) + 3);
            }
            else {
                ReturnString += (char)(message.charAt(i) - 23);
            }
        }
        return ReturnString;
    }

    public static String decryptCaesar(String message) {
        String ReturnString = "";
        int MessageLen = message.length();
        for (int i  = 0; i<MessageLen;i++) {
            if ( ((message.charAt(i) >= 68) && (message.charAt(i)<=90)) || ((message.charAt(i)>= 100) && (message.charAt(i)<=122)) ) {
                ReturnString += (char)(message.charAt(i) - 3);
            }
            else {
                ReturnString += (char)(message.charAt(i) + 23);
            }
        }
        return ReturnString;
    }

    public static String encryptCaesarKey(String message, int key) {
        return message; //THIS IS ON THE OTHER FILE //THIS IS ON THE OTHER FILE
        // REPLACE THIS WITH YOUR CODE
    }

    public static String decryptCaesarKey(String message, int key) {
        return message; //THIS IS ON THE OTHER FILE //THIS IS ON THE OTHER FILE
        // REPLACE THIS WITH YOUR CODE
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptCaesar(message));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptCaesar(message));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
