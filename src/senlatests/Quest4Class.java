package senlatests;

import java.util.Scanner;

/**
 *
 * @author SVGOrel
 */
public abstract class Quest4Class {

    public static void getQuest() {
        System.out.println("QUEST #4. Two Boolean is True");
        Scanner scan = new Scanner(System.in);
        int arrayLen=4;
        boolean[] array = new boolean[arrayLen];
        boolean x=false;
        int cnt=0;
        for (int i=0; i< arrayLen; i++) {
            System.out.printf("Input boolean value Array[%d]=", i);
            x=scan.nextBoolean();
            array[i]=x;
            if (x) cnt++;
        }
        if (cnt==2) System.out.println("True");
        scan.close();
    }
}
