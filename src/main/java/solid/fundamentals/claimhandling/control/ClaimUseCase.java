package solid.fundamentals.claimhandling.control;

import solid.fundamentals.claimhandling.database.PersistenceGateway;

import javax.inject.Inject;

/**
 * Created by zapp on 01/11/15.
 */
public class ClaimUseCase {

    @Inject
    PersistenceGateway persistence;

    public class ClaimTypeNotFound extends RuntimeException {
        public ClaimTypeNotFound(String s) {
        }
    }
}
