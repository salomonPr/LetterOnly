package ExceptionHandling;

import java.util.Scanner;

public class LetterOnly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name ");

        String name = scanner.nextLine();

        if (name==null || name.trim().isEmpty() ){
            throw new IllegalArgumentException("fill name space empty");
        }

        if (!name.matches("[a-zA-z\\s]+")){
            //[a-zA-Z]: here is to allow letter from a-z in lowercase and A-Z in uppercase
            // here this is for \\s: to allow space in the given space
            // plus (+): is to allow at least one character
            throw new IllegalArgumentException("name must contain letter only");
        }

        System.out.println("thank you " + name + " for respond ");
    }

}
