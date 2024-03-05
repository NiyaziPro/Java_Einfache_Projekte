package whileTryCatch_Projeckte;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P02_sumNumbers {
    public static void main(String[] args) {
        // Помолете потребителя за целите числа, които да бъдат сумирани
        //      - потребителят трябва да натисне Q, за да спре въвеждането на число
        //      - когато потребителят натисне Q, колко общо числа са въведени
        //      - и отпечата сумата на въведените числа


        Scanner scanner=new Scanner(System.in);
        int inputNum=0;
        int numOfIssues = 0;
        int sum = 0;
        String str = "a";

        while (!str.equalsIgnoreCase("Q")) {
            System.out.println("Въведете цели числа, за да добавите\n натиснете Q, за да завършите");

            try {
                inputNum = scanner.nextInt();
                sum += inputNum;
                numOfIssues++;
            } catch (InputMismatchException e) {
                str = scanner.nextLine();
                if (!str.equalsIgnoreCase("Q")) {
                    System.out.println("Или въведете цяло число, или натиснете Q, за да завършите!");
                }
            }
        }
        System.out.println("Сумата от въведените " + numOfIssues + " цели числа : " + sum);
    }
}
