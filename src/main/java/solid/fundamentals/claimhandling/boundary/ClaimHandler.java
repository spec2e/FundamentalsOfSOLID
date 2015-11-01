package solid.fundamentals.claimhandling.boundary;

import solid.fundamentals.claimhandling.control.CreateAutoClaim;
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
    CreateAutoClaim createAutoClaim;

    Claim createAutoClaim(String name,
                           String insuredCarsLicensePlate,
                           String counterpartsLicensePlate) {

        return createAutoClaim.execute(new Date(),
                new Date(),
                name,
                insuredCarsLicensePlate,
                counterpartsLicensePlate,
                "This is the secret information");

    }




}
