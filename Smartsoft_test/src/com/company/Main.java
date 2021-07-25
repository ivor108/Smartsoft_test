package com.company;

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner in = new Scanner(System.in);
        RuleBasedNumberFormat numberFormat = new RuleBasedNumberFormat(Locale.forLanguageTag("ru"), RuleBasedNumberFormat.SPELLOUT);

        System.out.println("Введите число");
        String number = in.nextLine();

        if (number.matches("-?\\d+(\\.\\d+)?")){
            if (Long.parseLong(number) < Math.pow(10, 12))
                System.out.println(numberFormat.format(Long.parseLong(number)));
            else
                System.out.println("Число больше или равно 10^12");
        }
        else
            System.out.println(numberFormat.parse(number));

    }
}
