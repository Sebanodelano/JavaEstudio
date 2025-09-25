package C07_OOP.Clases;

public class BankAccount {
    // 6. Crea una clase BankAccount con atributo balance y un metodo deposit() que sume el saldo.
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;

    }
    public void deposit(double amount){
        if(amount > 0){
            balance =+ amount;
            System.out.println("Se depositó " + amount +
                    ". Saldo actual: " + balance);
        }else{
            System.out.println("El depósito debe ser mayor a 0");

        }

    }
    public double getBalance(){
        return balance;

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
