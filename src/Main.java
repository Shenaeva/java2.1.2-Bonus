public class Main {
    public static void main(String[] args) {
        int accountBeforeDeposit = 100;
        int increase = 1200;
        int bonus;

        if (increase > 1000) {
            bonus = increase / 100;
        } else {
            bonus = 0;
        }

        int accountAfterDeposit = accountBeforeDeposit + increase + bonus;
        System.out.println(accountAfterDeposit);
    }
}
