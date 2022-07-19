public class Client {
    private static int idClient;
    private int id;
    private Bank bank;


   public Client(){
       idClient++;
       id = idClient;

    }


    public void enterBank(Bank bank) {
       this.bank = bank;
    }

    public void openAccount(String accountType) {
       if (bank == null){
           return;
       }
       bank.addAccount(id,accountType);
    }

    public void pay(String accountType, int amount){
        if (bank == null){
            return;
        }
        bank.pay(id,accountType,amount);

    }

    public void deposit(String accountType, int amount){
        if (bank == null){
            return;
        }
        bank.deposit(id,accountType,amount);

    }

    public void askCard(String accountType) {
       bank.askCard(id, accountType);
    }

   @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                '}';
    }
}
