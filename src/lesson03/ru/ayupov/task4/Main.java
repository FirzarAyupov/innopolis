package lesson03.ru.ayupov.task4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        int lastNumber = 0;
        boolean less;

        for (int i = 10; i > 0; i--) {
            System.out.println("Количство попыток: " + i);
            System.out.println("Введите число в диапозоне от 1 до 100:");

            Scanner sc = new Scanner(System.in);
            int inputNumber = sc.nextInt();

            if (inputNumber < 1 || inputNumber > 100) {
                System.out.println("Вы вевели число вне диапозона от 1 до 100!");
                continue;
            }

            if (randomNumber == inputNumber) {
                System.out.println("Вы угадали! Загадано число " + randomNumber);
                break;
            } else {
                int diff = Math.abs(randomNumber - inputNumber);
                less = diff < Math.abs(randomNumber - lastNumber);

                if (less) {
                    System.out.println("Тепло");
                } else {
                    System.out.println("Холодно");
                }
            }

            lastNumber = inputNumber;

        }
    }
}
