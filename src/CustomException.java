import java.util.Scanner;

// TODO: Create class InvalidAgeException extends Exception
class InvalidAgeException extends Exception {
    // Create a constructor that accepts a message string and passes it to super(message)
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {
    
    // TODO: Create a static method validate(int age) that throws InvalidAgeException
    public static void validate(int age) throws InvalidAgeException {
        // Check if age < 18, throw new InvalidAgeException("Not eligible to vote")
        if (age < 18) {
            throw new InvalidAgeException("Not eligible to vote");
        } 
        // Else print "Eligible to vote"
        else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Read age
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            
            try {
                validate(age);
            } catch (InvalidAgeException e) {
                // Print "Exception: " followed by the exception message
                System.out.println("Exception: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
}
