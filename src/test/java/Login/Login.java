package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {
    private WebDriver driver;
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://github.com/login");
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("login")).sendKeys("ridwan.abdulazeez1@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Labibah1.");
        driver.findElement(By.name("commit")).click(); }

    public static void main(String args[]) throws InterruptedException {
        Login test = new Login();
        test.setUp();
    }
}
