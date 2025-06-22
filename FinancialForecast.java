package file.scs;

import java.util.Scanner;

public class FinancialForecast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Financial Forecasting Tool ===");

        System.out.print("Enter initial savings amount: ");
        double savings = sc.nextDouble();

        System.out.print("Enter expected monthly income: ");
        double monthlyIncome = sc.nextDouble();

        System.out.print("Enter estimated monthly expenses: ");
        double monthlyExpenses = sc.nextDouble();

        System.out.print("Enter number of months to forecast: ");
        int months = sc.nextInt();

        System.out.println("\n--- Forecast Summary ---");

        for (int i = 1; i <= months; i++) {
            double monthlySavings = monthlyIncome - monthlyExpenses;
            savings += monthlySavings;

            System.out.printf("Month %d: Projected Savings = ₹%.2f\n", i, savings);
        }

        System.out.println("\nForecast completed.");
        sc.close();
    }
}
