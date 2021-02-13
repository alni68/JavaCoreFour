package JavaCoreFour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phonebook {

    private HashMap<String, List<String>> book;

    public Phonebook() {
        this.book=new HashMap<>();
    }

    public void add(String surname, String number) {
        if (book.containsKey(surname)) {
            List<String> numbers=book.get(surname);
            if (!numbers.contains(number)) {
                numbers.add(number);
                System.out.println(String.format("Для %s добавлен номер телефона %s  ", surname, number));
            } else {
                System.out.println(String.format("Номер %s уже существует для %s", number, surname));
            }
        } else {
            book.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Для %s добавлен номер телефона %s  ", surname, number));
        }
    }

    public Object get(String surname) {
        if (book.containsKey(surname)) {
            return book.get(surname);
        } else {
            System.out.println(String.format("В справочнике отсутствует информация о %s", surname));
            return null;
        }
    }
}
