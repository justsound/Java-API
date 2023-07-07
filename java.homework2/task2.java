// 2)* Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task2 {
        public static void main(String[] args) {
        // String input = "name:Ivanov," + "country:Russia," + "city: ," +
        // "age:null";
        System.out.println("sql - Request select * from students WHERE ");
        String input = InputWHERE(
                "Please, input the WHERE as follows:\n name:value, country:value, city:value, age:value");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(input.split(",")));
        StringBuilder filter = new StringBuilder();
        filter.append("select * from students WHERE ");
        for (String s : list) {
            s = s.replace(":", " = ");
            if (s.contains("null"))
                continue;
            filter.append(s).append(" AND ");
        }
        filter.setLength(filter.length() - 5);
        System.out.println(filter);
    }

    public static String InputWHERE(String Message) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print(Message + ": ");
        String where = sc.nextLine();
        sc.close();
        return where;
    }
}


