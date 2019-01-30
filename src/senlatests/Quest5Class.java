package senlatests;

import java.util.Scanner;

/**
 *
 * @author SVGOrel
 */
public abstract class Quest5Class {

    private static boolean checkPolyndrom(String s) {
        int j = s.length();
        if (j < 2) {
            return false;
        }
        int l = s.length() / 2;
        for (int i = 0; i < l; i++) {
            j--;
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    
    public static void getQuest() {
        System.out.println("QUEST #5. Check for Polyndrom");
        Scanner scan = new Scanner(System.in);
        String val;
        System.out.print("Input String : ");
        val = scan.next();
        if (checkPolyndrom(val)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        scan.close();
    }
}
