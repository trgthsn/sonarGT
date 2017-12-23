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
    	
double d = 1.1;

BigDecimal bd1 = new BigDecimal(d); // Noncompliant; see comment above
BigDecimal bd2 = new BigDecimal(1.1); // Noncompliant; same result


        System.out.println( "Hello World!" );
    }

void test_divide() {
  int z = 0;
  if (unknown()) {
    // ..
    z = 3;
  } else {
    // ..
  }
  z = 1 / z; // Noncompliant, possible division by zero
}

}
