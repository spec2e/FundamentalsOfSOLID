package solid.fundamentals.claimhandling.model.claim;

import solid.fundamentals.claimhandling.model.Car;

/**
 * Created by zapp on 01/11/15.
 */
public class AutoClaim extends Claim {

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
