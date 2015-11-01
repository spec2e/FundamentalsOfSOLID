package solid.fundamentals.claimhandling.model.claim;

import java.util.Date;
import java.util.List;

/**
 * Created by zapp on 01/11/15.
 */
public class ClaimFactory {

    public static Claim createAutoClaim(Date claimDate,
                                        Date accidentDate,
                                        String name,
                                        String insuredCarsLicensenPlate,
                                        String counterpartsLicensePlate,
                                        String secretInformation) {
        return new AutoClaim();
    }


    public static Claim createPersonalInjuryClaim(Date claimDate,
                                                  Date accidentDate,
                                                  String name,
                                                  String injuryDescription,
                                                  String secretInformation) {
        return new PersonalInjuryClaim();
    }

    public static Claim createPrivateClaim(Date claimDate,
                                           Date accidentDate,
                                           String name,
                                           List<String> lostProperty,
                                           String secretInformation) {
        return new PrivateClaim();
    }

}
