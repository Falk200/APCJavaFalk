package org.example;

public class EComController {
     public static void main( String [] args) {
        ShippingInfo info =
                new ShippingInfo (" Munich", "Germany" , 80085);
        Profile profile = new Profile (info );
         Customer customer = new Customer (profile , 123);
        System .out. println (" Shipping to: " +
                customer.getProfile (). getShippingInfo (). getCity ());
    }
}
