package mathgame;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author MD_RASEDUZZAMAN_ZIBON
 */
public class Sum { 
    int c = 0;
    int w = 0;
    String summary="";
    public void add(){
    
    int num1 = (int) (Math.random()*10);
    int num2 = (int) (Math.random()*10);
    Scanner input2 = new Scanner(System.in);
    int actualanswer = num1 + num2;
    System.out.println("What is "+num1+"+"+num2+"?");
    int useranswer = input2.nextInt();
    if(useranswer == actualanswer){
       c++;
        }
    else{
        w++;
    }
    summary = summary+"\n"+num1 +"+"+num2 +"=" +useranswer+":"+(useranswer==actualanswer);
    }
    
          public void sub(){
       
    int num1 = (int) (Math.random()*10);
    int num2 = (int) (Math.random()*10);
    Scanner input2 = new Scanner(System.in);
    if(num2>num1){
    int temp;
    temp = num2;
    num1 = num2;
    num1 = temp;
    }
    int actualanswer = num1 - num2;
    System.out.println("What is "+num1+"-"+num2+"?");
    int useranswer = input2.nextInt();
    if(useranswer == actualanswer){
       c++;
        }
    else{
        w++;
    }
    summary = summary+"\n"+num1+"-"+num2+"="+useranswer+":"+(useranswer==actualanswer);
    }
           public void mul(){
     
    int num1 = (int) (Math.random()*10);
    int num2 = (int) (Math.random()*10);
    Scanner input2 = new Scanner(System.in);
    int actualanswer = num1 * num2;
    System.out.println("What is "+num1+"*"+num2+"?");
    int useranswer = input2.nextInt();
    if(useranswer == actualanswer){
        c++;
        }
    else{
        w++;
    }
    summary = summary+"\n"+num1+"*"+num2+"="+useranswer+":"+(useranswer==actualanswer);
    }
            public void div(){

    double num1 = (int) (Math.random()*10);
    double num2 = (int) (Math.random()*10);
    Scanner input2 = new Scanner(System.in);
    if(num1==0||num1==1||num2==1||num2==0){
    num1 += 2;
    num2 += 2;
    }
    if(num2>num1){
    double temp;
    temp = num2;
    num1 = num2;
    num1 = temp;
    }
    double actualanswer = num1 / num2;
    System.out.println("What is "+(int)num1+"/"+(int)num2+"?");
    DecimalFormat df = new DecimalFormat("#.##");
    String s = df.format(actualanswer);
    actualanswer = Double.valueOf(s);
    double useranswer = input2.nextDouble();
    if(useranswer == actualanswer){
        c++;
        }
    else{
        w++;
    }
    summary = summary+"\n"+num1+"+"+num2+"="+useranswer+":"+(useranswer==actualanswer);
    }
           
}
