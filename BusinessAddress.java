import java.util.Scanner;
public class BusinessAddress implements IAdress{
    private String address;

    public BusinessAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddressInfo() {
        return "İş Adresi: " + address;
    }
}
