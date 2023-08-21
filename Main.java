import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıları oluşturun
        User user1 = new User("Ali", "Yılmaz", "ali@example.com", "123456", "Mühendis", 30,new Date());
        User user2 = new User("Ayşe", "Kara", "ayse@example.com", "654321", "Doktor", 28,new Date());


        IAdress homeAddress1 = new HomeAdress("Konya,Türkiye");
        IAdress businessAddress1 = new BusinessAddress("İstanbul, Türkiye");

        IAdress homeAddress2 = new HomeAdress("Amasya,Türkiye");
        IAdress businessAddress2 = new BusinessAddress("Ankara, Türkiye");


        user1.addAddress(homeAddress1);
        user1.addAddress(businessAddress1);

        user2.addAddress(homeAddress2);
        user2.addAddress(businessAddress2);

        // Sağlık sigortası oluşturun ve kullanıcılara ekleyin
        HealthInsurance healthInsurance1 = new HealthInsurance("Sağlık Sigortası 1", 500.0, new Date(), new Date());
        HealthInsurance healthInsurance2 = new HealthInsurance("Sağlık Sigortası 2", 600.0, new Date(), new Date());

        user1.setInsurances(healthInsurance1);
        user2.setInsurances(healthInsurance2);

        // Kullanıcıları listeleyin
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        for (User user : users) {
            System.out.println("Kullanıcı Adı: " + user.getName());
            System.out.println("Kullanıcı Soyadı: " + user.getLastName());
            System.out.println("Kullanıcı Email: " + user.getEmail());
            System.out.println("Kullanıcı Meslek: " + user.getJob());
            System.out.println("Kullanıcı Yaş: " + user.getAge());

            System.out.println("Adresler");
            System.out.println("---------------");
            for (IAdress address : user.getAddresses()) {
                System.out.println(address.getAddressInfo());
            }

            System.out.println("Sigortalar");
            System.out.println("---------------");
            for (Insurance insurance : user.getInsurances()) {
                System.out.println("Sigorta Adı: " + insurance.getInsuranceName());
                System.out.println("Sigorta Ücreti: " + insurance.getInsurancePrice());
            }

            System.out.println("#########################");
        }
    }
}
