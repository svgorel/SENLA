package senlatests;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author SVGOrel
 */
public abstract class Quest3Class {

    public static void getQuest() {
        System.out.println("QUEST #3. Array.sort");
        Scanner scan = new Scanner(System.in);
        int valN=10;
        System.out.print("input size of array (integer value) >0 : ");
        valN = scan.nextInt(valN);
        while (valN <= 0) {
            System.out.print("Please, input integer value >0 : ");
            valN = scan.nextInt();
        }
        int[] array = new int[valN];
        int x=0;
        for (int i=0; i< valN; i++) {
            System.out.printf("Input integer value Array[%d]=", i);
            x=scan.nextInt();
            array[i]=x;
        }
        Arrays.sort(array);
        for (int i=valN-1; i>=0; i--) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        scan.close();
    }
}
