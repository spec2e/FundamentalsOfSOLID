package solid.fundamentals.claimhandling.control.customer;

import solid.fundamentals.claimhandling.model.customer.CustomerClaim;
import solid.fundamentals.claimhandling.model.customer.CustomerClaimFactory;

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
