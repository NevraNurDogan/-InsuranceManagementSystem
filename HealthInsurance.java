import java.util.Date;

public class HealthInsurance extends Insurance {
    public HealthInsurance(  String insuranceName, Double insurancePrice, Date insuranceStart, Date insuranceEnd) {
        super(insuranceName,insurancePrice,insuranceStart,insuranceEnd);
    }

    @Override
    public double calculate() {
        // Sağlık sigortası için ücret hesaplama işlemi
        return 1000;
    }
}
