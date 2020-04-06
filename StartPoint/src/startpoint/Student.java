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
public class Student {

 
    

   
    
    
    private  String studentName;
    private String studentId;

   
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" + "studentName=" + studentName + ", studentId=" + studentId + '}';
    }
    
    
    
}
