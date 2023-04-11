package examination.model;

import java.time.LocalDate;

public class SavingAccount extends Bank{
    private double moneySaving;
    private LocalDate dateSaving;
    private double interestRate;
    private int numberMonths;

    public SavingAccount() {
    }

    public SavingAccount(int idAccount, String codeAccount, String nameAccount, LocalDate dateAccount, double moneySaving, LocalDate dateSaving, double interestRate, int numberMonths) {
        super(idAccount, codeAccount, nameAccount, dateAccount);
        this.moneySaving = moneySaving;
        this.dateSaving = dateSaving;
        this.interestRate = interestRate;
        this.numberMonths = numberMonths;
    }

    public double getMoneySaving() {
        return moneySaving;
    }

    public void setMoneySaving(double moneySaving) {
        this.moneySaving = moneySaving;
    }

    public LocalDate getDateSaving() {
        return dateSaving;
    }

    public void setDateSaving(LocalDate dateSaving) {
        this.dateSaving = dateSaving;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getNumberMonths() {
        return numberMonths;
    }

    public void setNumberMonths(int numberMonths) {
        this.numberMonths = numberMonths;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +super.toString()+
                "moneySaving=" + moneySaving +
                ", dateSaving=" + dateSaving +
                ", interestRate=" + interestRate +
                ", numberMonths=" + numberMonths +
                '}';
    }
}
