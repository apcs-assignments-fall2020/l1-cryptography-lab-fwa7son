import java.util.Scanner;

// same problem as the other .java 
// good framework but doesnt past test 


public class Vigenere {
    public static String encryptVigenere(String message, String key) {
        String ReturnString = "";
        int KeyNum = Integer.parseInt(key);
        int MessageLen = message.length();
        for (int i = 0; i<MessageLen;i++){
            if (((message.charAt(i) >= 65) && (message.charAt(i)<=87)) || ((message.charAt(i)>= 97) && (message.charAt(i)<=119))) {
                ReturnString += (char)(message.charAt(i) + KeyNum);
            }
            else {
                ReturnString += (char)(message.charAt(i) - (26 - KeyNum));
            }
        }
        return ReturnString;
    }

    public static String decryptVigenere(String message, String key) {
        String ReturnString = "";
        int KeyNum = Integer.parseInt(key);
        int MessageLen = message.length();
        for (int i  = 0; i<MessageLen;i++) {
            if ( ((message.charAt(i) >= 68) && (message.charAt(i)<=90)) || ((message.charAt(i)>= 100) && (message.charAt(i)<=122)) ) {
                ReturnString += (char)(message.charAt(i) - KeyNum);
            }
            else {
                ReturnString += (char)(message.charAt(i) + (26 -KeyNum));
            }
        }
        return ReturnString;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptVigenere(message, key));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptVigenere(message, key));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
