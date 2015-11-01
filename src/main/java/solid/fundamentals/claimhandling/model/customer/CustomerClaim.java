package solid.fundamentals.claimhandling.model.customer;

import solid.fundamentals.claimhandling.model.Person;

import java.util.Date;

/**
 * Created by zapp on 01/11/15.
 */
public class CustomerClaim {

    String id;
    Date dateOfClaim;
    Date dateOfAccident;
    Person personWithClaim;
    String someSecretInformation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateOfClaim() {
        return dateOfClaim;
    }

    public void setDateOfClaim(Date dateOfClaim) {
        this.dateOfClaim = dateOfClaim;
    }

    public Date getDateOfAccident() {
        return dateOfAccident;
    }

    public void setDateOfAccident(Date dateOfAccident) {
        this.dateOfAccident = dateOfAccident;
    }

    public Person getPersonWithClaim() {
        return personWithClaim;
    }

    public void setPersonWithClaim(Person personWithClaim) {
        this.personWithClaim = personWithClaim;
    }

    public String getSomeSecretInformation() {
        return someSecretInformation;
    }

    public void setSomeSecretInformation(String someSecretInformation) {
        this.someSecretInformation = someSecretInformation;
    }
}
