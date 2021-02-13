package JavaCoreFour;


import java.util.*;

public class MainClass {
    public static void main(String[] args) {

        //Task1
        List<String> words=Arrays.asList(
                "Bitcoin", "Ethereum", "Litecoin", "Dogecoin", "Monero",
                "Dash", "Zcash", "Cardano", "Ethereum", "Dash",
                "Dogecoin", "Cardano", "Ethereum", "Ethereum", "Bitcoin",
                "Cardano", "Ethereum", "Zcash", "Dash", "Zcash", "Cardano"
        );

        Set<String> unique=new HashSet<String>(words);

        System.out.println();
        System.out.println("***Task1***");
        System.out.println();
        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }

        //Task2
        System.out.println();
        System.out.println("***Task2***");
        System.out.println();

        Phonebook phonebook=new Phonebook();
        System.out.println("(Телефонный Справочник)");
        phonebook.add("Иоанн", "0001");
        phonebook.add("Матфей", "0002");
        phonebook.add("Лука", "0003");
        phonebook.add("Марк", "0004");
        phonebook.add("Иоанн", "0007");
        phonebook.add("Иоанн", "0007");
        System.out.println();

        System.out.println("(Информация о номерах)");
        System.out.print("Иоанн: ");
        System.out.println(phonebook.get("Иоанн"));
        System.out.print("Матфей: ");
        System.out.println(phonebook.get("Матфей"));
        System.out.print("Лука: ");
        System.out.println(phonebook.get("Лука"));
        System.out.print("Марк: ");
        System.out.println(phonebook.get("Марк"));
        System.out.print("Фома: ");
        System.out.println(phonebook.get("Фома"));
    }
}

