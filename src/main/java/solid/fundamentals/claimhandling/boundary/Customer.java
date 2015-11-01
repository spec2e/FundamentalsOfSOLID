package solid.fundamentals.claimhandling.boundary;

import solid.fundamentals.claimhandling.control.customer.CreateAutoCustomerClaim;
import solid.fundamentals.claimhandling.model.customerClaim.CustomerClaim;

import javax.inject.Inject;

/**
 * Created by zapp on 01/11/15.
 */
public class Customer {

    @Inject
    CreateAutoCustomerClaim createAutoClaim;

    public CustomerClaim createAutoClaim(String name,
                                  String insuredCarsLicensePlate,
                                  String counterpartsLicensePlate) {

        return createAutoClaim.execute(
                name,
                insuredCarsLicensePlate,
                counterpartsLicensePlate);
    }



}
