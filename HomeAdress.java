import java.util.Scanner;
public class HomeAdress implements IAdress{
    private String address;

    public  HomeAdress(String address) {
        this.address = address;
    }

    @Override
    public String getAddressInfo() {
        return "Ev Adresi: " + address;
    }
}
