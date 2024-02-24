import java.util.Scanner;

public class P03_kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете първото число :");
        double num1 = scanner.nextDouble();
        System.out.println("Въведете второто число :");
        double num2 = scanner.nextDouble();
        System.out.println("Изберете операция ( + , - , * , / ) :");
        char operator = scanner.next().charAt(0);
        double result;

        switch (operator){
            case '+' :
                result = num1+num2;
                System.out.println("Резултат : "+result);
                break;
            case '-' :
                result = num1-num2;
                System.out.println("Резултат : "+result);
                break;
            case '*' :
                result = num1*num2;
                System.out.println("Резултат : "+result);
                break;
            case '/' :
                if (num2!=0){
                    result = num1/num2;
                    System.out.println("Резултат : "+result);
                } else {
                    System.out.println("Грешка : деление на нула !");
                }
                break;
            default:
                System.out.println("Грешка : невалиден оператор !");
                break;

        }scanner.close();

    }
}
