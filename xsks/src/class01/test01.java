package class01;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class test01 {
  public static WebDriver driver;
  public static String url;
  @BeforeClass
  public static void setUp() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	  driver = new ChromeDriver();
    url = "http://localhost:8080/examsys/index.thtml";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  @Test
  public void testUntitled() throws Exception {
    driver.get(url);
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("hujianming");
    driver.findElement(By.name("userpass")).clear();
    driver.findElement(By.name("userpass")).sendKeys("hujianming123");
    new Select(driver.findElement(By.name("usertype"))).selectByVisibleText("π‹¿Ì‘±");
    Thread.sleep(10000);
    driver.findElement(By.className("tm_btn")).click();
    		}

  @AfterClass
  public void tearDown() throws Exception {
    driver.quit();
  }}

