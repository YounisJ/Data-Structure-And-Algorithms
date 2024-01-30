package Bruteforce_Algorithms;

import java.util.Scanner;

//public class Brutforce_Algorithm {
//    
//    public static String bruteForce(String target) {
//        // Use only lowercase letters
//        String characters = "abcdefghijklmnopqrstuvwxyz";
//        int targetLength = target.length();
//        long attempts = 0; // Counter for attempts
//
//        // Iterate through all possible permutations
//        for (int i = 0; i < characters.length(); i++) {
//            for (int j = 0; j < characters.length(); j++) {
//                for (int k = 0; k < characters.length(); k++) {
//                    attempts++; // Increment attempts counter
//
//                    // Generate the current permutation
//                    String currentPerm = "" + characters.charAt(i) + characters.charAt(j) + characters.charAt(k);
//
//                    // Check if the current permutation matches the target
//                    if (currentPerm.equals(target)) {
//                        System.out.println("Attempts made: " + attempts);
//                        return currentPerm; // Password found, exit the method
//                    }
//                }
//            }
//        }
//
//        // Output the number of attempts made
//        System.out.println("Attempts made: " + attempts);
//        return null; // Target not found
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Step 1: Create a password
//        System.out.print("Step 1: Create a password (lowercase letters only): ");
//        String password = scanner.nextLine();
//        System.out.println("Password successfully created.");
//
//        // Step 2: Attempt to crack the password
//        System.out.println("Password cracking attempt...");
//
//        // Use brute-force with only lowercase letters
//        String crackedPassword = bruteForce(password);
//
//        // Step 3: Display the result
//        if (crackedPassword != null) {
//            System.out.println("Password cracked: " + crackedPassword);
//        } else {
//            System.out.println("Unable to crack the password.");
//        }
//    }
//
//}
import java.util.Scanner;

public class Brutforce_Algorithm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create a password
        System.out.print("Step 1: Create a password (lowercase letters only): ");
        String password = scanner.nextLine();
        System.out.println("Password successfully created.");

        // Step 2: Attempt to crack the password
        System.out.println("Password cracking attempt...");

        // Use brute-force with only lowercase letters
        String crackedPassword = bruteForce(password);

        // Step 3: Display the result
        if (crackedPassword != null) {
            System.out.println("Password cracked: " + crackedPassword);
        } else {
            System.out.println("Unable to crack the password.");
        }
    }

    // Brute-force method with automatic length adjustment
    public static String bruteForce(String target) {
        // Use only lowercase letters
        String characters = "abcdefghijklmnopqrstuvwxyz";
        long attempts = 0; // Counter for attempts

        // Iterate through different password lengths
        for (int passwordLength = 1; passwordLength <= target.length(); passwordLength++) {
            System.out.println("Attempting password length: " + passwordLength);

            // Nested loops for permutations
            boolean found = generateAndCheckPermutations(target, characters, passwordLength, attempts);
            if (found) {
                return target; // Password found, exit the method
            }
        }

        // Output the number of attempts made
        System.out.println("Attempts made: " + attempts);
        return null; // Target not found
    }

    // Helper method to generate and check permutations for a specific password length
    private static boolean generateAndCheckPermutations(String target, String characters, int passwordLength, long attempts) {
        // Iterate through all possible permutations
        for (int i = 0; i < characters.length(); i++) {
            for (int j = 0; j < characters.length(); j++) {
                // Add more loops for longer passwords if needed
                if (passwordLength > 2) {
                    for (int k = 0; k < characters.length(); k++) {
                        attempts++; // Increment attempts counter

                        // Generate the current permutation
                        String currentPerm = generatePermutation(characters, passwordLength, i, j, k);

                        // Check if the current permutation matches the target
                        if (currentPerm.equals(target)) {
                            System.out.println("Attempts made: " + attempts);
                            return true; // Password found, exit the method
                        }
                    }
                } else {
                    attempts++; // Increment attempts counter

                    // Generate the current permutation
                    String currentPerm = generatePermutation(characters, passwordLength, i, j);

                    // Check if the current permutation matches the target
                    if (currentPerm.equals(target)) {
                        System.out.println("Attempts made: " + attempts);
                        return true; // Password found, exit the method
                    }
                }
            }
        }
        return false; // Target not found for the current password length
    }

    // Helper method to generate a permutation for a specific password length
    private static String generatePermutation(String characters, int passwordLength, int... indices) {
        StringBuilder permutation = new StringBuilder();
        for (int i = 0; i < passwordLength; i++) {
            permutation.append(characters.charAt(indices[i]));
        }
        return permutation.toString();
    }
}
