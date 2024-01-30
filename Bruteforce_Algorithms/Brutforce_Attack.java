
package Bruteforce_Algorithms;


//public class Brutforce_Attack {
//
//    static void BruteforceAttack(String pass) {
//        int tries = 0;
//
//        for (char firstChar = 'a'; firstChar <= 'z'; firstChar++) {
//            for (char secondChar = 'a'; secondChar <= 'z'; secondChar++) {
//                for (char thirdChar = 'a'; thirdChar <= 'z'; thirdChar++) {
//                    String possibility = "" + firstChar + secondChar + thirdChar;
//
//                    tries++;
//                    if (possibility.equals(pass)) {
//                        
//                        System.out.println("The password '"+pass +"'"+" Has been cracked in "+ tries + " tries");
//                        return;
//                     }
//
//                }
//            }
//        }
//
//        System.out.println("Password not found after " + tries + " tries");
//        System.out.println("May be your password is more Or Less than 3 characters");
//    }
//
//    public static void main(String[] args) {
//        
//
//        BruteforceAttack("jsd");
//    }
//}

public class Brutforce_Attack {

    static void BruteforceAttack(String pass) {
        double startTime = System.currentTimeMillis();
        int tries = 0;

        for (char firstChar = 'a'; firstChar <= 'z'; firstChar++) {
            for (char secondChar = 'a'; secondChar <= 'z'; secondChar++) {
                for (char thirdChar = 'a'; thirdChar <= 'z'; thirdChar++) {
                    String possibility = "" + firstChar + secondChar + thirdChar;

                    tries++;
                    if (possibility.equals(pass)) {
                        double endTime = System.currentTimeMillis();
                        double elapsedTime = endTime - startTime;
                        double elapsedTimeInSec = elapsedTime/1000;
                        
                        System.out.println("The password '" + pass + "' has been cracked in " + tries + " tries.");
                        System.out.println("Time taken: "+elapsedTimeInSec+" Seconds or "+ elapsedTime + " milliseconds.");
                        return;
                    }
                }
            }
        }

        System.out.println("Password not found after " + tries + " tries");
        System.out.println("Maybe your password is more or less than 3 characters");
    }

    public static void main(String[] args) {
        BruteforceAttack("zzz");
    }
}




