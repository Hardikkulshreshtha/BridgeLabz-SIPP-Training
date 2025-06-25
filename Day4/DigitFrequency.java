import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        long tempNumber = number;
        int digitCount = 0;
        
        while (tempNumber != 0) {
            digitCount++;
            tempNumber /= 10;
        }
        
        int[] digits = new int[digitCount];
        tempNumber = number;
        
        for (int i = 0; i < digitCount; i++) {
            digits[i] = (int) (tempNumber % 10);
            tempNumber /= 10;
        }
        
        int[] frequency = new int[10];
        
        for (int i = 0; i < digitCount; i++) {
            frequency[digits[i]]++;
        }
        
        System.out.println("Digit frequency in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times");
            }
        }
        
        scanner.close();
    }
} 