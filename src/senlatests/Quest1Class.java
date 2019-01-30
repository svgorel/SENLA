package senlatests;

import java.util.Scanner;

/**
 *
 * @author SVGOrel
 */
public abstract class Quest1Class {

    public static void getQuest() {
        System.out.println("QUEST #1. Simple number ?");
        System.out.println("for quit input integer value <=0");
        System.out.println();
        int valN = 1; // value N
        boolean isSimple; // value is Simple. need for loop
        Scanner scan = new Scanner(System.in);
        while (valN > 0) {
            System.out.print("input integer value >0 : ");
            valN = scan.nextInt();
            if (valN > 0) {
                for (int i = 1; i <= valN; i++) 
                if (i>1) { // вот приходится делать такой костыль :) ибо в ТЗ написано - делай с единицы,
                           // а простые числа - больше единицы
                    isSimple = true;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            isSimple = false;
                            break;
                        }
                    }
                    if (isSimple) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }
        }
        scan.close();
    }
}
