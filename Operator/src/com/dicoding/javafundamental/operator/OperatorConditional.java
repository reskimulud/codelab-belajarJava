package com.dicoding.javafundamental.operator;

public class OperatorConditional {

    public static void main(String[] args) {
        int value = 4;
        int anotherValue = 5;
        System.out.println("value : " + value);
        System.out.println("anotherValue : " + anotherValue);
        System.out.println();

        boolean result;
        boolean anotherResult;

        System.out.println("Conditional AND");
        result = value == 3 && anotherValue == 5;
        anotherResult = value != 3 && anotherValue == 5;
        System.out.println("Hasil Operator AND pada syarat value == 3 && anotherValue == 5 adalah : " + result);
        System.out.println("Hasil Operator AND pada syarat value != 3 && anotherValue == 5 adalah : " + anotherResult);
        System.out.println();

        System.out.println("Conditional OR");
        result = value == 3 || anotherValue == 5;
        anotherResult = value != 3 || anotherValue == 5;
        System.out.println("Hasil Operator OR pada syarat value == 3 || anotherValue == 5 adalah : " + result);
        System.out.println("Hasil Operator OR pada syarat value != 3 || anotherValue == 5 adalah : " + anotherResult);
        System.out.println();
    }

}
