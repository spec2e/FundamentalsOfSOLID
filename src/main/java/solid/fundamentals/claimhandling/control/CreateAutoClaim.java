package solid.fundamentals.claimhandling.control;

import solid.fundamentals.claimhandling.model.Claim;
import solid.fundamentals.claimhandling.model.ClaimFactory;

import java.util.Date;

/**
 * Created by zapp on 01/11/15.
 */
public class CreateAutoClaim extends ClaimUseCase {


    public Claim execute(
            String name,
            String insuredCarsLicensePlate,
            String counterpartsLicensePlate,
            String secretInformation
    ) {

        Claim autoClaim = ClaimFactory.createAutoClaim(
                new Date(),
                new Date(),
                name,
                insuredCarsLicensePlate,
                counterpartsLicensePlate,
                secretInformation);

        String id = persistence.createClaim(autoClaim);
        autoClaim.setId(id);

        return autoClaim;
    }
}