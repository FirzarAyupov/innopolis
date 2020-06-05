package ru.ayupov.lesson03.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество литров:");
        Scanner sc = new Scanner(System.in);
        int volumes = sc.nextInt();
        int price = 43;
        int sum = price * volumes;
        System.out.println("Цена 1 л. бензина - " + price + " руб.");
        System.out.println("Цена за " + volumes + " л. - " + sum + " руб.");
    }
}
