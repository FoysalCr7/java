package mathgame;
import java.util.Random;
public class MathGame{
    public static void main(String[] args) {
        long start, end;
        start = System.currentTimeMillis();
      Sum A = new Sum();
      while(A.w==0){
      Random n = new Random();
            int num = n.nextInt(4);
            switch (num) {
                case 0:
                    A.add();
                    break;
                case 1:
                    A.sub();
                    break;
                case 2:
                    A.mul();
                    break;
                case 3:
                    A.div();
                    break;
            }
      }
       end = System.currentTimeMillis();
       System.out.println("!!!!!GAME IS OVER!!!!!");
      System.out.println("Your total right answer:"+A.c);
      System.out.println("Your take " +((end-start)/1000)+ " seconds to answer all questions.");
      System.out.println("Summary:"+A.summary);
    }
    
}
