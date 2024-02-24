package switchAufgaben;

import java.util.Scanner;

public class P02_dayOfWeek {
    public static void main(String[] args) {
        // Тип на деня:
        //Напишете програма, която приема името на деня от седмицата и
        // извежда типа му - дали е работен, почивен или невалиден.
        // Използвайте switch конструкция, за да сравните името на деня и
        // да върнете съответния тип.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Моля въведете съответната цифра на деня от седмицата :");
        byte day = scanner.nextByte();
        String dayOfWeek= "";

        switch (day) {
            case 1:
                dayOfWeek="Понеделник";
                break;
            case 2:
                dayOfWeek="Вторник";
                break;
            case 3:
                dayOfWeek="Сряда";
                break;
            case 4:
                dayOfWeek="Четвъртък";
                break;
            case 5:
                dayOfWeek="Петък";
                break;
            case 6:
                dayOfWeek="Събота";
                break;
            case 7:
                dayOfWeek="Неделя";
                break;
            default:
                dayOfWeek= "Невалиден ден !";
                break;
        } if (day==1||day==2||day==3||day==4||day==5)
            System.out.println(dayOfWeek+" е работен ден !");
        else if (day==6||day==7)
            System.out.println(dayOfWeek+" е почивен ден ! Relax :) ");
        else System.out.println("Невалиден ден от седмицата !");

    }
}
