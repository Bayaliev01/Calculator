package com.company;

public class ArabNumber {
    public static void calc(String input) {
        try {
            String[] opers = input.split("\\w");
            String operator = opers[opers.length - 1];
            String[] nums = input.split("\\W");
            int number1 = Integer.parseInt(nums[0]);
            int number2 = Integer.parseInt(nums[1]);
            checkNumber(number1);
            checkNumber(number2);
            System.out.println("--Результат для арабских цифр----");
            System.out.println(calculate(number1, number2, operator));
        } catch (MyExc | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int calculate(int number1, int number2, String operator) {

        return switch (operator) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            case "/" -> number1 / number2;
            default -> throw new IllegalArgumentException("Неверный знак операции");
        };
    }

    public static void checkNumber(int number) throws MyExc {
        if (number < 1 || number > 10) {
            throw new MyExc("неверный формат данных");
        }
    }
}
