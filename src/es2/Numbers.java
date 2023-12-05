package es2;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        System.out.println(addNumbers());
        List<Integer> numbersToReverse = addNumbers();
        System.out.println(reverseNumbers(numbersToReverse));
        System.out.println(createRandomNumbersList());
        printOddsOrEvenNumbers(numbersToReverse,false);

    }

    public static List<Integer> addNumbers() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> randomNumbers = new ArrayList<>();
        int numbersQuantity = 0;
        do {
            try {
                System.out.println("Quanti numeri vuoi?. Indicalo con un numero intero.");
                numbersQuantity = Integer.parseInt(scanner.nextLine());


                for (int i = 0; i < numbersQuantity; i++) {
                    Random rnd = new Random();
                    int number = rnd.nextInt(0, 101);
                    randomNumbers.add(number);
                }
            } catch (NumberFormatException e) {
                System.out.println("Errore. L'elemento inserito non è un numero.");

            }

        } while (!(numbersQuantity > 0));
        Collections.sort(randomNumbers);
        return randomNumbers;
    }

    public static List<Integer> reverseNumbers(List<Integer> numbersToReverse) {

        List<Integer> numbers = new ArrayList<>();
        Collections.reverse(numbersToReverse);
        numbers = numbersToReverse;
        return numbers;
    }

    public static List<Integer> createRandomNumbersList() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> randomNumbers = new ArrayList<>();
        int numbersQuantity = 0;
        do {
            try {
                System.out.println("Quanti numeri vuoi?. Indicalo con un numero intero.");
                numbersQuantity = Integer.parseInt(scanner.nextLine());


                for (int i = 0; i < numbersQuantity; i++) {
                    Random rnd = new Random();
                    int number = rnd.nextInt(0, 101);
                    randomNumbers.add(number);
                }
            } catch (NumberFormatException e) {
                System.out.println("Errore. L'elemento inserito non è un numero.");

            }

        } while (!(numbersQuantity > 0));
        System.out.println("Questa è una lista di numeri casuali.");
        return randomNumbers;
    }

    public static void printOddsOrEvenNumbers(List<Integer> list, Boolean bool) {
        if (bool) {
            for (int i = 0; i < list.size(); i += 2) {
                System.out.println(list.get(i) + " elemento in posizione " + i);
            }
        } else {
            for (int i = 1; i < list.size(); i += 2) {
                System.out.println(list.get(i) + " elemento in posizione " + i);
            }

        }
    }
}
