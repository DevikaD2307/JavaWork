import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling1
{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("devika@gmail.com");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-800)", "");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Devik@123");
        driver.findElement(By.xpath("//button[@name='login']")).click();
    }

}
