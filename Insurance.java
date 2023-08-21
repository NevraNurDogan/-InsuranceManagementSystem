import java.util.Date;
public abstract class Insurance {
    public String insuranceName;
    public Double insurancePrice;
    public Date insuranceStart;
    public Date insuranceEnd;

    public Insurance(String insuranceName, Double insurancePrice, Date insuranceStart, Date insuranceEnd) {
        this.insuranceName = insuranceName;
        this.insurancePrice = insurancePrice;
        this.insuranceStart = insuranceStart;
        this.insuranceEnd = insuranceEnd;
    }
    public abstract double calculate();

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public Double getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(Double insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public Date getInsuranceStart() {
        return insuranceStart;
    }

    public void setInsuranceStart(Date insuranceStart) {
        this.insuranceStart = insuranceStart;
    }

    public Date getInsuranceEnd() {
        return insuranceEnd;
    }

    public void setInsuranceEnd(Date insuranceEnd) {
        this.insuranceEnd = insuranceEnd;
    }
}
