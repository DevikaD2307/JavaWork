import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MouseEvents
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        Actions a = new Actions(driver);
        //WebElement w = driver.findElement(By.id("doubleClickBtn"));
        //a.doubleClick(w).perform();
        //WebElement w= driver.findElement(By.id("rightClickBtn"));
        //a.contextClick(w).perform();
        WebElement w= driver.findElement(By.xpath("//button[text()='Click Me']"));
        w.click();


    }


}
