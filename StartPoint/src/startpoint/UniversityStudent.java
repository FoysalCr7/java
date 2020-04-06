/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startpoint;

/**
 *
 * @author faysa
 */
public class UniversityStudent extends Course{
    private String semister;
    private double Cgpa;
    private String Section;

   

  



   
    public String getSemister() {
        return semister;
    }

    public void setSemister(String semister) {
        this.semister = semister;
    }

    public double getCgpa() {
        return Cgpa;
    }

    public void setCgpa(double Cgpa) {
        this.Cgpa = Cgpa;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String Section) {
        this.Section = Section;
    }

  

   
    @Override
    public String toString() {
        return "UniversityStudent{" + "semister=" + semister + ", Cgpa=" + Cgpa + ", Section=" + Section + '}';
    }

    
    
}
