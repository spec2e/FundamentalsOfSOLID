package solid.fundamentals.persistence;

import solid.fundamentals.claimhandling.customerClaim.persistence.CustomerPersistenceGateway;
import solid.fundamentals.claimhandling.customerClaim.entity.CustomerClaim;

/**
 * Created by zapp on 01/11/15.
 */
public class CustomerClaimPersistence implements CustomerPersistenceGateway {

    public String createClaim(CustomerClaim claim) {
        return null;
    }

    public void updateClaim(CustomerClaim claim) {

    }

    public CustomerClaim fetchClaim(String id) {
        return null;
    }

    public void deleteClaim(String id) {

    }
}