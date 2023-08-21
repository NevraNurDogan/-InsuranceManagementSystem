import java.util.Date;

public class CarInsurance extends Insurance{
    public CarInsurance(String insuranceName, Double insurancePrice, Date insuranceStart, Date insuranceEnd) {
        super(insuranceName,insurancePrice,insuranceStart,insuranceEnd);
    }
    @Override
    public double calculate() {
        // Otomobil sigortası için ücret hesaplama işlemi
    return 1500;
    }
}
