package com.zenom.UserManagement.Model.RequestModel;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class UserDetailsRequest {

    @NotNull(message = "Please Enter your FirstName")
    private String firstName;

    @NotNull(message = "Please Enter your LastName")
    private String lastName;

    @NotNull(message = "Please Enter your Email")
    @Email(message = "Please Enter corret Email")
    private String email;

    @NotNull(message = "Please Enter Country Code")
    private String countryCode;

    @NotNull(message = "Please Enter your Phone Number")
    @Max(value = 10,message = "Phone Number should be 10 digits long")
    @Min(value = 10,message = "Phone Number should be 10 digits long")
    private String phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
