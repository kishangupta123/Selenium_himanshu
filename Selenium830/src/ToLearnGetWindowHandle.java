import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
		//Syntax for to use GetWindowHandle it is used to capture window ID
		String str = driver.getWindowHandle();
		//Return type is String and Generated Through clicking on local Variable
		
		
		System.out.println(str);
		
	}

}
