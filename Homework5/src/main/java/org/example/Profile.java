package org.example;

public class Profile {

    private ShippingInfo shippingInfo;

    public Profile(ShippingInfo shippingInfo) {
        if (shippingInfo == null) throw new MissingShippingInfoException("Shipping Info cannot be null");
        this.shippingInfo = shippingInfo;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }
}
