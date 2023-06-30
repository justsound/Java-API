//  Вывести все простые числа от 1 до 1000
public class hw1_2 {
    public static void main(String[] args) {
        OutSimple(2);
    }

    public static void OutSimple(int Number) {
        if (Number == 1)
            System.out.print(1);
        if (Number >= 2)
            System.out.printf("%d, %d", 1, 2);
        for (int i = 1; i <= Number; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } else {
                    if (j == i - 1) {
                        System.out.printf(", %d", i);
                    }
                }
            }
        }
    }
}