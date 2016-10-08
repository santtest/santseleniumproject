package MavenTestpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class comfacebook {

	public static void main(String[] args) {
		/*define webdriver*/ 
		System.setProperty("webdriver.chrome.driver","C:\\selenium_software\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		/*System.out.println(urlname);*/
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("aaaaa");
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("bbbbbb");
		driver.findElement(By.name("reg_email__")).clear();
		driver.findElement(By.name("reg_email__")).sendKeys("aaaa@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).clear();
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("aaaa@gmail.com");
		driver.findElement(By.name("reg_passwd__")).clear();
		driver.findElement(By.name("reg_passwd__")).sendKeys("&aaaaaaaaaa1111");
		
		
		/* birthdate*/
		
		
		//SELECT MONTH USING LIST BOX
		//driver.findElement(By.id("month")).clear();
		Select month = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		month.selectByValue("1");

		
		
		//SELECT DAY USING LIST BOX
		//driver.findElement(By.id("day")).clear();
		Select day = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		day.selectByValue("11");

		//SELECT YEAR USING LIST BOX
		Select year = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
				year.selectByValue("1976");
		//Thread.sleep(5000); wait 5 second
		

		/*SELECT SEX CODE USING RADIO BUTTON*/
		//driver.findElement(By.name("sex")).clear();
		
		List<WebElement> radio_button = driver.findElements(By.xpath("//input[@type='radio']"));
	    System.out.println(radio_button.size());
		System.out.println(radio_button.get(0).getAttribute("value"));
		System.out.println(radio_button.get(0).getAttribute("checked"));

		radio_button.get(1).click();// check the radio button if it is unchacked
                                    // VALUE 0 FOR FEMALE AND VALUE 1 FOR MALE
		driver.findElement(By.name("websubmit")).click();
		

	}

}
