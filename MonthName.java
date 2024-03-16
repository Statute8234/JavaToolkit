import java.util.Random;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

class MonthName {
    public static void main(String[] args) {
        Random randint = new Random();
        int month = randint.nextInt(12) + 1;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Unknown status");
                break;
        }
    }
}

class PositiveNegativeAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int positiveTotal = 0;
        int negativeTotal = 0;
        int number;

        System.out.println("Enter integers (end with 0):");

        while (true) {
            number = scanner.nextInt();

            if (number == 0) {
                break; // Exit the loop when 0 is entered
            } else if (number > 0) {
                positiveCount++;
                positiveTotal += number;
            } else {
                negativeCount++;
                negativeTotal += number;
            }
        }

        if (positiveCount + negativeCount > 0) {
            double positiveAverage = (double) positiveTotal / positiveCount;
            double negativeAverage = (double) negativeTotal / negativeCount;

            System.out.println("Positive count: " + positiveCount);
            System.out.println("Negative count: " + negativeCount);
            System.out.println("Positive average: " + positiveAverage);
            System.out.println("Negative average: " + negativeAverage);
        } else {
            System.out.println("No numbers entered except 0.");
        }
    }
}

class KilogramsToPoundsAndPoundsToKilograms {
    public static void main(String[] args) {
        final double KG_TO_LBS = 2.2;
        int kg = 1; // Starting value in kilograms
        int lbs = 20; // Starting value in pounds

        System.out.printf("%-12s %-12s | %-12s %-12s%n", "Kilograms", "Pounds", "Pounds", "Kilograms");
        System.out.println("----------------------------------------|----------------------------------------");

        while (kg <= 100 && lbs <= 220) {
            double convertedLbs = kg * KG_TO_LBS;
            double convertedKg = lbs / KG_TO_LBS;

            System.out.printf("%-12d %-12.1f | %-12d %-12.2f%n", kg, convertedLbs, lbs, convertedKg);

            kg += 2; // Increment kilograms by 2
            lbs += 5; // Increment pounds by 5
        }
    }
}

class PiApproximation {
    public static void main(String[] args) {
        for (int i = 10000; i <= 100000; i += 10000) {
            double piApproximation = computePi(i);
            System.out.printf("Approximation of pi for i = %d: %.10f%n", i, piApproximation);
        }
    }

    public static double computePi(int i) {
        double pi = 0.0;
        for (int j = 1; j <= i; j++) {
            double term = (j % 2 == 0) ? -1.0 / (2 * j - 1) : 1.0 / (2 * j - 1);
            pi += 4 * term;
        }
        return pi;
    }
}

class EulerApproximation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of 'i': ");
        int i = scanner.nextInt();

        BigDecimal e = BigDecimal.ONE;
        BigDecimal item = BigDecimal.ONE;

        for (int j = 1; j <= i; j++) {
            item = item.divide(BigDecimal.valueOf(j), 16, RoundingMode.HALF_UP);
            e = e.add(item);
        }

        System.out.println("Approximation of e for i = " + i + ": " + e);
    }
}
