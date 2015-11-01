package solid.fundamentals.claimhandling.control;

import solid.fundamentals.claimhandling.model.Claim;
import solid.fundamentals.claimhandling.model.ClaimFactory;

import java.util.Date;

/**
 * Created by zapp on 01/11/15.
 */
public class CreatePersonalInjuryClaim extends ClaimUseCase {


    public Claim execute(
            Date claimDate,
            Date accidentDate,
            String name,
            String descriptionOfInjury,
            String secretInformation
    ) {

        Claim personalInjuryClaim = ClaimFactory.createPersonalInjuryClaim(
                claimDate,
                accidentDate,
                name,
                descriptionOfInjury,
                secretInformation);

        String id = persistence.createClaim(personalInjuryClaim);
        personalInjuryClaim.setId(id);

        return personalInjuryClaim;

    }
}
