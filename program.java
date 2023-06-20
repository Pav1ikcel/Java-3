/*
 import java.util.ArrayList;
import java.util.List;

public class NumberListOperations {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(7);
        
        // 1) Удаление четных чисел
        removeEvenNumbers(numbers);
        
        // 2) Поиск минимального значения
        int min = findMinValue(numbers);
        System.out.println("Минимальное значение: " + min);
        
        // 3) Поиск максимального значения
        int max = findMaxValue(numbers);
        System.out.println("Максимальное значение: " + max);
        
        // 4) Вычисление среднего арифметического значения
        double average = calculateAverage(numbers);
        System.out.println("Среднее арифметическое значение: " + average);
    }
    
    public static void removeEvenNumbers(List<Integer> numbers) {
        numbers.removeIf(num -> num % 2 == 0);
    }
    
    public static int findMinValue(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    
    public static int findMaxValue(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    public static double calculateAverage(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.size();
    }
}

 */