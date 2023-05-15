package org.BaseClassPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.Utilpackage.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass
{
   public WebDriver driver;
     public Properties prop;
    public void Baseclass() throws IOException {
         prop= new Properties();
        FileInputStream input= new FileInputStream("C:\\Users\\chand\\IdeaProjects\\AmazonAutomation Testing\\src\\main\\java\\org\\ConfigureProperties\\Config.Properties");
        prop.load(input);

    }
    public void intialize() {
        String browsername = prop.getProperty("browser");
        WebDriverManager.chromedriver().setup();
        if (browsername.equals("chrome"))
        {
            System.setProperty("WebDriver.chromeDriver", "\"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
            driver = new ChromeDriver();
        } else if (browsername.equals("firefox"))
        {
            System.setProperty("WebDriver.chromeDriver", "\"C:\\Users\\chand\\Downloads\\chromedriver_win32\\gecko.exe\"");
            driver = new FirefoxDriver();

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Utils.PAGE_LOAD_TIMEOUTS, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Utils.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));

    }


    }

