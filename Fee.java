
public class Fee {

    private final FeeType type;
    private final double amount;

    public Fee(FeeType type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public FeeType getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return type + " Fee: $" + amount;
    }
}
