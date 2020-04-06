
package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;


public class FileHandling {
    
   
    public static void main(String[] args) throws FileNotFoundException, IOException  {
         
        Scanner sc=new Scanner(System.in);
      File file = new File("C:\\Users\\USER\\OneDrive\\Desktop");
      try {
        boolean createFile = file.createNewFile();
        if (createFile) {
          System.out.println("New File is created.");
          
        }
        else {
         // System.out.println("File already exists.");
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
      
      try 
     {
          FileWriter fw=new FileWriter("C:\\Users\\USER\\OneDrive\\Desktop\\data.txt");
          System.out.println("Enter Your Text File:"+"\n");
          fw.write(sc.nextLine());
          fw.close();
       }
     catch(Exception e)
     {
        System.out.println(e);
        }
     System.out.println("\n"+"File Created Sucessfully");
        
        System.out.println("\n");
         FileReader filereadObj=new FileReader("C:\\Users\\USER\\OneDrive\\Desktop\\data.txt");    
          int iterator;    
          while((iterator=filereadObj.read())!=-1)    
          System.out.print((char)iterator);    
          filereadObj.close();
          System.out.println("\n");
 
    
      double count = 0,countBuffer=0,countLine=0;
    String lineNumber = "";
    String filePath = "C:\\Users\\USER\\OneDrive\\Desktop\\data.txt";
    BufferedReader br;
      System.out.println("Enter Your Search Word:");
    String inputSearch = sc.nextLine();
    String line = "";

    
    try {
        br = new BufferedReader(new FileReader(filePath));
        try {
            while((line = br.readLine()) != null)
            {
                countLine++;
                //System.out.println(line);
                String[] words = line.split(" ");

                for (String word : words) {
                  if (word.equals(inputSearch)) {
                    count++;
                    countBuffer++;
                  }
                }

                if(countBuffer > 0)
                {
                    countBuffer = 0;
                    lineNumber += countLine + ",";
                }

            }
            br.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    System.out.println("Times found at--"+count);
    System.out.println("Word found at--"+lineNumber);
}
    
}
