package senlatests;

import java.util.Scanner;

/**
 *
 * @author SVGOrel
 */
public class SENLATests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Choise of variant Quest : ");
        Scanner scan = new Scanner(System.in);
        int variant=scan.nextInt();
        switch (variant) {
            case 1: Quest1Class.getQuest();break;
            case 2: Quest2Class.getQuest();break;
            case 3: Quest3Class.getQuest();break;
            case 4: Quest4Class.getQuest();break;
            case 5: Quest5Class.getQuest();break;
            case 6: Quest6Class.getQuest();break;
        }
        scan.close();
    }
}