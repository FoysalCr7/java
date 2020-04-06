/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputtestterminal;

import java.io.IOException;

/**
 *
 * @author USER
 */
public class TranslateInt extends Translator {
    static final int LANGUAGE_DATA_ERROR = 3;

  public static void main(String[] args)
  {
    String inFilename = "";
    String languageToUse = "";
    int[] toConvert = null;
    LanguageInteger language = null;
    int state = 1;
    Stopwatch toLoad = new Stopwatch();
    Stopwatch toRun = new Stopwatch();


    if (args.length != 3)
    {
      System.out.println("TranslateInteger");
      System.out.println("USAGE  java TranslateInt <file> <language> <state>");
      System.exit(SUCCESS);
    }

    inFilename = new String(args[0]);
    languageToUse = new String(args[1]);
    state = Integer.parseInt(args[2]);
    args = null;

    try
    {
      toLoad.start();
      language = new LanguageInteger(languageToUse);
      toLoad.stop();
    }
    catch (IOException e)
    {
      System.err.println(e);
      System.exit(DISK_ERROR);
    }
    catch (LanguageLegacyDatafileFormatException e)
    {
      System.err.println(e);
      System.exit(LANGUAGE_DATA_ERROR);
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

        private void start() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getTime() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void stop() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
