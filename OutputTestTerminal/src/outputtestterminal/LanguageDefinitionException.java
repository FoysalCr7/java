/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputtestterminal;

/**
 *
 * @author USER
 */
public class LanguageDefinitionException extends Exception {
  public LanguageDefinitionException()
  {
    super();
  }
  /**
   * Creates a new LanguageDefinitionException with the error text held
   * in <CODE>description</CODE>.
   *
   * @param description  <CODE>String</CODE> containing description of error.
   */
  public LanguageDefinitionException(String description)
  {
    super(description);
  }  
    
}
