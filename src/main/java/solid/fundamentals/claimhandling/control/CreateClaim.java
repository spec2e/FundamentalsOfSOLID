package solid.fundamentals.claimhandling.control;

import solid.fundamentals.claimhandling.database.PersistenceGateway;
import solid.fundamentals.claimhandling.model.*;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;

/**
 * Created by zapp on 01/11/15.
 */
public class CreateClaim {

    @Inject
    PersistenceGateway dbGw;

    public Claim execute(
            Date claimDate,
            Date accidentDate,
            String claimType,
            String name,
            String descriptionOfInjury,
            List<String> property,
            String insuredCarsLicensePlate,
            String counterpartsLicensePlate,
            String secretInformation
    ) {

        Claim claim;

        if(claimType.equals("AUTO")) {

            claim = ClaimFactory.createAutoClaim(
                    claimDate,
                    accidentDate,
                    name,
                    insuredCarsLicensePlate,
                    counterpartsLicensePlate,
                    secretInformation);

        } else if(claimType.equals("PRIVATE")) {

            claim = ClaimFactory.createPrivateClaim(
                    claimDate,
                    accidentDate,
                    name,
                    property,
                    secretInformation);

        } else if(claimType.equals("PERSON")) {

            claim = ClaimFactory.createPersonalInjuryClaim(
                    claimDate,
                    accidentDate,
                    name,
                    descriptionOfInjury,
                    secretInformation);

        } else {
            throw new ClaimTypeNotFound("Could not recognize claim type!");
        }

        return claim;

    }

    private class ClaimTypeNotFound extends RuntimeException {
        public ClaimTypeNotFound(String s) {
        }
    }
}
