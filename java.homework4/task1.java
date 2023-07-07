import java.util.LinkedList;

public class task1 {
    // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
    // вернет “перевернутый” список.
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> reverse = new LinkedList<>();
        int count = 10;
        for (int i = 0; i < count; i++) {
            int rand = (int) (Math.random() * (100 - 1));
            list.addFirst(rand);
        }
        System.out.println(list);

        for (int i = 0; i < count; i++) {
            reverse.addFirst(list.getFirst());
            list.removeFirst();
        }
        System.out.println(reverse);;
    }

}
