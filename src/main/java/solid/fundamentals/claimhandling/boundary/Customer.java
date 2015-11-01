package solid.fundamentals.claimhandling.boundary;

import solid.fundamentals.claimhandling.control.CreateAutoClaim;
import solid.fundamentals.claimhandling.model.Claim;

import javax.inject.Inject;

/**
 * Created by zapp on 01/11/15.
 */
public class Customer {

    @Inject
    CreateAutoClaim createAutoClaim;

    public Claim createAutoClaim(String name,
                                  String insuredCarsLicensePlate,
                                  String counterpartsLicensePlate) {

        return createAutoClaim.execute(
                name,
                insuredCarsLicensePlate,
                counterpartsLicensePlate,
                null);
    }



}
