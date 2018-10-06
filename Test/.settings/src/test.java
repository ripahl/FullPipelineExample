import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test {

	public static void main(String[] args) {

		String projectLocation = System.getProperty("user.dir");
		
		//FIREFOX
		//System.setProperty("webdriver.gecko.driver", projectLocation+"/lib/geckoDriver/geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		//driver.get("http://seleniumhq.org/");
		//System.out.println(driver.getTitle());
		//System.out.println("Hello world");
		//driver.quit();
		//driver.close();
		
		//INTERNET EXPLORER TEST
		//System.setProperty("webdriver.ie.driver", projectLocation+"/lib/IEDriver/IEdriverServer.exe");
		//WebDriver driver2 = new InternetExplorerDriver();
		//driver2.get("http://seleniumhq.org/");
		//driver2.manage().window().maximize();
		//System.out.println(driver2.getTitle());
		//driver2.quit();
		
		System.setProperty("webdriver.ie.driver", projectLocation+"/lib/IEDriver/IEdriverServer.exe");
		WebDriver driver2 = new InternetExplorerDriver();
		driver2.get("http://baseballcardinventory.com");
		driver2.manage().window().maximize();
		driver2.findElement(By.name("in_userid")).sendKeys("rpahl");
		//driver2.findElement(By.name("in_keycode")).sendKeys("indians12");
		driver2.findElement(By.id("LoginButton")).click();

		WebDriver driver3 = new InternetExplorerDriver();
		driver3.findElement(By.name("in_keycode")).sendKeys("indians12");
		driver3.findElement(By.id("LoginButton")).click();

		//System.out.println(driver2.getTitle());

	}
}