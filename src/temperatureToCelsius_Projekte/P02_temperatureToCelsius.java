package temperatureToCelsius_Projekte;
import java.util.Scanner;
public class P02_temperatureToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на стойност на температурата от потребителя
        System.out.print("Въведете стойност на температурата: ");
        double temperature = scanner.nextDouble();

        // Въвеждане на мерната единица от потребителя (C за Целзий, F за Фаренхайт)
        System.out.print("Въведете мерната единица (C за Целзий, F за Фаренхайт): ");
        char unit = scanner.next().charAt(0);

        double convertedTemperature;

        // Преобразуване на температурата според избраната мерна единица
        if (unit == 'C' || unit == 'c') {
            // Преобразуване от Целзий към Фаренхайт
            convertedTemperature = (temperature * 9/5) + 32;
            System.out.println("Температурата във Фаренхайт: " + convertedTemperature + " F");
        } else if (unit == 'F' || unit == 'f') {
            // Преобразуване от Фаренхайт към Целзий
            convertedTemperature = (temperature - 32) * 5/9;
            System.out.println("Температурата в Целзий: " + convertedTemperature + " C");
        } else {
            System.out.println("Грешка: Невалидна мерна единица!");
        }

        scanner.close();
    }
}
