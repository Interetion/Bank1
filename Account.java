public abstract class Account {

    public final static String  DEBIT  = "debit";
    public final static String  CREDIT  = "credit";
    private int balance;
    private int idClient;
    private String accountType;
    private boolean cardDelivered;



    public Account(int idClient, String accountType){
           this.accountType = accountType;
           this.idClient = idClient;
           cardDelivered = false;
    }

    public int getBalance() {

        return balance;
    }

    public void deposit(int amount){
        if(!isAmountPositive(amount)){
          return;
         }
         addBalance(amount);

    }



    public void addBalance(int amount){
        System.out.println("someone just added: " + amount);
         this.balance += amount;
    }


    public int getIdClient() {
        return idClient;
    }

    public String getAccountType() {
        return accountType;
    }

    public abstract void pay(int amount);


    public boolean isAmountPositive(int amount){
        if(amount < 0)    {
            System.out.println("cant do negative");    
        }

        return amount > 0;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", idClient=" + idClient +
                ", accountType='" + accountType + '\'' +
                '}';
    }

    public void askCard(){
        if(getCardDelivered()){
            System.out.println("Already have a carsd");
            return;
        }
        cardDelivered = true;
    }
    public boolean getCardDelivered() {
        return cardDelivered;
    }
}