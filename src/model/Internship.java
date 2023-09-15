/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Internship extends Candidate{
    public String majors;
    public String semester;
    public String university;

    public Internship(String candidateId, String firstName, String lastName, String birthDay,
            String addresss, String phone, String email, int candidateType,
            String majors, String semester, String university) {
        super(candidateId, firstName, lastName, birthDay, addresss, phone, email, candidateType);
        this.majors = majors;
        this.semester = semester;
        this.university = university;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return super.toString() + " Internship{" + "majors=" + majors + ", semester=" + semester + ", university=" + university + '}';
    }
    
    
    
    
}
