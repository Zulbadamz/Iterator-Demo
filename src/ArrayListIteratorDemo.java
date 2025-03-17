import java.util.*;

public class ArrayListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        // Populate list with 10 random integers (1-100)
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100) + 1);
        }

        System.out.println("Original List: " + numbers);

        // Iterate and calculate sum
        Iterator<Integer> iterator = numbers.iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            int num = iterator.next();
            System.out.println(num);
            sum += num;
        }
        System.out.println("Total Sum: " + sum);

        // Attempt modifications during iteration
        iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove(); // Removing even numbers
            }
        }

        System.out.println("List after removing even numbers: " + numbers);

        // Attempting list modification (will cause ConcurrentModificationException)
        try {
            for (int i : numbers) {
                if (i < 50) {
                    numbers.add(200); // Unsafe modification
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

