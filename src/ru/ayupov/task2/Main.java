package ru.ayupov.task2;

public class Main {
    public static void main(String[] args) {
        double salary = 100000;
        final int TAX = 13;
        double sum = salary - ((salary * TAX) / 100);
        System.out.println("Подоходный налог - " + TAX + "%");
        System.out.println("Зарплата до удержания налога - " + salary + " руб.");
        System.out.println("Зарплата после удержания налога - " + sum + " руб.");
    }
}
