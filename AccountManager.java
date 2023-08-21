import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> accountList;

    public AccountManager() {
        this.accountList = new TreeSet<>();
    }
    public void addAccount(Account account) {
        accountList.add(account);
    }
    public void removeAccount(Account account) {
        accountList.remove(account);
    }
    public Account.AuthenticationStatus login(String email, String password) throws InvalidAuthenticationException {
        for (Account account : accountList) {
            if (account.login(email, password) == Account.AuthenticationStatus.SUCCESS) {
                return Account.AuthenticationStatus.SUCCESS;
            }
        }
        throw new InvalidAuthenticationException();
    }
}
