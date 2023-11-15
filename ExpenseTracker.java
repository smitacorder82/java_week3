
import java.util.ArrayList;
import java.util.Scanner;
public class Expense {
    private String description;
    private double amount;
    private String category;

    public Expense(String description, double amount, String category) {
        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    // Getters and setters
}


public class ExpenseTracker {
    private ArrayList<Expense> expenses = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addExpense() {
        System.out.print("Enter Description: ");
        String description = scanner.nextLine();

        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();

        scanner.nextLine(); // Clear the buffer
        System.out.print("Enter Category: ");
        String category = scanner.nextLine();

        Expense expense = new Expense(description, amount, category);
        expenses.add(expense);
        System.out.println("Expense added successfully!");
    }

    public void viewExpenses() 
    {
        if (expenses.isEmpty())
         {
            System.out.println("No expenses recorded yet.");
        } 
        else
         {
            System.out.println("----- Expenses -----");
            for (Expense expense : expenses)
             {
                System.out.println("Description: " + expense.getDescription() +
                        "\nAmount: " + expense.getAmount() +
                        "\nCategory: " + expense.getCategory() + "\n");
            }
        }
    }

    // Implement other functionalities like summaries, data persistence, input validation
}
  public class Main {
    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Add Expense\n2. View Expenses\n3. Expense Summaries\n4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tracker.addExpense();
                    break;
                case 2:
                    tracker.viewExpenses();
                    break;
                case 3:
                    // Invoke expense summaries method
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

