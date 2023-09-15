/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Candidate {
    String candidateId;
    String firstName;
    String lastName;
    String birthDay;
    String addresss;
    String phone;
    String email;
    int candidateType;

    public Candidate() {
    }
    

    public Candidate(String candidateId, String firstName, String lastName, String birthDay,
            String addresss, String phone, String email, int candidateType) {
        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.addresss = addresss;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

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

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(int candidateType) {
        this.candidateType = candidateType;
    }

    @Override
    public String toString() {
        return "Candidate{" + "candidateId=" + candidateId + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDay=" + birthDay + ", addresss=" + addresss + ", phone=" + phone + ", email=" + email + ", candidateType=" + candidateType + '}';
    }
    
}
