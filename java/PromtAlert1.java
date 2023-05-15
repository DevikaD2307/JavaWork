import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlert1
{
    //Using Prompt alert
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("promtButton")).click();
        Alert promptalert=driver.switchTo().alert();
        System.out.println(promptalert.getText());
        Thread.sleep(4000L);
        promptalert.sendKeys("Sending the data");
        Thread.sleep(2000);
        promptalert.accept();
    }
}
