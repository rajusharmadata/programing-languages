
public class accesmod {
    public static void main(String [] args){
        BankAccount Account = new BankAccount();
        Account.username = "raju";
        System.out.println(Account.username);
        Account.setPassword("Helloraju");
    }
}
class BankAccount{
    // user name is public
    public String username;
    // password is private
    private String Password;
    void setPassword(String pwd){
        Password = pwd;
    }
}
