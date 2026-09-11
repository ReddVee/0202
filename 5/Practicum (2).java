public class Practicum {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
       bankAccount.setMoneyAmount(12000);
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
        bankAccount.draw(11000);
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
    }
}

class BankAccount {
    private long moneyAmount;
    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(long newMoneyAmount) {
       moneyAmount = newMoneyAmount;
    }
    public void draw(long newMoneyAmount) {
        if (moneyAmount>=newMoneyAmount)
        moneyAmount = moneyAmount-newMoneyAmount;
        System.out.println("Со счёта снято "+ newMoneyAmount+" р.");
    }
}
