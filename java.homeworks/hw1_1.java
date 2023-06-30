// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)
// 
public class hw1_1 {
    public static void main(String[] args) {
        System.out.printf("Факториал = %d \n", Fact(4));
        System.out.printf("Сумма = %d", Summ(4));
    }

    public static int Fact(int Number) {
        int factor = 1;
        if (Number > 0) {
            for (int i = 1; i <= Number; i++) {
                factor = factor * i;
            }
            return factor;
        } else {
            return factor;
        }
    }

    public static int Summ(int Number) {
        int summa = 0;
        if (Number > 0) {
            for (int i = 1; i <= Number; i++) {
                summa = summa + i;
            }
        }
        return summa;
    }

}


// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
// Требуется восстановить выражение до верного равенства. Предложить хотя бы
// одно решение или сообщить, что его нет.