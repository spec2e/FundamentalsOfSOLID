package solid.fundamentals.claimhandling.database;

import solid.fundamentals.claimhandling.model.customer.CustomerClaim;

/**
 * Created by zapp on 01/11/15.
 */
public interface CustomerPersistenceGateway {

    public String createClaim(CustomerClaim claim);

    public void updateClaim(CustomerClaim claim);

    public CustomerClaim fetchClaim(String id);

    public void deleteClaim(String id);
}
