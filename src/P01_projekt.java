
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class P01_projekt {
    public static void main(String[] args) {
        // Въпрос: Създайте два списъка с низове, като вземете стойности от потребителя.
        //         // Потребителят трябва да натисне 0, за да спре да въвежда стойности.
        //         // След като са създадени два списъка, подгответе изход, както следва
        //         // списък1 : …….
        //         // списък2 : …….
        //         // общи елементи: …….

        System.out.println("Въвеждане на текст за първия списък: ");
        List<String> liste1 = listeOlustur();

        System.out.println("Въвеждане на текст за втори списък : ");
        List<String> liste2 = listeOlustur();

        System.out.println("Списък 1 : " + liste1);
        System.out.println("Списък 2 : " + liste2);

        liste1.retainAll(liste2);

        System.out.println("Общи елементи : " + liste1);

    }


    public static List<String>  listeOlustur(){

        List<String> isimList = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        String girilenMetin = "";

        while (!girilenMetin.equals("0")){
            System.out.println("Моля, въведете текст за добавяне към списъка... " +
                    "\nНатиснете 0 за край");

            girilenMetin = scan.nextLine();

            if (!girilenMetin.equals("0")){
                isimList.add(girilenMetin);
            }
        }

        return isimList;
    }
}
