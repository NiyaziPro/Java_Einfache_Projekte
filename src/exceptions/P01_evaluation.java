package exceptions;

import java.util.Scanner;

public class P01_evaluation {
    public static void main(String[] args) {
        //  Попитайте потребителя за неговата оценка(точки)
        //      - отпечатайте успешно или неуспешно
        //      - хвърля IllegalArgumentException,
        //      ако потребителят въведе невалидна оценка

        Scanner scanner=new Scanner(System.in);
        System.out.println("Въведете вашата бележка : ");
        double note = scanner.nextDouble();
        if (note<0 || note>100){
            throw new IllegalArgumentException("Невалидна оценка!");
        }else if (note<50){
            System.out.println("Точките Ви не са достатъчни да преминете :(");
        }else
            System.out.println("Честито. Преминахте Успешно :)");


        /*АКО искаме да се случи изключение във всяка ситуация
             В този случай, ако Java няма готово изключение
             използваме ключова дума throw
             Можем да направим изключение

             Също така, ако искаме да изпратим кода на друго място в определена ситуация
             Можем да създадем изключение, като кажем throw new ...*/
    }
}
