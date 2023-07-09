import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<String, ArrayList<String>> phoneBook = new HashMap<>();
    

    void addNumber(String Name, String phoneNumber) {
        ArrayList<String> numbers = phoneBook.getOrDefault(Name,
                new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(Name, numbers);
    }

    public void printAll() {
        for (String Name : phoneBook.keySet()) {
            ArrayList<String> numbers = phoneBook.get(Name);
            System.out.print(Name + ": ");
            for (String number : numbers) {
                System.out.print(number + ", ");
            }
            System.out.println();
        }
    }

}