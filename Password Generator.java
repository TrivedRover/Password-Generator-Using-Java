import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {
        
        // Define requirements for the password
        int length = 10; 
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz"; 
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()_+=-{}[]|;:,<.>/?";
        
        // Create a random object
        Random random = new Random();
        
        // Define allowed characters by concatenating requirements 
        String allowedChars = capitalLetters + smallLetters + numbers + symbols;

        // Use random method to generate password
        char[] password = new char[length];
        for(int i=0; i<length; i++) {
            password[i] = allowedChars.charAt(random.nextInt(allowedChars.length()));
        }
        
        // Print generated password
        System.out.println(new String(password)); 
    }
}