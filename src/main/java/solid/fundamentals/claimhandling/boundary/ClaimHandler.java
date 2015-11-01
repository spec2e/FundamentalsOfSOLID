package solid.fundamentals.claimhandling.boundary;

import solid.fundamentals.claimhandling.control.CreateClaim;
import solid.fundamentals.claimhandling.model.Claim;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.Date;

/**
 * Created by zapp on 01/11/15.
 */
@Stateless
public class ClaimHandler {

    @Inject
    CreateClaim createClaim;

    Claim createAutoClaim(String name,
                           String insuredCarsLicensePlate,
                           String counterpartsLicensePlate) {

        return createClaim.execute(new Date(),
                new Date(),
                "AUTO",
                name,
                null,
                null,
                insuredCarsLicensePlate,
                counterpartsLicensePlate,
                "This is the secret information");

    }

}
