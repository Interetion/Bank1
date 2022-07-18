public  class DebitAccount extends Account {


    public DebitAccount(int idClient) {
        super(idClient, DEBIT);
    }


    @Override
    public void pay(int amount) {
        if(!getCardDelivered()){
            System.out.println("Need a card first");
            return;
        }
        if(!isAmountPositive(amount)){
            return;
        }
        if(getBalance()-amount < 0){
            System.out.println("Cant be negative after");
            return;
        }

        super.addBalance(-amount);

    }
}
