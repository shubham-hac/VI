import java.util.Date;

public class Vehicle {
    private int policyNo;
    private String vehicleNo;
    private String vehicleType;
    private String customerName;
    private int engineNo;
    private int chassisNo;
    private long phoneNo;
    private String insuranceType;
    private double premiumAmount;
    private Date fromDate;
    private Date toDate;
    private int underwriterId;

    public Vehicle(int policyNo, String vehicleNo, String vehicleType, String customerName,
                   int engineNo, int chassisNo, long phoneNo, String insuranceType,
                   double premiumAmount, Date fromDate, Date toDate, int underwriterId) {
        this.policyNo = policyNo;
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.customerName = customerName;
        this.engineNo = engineNo;
        this.chassisNo = chassisNo;
        this.phoneNo = phoneNo;
        this.insuranceType = insuranceType;
        this.premiumAmount = premiumAmount;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.underwriterId = underwriterId;
    }


    public String getInsuranceType() {
        return insuranceType;
    }
    public String getVehicleNo() {
        return vehicleNo;
    }
    public int getPolicyNo() {
        return policyNo;
    }

    @Override
    public String toString() {
        return "Policy No: " + policyNo + ", Vehicle No: " + vehicleNo +
                ", Type: " + vehicleType + ", Customer: " + customerName +
                ", Engine No: " + engineNo + ", Chassis No: " + chassisNo +
                ", Phone No: " + phoneNo + ", Insurance Type: " + insuranceType +
                ", Premium: " + premiumAmount + ", From: " + fromDate +
                ", To: " + toDate + ", Underwriter ID: " + underwriterId;
    }


    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }



}
