package kalkulator_Projekte;

import java.util.Objects;
import java.util.Scanner;

public class P01_kalkulator {
    public static void main(String[] args) {
        // Въведете две числа от потребителя и след това извършете операцията,
        // която потребителят избере (+, -, *, /), за да получите резултата.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете две числа :");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println("Коя операция желаете да извършите : " +
                "               \n- За събиране   на тези числа моля напишете + " +
                "               \n- За изваждане  на тези числа моля напишете - " +
                "               \n- За умножаване на тези числа моля напишете * " +
                "               \n- За деление    на тези числа моля напишете / ");
        String str = scanner.next();

        if (Objects.equals(str, "+"))
            System.out.println("Сумата на тези две числа е :"+(a+b));
        else if (Objects.equals(str,"-")) {
            System.out.println("Разликата на тези две числа е : "+(a-b));
        } else if (Objects.equals(str,"*"))
            System.out.println( "Сумата от умножението на тези две числа е : "+(a*b));
        else if (Objects.equals(str,"/"))
            System.out.println("Сумата от делението на тези две числа е : "+(a*b));
        else System.out.println("Въведеният символ е невалиден !");




    }
}
