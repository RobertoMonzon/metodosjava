import java.util.Scanner;
import java.lang.Math;
public class calculadorabrain {
	public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        Integer  a;
        Integer b;
        System.out.println( "Enter a:  " );
        a= console.nextInt();
        System.out.println( "Enter b:  " );
        b= console.nextInt();
        
        printSuma(a,b);
        printMult(a,b);
        printDiv(a,b);
        printRes(a,b);
        printRoot(a,b);
        printPower(a,b);


        //printNameLength( name );
        console.close();
}

	private static void printSuma( int a, int b)
    {
		System.out.println(a+b);

    }
    private static void printMult( int a, int b )
    {
    	System.out.println(a*b);
    	
    }
    private static void printDiv( float a, float b)
    {
    	System.out.println(a/b);

    }
    private static void printRes( int a, int b )
    {
    	System.out.println(a-b);
    }
    private static void printPower( int a, int b )
    {
    	System.out.println(Math.pow(a,b));
    }
    private static void printRoot( int a, int b )
    {
    	System.out.println(Math.sqrt(a-b));
    }
}
