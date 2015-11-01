package solid.fundamentals.claimhandling.control;

import solid.fundamentals.claimhandling.model.Claim;
import solid.fundamentals.claimhandling.model.ClaimFactory;

import java.util.Date;
import java.util.List;

/**
 * Created by zapp on 01/11/15.
 */
public class CreatePrivateClaim extends ClaimUseCase {


    public Claim execute(
            Date claimDate,
            Date accidentDate,
            String name,
            List<String> property,
            String secretInformation
    ) {

        Claim privateClaim = ClaimFactory.createPrivateClaim(
                claimDate,
                accidentDate,
                name,
                property,
                secretInformation);

        String id = persistence.createClaim(privateClaim);
        privateClaim.setId(id);

        return privateClaim;

    }
}
