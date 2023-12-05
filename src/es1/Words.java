package es1;

import java.util.*;

public class Words {
    public static void main(String[] args) {
        addWords();
    }

    public static void addWords() {
        Scanner scanner = new Scanner(System.in);
        int numberOfWords;
        String word;
        String[] words;
        do {
            System.out.println("Quante parole vuoi aggiungere? Inserisci un numero intero");
            numberOfWords = Integer.parseInt(scanner.nextLine());
            words = new String[numberOfWords];
            for (int i = 0; i < numberOfWords; i++) {
                System.out.println("Inserisci una parola");
                word = scanner.nextLine();
                words[i] = word;
            }
        } while(!(numberOfWords > 0));
        System.out.println("Elenco parole duplicate: " + Arrays.toString(words));
        Set<String> wordsSet = new HashSet<>(List.of(words));
        System.out.println("Elenco parole distinte:");
        for (String element: wordsSet
             ) {
            System.out.println(element);
        }
        System.out.println("Numero di parole distinte: " + wordsSet.size());
        scanner.close();
    }
}
