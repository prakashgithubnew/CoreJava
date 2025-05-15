package CoreJavaPractise.HandsOn.Stringoperations;

import java.util.Scanner;

public class CheckOccurrenceOfCharInString {
    public static void main(String[] args) {
        // Step 1: Read the string and the substring from the user
        String t="prakashkash";
        String substring="kash";
        int fromIndex = 0;
        System.out.println(t.indexOf(substring, fromIndex));
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the main string: ");
            String mainString = scanner.nextLine();

            System.out.print("Enter the substring to search for: ");
            String substring2 = scanner.nextLine();

            // Step 2: Count occurrences of the substring
            int count = 0;
            int fromIndex1 = 0;

            while ((fromIndex1 = mainString.indexOf(substring2, fromIndex1)) != -1) {
                count++;
                fromIndex1+= substring2.length();
            }

            // Step 3: Display the count of occurrences
            System.out.println("The substring '" + substring2 + "' occurs " + count + " times.");
        }
    }
}
