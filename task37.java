final class Money {
    private final double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public Money add(Money m) {
        return new Money(this.amount + m.amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;
        Money money = (Money) o;
        return Double.compare(money.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(amount);
    }
}

public class task37 {
    public static void main(String[] args) {
        Money m1 = new Money(100.0);
        Money m2 = new Money(100.0);
        Money m3 = m1.add(new Money(50.0));

        System.out.println("m1 == m2: " + (m1 == m2)); // Compares memory references
        System.out.println("m1.equals(m2): " + m1.equals(m2)); // Compares object values
        System.out.println("m3 Amount: " + m3.getAmount());
    }
}