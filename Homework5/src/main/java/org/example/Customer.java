package org.example;

public class Customer {

    private int id;
    private Profile profile;

    //This is an example of dependency injection because Customer receives the shipping info from the Profile class, creating a dependency.

    public Customer(Profile profile, int id) {
        if(profile == null){
            throw new InvalidCustomerException("profile is null");
        }
        this.profile = profile;
        if(id <= 0 ){
            throw new InvalidCustomerException("id is invalid");
        }
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
