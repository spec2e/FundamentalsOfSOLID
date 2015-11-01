package solid.fundamentals.claimhandling.database;

import solid.fundamentals.claimhandling.model.Claim;

/**
 * Created by zapp on 01/11/15.
 */
public interface PersistenceGateway {

    public String createClaim(Claim claim);

    public void updateClaim(Claim claim);

    public Claim fetchClaim(String id);

    public void deleteClaim(String id);

}
