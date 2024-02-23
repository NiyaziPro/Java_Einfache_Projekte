import java.util.Objects;
import java.util.Scanner;
import java.lang.String;
public class P01_kalkulator2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете  числo :");
        double a = scanner.nextDouble();
        System.out.println("Коя операция желаете да извършите : " +
                "               \n- За събиране   на тези числа моля напишете + " +
                "               \n- За изваждане  на тези числа моля напишете - " +
                "               \n- За умножаване на тези числа моля напишете * " +
                "               \n- За деление    на тези числа моля напишете / ");
        String str = scanner.next();

        System.out.println("Моля въведете числo :");
        double b = scanner.nextDouble();



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
