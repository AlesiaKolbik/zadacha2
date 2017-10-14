package com.company;

public class Main {

    public static void main(String[] args) {

        int amountOfMoney = 2;//(int) (Math.random() * Integer.MAX_VALUE);

        int firstDigit = amountOfMoney % 10;
        int secondDigit = (amountOfMoney / 10) % 10;
        int value = secondDigit * 10 + firstDigit;

        if (value >= 5 && value <= 19 || firstDigit == 0) {
            System.out.println(+amountOfMoney + " рублей");
        } else if (firstDigit >= 2 && firstDigit <= 4) {
            System.out.println(+amountOfMoney + " рубля");
        } else if (firstDigit == 1) {
            System.out.println(+amountOfMoney + " рубль");
        } else {
            System.out.println(+amountOfMoney + " рублей");
        }
    }
}
