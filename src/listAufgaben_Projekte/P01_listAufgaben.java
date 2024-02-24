package listAufgaben_Projekte;

import java.util.ArrayList;
import java.util.Scanner;

public class P01_listAufgaben {
    public static void main(String[] args) {
        // Списък със Задачи: Направете простo приложение за списък със задачи,
        // където потребителят може да добавя и премахва задачи.

        Scanner scanner=new Scanner(System.in);
        ArrayList <String> tasks = new ArrayList<>();

        while (true) {
            // Извеждане на менюто
            System.out.println("Изберете опция:");
            System.out.println("1. Добави задача");
            System.out.println("2. Изтрий задача");
            System.out.println("3. Изход");

            // Четене на избора на потребителя
            int choice = scanner.nextInt();
            scanner.nextLine(); // Изчистване на новия ред

            switch (choice) {
                case 1:
                    // Добавяне на задача
                    System.out.print("Въведете задача: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Задачата е добавена успешно!");
                    break;
                case 2:
                    // Изтриване на задача
                    if (tasks.isEmpty()) {
                        System.out.println("Няма налични задачи за изтриване.");
                    } else {
                        System.out.println("Изберете номер на задачата за изтриване:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        int taskIndex = scanner.nextInt();
                        scanner.nextLine(); // Изчистване на новия ред
                        if (taskIndex > 0 && taskIndex <= tasks.size()) {
                            tasks.remove(taskIndex - 1);
                            System.out.println("Задачата е изтрита успешно!");
                        } else {
                            System.out.println("Невалиден номер на задачата!");
                        }
                    }
                    break;
                case 3:
                    // Изход от програмата
                    System.out.println("Довиждане!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Невалиден избор! Моля, изберете отново.");
            }
        }


    }
}
