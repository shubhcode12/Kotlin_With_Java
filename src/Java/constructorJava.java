package Java;

public class constructorJava {
    int a;

    //constructor has same name as class
    //it cant return any value
    constructorJava() {
        System.out.println("Constructor called");
    }

    constructorJava(int value) {
        System.out.println("Constructor called with value = " + value);
    }


    public static void main(String[] args) {
        constructorJava obj = new constructorJava();
        constructorJava obj1 = new constructorJava(45);

Account account= Account.getInstance();
        System.out.println(account.getBankBalence());
        account.setBankBalance(588888);
        System.out.println(account.getBankBalence());
    }

}

class Account {
    private int bankBalence;
    private static Account singletonObject=null;

    //private constructor so that we cant create instance of this clas
    private Account(){
    }

     int getBankBalence() {
        return bankBalence;
    }

     void setBankBalance(int newBalance) {
        this.bankBalence = newBalance;
    }
//singleton object
    public static Account getInstance(){
        if(singletonObject==null)
            singletonObject= new Account();
        return  singletonObject;
    }
}
