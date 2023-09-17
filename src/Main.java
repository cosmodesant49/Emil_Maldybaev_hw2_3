public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(15000);

        try {
            while (true) {
                account.withdraw(6000);
            }
        } catch (LimitException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("у вас только " + e.getRemainingAmount() + " сом.");
            System.out.println("выполняется снятие всех денег");
            Thread.sleep(1000);
            System.out.println("Loading.");
            Thread.sleep(1000);
            System.out.println("Loading..");
            Thread.sleep(1000);
            System.out.println("Loading...");
            Thread.sleep(1000);
            System.out.println("Успех, ваш баланс снят, текущий баланс: " + (e.getRemainingAmount()  -  e.getRemainingAmount()));

        }
    }
}