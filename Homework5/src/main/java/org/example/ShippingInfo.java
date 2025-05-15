package org.example;

public class ShippingInfo {

    private String city;

    public ShippingInfo(String city, String country, int zipcode) {
        if(city == null){
            throw new MissingShippingInfoException("city is null");
        }
        this.city = city;
        this.country = country;
        if (zipcode <= 0){
            throw new InvalidShippingInfoException("zipcode is negative");
        }
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private int zipcode;
    private String country;
}
