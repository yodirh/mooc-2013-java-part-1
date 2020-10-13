
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account Mattsaccount = new Account("Matt's account", 1000.0);
        Account Myaccount = new Account("My account", 0.0);
        Mattsaccount.withdrawal(100.0);
        Myaccount.deposit(100.0);
        System.out.println(Mattsaccount);
        System.out.println(Myaccount);
    }

}
