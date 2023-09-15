/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Experience extends Candidate{
    public int ExplnYear;
    public String proSkill;

    public Experience(String candidateId, String firstName, String lastName,
            String birthDay, String addresss, String phone, String email,
            int candidateType, int ExplnYear, String proSkill) {
        super(candidateId, firstName, lastName, birthDay, addresss, phone, email, candidateType);
        this.ExplnYear = ExplnYear;
        this.proSkill = proSkill;
    }

    public int getExplnYear() {
        return ExplnYear;
    }

    public void setExplnYear(int ExplnYear) {
        this.ExplnYear = ExplnYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString() + " Experience{" + "ExplnYear=" + ExplnYear + ", proSkill=" + proSkill + '}';
    }
    
    
    
    
    
}
