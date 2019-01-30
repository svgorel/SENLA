package senlatests;

import java.util.Scanner;

/**
 *
 * @author SVGOrel
 */
public abstract class Quest2Class {

    private static int recurFybonaccy(int n) {
        if (n<2) return n;
        else return recurFybonaccy(n-2) + recurFybonaccy(n-1);
    }
    
    public static void getQuest() {
        System.out.println("QUEST #2. Fybonachy");
        System.out.println("for quit input integer value <=0");
        System.out.println();
        int valN = 1; // value N
        Scanner scan = new Scanner(System.in);
        while (valN > 0) {
            System.out.print("input integer value >0 : ");
            valN = scan.nextInt();
            if (valN > 0) {                
                System.out.println(recurFybonaccy(valN));
            }
        }
        scan.close();
    }
}
