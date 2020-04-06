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
public class Course extends Address {
   private String courseName;
    private String courseCredit;
    private String courseCode;
    

  

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(String courseCredit) {
        this.courseCredit = courseCredit;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return "Course{" + "courseName=" + courseName + ", courseCredit=" + courseCredit + ", courseCode=" + courseCode + '}';
    }

   
    
    
}
