package solid.fundamentals.claimhandling.claim.control;

import solid.fundamentals.claimhandling.claim.entity.Claim;
import solid.fundamentals.claimhandling.claim.entity.ClaimFactory;

import java.util.Date;
import java.util.List;

/**
 * Created by zapp on 01/11/15.
 */
public class CreatePrivateClaim extends ClaimUseCase {


    public Claim execute(
            String name,
            List<String> property,
            String secretInformation
    ) {

        Claim privateClaim = ClaimFactory.createPrivateClaim(
                new Date(),
                new Date(),
                name,
                property,
                secretInformation);

        String id = persistence.createClaim(privateClaim);
        privateClaim.setId(id);

        return privateClaim;

    }
}
