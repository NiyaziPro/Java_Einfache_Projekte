package listAufgaben_Projekte;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class P01_projekt_List {
    public static void main(String[] args) {
        // Въпрос: Създайте два списъка с низове, като вземете стойности от потребителя.
        //         // Потребителят трябва да натисне 0, за да спре да въвежда стойности.
        //         // След като са създадени два списъка, подгответе изход, както следва
        //         // списък1 : …….
        //         // списък2 : …….
        //         // общи елементи: …….

        System.out.println("Въвеждане на текст за първия списък: ");
        List<String> list1 = listCreating();

        System.out.println("Въвеждане на текст за втори списък : ");
        List<String> list2 = listCreating();

        System.out.println("Списък 1 : " + list1);
        System.out.println("Списък 2 : " + list2);

        list1.retainAll(list2);

        System.out.println("Общи елементи : " + list1);

    }


    public static List<String>  listCreating(){

        List<String> nameList = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        String input = "";

        while (!input.equals("0")){
            System.out.println("Моля, въведете текст за добавяне към списъка... " +
                    "\nНатиснете 0 за край");

            input = scan.nextLine();

            if (!input.equals("0")){
                nameList.add(input);
            }
        }

        return nameList;
    }
}
