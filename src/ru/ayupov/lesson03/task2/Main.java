package ru.ayupov.lesson03.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите сумму зарплаты:");
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        final int TAX = 13;
        double sum = salary - ((salary * TAX) / 100);
        System.out.println("Подоходный налог - " + TAX + "%");
        System.out.println("Зарплата до удержания налога - " + salary + " руб.");
        System.out.println("Зарплата после удержания налога, \"на руки\" - " + sum + " руб.");
    }
}
