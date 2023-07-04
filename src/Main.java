import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("one", "two","two", "three", "three", "three"));

        printOddNumbers(nums);

        printEvenNumbers(nums);

        removeDuplicates(strings);

        printNumberOfRepetitions(strings);
    }

    //Exercise #1
    public static void printOddNumbers(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
    }

    //Exercise #2
    public static void printEvenNumbers(List<Integer> nums) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : nums) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        HashSet<Integer> numbers = new HashSet<>(evenNumbers);
        Integer[] sortedNumbers = numbers.toArray(new Integer[0]);
        Arrays.sort(sortedNumbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }

    //Exercise #3
    public static void removeDuplicates(List<String> text) {
        HashSet<String> hashText = new HashSet<>(text);
        System.out.println(hashText);
    }

    //Exercise #4
    public static void printNumberOfRepetitions(List<String> text) {
        HashSet<String> hashText = new HashSet<>(text);
        String[] sorted = hashText.toArray(new String[0]);

        int counter = 0;
        for (String s : sorted) {
            for (String value : text) {
                if (s.equals(value)) {
                    counter++;
                }
            }
            System.out.println(counter);
            counter = 0;
        }
    }

}