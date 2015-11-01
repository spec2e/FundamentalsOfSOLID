package solid.fundamentals.claimhandling.control.customer;

import solid.fundamentals.claimhandling.database.CustomerPersistenceGateway;

import javax.inject.Inject;

/**
 * Created by zapp on 01/11/15.
 */
public class CustomerClaimUseCase {

    @Inject
    CustomerPersistenceGateway persistence;

    public class ClaimTypeNotFound extends RuntimeException {
        public ClaimTypeNotFound(String s) {
        }
    }
}
