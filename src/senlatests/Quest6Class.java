package senlatests;

import java.util.Scanner;

/**
 *
 * @author SVGOrel
 */
public abstract class Quest6Class {

    public static void getQuest() {
        System.out.println("QUEST #6. Delete all numbers from string");
        Scanner scan = new Scanner(System.in);
        String val;
        System.out.print("Input String : ");
        val = scan.nextLine();
        StringBuilder newVal = new StringBuilder();
        char c; int l = val.length();
        for (int i = 0; i < l; i++) {
            c = val.charAt(i);
            if (c >= '0' && c <= '9') {
            } else {
                newVal.append(c);
            }
        }
        System.out.println("Output String : " + newVal.toString());        
        scan.close();
    }
}
