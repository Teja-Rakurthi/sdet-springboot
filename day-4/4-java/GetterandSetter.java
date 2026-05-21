class Bankaccount{
    private double balance;

    public double  getBalance(){
        return balance;
    }
    public void setBalance(double amount){

    if(amount>0){
        balance=amount+balance;
        System.out.println("deposited "+ amount);
    }else{
        System.out.println("Invalid amount");
    }
    }
}

public class GetterandSetter {
    public static void main(String[] args){
        Bankaccount sbi= new Bankaccount();
        sbi.setBalance(500);
        sbi.setBalance(-500);
        System.out.println("Current Balance is "+sbi.getBalance());
    }
}
