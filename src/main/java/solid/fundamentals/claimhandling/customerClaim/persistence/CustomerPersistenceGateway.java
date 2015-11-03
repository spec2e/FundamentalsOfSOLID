package solid.fundamentals.claimhandling.customerClaim.persistence;

import solid.fundamentals.claimhandling.customerClaim.entity.CustomerClaim;

/**
 * Created by zapp on 01/11/15.
 */
public interface CustomerPersistenceGateway {

    String createClaim(CustomerClaim claim);

    void updateClaim(CustomerClaim claim);

    CustomerClaim fetchClaim(String id);

    void deleteClaim(String id);
}
