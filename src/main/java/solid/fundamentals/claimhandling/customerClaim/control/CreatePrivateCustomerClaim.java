package solid.fundamentals.claimhandling.customerClaim.control;

import solid.fundamentals.claimhandling.customerClaim.entity.CustomerClaim;
import solid.fundamentals.claimhandling.customerClaim.entity.CustomerClaimFactory;

import java.util.Date;
import java.util.List;

/**
 * Created by zapp on 01/11/15.
 */
public class CreatePrivateCustomerClaim extends CustomerClaimUseCase {


    public CustomerClaim execute(
            String name,
            List<String> property
    ) {

        CustomerClaim privateClaim = CustomerClaimFactory.createPrivateClaim(
                new Date(),
                new Date(),
                name,
                property);

        String id = persistence.createClaim(privateClaim);
        privateClaim.setId(id);

        return privateClaim;

    }
}
