package Collections;

import java.util.Map;

public class PhoneBookService {
    private Map<String, String> phoneBook;

    public PhoneBookService(Map<String, String> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void addEntryToPhoneBook(String name, String number) {
        phoneBook.put(name, number);
    }

    public void deleteEntryFromPhoneBook(String name) {
        phoneBook.remove(name);
    }

    public String findPhoneNumberForName(String name) {
        String phoneNumber = null;
        for (String key : phoneBook.keySet()) {
            if (key.equals(name)) {
                phoneNumber = phoneBook.get(key);
            }
        }
        return phoneNumber;
    }

    public boolean isNumberInPhoneBook(String number) {
        boolean isContained = false;
        for (String value : phoneBook.values()) {
            if (number.equals(value)) {
                isContained = true;
                break;
            }
        }
        return isContained;
    }

    public void printPhoneBook() {
        for (String s : phoneBook.keySet()) {
            System.out.println(s + ": " + phoneBook.get(s));
        }
    }


}
