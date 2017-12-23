package sonardenemeleri.sonar;

/**
 * Hello world! deneme
 *
 */
public class App 
{
    public static void main( String[] args )
    {final int deneme;
	int target2 = -5;
	int num3 = 3;
final int deneme2;
	target2 =- num3;  // Noncompliant; target = -3. Is that really what's meant?
	target2 =+ num3; // Noncompliant; target = 3
    	
        System.out.println( "Hello World!" );
    }
}
