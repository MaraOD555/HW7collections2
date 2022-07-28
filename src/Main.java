import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(8, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 12));
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for (Integer x : nums) {
            if (x % 2 != 0)// нечетные
                odd.add(x);
        }
        System.out.println(odd); // выводим только нечетные

        for (Integer x : nums) {
            if (x % 2 == 0) // четные
                even.add(x); // четные значения в листе
        }
        HashSet<Integer> uniqueEven = new HashSet<>(even); //convert ArrayList to HastSet для получения
        // уникальных значений
        Collections.sort(even); // сортировка четных значений
        System.out.println(uniqueEven); // вывод уникальных четных значений по возрастанию


        ArrayList<String> kingsName = new ArrayList<>(List.of("Иван", "Петр", "Александр",
                "Николай", "Иван", "Александр", "Михаил"));
        HashSet<String> uniqueKingsName = new HashSet<>(kingsName);
        System.out.println(uniqueKingsName);

        Set<String> names = new HashSet<>(kingsName);// Чтобы подсчитать вхождения элементов ArrayList,
        // мы создаем HashSet и добавляем все элементы ArrayList.
        for (String s : names) // перебираем все имена
            System.out.println(s + ": " + Collections.frequency(kingsName, s)); //для подсчета появления
        // объекта s в коллекции kingsName.
    }
}




