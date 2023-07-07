import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> List1 = new ArrayList<>(Arrays.asList(10, 45, 22, 12, 9, 78, 1, 2, 3, 5));
        System.out.println(List1);
        removeEvenDigits(List1);
        System.out.println(List1);
        System.out.println(findMax(List1));
        System.out.println(findMin(List1));
        System.out.println(Avverange(List1));

    }

    /*
     * Пусть дан произвольный список целых чисел.
     * 1) Нужно удалить из него чётные числа
     * 2) Найти минимальное значение
     * 3) Найти максимальное значение
     * 4) Найти среднее значение
     */

    public static void removeEvenDigits(ArrayList<Integer> list) {
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
    }

    public static int findMax(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static int findMin(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static double Avverange(ArrayList<Integer> list) {
        double sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        double res = sum / list.size();
        return res;
    }
}
