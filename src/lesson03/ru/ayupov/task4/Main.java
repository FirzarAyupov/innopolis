package lesson03.ru.ayupov.task4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        System.out.println(randomNumber);
        for (int i = 10; i > 0; i--) {
            System.out.println("Количство попыток: " + i);
            System.out.println("Введите число в диапозоне от 0 до 100:");

            Scanner sc = new Scanner(System.in);
            int inputNumber = sc.nextInt();

            if (inputNumber < 0 || inputNumber > 100) {
                System.out.println("Вы вевели не ввели число вне диапозона от 0 до 100!");
                continue;
            }

            if (randomNumber == inputNumber) {
                System.out.println("Вы угадали!");
            } else {
                int difference = Math.abs(randomNumber - inputNumber);
                if (difference > 10) {
                    System.out.println("Холодно");
                } else if (difference < 10) {
                    System.out.println("Тепло");
                }
            }

        }
    }
}
