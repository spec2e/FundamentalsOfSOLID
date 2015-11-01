package solid.fundamentals.claimhandling.customerClaim.boundary;

import solid.fundamentals.claimhandling.customerClaim.control.CreateAutoCustomerClaim;
import solid.fundamentals.claimhandling.customerClaim.entity.CustomerClaim;

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
