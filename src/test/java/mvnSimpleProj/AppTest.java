/**
 * 
 */
package mvnSimpleProj;

 import static org.junit.Assert.*; 
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author Anu
 *
 */
public class AppTest {

	/**
	 * Test method for {@link mvnSimpleProj.App#main(java.lang.String[])}.
	 */
	@Test
	public void AppTest1() {
	//	fail("Not yet implemented"); // TODO
		
		final ByteArrayOutputStream outContent = new
				ByteArrayOutputStream();
				System.setOut(new PrintStream(outContent)); //make the output go to a stream instead of
				//the console
				App.main(null); //call main in the App file
				//check if the output is "Hello ATU!" and a new line.
				assertEquals("L00177576 DevOps Assignment 3" + System.getProperty("line.separator"),
				outContent.toString());
	}
	@Test
	public void AppFailTest2() {
	//	fail("Not yet implemented"); // TODO
		
		final ByteArrayOutputStream outContent = new
				ByteArrayOutputStream();
				System.setOut(new PrintStream(outContent)); //make the output go to a stream instead of
				//the console
				App.main(null); //call main in the App file
				//check if the output is "Hello ATU!" and a new line.
				assertNotEquals("L00177576 DevOps xx 3" + System.getProperty("line.separator"),
				outContent.toString());
	}
	
	  @Test
	    public void AlwaysTrue()
	    {
	        assertTrue( true );
	    }

}
