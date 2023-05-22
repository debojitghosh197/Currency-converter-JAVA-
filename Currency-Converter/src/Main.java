//PROJECT - Currency Converter
//Limited edition
import java.util.*; //importing libraries
class currencyConverter{
    //currency will be converted in this class
    public void converter(String fromCurrency, String toCurrency, double amountToChange){
        String []abbreviationAcr = {"USD","NGN","BRL","CAD","KES","IDR","INR","PHP","PKR","AUD", "GBP", "EUR","JPY", "CHF","NZD","EGP"}; //array with currencies short form
        String fromCurrency1 = fromCurrency.toUpperCase(); //converting to uppercase char
        String toCurrency1 = toCurrency.toUpperCase(); //converting to uppercase char
        double amountINpounds = 0;
        double amountChange = 0;
        int ctr1 = 0, ctr2 = 0; //counter value

        // value in other currency of 1 pound
        double US_DOLLAR = 1.26d, NIGERIAN_NAIRA = 581.17d, BRAZILIAN_REAL = 6.32d, CNADIAN_DOLLAR = 1.69d,
                KENYAN_SHILLING = 172.52d, INODONESIAN_RUPIAH = 18602.20d, INDIAN_RUPEE = 103.53d, PHILIPPINE_PESO = 70.42d,
                PAKISTANI_RUPEE = 355.68d, AUSTRALIAN_DOLLAR = 1.86d, GREAT_BRITAIN = 1, EUROPEAN_UNION = 1.15d, JAPAN_YEN = 170.06d,
                SWISS_FRANC = 1.12, NEW_ZELAND_DOLLAR = 1.99d, EGYPTIAN_POUND = 38.91d;

        // case checking of fromCurrency1
        switch (fromCurrency1) {
            case "USD" -> {
                amountINpounds = amountToChange / US_DOLLAR; ctr1 = 0;
            }
            case "NGN" -> {
                amountINpounds = amountToChange / NIGERIAN_NAIRA; ctr1 = 1;
            }
            case "BRL" -> {
                amountINpounds = amountToChange / BRAZILIAN_REAL; ctr1 = 2;
            }
            case "CAD" -> {
                amountINpounds = amountToChange / CNADIAN_DOLLAR; ctr1 = 3;
            }
            case "KES" -> {
                amountINpounds = amountToChange / KENYAN_SHILLING; ctr1 = 4;
            }
            case "IDR" -> {
                amountINpounds = amountToChange / INODONESIAN_RUPIAH; ctr1 = 5;
            }
            case "INR" -> {
                amountINpounds = amountToChange / INDIAN_RUPEE; ctr1 = 6;
            }
            case "PHP" -> {
                amountINpounds = amountToChange / PHILIPPINE_PESO; ctr1 = 7;
            }
            case "PKR" -> {
                amountINpounds = amountToChange / PAKISTANI_RUPEE; ctr1 = 8;
            }
            case "AUD" -> {
                amountINpounds = amountToChange / AUSTRALIAN_DOLLAR; ctr1 = 9;
            }
            case "GBP" -> {
                amountINpounds = amountToChange / GREAT_BRITAIN; ctr1 = 10;
            }
            case "EUR" -> {
                amountINpounds = amountToChange / EUROPEAN_UNION; ctr1 = 11;
            }
            case "JPY" -> {
                amountINpounds = amountToChange / JAPAN_YEN; ctr1 = 12;
            }
            case "CHF" -> {
                amountINpounds = amountToChange / SWISS_FRANC; ctr1 = 13;
            }
            case "NZD" -> {
                amountINpounds = amountToChange / NEW_ZELAND_DOLLAR; ctr1 = 14;
            }
            case "EGP" -> {
                amountINpounds = amountToChange / EGYPTIAN_POUND; ctr1 = 15;
            }
        }
        // case checking of toCurrency1
        switch (toCurrency1) {
            case "USD" -> {
                amountChange = amountINpounds * US_DOLLAR;
                ctr2 = 0;
            }
            case "NGN" -> {
                amountChange = amountINpounds * NIGERIAN_NAIRA;
                ctr2 = 1;
            }
            case "BRL" -> {
                amountChange = amountINpounds * BRAZILIAN_REAL;
                ctr2 = 2;
            }
            case "CAD" -> {
                amountChange = amountINpounds * CNADIAN_DOLLAR;
                ctr2 = 3;
            }
            case "KES" -> {
                amountChange = amountINpounds * KENYAN_SHILLING;
                ctr2 = 4;
            }
            case "IDR" -> {
                amountChange = amountINpounds * INODONESIAN_RUPIAH;
                ctr2 = 5;
            }
            case "INR" -> {
                amountChange = amountINpounds * INDIAN_RUPEE;
                ctr2 = 6;
            }
            case "PHP" -> {
                amountChange = amountINpounds * PHILIPPINE_PESO;
                ctr2 = 7;
            }
            case "PKR" -> {
                amountChange = amountINpounds * PAKISTANI_RUPEE;
                ctr2 = 8;
            }
            case "AUD" -> {
                amountChange = amountINpounds * AUSTRALIAN_DOLLAR;
                ctr2 = 9;
            }
            case "GBP" -> {
                amountChange = amountINpounds * GREAT_BRITAIN;
                ctr2 = 10;
            }
            case "EUR" -> {
                amountChange = amountINpounds * EUROPEAN_UNION;
                ctr2 = 11;
            }
            case "JPY" -> {
                amountChange = amountINpounds * JAPAN_YEN;
                ctr2 = 12;
            }
            case "CHF" -> {
                amountChange = amountINpounds * SWISS_FRANC;
                ctr2 = 13;
            }
            case "NZD" -> {
                amountChange = amountINpounds * NEW_ZELAND_DOLLAR;
                ctr2 = 14;
            }
            case "EGP" -> {
                amountChange = amountINpounds * EGYPTIAN_POUND;
                ctr2 = 15;
            }
        }
        if (amountChange != 0) {
            System.out.println("Amount In " + fromCurrency +"("+ abbreviationAcr[ctr1]+")"+" \t\t  Amount In " + toCurrency+"("+ abbreviationAcr[ctr2]+")");
            System.out.println("       " + amountToChange + "\t\t" + "         " + amountChange);
        }else {
            System.out.println("Invalid Parameters");
        }
    }
}
public class Main {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // obj of scanner class
        System.out.println("To convert into another currency type the short form of it");
        System.out.println("USD - NGN - BRL - CAD - KES - IDR - INR - PHP - PKR - AUD - GBP - EUR - JPY - CHF - NZD - EGP");
        System.out.println("CURRENCY CONVERTER");
        System.out.print("From currency of: ");
        String fromStr = sc.nextLine();
        System.out.println();
        System.out.print("To currency of: ");
        String toStr = sc.nextLine();
        System.out.println("Enter the amount: ");
        double amt = sc.nextDouble();
        currencyConverter convt = new currencyConverter(); // obj of currencyConverter class

        //checking that all the parameter has entered or not
        if (fromStr != null  && toStr != null && amt != 0) {
            convt.converter(fromStr,toStr,amt); //method call of currencyConverter class
        }
        else{
            //error message
            System.out.println("Please make sure that you have given all the three parameters.");
            System.out.println("Try again....");
        }
    }
}