package solid.fundamentals.claimhandling.model.claimhandler;

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
