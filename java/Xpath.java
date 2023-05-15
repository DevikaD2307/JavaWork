import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        //by using xpath
       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Women shopping bag");

    }
}
