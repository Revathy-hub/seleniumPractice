import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();

//to maximize the screen
driver.manage().window().maximize();

//to open browser
driver.get("https://www.google.com");

//to grab title of the page
String title=driver.getTitle();
System.out.println(title);

//to grab current URL
String URL=driver.getCurrentUrl();
System.out.println(URL);

//Closing browser
driver.quit();
	}

}
