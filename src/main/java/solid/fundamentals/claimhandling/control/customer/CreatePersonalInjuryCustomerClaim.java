package solid.fundamentals.claimhandling.control.customer;

import solid.fundamentals.claimhandling.model.customer.CustomerClaim;
import solid.fundamentals.claimhandling.model.customer.CustomerClaimFactory;

import java.util.Date;

/**
 * Created by zapp on 01/11/15.
 */
public class CreatePersonalInjuryCustomerClaim extends CustomerClaimUseCase {


    public CustomerClaim execute(
            String name,
            String descriptionOfInjury
    ) {

        CustomerClaim personalInjuryClaim = CustomerClaimFactory.createPersonalInjuryClaim(
                new Date(),
                new Date(),
                name,
                descriptionOfInjury);

        String id = persistence.createClaim(personalInjuryClaim);
        personalInjuryClaim.setId(id);

        return personalInjuryClaim;

    }
}
