import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton1
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://materializecss.com/radio-buttons.html");
        driver.manage().window().maximize();
        WebElement we=driver.findElement(By.xpath("//span[text()='Green']"));
        we.click();
        boolean b= we.isDisplayed();
        System.out.println(b);

    }
}
