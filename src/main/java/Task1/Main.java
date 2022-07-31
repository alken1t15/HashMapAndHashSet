package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        ArrayList<Contact> contacts2 = new ArrayList<>();
        PhoneBook phoneBook = new PhoneBook();
        contacts.add(new Contact("Василий", "87471655780"));
        contacts.add(new Contact("Никита","87456873245"));
        contacts.add(new Contact("Максим","87456873987"));
        contacts.add(new Contact("Стас","87434473245"));
        contacts.add(new Contact("Петя","87459863245"));
        phoneBook.addContact("Друзья",contacts);
        contacts2.add(new Contact("Даня", "3913152998"));
        contacts2.add(new Contact("Даша","8780951264"));
        contacts2.add(new Contact("Растислав","9237061274"));
        contacts2.add(new Contact("Денис","9834023932"));
        contacts2.add(new Contact("Саша","2367494843"));
        phoneBook.addContact("Работа", contacts2);
        phoneBook.foundGroup("hgf");
        //phoneBook.fountContact("765");
    }
}
