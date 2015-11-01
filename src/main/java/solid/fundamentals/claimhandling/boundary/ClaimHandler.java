package solid.fundamentals.claimhandling.boundary;

import solid.fundamentals.claimhandling.control.claimhandler.CreateAutoClaim;
import solid.fundamentals.claimhandling.control.claimhandler.CreatePersonalInjuryClaim;
import solid.fundamentals.claimhandling.control.claimhandler.CreatePrivateClaim;
import solid.fundamentals.claimhandling.model.claim.Claim;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by zapp on 01/11/15.
 */
@Stateless
public class ClaimHandler {

    @Inject
    CreateAutoClaim createAutoClaim;

    @Inject
    CreatePrivateClaim createPrivateClaim;

    @Inject
    CreatePersonalInjuryClaim createPersonalClaim;

    Claim createAutoClaim(String name,
                          String insuredCarsLicensePlate,
                          String counterpartsLicensePlate,
                          String secretInformation) {

        return createAutoClaim.execute(
                name,
                insuredCarsLicensePlate,
                counterpartsLicensePlate,
                secretInformation);

    }


    Claim createPrivateClaim(String name,
                             List<String> lostProperty,
                             String secretInformation) {

        return createPrivateClaim.execute(
                name,
                lostProperty,
                secretInformation);
    }

    Claim createPersonalInjuryClaim(String name,
                                    String injuryDescription,
                                    String secretInformation) {

        return createPersonalClaim.execute(
                name,
                injuryDescription,
                secretInformation);
    }


}
