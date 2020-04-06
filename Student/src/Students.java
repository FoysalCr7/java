
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Extra Class
 */
public class Students {
     private String studentName;
      private String studentId;
       private String studentAge;
       private Department department;
       private Address address;
       private ArrayList<Course> courses;

    public Students(String studentName, String studentId, String studentAge, Department department, Address address, ArrayList<Course> courses) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentAge = studentAge;
        this.department = department;
        this.address = address;
        this.courses = courses;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public Department getDepartment() {
        return department;
    }

    public Address getAddress() {
        return address;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Students{" + "studentName=" + studentName + ", studentId=" + studentId + ", studentAge=" + studentAge + ", department=" + department + ", address=" + address + ", courses=" + courses + '}';
    }
       
       
    
}
