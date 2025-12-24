import java.util.Map;

public class Expense {
    private String expenseId;
    private double totalAmount;
    private User paidBy;
    private Map<User, Double> splits;

    public Expense(String expenseId, double totalAmount, User paidBy, Map<User, Double> splits) {
        this.expenseId = expenseId;
        this.totalAmount = totalAmount;
        this.paidBy = paidBy;
        this.splits = splits;
    }
}
