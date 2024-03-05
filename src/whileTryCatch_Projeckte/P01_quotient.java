package whileTryCatch_Projeckte;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P01_quotient {
    public static void main(String[] args) {
        // Поискайте  две цели числа от потребителя
        // отпечатайте частното на тези числа

        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean problem = true;

        while (problem){
            try {
                scanner = new Scanner(System.in);
                System.out.println("Въведете две цели числа : ");
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                problem=false;
            } catch (InputMismatchException e) {

                System.out.println("Грешка - въведете цяло число !");
            }
        }

        if (num2 == 0){
            System.out.println("Второто число не може да е 0 !");
        }else {
            System.out.println("Частното на числата  : " + num1 / num2);
        }

        System.out.println("Ако има проблем този ред ще работи !");
    }

}
