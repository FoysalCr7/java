/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Extra Class
 */
public class Course {
    private String course_name;
        private String course_code;
            private String course_credit;

    public Course(String course_name, String course_code, String course_credit) {
        this.course_name = course_name;
        this.course_code = course_code;
        this.course_credit = course_credit;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public void setCourse_credit(String course_credit) {
        this.course_credit = course_credit;
    }

    public String getCourse_name() {
        return course_name;
    }

    public String getCourse_code() {
        return course_code;
    }

    public String getCourse_credit() {
        return course_credit;
    }

    @Override
    public String toString() {
        return "Course{" + "course_name=" + course_name + ", course_code=" + course_code + ", course_credit=" + course_credit + '}';
    }
            
    
}
