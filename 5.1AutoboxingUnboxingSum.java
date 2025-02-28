import java.util.*;

public class AutoboxingUnboxingSum {
    
    public static List<Integer> parseStringToIntegers(String[] strNumbers) {
        List<Integer> numbers = new ArrayList<>();
        for (String str : strNumbers) {
            numbers.add(Integer.parseInt(str));
        }
        return numbers;
    }
    
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] strNumbers = input.split(" ");
        
        List<Integer> numbers = parseStringToIntegers(strNumbers);
        
        int sum = calculateSum(numbers);
        
        System.out.println("Sum of numbers: " + sum);
        scanner.close();
    }
}
