import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoard
{
    public static void main(String[] args) throws InterruptedException {


       WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com");
        driver.findElement(By.name("username")).sendKeys("devika@gmail.com");
        Thread.sleep(3000L);
        driver.findElement(By.name("username")).sendKeys(Keys.CONTROL,"A");
        Thread.sleep(3000L);
        driver.findElement(By.name("username")).sendKeys(Keys.BACK_SPACE);

    }
}
