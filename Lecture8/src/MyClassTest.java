import org.junit.Test;
import static org.junit.Assert.*;


public class MyClassTest {
	
	
	@Test
	public void readFromKeyboard_none_valid(){

		MyClass myclass = new MyClass();
		assertTrue(myclass.text.equals("Test"));
	}
	
	@Test
	public void hello(){
		System.out.println("Hello");
	}
}
