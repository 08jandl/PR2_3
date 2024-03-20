package Collections;

import java.util.HashMap;

public class PhoneBookMain {
    public static void main(String[] args) {
        PhoneBookService phoneBookService = new PhoneBookService(new HashMap<>());

        phoneBookService.addEntryToPhoneBook("Mrs. Doubtfire", "0689498374");
        phoneBookService.addEntryToPhoneBook("Mr. Doubtfire", "0689498234");
        phoneBookService.addEntryToPhoneBook("Anna Karenina", "0689346677");
        phoneBookService.addEntryToPhoneBook("Grace Hopper", "0947567498374");

        phoneBookService.printPhoneBook();


    }
}
