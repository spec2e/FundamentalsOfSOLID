package solid.fundamentals.claimhandling.claim.entity;

/**
 * Created by zapp on 01/11/15.
 */
public class PersonalInjuryClaim extends Claim {

    String descriptionOfInjury;

    public String getDescriptionOfInjury() {
        return descriptionOfInjury;
    }

    public void setDescriptionOfInjury(String descriptionOfInjury) {
        this.descriptionOfInjury = descriptionOfInjury;
    }
}
