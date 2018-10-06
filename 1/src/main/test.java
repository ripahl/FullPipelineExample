import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test {

	public static void main(String[] args) {
		
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

	try {
		Thread.sleep(2000);
		} catch (Exception e) {
			
		}
	
	System.out.println(driver2.getTitle());
}
}