import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * выделить поля и
 * методы. Реализовать в java.
 * Написать метод, который будет запрашивать у пользователя критерий (или
 * критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии
 * фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую
 * необходимому критерию:
 * 1 - ОЗУ
 * 
 * 2 - Объем ЖД
 * 
 * 3 - Операционная система
 * 
 * 4 - Цвет …
 * 
 * Далее нужно запросить минимальные значения для указанных критериев -
 * сохранить параметры фильтрации можно также в Map.
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
 * условиям.
 */

public class task0 {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

        Laptop laptop1 = new Laptop("Lenovo", 16, "black", "Windows", 128);
        Laptop laptop2 = new Laptop("Apple", 8, "white", "MacOS", 256);
        Laptop laptop3 = new Laptop("Acer", 8, "grey", "Linux", 512);
        Laptop laptop4 = new Laptop("ASUS", 32, "blue", "Ubuntu", 1024);
        Laptop laptop5 = new Laptop("ASUS", 32, "blue", "Ubuntu", 1024);

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop5);
        laptops.add(laptop4);
        laptops.add(new Laptop("Apple", 8, "grey", "MacOS", 256));
        laptops.add(new Laptop("Asus", 4, "grey", "Windows", 128));
        laptops.add(new Laptop("Huawei", 4, "black", "Linux", 512));
        laptops.add(new Laptop("Dell", 16, "black", "windows", 256));

        System.out.println("Количество ноутбуков: " + laptops.size());

        var result = filterLaptops(laptops, queryfilter());
        if (result.size() == 0) {
            System.out.println("Нет ноутбуков, удовлетворяющих заданному критерию");
        } else
            for (Laptop laptop : result) {
                System.out.println(laptop);
            }
        // System.out.println(laptop4.equals(laptop1));
        // System.out.println(laptop4.equals(laptop5));

    }

    public static Set<Laptop> filterLaptops(Set<Laptop> laptops, Map<String, String> filter) {
        Set<Laptop> result = new HashSet<>();
        for (Laptop laptop : laptops) {
            boolean filterMatch = true;
            for (Map.Entry<String, String> entry : filter.entrySet()) {
                switch (entry.getKey()) {
                    case "title":
                        if (!laptop.getTitle().equals(entry.getValue())) {
                            filterMatch = false;
                        }
                        break;
                    case "RAM":
                        if (laptop.getRAM() < Integer.parseInt(entry.getValue())) {
                            filterMatch = false;
                        }
                        break;
                    case "OS":
                        if (!laptop.getOS().equals(entry.getValue())) {
                            filterMatch = false;
                        }
                        break;
                    case "color":
                        if (!laptop.getColor().equals(entry.getValue())) {
                            filterMatch = false;
                        }
                        break;
                    case "hardDisk":
                        if (laptop.getHardDisk() < Integer.parseInt(entry.getValue())) {
                            filterMatch = false;
                        }
                        break;
                }
                if (!filterMatch) {
                    break;
                }
            }
            if (filterMatch) {
                result.add(laptop);
            }
        }
        return result;
    }

    public static Map<String, String> queryfilter() {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> map = new HashMap<>();

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - Название компании");
        System.out.println("2 - Оперативная память");
        System.out.println("3 - Цвет");
        System.out.println("4 - Ос");
        System.out.println("5 - Объем жесткого диска");

        int filter = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите название или минимальное значение:");
        String minValue = scanner.nextLine();
        scanner.close();

        switch (filter) {
            case 1:
                map.put("title", minValue);
                break;
            case 2:
                map.put("RAM", minValue);
                break;
            case 3:
                map.put("color", minValue);
                break;
            case 4:
                map.put("OS", minValue);
                break;
            case 5:
                map.put("hardDisk", minValue);
                break;
        }
        return map;
    }
}