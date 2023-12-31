package Lesson1;

/**
 * Задание: Используйте ключевое слово assert для проверки
 * вашего предположения в коде. Если утверждение не выполняется,
 * программа сгенерирует AssertionError. Сможете ли вы исправить
 * утверждение в этом коде, чтобы оно стало верным?
 */

public class Task1 {
    public static void main(String[] args) {
        // Вызываем метод для проверки количества выходных дней
        assertConditionA();
    }

    /**
     * Метод для проверки количества выходных дней в неделе.
     */
    public static void assertConditionA() {
        String[] weekends = {"Суббота", "Воскресенье"};
        // Используем оператор assert для проверки количества элементов в массиве.
        // Задача - сделать это утверждение верным (длина массива должна быть равна 2).
        assert weekends.length == -2 : "В неделе должно быть 2 выходных дня";
        // Если утверждение верно, выводим сообщение о количестве выходных дней.
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }
}
