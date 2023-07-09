import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Phonebook phoneBook = new Phonebook();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 2) {
            System.out.println("В новой строке введите:\n1) Добавление номера" +
                    "\n2) Вывод всего");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите фамилию:");
                    String Name = scanner.next();
                    System.out.println("Введите номер:");
                    String phoneNumber = scanner.next();
                    phoneBook.addNumber(Name, phoneNumber);
                    break;
                case 2:
                    phoneBook.printAll();
                    break;
                default:
                    System.out.println("Некорректный ввод.");
            }
        }
    }
}
