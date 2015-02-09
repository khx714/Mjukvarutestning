import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MyClass{
	MyInterface my;
	String text = null;
	public MyClass() {
		this.my = new FakeClass();
		text = my.readFromKeyboard();		
	}
	public MyClass(MyInterface my){
		this.my = my;
		text = my.readFromKeyboard();
	}
	public class FakeClass implements MyInterface{
		@Override
		public String readFromKeyboard() {
			return "test";
		}
	}
	public class ValidReader implements MyInterface {
		public String readFromKeyboard(){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				text = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return text;
		}
	}

}
