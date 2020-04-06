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
public class StartPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UniversityStudent st=new UniversityStudent();
       st.setStudentName("foysal");
       st.setStudentId("161-15");
       st.setHouseNo("94/1");
       st.setRoadNo("89");
       st.setPhoneNumber("01788");
       st.setEmail("faysal@");
       st.setCourseCode("cse123");
       st.setCourseCredit("3");
       st.setCourseName("AI");
       st.setSemister("spring");
     st.setCgpa(3.57);
     st.setSection("L");
     
        System.out.println(st);
    }
    
}
