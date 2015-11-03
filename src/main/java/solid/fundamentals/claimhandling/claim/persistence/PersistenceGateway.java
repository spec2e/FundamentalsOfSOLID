package solid.fundamentals.claimhandling.claim.persistence;

import solid.fundamentals.claimhandling.claim.entity.Claim;

/**
 * Created by zapp on 01/11/15.
 */
public interface PersistenceGateway {

    String createClaim(Claim claim);

    void updateClaim(Claim claim);

    Claim fetchClaim(String id);

    void deleteClaim(String id);

}
