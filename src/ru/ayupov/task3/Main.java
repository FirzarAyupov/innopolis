package ru.ayupov.task3;

public class Main {
    public static void main(String[] args) {
        final int secondsInHour = 3600;
        int hours = 3;
        int sum = hours * secondsInHour;
        System.out.println("В 1 ч. - " + secondsInHour +" с.");
        System.out.println("В " + hours + " ч. - " + sum +" с.");
    }
}
