
import java.util.Scanner;

public class proyecto {
	public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        String  name;
        System.out.println( "Enter your name:  " );
        name= console.nextLine();
        printNameLength( name );
       
        printNameCharacters( name );

        //printNameLength( name );
        console.close();
    }

    private static void printNameLength( String name )
    {
	        	System.out.println(name.length());//TODO implement this code
    }
    private static void printNameCharacters( String name )
    {
    	for( int pos=0;pos < name.length() ;  pos++) {
        	System.out.println(name.charAt(pos));//TODO implement this code
        	}//TODO implement this code
    }

}
