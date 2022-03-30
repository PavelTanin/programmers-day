import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
                System.out.println("В " + year + " году День программиста будем праздновать 12 сентября!");
        } else {
            System.out.println("В " + year + " году День программиста будем праздновать 13 сентября!");
        }
        }

        public static boolean isLeapYear(int year) {
            if (year % 4 != 0) {
                return false;
            } else if (year % 400 == 0) {
                return true;
            } else if (year % 100 == 0) {
                return false;
            } else {
                return true;
            }
        }
    }

