package temperatureToCelsius_Projekte;

import java.util.Scanner;

public class P01_temperatureToCelsius {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Моля въведете стойност на температурата :");
        double temperature = scanner.nextInt();
        System.out.println("За целзий натиснете 'С' , за фаренхайт натиснете 'F' :");
        char ch = scanner.next().charAt(0);

        if (ch=='C'||ch =='c'){ // °F = (°C x 1.8) + 32
            System.out.println("Въведените "+temperature+"°C са "+((temperature*1.8)+32)+"°F");

        }else if (ch=='F'||ch =='f'){ // °C = (°F - 32) × 5/9
            System.out.println("Въведените "+temperature+"°F са "+((temperature-32)*5/9)+"°C");

        }else System.out.println("Некоректни данни !");

        scanner.close();
    }
}
