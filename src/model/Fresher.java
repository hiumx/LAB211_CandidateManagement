/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Fresher extends Candidate {

    public String graduationDate;
    public String graduationRank;
    public String university;

    public Fresher(String candidateId, String firstName, String lastName, String birthDay,
            String addresss, String phone, String email, int candidateType,
            String graduationDate, String graduationRank, String university) {
        super(candidateId, firstName, lastName, birthDay, addresss, phone, email, candidateType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.university = university;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return super.toString() + " Fresher{" + "graduationDate=" + graduationDate + ", graduationRank=" + graduationRank + ", university=" + university + '}';
    }
    
    

}
