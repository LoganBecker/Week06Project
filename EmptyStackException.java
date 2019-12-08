package week06;

public class EmptyStackException extends Exception
{
   public EmptyStackException(){
      this( "Stack is empty" );
   } 
   
   public EmptyStackException( String exception )
   {
      super( exception );
   } 
}