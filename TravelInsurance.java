import java.util.Date;

public class TravelInsurance extends  Insurance{
    public TravelInsurance(String insuranceName, Double insurancePrice, Date insuranceStart, Date insuranceEnd) {
        super(insuranceName,insurancePrice,insuranceStart,insuranceEnd);
    }
    @Override
    public double calculate() {
        // Seyahat sigortası için ücret hesaplama işlemi
        return 500;
    }
}
