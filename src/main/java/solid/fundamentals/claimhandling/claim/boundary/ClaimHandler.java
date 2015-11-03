package solid.fundamentals.claimhandling.claim.boundary;

import solid.fundamentals.claimhandling.claim.control.*;
import solid.fundamentals.claimhandling.claim.entity.Claim;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by zapp on 01/11/15.
 */
@Stateless
public class ClaimHandler {

    @Inject
    CreateAutoClaim createAutoClaimUseCase;

    @Inject
    CreatePrivateClaim createPrivateClaimUseCase;

    @Inject
    CreatePersonalInjuryClaim createPersonalClaimUseCase;

    @Inject
    ViewAutoClaim viewAutoClaimUseCase;

    @Inject
    ViewPersonalInjuryClaim viewPersonalInjuryClaimUseCase;

    @Inject
    ViewPrivateClaim viewPrivateClaimUseCase;

    public Claim createAutoClaim(String name,
                          String insuredCarsLicensePlate,
                          String counterpartsLicensePlate,
                          String secretInformation) {

        return createAutoClaimUseCase.execute(
                name,
                insuredCarsLicensePlate,
                counterpartsLicensePlate,
                secretInformation);

    }


    public Claim createPrivateClaim(String name,
                             List<String> lostProperty,
                             String secretInformation) {

        return createPrivateClaimUseCase.execute(
                name,
                lostProperty,
                secretInformation);
    }

    public Claim createPersonalInjuryClaim(String name,
                                    String injuryDescription,
                                    String secretInformation) {

        return createPersonalClaimUseCase.execute(
                name,
                injuryDescription,
                secretInformation);
    }

    public Claim viewAutoClaim(String id) {
        return viewAutoClaimUseCase.execute(id);
    }

    public Claim viewPersonalInjuryClaim(String id) {
        return viewAutoClaimUseCase.execute(id);
    }

    public Claim viewPrivateClaim(String id) {
        return viewPrivateClaimUseCase.execute(id);
    }
}
