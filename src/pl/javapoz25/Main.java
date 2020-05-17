package pl.javapoz25;

import java.util.Scanner;

public class Main {

    public static boolean isPrime(int var2) {
        if (var2 < 2) return false;
        boolean isPrimeNumber = true;
        for (int i = 2; i < var2; i++) {
            if (var2 % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }
        if(isPrimeNumber)
            System.out.println("Podana liczba jest liczbą pierwszą");
        else
            System.out.println("Podana liczba nie jest liczbą pierwszą");

        return isPrimeNumber;
    }

//    public static int sumOfXY (int x, int y) {
//
//    }

    public static void tableEx4 (int[] tab) {
        int tmp = tab[0];
        tab[0] = tab[2];
        tab[2] = tmp;

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

    }

    public static void main(String[] args) {

        System.out.println("Exercise 1: ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę, którą chcesz pomnożyć: ");
        int var = scan.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(var + " * " + i + " = " + (var * i));
        }
        System.out.println();

        System.out.println("Exercise 2: ");
        System.out.print("Podaj liczbę: ");
        boolean result = isPrime(scan.nextInt());
        System.out.println(result);
        System.out.println();

        System.out.println("Exercise 3: ");

        System.out.println("Exercise 4: ");
        int[] tab = new int[] {1, 2, 3};
        tableEx4(tab);

    }

}
