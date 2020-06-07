package lesson03.ru.ayupov.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количтво секунд:");
        Scanner sc = new Scanner(System.in);
        final int secondsInHour = 3600;
        int seconds = sc.nextInt();
        int sum = seconds / secondsInHour;
        System.out.println(seconds + " c. = " + sum + " ч.");
    }
}
