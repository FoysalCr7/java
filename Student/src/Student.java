
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Extra Class
 */
public class Student {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cn =new Scanner(System.in);
        Scanner sc =new Scanner(System.in);
         Scanner st =new Scanner(System.in);
        ArrayList<Students>student=new ArrayList<Students>();
         ArrayList<Department>department=new ArrayList<Department>();
          ArrayList<Address>address=new ArrayList<Address>();
          
        
     System.out.println("Student Registration");
      System.out.println("--------------------");
      System.out.println("how many student");
      int con =cn.nextInt();
      for(int b=0;b<=con;b++){
       
      
       System.out.print("Enter Name:");
       String studentName=st.nextLine();
        System.out.println();
     
          System.out.print("Enter Id:");
       String studentId=st.nextLine();
        System.out.println();
        
          System.out.print("Enter Age:");
       String studentAge=st.nextLine();
        System.out.println();
        
          System.out.print("Enter Department Name:");
       String dep_name=sc.nextLine();
        System.out.println();
        
        
       System.out.print("Enter Department Building No:");
       String dep_building=sc.nextLine();
        System.out.println();
        
           System.out.print("Enter House No:");
       String houseNo=sc.nextLine();
        System.out.println();
       System.out.print("Enter Road No:");
       String roadNo=sc.nextLine();
        System.out.println();
        
          System.out.print("Enter City:");
       String city=sc.nextLine();
        System.out.println();
        
          System.out.print("Enter Zip Code:");
       String zipCode=sc.nextLine();
        System.out.println();
        
          System.out.print("Enter Phone No:");
       String phoneNo=sc.nextLine();
        System.out.println();
        
          System.out.print("Enter Email Address:");
       String emailAddress=sc.nextLine();
        System.out.println();
        
       // Students s=new Students (studentName,studentId,studentAge,dep_name,dep_building,houseNo,roadNo,city,zipCode,phoneNo,emailAddress;
        
          System.out.println("Course Registration");
            System.out.println("-------------------");
              System.out.println("how many course");
              int count=sc.nextInt();
              
              ArrayList<Course>courses=new ArrayList<Course>();
              
              for(int a=0;a<count;a++){
                  
                  
                   System.out.print("Enter Course Name: ");
       String courseName=st.nextLine();
        System.out.println();
                  
                System.out.print("Enter Course Code: ");
       String courseCode=st.nextLine();
        System.out.println();
        
         System.out.print("Enter Course Credit: ");
       String courseCredit=st.nextLine();
        System.out.println();
        
        Course c =new Course(courseName, courseCode, courseCredit);
              courses.add(c);    
              }
      
              Department d =new Department(dep_name,dep_building) ;
              department.add(d);
              
               Address a =new Address(houseNo, roadNo, city, zipCode, phoneNo, emailAddress);
              address.add(a);
              
               Students s =new Students(studentName, studentId, studentAge, d, a, courses);
              student.add(s);
        
      
              /* System.out.println("Enter search query: ");
		sc.nextLine();
		String f = sc.nextLine();
		System.out.println("=========================");
		//System.out.println(s);
		student.add(s);
		
		for(Students sss : student){
			if(sss.getStudentName().equals(f)){
				System.out.println(sss);
			}else{
				System.out.println("not found");
			}
                }*/
         //Department d1=new Department(dep_name, dep_building);
       // Address a1 =new Address(houseNo, roadNo, city, zipCode, phoneNo, emailAddress);
        //Students st1 = new Students (studentName,studentId,studentAge,d,a,courses);
      
      
       
			
		}
   
      /*Students st1=new Students("karim","n-001","20");  
       Department d1=new Department("Computer Science","A");
       Address a1 =new Address("111","101", "Dhaka", "1215", "5559","@gmail.com");
       Course c1=new Course("coumpter Fundamental", "cse111", "3");
      Course c2 =new Course("AI","Cse401","3");
       ArrayList<Course>courses1=new ArrayList<Course>();
       courses1.add(c1);
       courses1.add(c2);
       
       Students st1 = new Students ("Foysal","161-15-9876","20",d1,a1,courses1);
       System.out.println(st1);
       System.out.println(st1.getDepartment());
       Array List
               Inhance loop
      for(Course c:st1.getCourses()){
          System.out.println(c.getCourse_name());
       }*/
    }
    

