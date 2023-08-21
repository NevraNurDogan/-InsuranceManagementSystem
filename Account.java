import java.util.ArrayList;
public  abstract class Account implements Comparable<Account> {
    public enum AuthenticationStatus {
        SUCCESS,
        FAIL
    }
    private AuthenticationStatus loginStatus;
    private User user;
    private ArrayList<Insurance> insurances;

    public abstract AuthenticationStatus login(String email, String password) throws InvalidAuthenticationException;

  //  public abstract void addInsurance(Insurance insurance);

    public Account(User user) {
        this.user = user;
    }
    final void showInfo(){
        System.out.println("Müşteri İsmi:"+getUser().getName());
        System.out.println("Müşteri Soyismi:"+getUser().getLastName());
        System.out.println("Müşteri email:"+getUser().getEmail());
        System.out.println("Müşteri job:"+getUser().getJob());
        System.out.println("Müşteri age:"+getUser().getAge());

    }
    public abstract void addInsurance(Insurance insurance); // Soyut fonksiyon
    @Override
    public int compareTo(Account account) {
        // Karşılaştırma işlemleri burada gerçekleştirilebilir
        return 0;
    }

    @Override
    public int hashCode() {
        // hashCode işlemleri burada gerçekleştirilebilir
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        // equals işlemleri burada gerçekleştirilebilir
        return true;// öylesine hata giderlemk için yazdım returnu
    }

    public AuthenticationStatus getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(AuthenticationStatus loginStatus) {
        this.loginStatus = loginStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(ArrayList<Insurance> insurances) {
        this.insurances = insurances;
    }


}
