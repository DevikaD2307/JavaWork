import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtext
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        //using class
        //driver.findElement(By.className("_1_3w1N")).click();
        //using text method
        //driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.findElement(By.xpath("//a[contains(class,'_1_3w1N')]")).click();
    }
}
