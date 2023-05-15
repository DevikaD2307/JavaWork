import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        Select s=new Select(driver.findElement(By.id("drop1")));
        //s.selectByVisibleText("doc 2");
        //s.selectByValue("jkl");
        s.selectByIndex(1);
    }
}
