package solid.fundamentals.claimhandling.customerClaim.persistence;

import solid.fundamentals.claimhandling.customerClaim.entity.CustomerClaim;

/**
 * Created by zapp on 01/11/15.
 */
public interface CustomerPersistenceGateway {

    public String createClaim(CustomerClaim claim);

    public void updateClaim(CustomerClaim claim);

    public CustomerClaim fetchClaim(String id);

    public void deleteClaim(String id);
}
