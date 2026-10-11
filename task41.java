// Custom checked exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccountWithException {
    private double balance = 500.0;

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Attempted to withdraw " + amount + ", but balance is only " + balance);
        }
        balance -= amount;
        System.out.println("Successfully withdrew: " + amount + ". Remaining balance: " + balance);
    }
}

public class task41 {
    // Demonstrating that finally runs even when try returns a value
    public static int testFinallyReturn() {
        try {
            System.out.println("Inside try block: executing return 100");
            return 100;
        } finally {
            System.out.println("Inside finally block: this always executes before method returns!");
        }
    }

    public static void main(String[] args) {
        // Part 1: Demonstrate finally execution with return
        int returnedVal = testFinallyReturn();
        System.out.println("Method returned value: " + returnedVal);

        System.out.println("\n-------------------\n");

        // Part 2: Demonstrate custom exception usage
        BankAccountWithException account = new BankAccountWithException();
        try {
            account.withdraw(200.0); // Valid withdrawal
            account.withdraw(400.0); // Will throw InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Transaction attempt completed.");
        }
    }
}