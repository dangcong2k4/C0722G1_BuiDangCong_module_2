package examination.model;

import java.time.LocalDate;

public abstract class Bank {
    private int idAccount;
    private String codeAccount;
    private String nameAccount;
    private LocalDate dateAccount;

    public Bank() {
    }

    public Bank(int idAccount, String codeAccount, String nameAccount, LocalDate dateAccount) {
        this.idAccount = idAccount;
        this.codeAccount = codeAccount;
        nameAccount = nameAccount;
        this.dateAccount = dateAccount;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getCodeAccount() {
        return codeAccount;
    }

    public void setCodeAccount(String codeAccount) {
        this.codeAccount = codeAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        nameAccount = nameAccount;
    }

    public LocalDate getDateAccount() {
        return dateAccount;
    }

    public void setDateAccount(LocalDate dateAccount) {
        this.dateAccount = dateAccount;
    }

    @Override
    public String toString() {
        return "idAccount=" + idAccount +
                ", codeAccount='" + codeAccount + '\'' +
                ", NameAccount='" + nameAccount + '\'' +
                ", dateAccount=" + dateAccount ;
    }
}
