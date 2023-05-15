import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHanding1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/popup.php");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Click Here")).click();
        Set<String> h = (Set<String>) driver.getWindowHandles();
        Iterator<String> i = h.iterator();
        String parentid = i.next();
        System.out.println("this is parent id" + parentid);
        String childid = i.next();
        System.out.println("this is child id" + childid);
        driver.switchTo().window(childid);
        Thread.sleep(5000L);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("devika@gmail.com");
        driver.findElement(By.xpath("//input[@type='text']")).click();
        Thread.sleep(3000);
        driver.close();
        driver.switchTo().window(parentid);
        System.out.println(driver.getTitle());
    }
}











