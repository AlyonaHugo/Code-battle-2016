package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer number = 0;
        try {
            number = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please input integer next time");
            return;
        }
        if(number < 0 || number > 3999){
            System.out.println("Number has to be in range between 1 - 3999");
            return;
        }
        System.out.println(convert(number));
    }

    public static String convert(Integer number) {
        String res = "";
        int thouthand = number / 1000;
        if (thouthand != 0) {
            res += makeNumber(thouthand, "M");
        }
        int nine_hundred = (number - thouthand * 1000) / 900;
        if (nine_hundred != 0) {
            res += makeNumber(nine_hundred, "CM");
        }
        int eight_hundred = (number - thouthand * 1000 - nine_hundred * 900) / 800;
        if (eight_hundred != 0) {
            res += makeNumber(eight_hundred, "DCCC");
        }
        int seven_hundred = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800) / 700;
        if (seven_hundred != 0) {
            res += makeNumber(seven_hundred, "DCC");
        }
        int six_hundred = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700) / 600;
        if (six_hundred != 0) {
            res += makeNumber(six_hundred, "DC");
        }

        int five_hundred = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600) / 500;
        if (five_hundred != 0) {
            res += makeNumber(five_hundred, "D");
        }

        int four_hundred = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500) / 400;
        if (four_hundred != 0) {
            res += makeNumber(four_hundred, "D");
        }

        int three_hundred = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400) / 300;
        if (three_hundred != 0) {
            res += makeNumber(three_hundred, "D");
        }

        int two_hundred = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400 - three_hundred * 300) / 200;
        if (two_hundred != 0) {
            res += makeNumber(two_hundred, "D");
        }

        int hundred = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400 - three_hundred * 300 - two_hundred * 200) / 100;
        if (hundred != 0) {
            res += makeNumber(hundred, "C");
        }

        int ninty = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400 - three_hundred * 300 - two_hundred * 200) / 90;
        if (ninty != 0) {
            res += "XC";
        }

        int eighty = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400 - three_hundred * 300 - two_hundred * 200 - ninty * 90) / 80;
        if (eighty != 0) {
            res += "LXXX";
        }

        int seventy = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400 - three_hundred * 300 - two_hundred * 200 - ninty * 90 - eighty * 80) / 70;
        if (seventy != 0) {
            res += "LXX";
        }
        int sixty = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400 - three_hundred * 300 - two_hundred * 200 - ninty * 90 - eighty * 80 - seventy * 70) / 60;
        if (sixty != 0) {
            res += "LX";
        }

        int fifty = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400 - three_hundred * 300 - two_hundred * 200 - ninty * 90 - eighty * 80 - seventy * 70 - sixty * 60) / 50;
        if (fifty != 0) {
            res += "L";
        }

        int forty = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400 - three_hundred * 300 - two_hundred * 200 - ninty * 90 - eighty * 80 - seventy * 70 - sixty * 60 - fifty * 50) / 40;
        if (forty != 0) {
            res += "XL";
        }
        int thirty = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400 - three_hundred * 300 - two_hundred * 200 - ninty * 90 - eighty * 80 - seventy * 70 - sixty * 60 - fifty * 50 - forty * 40) / 30;
        if (thirty != 0) {
            res += "XXX";
        }

        int twenty = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400 - three_hundred * 300 - two_hundred * 200 - ninty * 90 - eighty * 80 - seventy * 70 - sixty * 60 - fifty * 50 - forty * 40 - thirty * 30) / 20;
        if (twenty != 0) {
            res += "XX";
        }

        int ten = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400 - three_hundred * 300 - two_hundred * 200 - ninty * 90 - eighty * 80 - seventy * 70 - sixty * 60 - fifty * 50 - forty * 40 - thirty * 30 - twenty * 20) / 10;
        if (ten != 0) {
            res += "X";
        }
        int nine = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400 - three_hundred * 300 - two_hundred * 200 - ninty * 90 - eighty * 80 - seventy * 70 - sixty * 60 - fifty * 50 - forty * 40 - thirty * 30 - twenty * 20 - ten * 10) / 9;
        if (nine != 0) {
            res += "IX";
        }
        int eight = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400 - three_hundred * 300 - two_hundred * 200 - ninty * 90 - eighty * 80 - seventy * 70 - sixty * 60 - fifty * 50 - forty * 40 - thirty * 30 - twenty * 20 - ten * 10 - nine * 9) / 8;
        if (eight != 0) {
            res += "VIII";
        }

        int seven = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400 - three_hundred * 300 - two_hundred * 200 - ninty * 90 - eighty * 80 - seventy * 70 - sixty * 60 - fifty * 50 - forty * 40 - thirty * 30 - twenty * 20 - ten * 10 - nine * 9 - eight * 8) / 7;
        if (seven != 0) {
            res += "VII";
        }

        int six = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400 - three_hundred * 300 - two_hundred * 200 - ninty * 90 - eighty * 80 - seventy * 70 - sixty * 60 - fifty * 50 - forty * 40 - thirty * 30 - twenty * 20 - ten * 10 - nine * 9 - eight * 8 - seven * 7) / 6;
        if (six != 0) {
            res += "VI";
        }

        int five = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400 - three_hundred * 300 - two_hundred * 200 - ninty * 90 - eighty * 80 - seventy * 70 - sixty * 60 - fifty * 50 - forty * 40 - thirty * 30 - twenty * 20 - ten * 10 - nine * 9 - eight * 8 - seven * 7 - six * 6) / 5;
        if (five != 0) {
            res += "V";
        }

        int four = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400 - three_hundred * 300 - two_hundred * 200 - ninty * 90 - eighty * 80 - seventy * 70 - sixty * 60 - fifty * 50 - forty * 40 - thirty * 30 - twenty * 20 - ten * 10 - nine * 9 - eight * 8 - seven * 7 - six * 6 - five * 5) / 4;
        if (four != 0) {
            res += "IV";
        }

        int three = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400 - three_hundred * 300 - two_hundred * 200 - ninty * 90 - eighty * 80 - seventy * 70 - sixty * 60 - fifty * 50 - forty * 40 - thirty * 30 - twenty * 20 - ten * 10 - nine * 9 - eight * 8 - seven * 7 - six * 6 - five * 5 - four * 4) / 3;
        if (three != 0) {
            res += "III";
        }

        int two = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400 - three_hundred * 300 - two_hundred * 200 - ninty * 90 - eighty * 80 - seventy * 70 - sixty * 60 - fifty * 50 - forty * 40 - thirty * 30 - twenty * 20 - ten * 10 - nine * 9 - eight * 8 - seven * 7 - six * 6 - five * 5 - four * 4 - three * 3) / 2;
        if (two != 0) {
            res += "II";
        }
        int one = (number - thouthand * 1000 - nine_hundred * 900 - eight_hundred * 800 - seven_hundred * 700 - six_hundred * 600 - five_hundred * 500 - four_hundred * 400 - three_hundred * 300 - two_hundred * 200 - ninty * 90 - eighty * 80 - seventy * 70 - sixty * 60 - fifty * 50 - forty * 40 - thirty * 30 - twenty * 20 - ten * 10 - nine * 9 - eight * 8 - seven * 7 - six * 6 - five * 5 - four * 4 - three * 3 - two * 2);
        if (one != 0) {
            res += "I";
        }
        return res;
    }

    private static String makeNumber(Integer num, String str) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result += str;
        }
        return result;
    }
}
