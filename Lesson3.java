import java.util.*;

public class Lesson3 {

    public static void main(String[] args) {
        //создаем массив из слов, есть повторяющиеся
        List<String> arr = new ArrayList<>();
        arr.add("яблоко");
        arr.add("яблоко");
        arr.add("груша");
        arr.add("банан");
        arr.add("дыня");
        arr.add("арбуз");
        arr.add("арбуз");
        arr.add("арбуз");
        arr.add("вишня");
        arr.add("помидор");

        Set<String> arr2 = new HashSet<>();

        //создаем колекцию уникальных слов

        Set<String> set = new HashSet<>(arr);

         //выводим уникальные слова.
        for (String str : set)
        {
            System.out.println(str);
        }

        System.out.println();
        //определить количество повторов

        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : arr)
        {
            if (!wordToCount.containsKey(word))
            {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet())
        {
            System.out.println(word + " " + wordToCount.get(word));
        }

        System.out.println();

        //создаем телефонный справочник
        PhoneBook phonebook = new PhoneBook();

        phonebook.add(123456, "Ivan");
        phonebook.add(456789, "Ivan");
        phonebook.add(123456, "Petr");
        phonebook.add(159951, "Fedor");
        phonebook.add(478874, "Fedor");
        phonebook.add(123621, "Fedor");

        phonebook.get("Ivan");
        phonebook.get("Petr");
        phonebook.get("Fedor");
        phonebook.get("Andrey");

    }
}
