package solid.fundamentals.claimhandling.customerClaim.entity;


/**
 * Created by zapp on 01/11/15.
 */
public class AutoCustomerClaim extends CustomerClaim {

    private Car insuredCar;
    private Car counterpart;

    public Car getInsuredCar() {
        return insuredCar;
    }

    public void setInsuredCar(Car insuredCar) {
        this.insuredCar = insuredCar;
    }

    public Car getCounterpart() {
        return counterpart;
    }

    public void setCounterpart(Car counterpart) {
        this.counterpart = counterpart;
    }
}
