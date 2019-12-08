package week06;
/**
 *
 * @author loganbecker
 */
public class FullStackException extends Exception
{
   
   public FullStackException() {
      this( "Stack is full" );
   } 
   
   public FullStackException( String exception ) {
      super( exception );
   } 
}