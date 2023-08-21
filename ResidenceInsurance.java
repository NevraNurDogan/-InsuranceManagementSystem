import java.util.Date;

public class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(String insuranceName, Double insurancePrice, Date insuranceStart, Date insuranceEnd) {
        super(insuranceName, insurancePrice, insuranceStart, insuranceEnd);
    }

    @Override
    public double calculate() {
        // Konut sigortası için ücret hesaplama işlemi
        return 2000;
    }
}
