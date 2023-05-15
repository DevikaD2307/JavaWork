import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox1
{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(3000);
       WebElement sp =driver.findElement(By.xpath("//label[text()='Sports']"));
       sp.click();
        //Thread.sleep(3000);

        WebElement re =driver.findElement(By.xpath("//label[text()='Reading']"));
        re.click();
        //Thread.sleep(3000);

        WebElement mu =driver.findElement(By.xpath("//label[text()='Music']"));
        mu.click();

    }



}
