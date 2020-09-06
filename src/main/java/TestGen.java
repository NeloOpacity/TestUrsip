import java.util.Arrays;
import java.util.List;

public class TestGen {

    public static String generateNum(List<Integer> numbers) {
        Integer result = null;
        if (numbers.get(0) == 1) {
            for (int i = 1; i <= numbers.size(); i++) {
                result = numbers.get(i - 1) + 1;
                if (i == numbers.size() || numbers.get(i) - numbers.get(i - 1) > 1) {
                    break;
                }
            }
        } else {
            result = 1;
        }

        return String.format("%03d", result);
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 6);
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        List<Integer> list3 = Arrays.asList(1, 10);
        List<Integer> list4 = Arrays.asList(3, 5, 6);

        String result1 = generateNum(list1);
        String result2 = generateNum(list2);
        String result3 = generateNum(list3);
        String result4 = generateNum(list4);

        String template = "list: %s; result: %s";
        System.out.println(String.format(template, list1, result1));
        System.out.println(String.format(template, list2, result2));
        System.out.println(String.format(template, list3, result3));
        System.out.println(String.format(template, list4, result4));
    }
}
