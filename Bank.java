public class Bank {


    private Account[] accounts;
    private int nextAccountIndex;



  public Bank(){
      accounts = new Account[10];

  }

    public Account getAccount(int idClient, String accountType){
        for (Account account: accounts) {
            if(account == null){
                continue;
            }
            if (account.getIdClient() == idClient && account.getAccountType()==accountType ){
                System.out.println("you just open a account ");
                return account;

            }
        }
       // System.out.println("No account matching query");

        return null;
    }

    public void addAccount(int idClient, String accountType){
      if(getAccount(idClient,accountType )!= null){
          System.out.println("Already have account ");
          return;
      }
      switch (accountType){
          case Account.DEBIT :
              accounts[nextAccountIndex] = new DebitAccount(idClient);
              break;
          case Account.CREDIT:
              accounts[nextAccountIndex] = new CreditAccount(idClient);
              break;
      }

      nextAccountIndex++;

    }

    public void pay(int idClient, String accountType, int amount){
      Account tempAccount = getAccount(idClient, accountType);
      if(tempAccount == null){
          return;
      }
      tempAccount.pay(amount);
    }


    public void deposit(int idClient, String accountType, int amount) {
        Account tempAccount = getAccount(idClient, accountType);
        if(tempAccount == null){
            return;
        }
        tempAccount.deposit(amount);
    }

    public void askCard(int idClient, String accountType) {
        Account tempAccount = getAccount(idClient, accountType);
        if(tempAccount == null){
            return;
        }
        if(!tempAccount.getCardDelivered()){
            tempAccount.askCard();
        }
    }


}
