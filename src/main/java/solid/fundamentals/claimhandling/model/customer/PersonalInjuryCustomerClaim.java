package solid.fundamentals.claimhandling.model.customer;

/**
 * Created by zapp on 01/11/15.
 */
public class PersonalInjuryCustomerClaim extends CustomerClaim {

    String descriptionOfInjury;

    public String getDescriptionOfInjury() {
        return descriptionOfInjury;
    }

    public void setDescriptionOfInjury(String descriptionOfInjury) {
        this.descriptionOfInjury = descriptionOfInjury;
    }
}
