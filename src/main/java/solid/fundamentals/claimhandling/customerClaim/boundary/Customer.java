package solid.fundamentals.claimhandling.customerClaim.boundary;

import solid.fundamentals.claimhandling.customerClaim.control.*;
import solid.fundamentals.claimhandling.customerClaim.entity.CustomerClaim;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by zapp on 01/11/15.
 */
public class Customer {

    @Inject
    CreateAutoCustomerClaim createAutoClaimUseCase;

    @Inject
    ViewAutoCustomerClaim viewAutoCustomerClaimUseCase;

    @Inject
    CreatePersonalInjuryCustomerClaim createPersonalInjuryCustomerClaimUseCase;

    @Inject
    ViewPersonalInjuryCustomerClaim viewPersonalInjuryCustomerClaimUseCase;

    @Inject
    CreatePrivateCustomerClaim createPrivateCustomerClaimUseCase;

    @Inject
    ViewPrivateCustomerClaim viewPrivateCustomerClaimUseCase;

    public CustomerClaim createAutoClaim(String name,
                                  String insuredCarsLicensePlate,
                                  String counterpartsLicensePlate) {

        return createAutoClaimUseCase.execute(
                name,
                insuredCarsLicensePlate,
                counterpartsLicensePlate);
    }


    public CustomerClaim createPersonalInjuryClaim(String name, String descriptionOfInjury) {
        return createPersonalInjuryCustomerClaimUseCase.execute(
                name,
                descriptionOfInjury
        );
    }

    public CustomerClaim createPrivateCustomerClaim(String name, List<String> lostProperties) {
        return createPrivateCustomerClaimUseCase.execute(
                name,
                lostProperties
        );
    }

    public CustomerClaim viewAutoCustomerClaim(String id) {
        return viewAutoCustomerClaimUseCase.execute(id);
    }

    public CustomerClaim viewPersonalInjuryCustomerClaim(String id) {
        return viewPersonalInjuryCustomerClaimUseCase.execute(id);
    }

    public CustomerClaim viewPrivateCustomerClaim(String id) {
        return viewPrivateCustomerClaimUseCase.execute(id);
    }
}
