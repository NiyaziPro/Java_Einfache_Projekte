package switchAufgaben;

import java.util.Scanner;

public class P01_switchAufgabe {
    public static void main(String[] args) {
        //  Оценка от студент:
        //  Напишете програма, която приема оценка от 2 до 6 от студент и
        //  извежда съответното кратко съобщение за оценката
        //  (например "Отличен", "Много добър", "Добър" и т.н.).
        //  Използвайте switch конструкция, за да сравните оценката и да върнете съобщението.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Моля напишете оценката си :");
        int in = scanner.nextInt();

        String otsenka = "";

        switch (in) {

            case 2:
                otsenka = "Слаб";
                break;
            case 3:
                otsenka = "Среден";
                break;
            case 4:
                otsenka = "Добър";
                break;
            case 5:
                otsenka = "Много добър";
                break;
            case 6:
                otsenka = "Отличен ";
                break;
            default:
                otsenka="грешна : Въведете цифра от 2 до 6 !";

        }
        System.out.println("Оценката ви е " + otsenka);

    }
}
