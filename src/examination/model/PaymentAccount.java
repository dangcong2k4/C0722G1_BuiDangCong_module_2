package examination.model;

import java.time.LocalDate;

public class PaymentAccount extends Bank{
    private String numberCard;
    private double moneyPayment;

    public PaymentAccount() {
    }

    public PaymentAccount(int idAccount, String codeAccount, String nameAccount, LocalDate dateAccount, String numberCard, double moneyPayment) {
        super(idAccount, codeAccount, nameAccount, dateAccount);
        this.numberCard = numberCard;
        this.moneyPayment = moneyPayment;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public double getMoneyPayment() {
        return moneyPayment;
    }

    public void setMoneyPayment(double moneyPayment) {
        this.moneyPayment = moneyPayment;
    }

    @Override
    public String toString() {
        return "PaymentAccount{" +super.toString()+
                "numberCard='" + numberCard + '\'' +
                ", moneyPayment=" + moneyPayment +
                '}';
    }
}
