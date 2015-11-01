package solid.fundamentals.claimhandling.model.customer;

import java.util.Date;
import java.util.List;

/**
 * Created by zapp on 01/11/15.
 */
public class CustomerClaimFactory {

    public static CustomerClaim createAutoClaim(Date claimDate,
                                        Date accidentDate,
                                        String name,
                                        String insuredCarsLicensenPlate,
                                        String counterpartsLicensePlate) {
        return new AutoCustomerClaim();
    }


    public static CustomerClaim createPersonalInjuryClaim(Date claimDate,
                                                  Date accidentDate,
                                                  String name,
                                                  String injuryDescription) {
        return new PersonalInjuryCustomerClaim();
    }

    public static CustomerClaim createPrivateClaim(Date claimDate,
                                           Date accidentDate,
                                           String name,
                                           List<String> lostProperty) {
        return new PrivateCustomerClaim();
    }

}
