package outputtestterminal;

import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Translate256 extends Translator {
     static final String RESULT_SUFFIX = ".out.txt";

  public static void main(String[] args)
  {
    String inFilename = "";
    String languageToUse = "";
    int[] toConvert = null;
    Language256 language = null;
    int state = 1;
    Stopwatch toLoad = new Stopwatch();
    Stopwatch toRun = new Stopwatch();


    if (args.length != 3)
    {
      System.out.println("Translate256");
      System.out.println("USAGE  java Translate256 <file> <language> <state>");
      System.exit(SUCCESS);
    }

    inFilename = new String(args[0]);
    languageToUse = new String(args[1]);
    state = Integer.parseInt(args[2]);
    args = null;

    try
    {
      toLoad.start();
      language = new Language256(languageToUse);
      toLoad.stop();
    }
    catch (IOException e)
    {
      System.err.println(e);
      System.exit(DISK_ERROR);
    }
    language.setState(state);

    // Get the input to translate
    try {
      toConvert = Translator.readIntArrayFromDisk(inFilename);
    } catch (Exception e) { System.err.println(e); System.exit(DISK_ERROR); }

    toRun.start();
    int[] output = language.translate(toConvert);
    toRun.stop();

    System.out.println("Result:" +Translator.turnIntoString(output));
    System.out.println("Time to load: " + toLoad.getTime());
    System.out.println("Time to run: " + toRun.getTime());
  }

    private static class Stopwatch {

        public Stopwatch() {
        }

        private String getTime() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void stop() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void start() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
