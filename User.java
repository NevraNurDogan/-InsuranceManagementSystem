import java.util.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class User {
    public String name;
    public String lastName;
    public String email;
    public String password;
    public String job;
    public int age;
    private ArrayList<IAdress> addresses;
    private LocalDate lastLoginDate;
    private ArrayList<Insurance> insurances;

    public User(String name, String lastName, String email, String password, String job, int age, Date lastLoginDate) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.addresses = new ArrayList<>();
        this.insurances = new ArrayList<>();
        this.lastLoginDate =LocalDate.now();
    }
    public void addAddress(IAdress address) {
        addresses.add(address);
    }

    public void removeAddress(IAdress address) {
        addresses.remove(address);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<IAdress> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<IAdress> addresses) {
        this.addresses = addresses;
    }

    public LocalDate getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDate lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(ArrayList<Insurance> insurances) {
        this.insurances = insurances;
    }

    public void setInsurances(Insurance insurance) {
        insurances.add(insurance);
    }

}
