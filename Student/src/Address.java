/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Extra Class
 */
public class Address {
    private String houseNo;
     private String roadNo;
     private String city;
      private String zipCode;
       private String phoneNo;
        private String emailAddress;

    public Address(String houseNo, String roadNo, String city, String zipCode, String phoneNo, String emailAddress) {
        this.houseNo = houseNo;
        this.roadNo = roadNo;
        this.city = city;
        this.zipCode = zipCode;
        this.phoneNo = phoneNo;
        this.emailAddress = emailAddress;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public void setRoadNo(String roadNo) {
        this.roadNo = roadNo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public String getRoadNo() {
        return roadNo;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "Address{" + "houseNo=" + houseNo + ", roadNo=" + roadNo + ", city=" + city + ", zipCode=" + zipCode + ", phoneNo=" + phoneNo + ", emailAddress=" + emailAddress + '}';
    }
        
        
}
