package solid.fundamentals.claimhandling.control;

import solid.fundamentals.claimhandling.database.PersistenceGateway;
import solid.fundamentals.claimhandling.model.Claim;

import javax.inject.Inject;

/**
 * Created by zapp on 01/11/15.
 */
public class ViewClaim {

    @Inject
    PersistenceGateway persistenceGateway;

    public Claim execute(String claimId, String claimType) {

        return null;

    }

}
