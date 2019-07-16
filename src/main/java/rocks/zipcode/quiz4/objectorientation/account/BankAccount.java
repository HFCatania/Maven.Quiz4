package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{
    private Double val;
    private Long id;


    public BankAccount(Double val, Long id) {
        this.val = 0.0;
        this.id = id;
    }

    public BankAccount() {
        this.val = 0.0;
    }

    public void setBalance(Double val) {
        this.val = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) throws IllegalArgumentException {
        if(amountToIncreaseBy < 0) {
            throw new IllegalArgumentException();
        } else {
            this.val += amountToIncreaseBy;
        }
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) throws IllegalArgumentException {
        if(amountToDecreaseBy > this.val || amountToDecreaseBy < 0) {
            throw new IllegalArgumentException();
        }else{
        this.val -= amountToDecreaseBy;
        }
    }

    @Override
    public Double getBalance() {
        return val;
    }
}
