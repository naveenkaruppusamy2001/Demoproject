package Project1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class openbrowser {

	public static void main(String[] args) {
		
	
		        // Set the path for the ChromeDriver executable
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gopik\\Desktop\\chromedriver.exe");

		        // Initialize WebDriver
		        WebDriver driver = new ChromeDriver();

		        // Open a website
		        driver.get("https://www.selenium.dev/downloads/");

		        // Close the browser
		        //driver.quit();
		    }
		

		// TODO Auto-generated method stub

	}


