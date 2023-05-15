import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class LaunchLocators
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver d= new ChromeDriver();
        d.get("https://www.instagram.com/");
        //Using locators
        //d.findElement(By.name("username")).sendKeys("xyz123@gmail.com");
        //d.findElement(By.class("")//not to use with the spaces
        //d.findElement(By.tagName("input")).sendKeys("23569222");
        //d.findElement(By.linkText("Forgot password?")).click();
        //d.findElement(By.partialLinkText("word")).click();
        //WebElement w=d.findElement(By.xpath("//input[@name='username']"));
        //w.sendKeys("dfgh");
        //System.out.println(w.getTagName());
        //d.findElement(By.cssSelector("input[name='username']")).sendKeys("dfghbb");
    }
}
