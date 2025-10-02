package C07_OOP.AccessModifiersExcercises;

public class BankAccount {
    /*3. Crea una clase BankAccount con el atributo privado balance.
        Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
         */
    private double balance;
    public BankAccount(double balance){
        if(balance<0){
            System.out.println("El balance inicial es valido o es 0");
            this.balance=0;
        }else{
            this.balance=balance;

        }

    }
    public double deposit(double amount){
        if(amount<= 0){
            System.out.println("El monto es invalido");
        }else{
            balance += amount;
        }
        return  balance;
    }
    public double withdraw(double amount){
        if(amount<= 0 || amount> balance){
            System.out.println("El monto no es valido");
        }else{
            balance -= amount;
        }
        return balance;

    }

    public double getBalance() {
        return balance;
    }
    public void showBankAccount(){
        System.out.println("el balance actual es de" + balance);
    }
}

