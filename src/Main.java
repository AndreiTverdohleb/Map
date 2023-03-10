import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 12, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);
        List<String> strings = new ArrayList<>(List.of("hello", "world", "help", "hello"));
        task3(strings);
        task4(strings);

    }
    private static boolean isEven(Integer num) {
        return num % 2 == 0;
    }

    private static void task1(List<Integer> nums) {
        for (Integer num : nums) {
            if (!isEven(num))
            System.out.println(num);
        }
        System.out.println();
    }

    private static void task2(List<Integer> nums) {
        Set<Integer> numSet = new TreeSet<>(nums);

        for (Integer num : numSet) {
            if (isEven(num)) {
                System.out.println(num);}
        }
    }

    public static void task3(List<String> strings) {
        System.out.println(new HashSet<>(strings));
    }

    public static void task4(List<String> strings) {
        Map<String, Integer> countStringByString = new HashMap<>();

        for (String str : strings) {
            if (countStringByString.get(str) == null) {
                countStringByString.put(str, 1);
            } else {
                countStringByString.put(str, countStringByString.get(str) + 1);
                System.out.println(countStringByString);
            }
        }
    }
}