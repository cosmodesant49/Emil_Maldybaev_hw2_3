public class BankAccount {
    private double amount;

    public BankAccount(double initialAmount) {
        this.amount = initialAmount;
    }

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum) {
        if (sum > 0) {
            amount += sum;
            System.out.println("Баланс пополнен на " + sum + " сом, текущий баланс: " + amount + " сом.");
        } else {
            System.out.println("Ошибка");
        }
    }
    public void withdraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Недостаточно средств!", amount);
        } else {
            amount -= sum;
            System.out.println("Снято: " + sum + ", текущий баланс: " + amount);
        }
    }
}
