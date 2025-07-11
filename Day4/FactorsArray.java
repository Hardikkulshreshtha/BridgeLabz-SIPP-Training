import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] tempArray = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        tempArray[j] = factors[j];
                    }
                    factors = tempArray;
                }
                factors[index] = i;
                index++;
            }
        }
        
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
} 