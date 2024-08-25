package com.vaibhavproject.vendor;

public class cloudvendor {
    private String vendorId;
    private String vendorName;
    private String vendorAddress;

    private  String vendorphonenumber;

    public cloudvendor() {
    }

    public cloudvendor(String vendorId, String vendorName, String vendorAddress, String vendorphonenumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorphonenumber = vendorphonenumber;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorphonenumber() {
        return vendorphonenumber;
    }

    public void setVendorphonenumber(String vendorphonenumber) {
        this.vendorphonenumber = vendorphonenumber;
    }
}
