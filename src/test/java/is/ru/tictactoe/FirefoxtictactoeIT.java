
package is.ru.tictactoe;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;
import java.util.concurrent.TimeUnit;
import com.thoughtworks.selenium.Selenium;

public class FirefoxtictactoeIT {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private Selenium selenium;

  @Before
  public void setUp() throws Exception {
    WebDriver driver = new FirefoxDriver();
    String baseUrl = "http://tictackesha.herokuapp.com/";
    selenium = new WebDriverBackedSelenium(driver, baseUrl);
  }  


  @Test
  public void titleShouldBeHelloWorld() throws Exception {
    driver.get(baseUrl);
    assertEquals("TicTacToe", driver.getTitle());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"TicTacToe".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }
}
