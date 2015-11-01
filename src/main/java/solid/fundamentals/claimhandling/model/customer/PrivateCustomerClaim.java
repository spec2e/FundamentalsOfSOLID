package solid.fundamentals.claimhandling.model.customer;

import java.util.List;

/**
 * Created by zapp on 01/11/15.
 */
public class PrivateCustomerClaim extends CustomerClaim {

    List<String> lostProperty;

    public List<String> getLostProperty() {
        return lostProperty;
    }

    public void setLostProperty(List<String> lostProperty) {
        this.lostProperty = lostProperty;
    }
}
