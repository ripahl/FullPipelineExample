import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test {

	public static boolean testIE() {
//		try {
		String projectLocation = System.getProperty("user.dir");
		
		System.setProperty("webdriver.ie.driver", projectLocation+"/lib/IEDriver/IEdriverServer.exe");
		WebDriver driver2 = new InternetExplorerDriver();
		driver2.get("http://baseballcardinventory.com/");
		driver2.manage().window().maximize();
		driver2.findElement(By.name("in_userid")).sendKeys("rpahl");
		driver2.findElement(By.name("in_keycode")).click();  //focus the field
		driver2.findElement(By.name("in_keycode")).clear(); //removing and autofill
		driver2.findElement(By.name("in_keycode")).sendKeys("indians12");
		
		System.out.println("Ready to Hit Login Button");
		
		driver2.findElement(By.id("LoginButton")).click();

		driver2.findElement(By.linkText("Partial Sets")).click();
		

		driver2.close();
//		} catch(Exception e)  {
//			System.out.println(e);
//			return false;
//		}
		return true;
		// Sample Code for testing
	}
	
	public static boolean testFF() {
		try {
		String projectLocation = System.getProperty("user.dir");
		//System.setProperty("webdriver.ie.driver", projectLocation+"/lib/IEDriver/IEdriverServer.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\bby\\git\\FullPipelineExample\\Test\\lib\\geckodriver\\geckodriver.exe");
		//System.out.println(projectLocation+"/lib/geckodriver/geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		driver2.manage().window().maximize();

		driver2.get("http://baseballcardinventory.com/");

		driver2.findElement(By.name("in_userid")).sendKeys("rpahl");
		driver2.findElement(By.name("in_keycode")).click();  //focus the field
		driver2.findElement(By.name("in_keycode")).clear(); //removing and autofill
		driver2.findElement(By.name("in_keycode")).sendKeys("indians12");
		
		System.out.println("Ready to Hit Login Button");
		driver2.findElement(By.id("LoginButton")).click();
		driver2.findElement(By.linkText("Admin")).click();
		driver2.close();
	} catch(Exception e)  {
		System.out.println(e);
		return false;
	}
	return true;
	}
	
	public static void main(String[] args) {
		//if (testIE() && testFF()) 
		if (testFF()) 
				System.out.println("Testing Passed");
				else 
				System.out.println("Testing Failed");
	}
}