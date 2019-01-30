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
        String newVal = val.replaceAll("\\d+", "");
        System.out.println("Output String : " + newVal.toString());        
        scan.close();
    }
}
