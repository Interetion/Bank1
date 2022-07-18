public class Main {
    public static void main(String[] args) {
       //testDebit();
       // testCredit();
     //  testBankAccount();
        testBankClient();
    }

    public static void testDebit() {

        DebitAccount debitAccount = new DebitAccount(1);
        debitAccount.pay(-100);
        debitAccount.pay(100);
        debitAccount.deposit(100);
        debitAccount.pay(100);

    }

    public static void testCredit() {

        CreditAccount creditAccount = new CreditAccount(1);
        creditAccount.pay(-100);
        creditAccount.pay(100);
        creditAccount.deposit(100);
        creditAccount.pay(100);

    }

    public static void testBankAccount() {
        Bank bank = new Bank();
        bank.addAccount(1,Account.DEBIT);
        bank.addAccount(1,Account.CREDIT);
        System.out.println(bank.getAccount(1, Account.DEBIT));
        System.out.println(bank.getAccount(1, Account.CREDIT));

        bank.pay(1, Account.DEBIT, 100);
        bank.pay(1, Account.CREDIT, 10);
        bank.deposit(1, Account.CREDIT, 100);
    }

    public static void testBankClient() {
        Bank bank = new Bank();
        Client client = new Client();
        client.enterBank(bank);
        client.openAccount(Account.CREDIT);
        client.askCard(Account.CREDIT);
        client.openAccount(Account.CREDIT);
        client.openAccount(Account.DEBIT);
        client.pay(Account.DEBIT, 100);
        client.deposit(Account.DEBIT, 200);
        client.askCard(Account.DEBIT);
        client.pay(Account.DEBIT, 100);

    }
}
