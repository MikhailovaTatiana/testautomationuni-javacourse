package salt.testautouni.javacourse.chapter12;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
//        setDemo();
//        listDemo();
        queueDemo();
//        mapDemo();
    }

    private static void setDemo() {
        Set<String> fruit = new HashSet<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);

        // Alternative 1
        var i = fruit.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // Alternative 2
        for (Object item: fruit) {
            System.out.println(item);
        }

        // Alternative 3
        fruit.forEach(System.out::println);

        // Alternative 4
        fruit.forEach(x -> System.out.println(x));
    }

    private static void listDemo() {
        List<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2));
        System.out.println(fruit.size());
        System.out.println(fruit);
    }

    private static void queueDemo() {
        Queue<String> fruit = new LinkedList<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);

        fruit.remove();
        System.out.println(fruit);
        System.out.println(fruit.peek());
    }

    private static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 96);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 120);
        fruitCalories.put("orange", 48);
        fruitCalories.put("apple", 94);

        System.out.println(fruitCalories.size());
        System.out.println(fruitCalories);

        System.out.println(fruitCalories.get("lemon"));

        System.out.println(fruitCalories.entrySet());

        fruitCalories.remove("orange");
        System.out.println(fruitCalories);

        for (var entry: fruitCalories.entrySet()) {
            System.out.println(entry.getValue());
        }

        fruitCalories.forEach(
                (k, v) -> System.out.println("fruit: " + k + "; calories: " + v)
        );
    }
}
