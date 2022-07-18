public class CreditAccount extends Account{

    private final static int FEE=2;


    public CreditAccount(int idClient) {
        super(idClient, CREDIT);
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
        if(getBalance()-amount - FEE < -100){
            System.out.println("No more credit for you");
            return;
        }

        super.addBalance(-amount - FEE);
    }
}