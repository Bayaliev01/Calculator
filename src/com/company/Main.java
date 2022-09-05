package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение [2+2] или два римских числа от I до X:[V+V] + Enter ");

        String userInput = scanner.nextLine();

        if (Character.isLetter(userInput.charAt(0))) {
            RomanNumber.romanColc(userInput);
        } else {
            ArabNumber.calc(userInput);
        }
    }
}
