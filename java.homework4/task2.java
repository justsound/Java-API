public class task2 {
    /*
     * Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() -
     * помещает элемент в конец очереди, dequeue() - возвращает первый элемент из
     * очереди и удаляет его, first() - возвращает первый элемент из очереди, не
     * удаляя.
     */
    public static void main(String[] args) {

        ListQueue queue = new ListQueue();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue.toStr());
        System.out.println(queue.dequeue());
        System.out.println(queue.first());
    }
}
