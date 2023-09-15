package common;

import java.util.ArrayList;
import model.Candidate;
import model.Experience;
import model.Fresher;
import model.Internship;

public class CandidateManagementSystem extends ArrayList<Candidate> {

    Library library = new Library();

    public void create(int candidateType) {
        String candidateId = library.getString("Input candidate ID: ");
        String firstName = library.getString("Input first name: ");
        String lastName = library.getString("Input last name: ");
        String birthDay = library.getString("Input candidate birthday: ");
        String address = library.getString("Input candidate address : ");
        String phone = library.getString("Input candidate phone: ");
        String email = library.getString("Input candidate email: ");

        switch (candidateType) {
            case 0:
                int ExplnYear = library.getInt("Input candidate year experience: ");
                String proSkill = library.getString("Input candidate professional skill: ");
                this.add(new Experience(candidateId, firstName, lastName, birthDay, address,
                        phone, email, candidateType, ExplnYear, proSkill));
                break;
            case 1: {
                String graduationDate = library.getString("Input candidate graduation date: ");
                String graduationRank = library.getString("Input candidate graduation rank : ");
                String university = library.getString("Input candidate university : ");
                this.add(new Fresher(candidateId, firstName, lastName, birthDay, address,
                        phone, email, candidateType, graduationDate, graduationRank, university));
                break;
            }
            default: {
                String majors = library.getString("Input candidate majors : ");
                String semester = library.getString("Input candidate semester : ");
                String university = library.getString("Input candidate university : ");
                this.add(new Internship(candidateId, firstName, lastName, birthDay, address, phone,
                        email, candidateType, majors, semester, university));
                break;
            }
        }

    }

    public void detele(String candidateId) {
        try {
            for (Candidate candi : this) {
                if (candi.getCandidateId().equalsIgnoreCase(candidateId)) {
                    this.remove(candi);
                } else {
                    System.out.println("Candidate Id not found to remove");
                }
            }
        } catch (Exception e) {
        }

    }

    public void update(String candidateId) {
        for (Candidate candi : this) {
            if (candi.getCandidateId().equalsIgnoreCase(candidateId)) {
                int candidateType = candi.getCandidateType();
                String address = library.getString("Input update address : ");
                candi.setAddresss(address);
                String phone = library.getString("Input update phone: ");
                candi.setPhone(phone);
                String email = library.getString("Input update email: ");
                candi.setEmail(email);
                switch (candidateType) {
                    case 0:
                        int ExplnYear = library.getInt("Input update year experience: ");
                        ((Experience) candi).setExplnYear(ExplnYear);
                        String proSkill = library.getString("Input update professional skill: ");
                        ((Experience) candi).setProSkill(proSkill);
                        break;
                    case 1:
                        String graduationDate = library.getString("Input update graduation date: ");
                        ((Fresher) candi).setGraduationDate(graduationDate);
                        String graduationRank = library.getString("Input update graduation rank : ");
                        ((Fresher) candi).setGraduationRank(graduationRank);
                        String university = library.getString("Input update university : ");
                        ((Fresher) candi).setUniversity(university);
                        break;
                    default:
                        String majors = library.getString("Input candidate majors : ");
                        ((Internship) candi).setMajors(majors);
                        String semester = library.getString("Input candidate semester : ");
                        ((Internship) candi).setSemester(semester);
                        String universityIntern = library.getString("Input candidate university : ");
                        ((Internship) candi).setUniversity(universityIntern);
                }
            }
        }
    }

    public Candidate search(String candidateId) {
        for (Candidate candi : this) {
            if (candi.getCandidateId().equalsIgnoreCase(candidateId)) {
                return candi;
            }
        }
        return null;
    }

    public void display() {
        for (Candidate candidate : this) {
            System.out.println(candidate);
        }
    }

}
