import Zoo.*;
import Zoo.Elephant;
import Zoo.Panda;
import Zoo.Tiger;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----IN A ZOO-----");

            HashMap<Integer, ZooAnimals> anList = new HashMap<>();
            anList.put(1, new Tiger());
            anList.put(2, new Elephant());
            anList.put(3, new Panda());
            anList.put(4, new Straus());
            anList.put(5, new Peacock());
            anList.put(6, new Goldfish());

            anList.forEach((key, value) -> System.out.print(key + ":" + value.getClass() + "\n"));
            System.out.println();

            System.out.println("-----------------------------------------------");
            while (true) {
                System.out.println("Choose an animal:");
                int number = new Scanner(System.in).nextInt();
                System.out.println(anList.get(number));
                if (number > 6 | number < 1)
                    break;
            }
        }



}




