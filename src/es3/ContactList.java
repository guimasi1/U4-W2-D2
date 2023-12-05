package es3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ContactList {
    public static void main(String[] args) {

        Map<String, Long> contactList = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        addContact(contactList, scanner);
        addContact(contactList, scanner);
        // removeContact(contactList, scanner);
        // searchByNumber(contactList, scanner);
        searchByName(contactList, scanner);
        printContacts(contactList,scanner);
        scanner.close();

    }

    public static void addContact(Map<String, Long> contactList, Scanner scanner) {
        String name;
        long number;
        System.out.println("Inserisci il nome del contatto da aggiungere");
        name = scanner.nextLine();
        System.out.println("Inserisci il numero del contatto");
        number = Long.parseLong(scanner.nextLine());
        contactList.put(name,number);
    }

    public static void removeContact(Map<String, Long> contactList, Scanner scanner) {
        String name;
        System.out.println("Inserisci il nome del contatto da cancellare.");
        name = scanner.nextLine();
        if (contactList.containsKey(name)) contactList.remove(name);
        else System.out.println("Questo nome non è presente nella tua rubrica.");
    }

    public static void searchByNumber(Map<String, Long> contactList, Scanner scanner) {
        long number;
        System.out.println("Inserisci il numero del contatto da ricercare.");
        number = Long.parseLong(scanner.nextLine());
        if (contactList.containsValue(number)) {
            Set<String> numbersList = contactList.keySet();
            for (String name : numbersList
            ) {
                if (contactList.get(name) == number)
                    System.out.println("numero: " + contactList.get(name) + " nome: " + name);
            }
        } else System.out.println("Il numero non è presente nella tua rubrica.");

    }

    public static void searchByName(Map<String, Long> contactList, Scanner scanner) {
        String name;
        System.out.println("Inserisci il nome del contatto da ricercare.");
        name = scanner.nextLine();
        if (contactList.containsKey(name)) {
            Set<String> numberList = contactList.keySet();
            for (String key : numberList
            ) {
                if (name.equals(key)) System.out.println("numero: " + contactList.get(key) + " nome: " + key);

            }
        } else System.out.println("Questo nome non è presente nella tua rubrica.");
    }

    public static void printContacts(Map<String, Long> contactList, Scanner scanner) {
        Set<String> numberList = contactList.keySet();
        System.out.println("Ecco la tua rubrica:");
        for (String key: numberList) {
            System.out.println("Nome: " + key + " numero: " + contactList.get(key));
        }
    }

}