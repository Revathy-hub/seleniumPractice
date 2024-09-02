
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.edge.EdgeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
public class Multiplebrowsers {

	public static void main(String[] args) {
		String browsername="chrome";
		WebDriver driver=null;
		
if(browsername.equalsIgnoreCase("chrome")){
	driver=new ChromeDriver();
}

else if(browsername.equalsIgnoreCase("edge")) {
	driver=new EdgeDriver();
}

else if(browsername.equalsIgnoreCase("firefox")) {
	driver=new FirefoxDriver();
}

else {
	System.out.println("please choose correct browser");
}


driver.manage().window().maximize();
driver.get("https://www.google.com");

driver.quit();

	
	
}
		

	}


