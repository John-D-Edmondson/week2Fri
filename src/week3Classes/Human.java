package week3Classes;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Human {
    private String eyeColour;
    private LocalDate dateOfBirth;
    private int coolnessRating;

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getCoolnessRating() {
        return coolnessRating;
    }

    public void setCoolnessRating(int coolnessRating) {
        this.coolnessRating = coolnessRating;
    }

    public Human(String eyeColour, LocalDate dateOfBirth, int coolnessRating) {
        this.eyeColour = eyeColour;
        this.dateOfBirth = dateOfBirth;
        this.coolnessRating = coolnessRating;
    }

    public Human(String eyeColour, int coolnessRating) {
        this.eyeColour = eyeColour;
        this.coolnessRating = coolnessRating;
        this.dateOfBirth = LocalDate.of(1983, 07, 16);
    }

    @Override
    public String toString() {
        return "Human{" +
                "eyeColour='" + eyeColour + '\n' +
                ", dateOfBirth=" + dateOfBirth + '\n' +
                ", coolnessRating=" + coolnessRating +
                '}';
    }

    public Human() {
    }

    public int getAgeLocal(){
         return getAge(this.dateOfBirth);
    }
    public static int getAge(LocalDate dateOfBirth){
        Period res = Period.between(LocalDate.now(), dateOfBirth);
        System.out.println(res);
        return res.getYears();
    }
}
