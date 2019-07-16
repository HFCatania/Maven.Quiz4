package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private ArrayList<BankAccount> bankAccountsList = new ArrayList<>();

    public Bank(){
        this.bankAccountsList = new ArrayList<>();
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        if(bankAccountsList.get(indexNumber) != null){
            BankAccount indexAccount = this.bankAccountsList.get(indexNumber);
            this.bankAccountsList.remove(indexAccount);
            return indexAccount;
        }
        return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccountsList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
      return   bankAccountsList.contains(bankAccount);
    }
}
